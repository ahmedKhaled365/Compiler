import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;
import javax.swing.event.*;
import javax.swing.text.*;

public class EnhancedCompilerGUI extends JFrame {

    // Core components
    private JTabbedPane tabbedPane;
    private List<JTextArea> codeEditors;
    private JTextArea outputConsole;
    private JLabel statusIndicator;
    private ProjectFinalASTParser parser;
    private Image originalParseTreeImage;
    private double zoomScale;

    // UI Components
    private JPanel mainPanel;
    private JPanel editorPanel;
    private JPanel outputPanel;
    private JButton compileButton;
    private JButton loadFileButton;
    private JButton newTabButton;
    private JButton showParseTreeButton;

    // Constants for styling
    private static final Color PRIMARY_COLOR = new Color(0xF5F5F5); // Soft off-white
    private static final Color SECONDARY_COLOR = new Color(0xE0E0E0); // Light gray
    private static final Color ACCENT_COLOR = new Color(0x0288D1); // Vibrant blue
    private static final Color SUCCESS_COLOR = new Color(0x2E7D32); // Forest green
    private static final Color ERROR_COLOR = new Color(0xD32F2F); // Muted red
    private static final Color TEXT_PRIMARY = new Color(0x212121); // Dark gray
    private static final Color TEXT_SECONDARY = new Color(0x757575); // Muted gray
    private static final Color BORDER_COLOR = new Color(0xB0B0B0); // Light border
    private static final Font TITLE_FONT = new Font("Segoe UI", Font.BOLD, 14);
    private static final Font LABEL_FONT = new Font("Segoe UI", Font.PLAIN, 12);
    private static final Font CODE_FONT = new Font("JetBrains Mono", Font.PLAIN, 16);
    private static final Font CONSOLE_FONT = new Font("Consolas", Font.PLAIN, 14);
    private static final String TAB_TYPE_CODE = "code";
    private static final String TAB_TYPE_PARSE_TREE = "parseTree";

    /**
     * Constructor - Initializes the GUI components
     */
    public EnhancedCompilerGUI() {
        setTitle("C++ compiler");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        codeEditors = new ArrayList<>();
        initializeComponents();
        setupLayout();
        addNewTab("Untitled");

        // Finalize window setup
        pack();
        setMinimumSize(new Dimension(1200, 800));
        setLocationRelativeTo(null);
    }

    /**
     * Initialize all GUI components
     */
    private void initializeComponents() {
        // Initialize main panels with modern styling
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBackground(PRIMARY_COLOR);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Editor panel
        editorPanel = new JPanel(new BorderLayout(0, 0));
        editorPanel.setBackground(SECONDARY_COLOR);
        editorPanel.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 1));

        // Tabbed pane for multiple editors
        tabbedPane = new JTabbedPane();
        tabbedPane.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        tabbedPane.setBackground(SECONDARY_COLOR);
        tabbedPane.setForeground(TEXT_PRIMARY);

        // Create modern-styled buttons for toolbar
        loadFileButton = createToolbarButton("Load File", ACCENT_COLOR);
        compileButton = createToolbarButton("Compile", SUCCESS_COLOR);
        newTabButton = createToolbarButton("New Tab", ACCENT_COLOR);
        showParseTreeButton = createToolbarButton("Show Tree", ACCENT_COLOR);

        // Output panel
        outputPanel = createStyledPanel("Console Output", SECONDARY_COLOR);

        // Console output
        outputConsole = new JTextArea();
        outputConsole.setFont(CONSOLE_FONT);
        outputConsole.setEditable(false);
        outputConsole.setBackground(SECONDARY_COLOR);
        outputConsole.setForeground(TEXT_PRIMARY);
        outputConsole.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BORDER_COLOR, 1),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        // Status indicator
        statusIndicator = new JLabel();
        statusIndicator.setPreferredSize(new Dimension(20, 20));
    }

    /**
     * Setup the layout for the GUI components
     */
    private void setupLayout() {
        // Setup editor panel with toolbar at top
        JPanel toolbarPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(new GradientPaint(0, 0, SECONDARY_COLOR, 0, getHeight(), PRIMARY_COLOR));
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        toolbarPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        toolbarPanel.setOpaque(false);

        // Add buttons to toolbar
        compileButton.setPreferredSize(new Dimension(120, 36));
        loadFileButton.setPreferredSize(new Dimension(100, 36));
        newTabButton.setPreferredSize(new Dimension(100, 36));
        showParseTreeButton.setPreferredSize(new Dimension(100, 36));
        toolbarPanel.add(newTabButton);
        toolbarPanel.add(loadFileButton);
        toolbarPanel.add(compileButton);
        toolbarPanel.add(showParseTreeButton);

        editorPanel.add(toolbarPanel, BorderLayout.NORTH);
        editorPanel.add(tabbedPane, BorderLayout.CENTER);

        // Setup output panel
        JPanel consolePanel = new JPanel(new BorderLayout(5, 5));
        consolePanel.setBackground(SECONDARY_COLOR);

        JPanel consoleHeaderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        consoleHeaderPanel.setBackground(SECONDARY_COLOR);
        JLabel consoleLabel = new JLabel("Console Output:");
        consoleLabel.setForeground(TEXT_PRIMARY);
        consoleHeaderPanel.add(consoleLabel);
        consoleHeaderPanel.add(statusIndicator);

        JScrollPane consoleScrollPane = new JScrollPane(outputConsole);
        consoleScrollPane.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 1));
        consolePanel.add(consoleHeaderPanel, BorderLayout.NORTH);
        consolePanel.add(consoleScrollPane, BorderLayout.CENTER);

        outputPanel.add(consolePanel, BorderLayout.CENTER);

        // Main layout with split pane
        JSplitPane mainSplitPane = new JSplitPane(
                JSplitPane.VERTICAL_SPLIT,
                editorPanel,
                outputPanel
        ) {
            {
                setDividerSize(8);
                setBackground(ACCENT_COLOR);
            }
        };
        mainSplitPane.setResizeWeight(0.7);
        mainSplitPane.setDividerLocation(450);
        mainSplitPane.setBorder(null);

        mainPanel.add(mainSplitPane, BorderLayout.CENTER);

        // Add main panel to frame
        add(mainPanel);

        // Setup event handlers
        setupEventHandlers();
    }

    /**
     * Setup event handlers for interactive components
     */
    private void setupEventHandlers() {
        // Compile button action
        compileButton.addActionListener(e -> compileCode());

        // Load file button action
        loadFileButton.addActionListener(e -> loadFile());

        // New tab button action
        newTabButton.addActionListener(e -> addNewTab("Untitled"));

        // Show parse tree button action
        showParseTreeButton.addActionListener(e -> showParseTree());

        // Tab hover effect
        tabbedPane.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int tab = tabbedPane.indexAtLocation(e.getX(), e.getY());
                if (tab >= 0) {
                    tabbedPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
                } else {
                    tabbedPane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
            }
        });
    }

    /**
     * Add a new code tab with a code editor
     */
    private void addNewTab(String title) {
        JTextArea codeEditor = new JTextArea();
        codeEditor.setFont(CODE_FONT);
        codeEditor.setLineWrap(true);
        codeEditor.setWrapStyleWord(true);
        codeEditor.setBackground(PRIMARY_COLOR);
        codeEditor.setForeground(TEXT_PRIMARY);
        codeEditor.setCaretColor(TEXT_PRIMARY);
        codeEditor.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BORDER_COLOR, 1),
                BorderFactory.createEmptyBorder(8, 8, 8, 8)
        ));

        JScrollPane codeScrollPane = new JScrollPane(codeEditor);
        codeScrollPane.setRowHeaderView(new TextLineNumber(codeEditor));
        codeScrollPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        codeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Add mouse wheel listener to code editor
        codeEditor.addMouseWheelListener(e -> {
            JScrollBar verticalScrollBar = codeScrollPane.getVerticalScrollBar();
            int unitsToScroll = e.getWheelRotation() * 3 * codeEditor.getFontMetrics(codeEditor.getFont()).getHeight();
            verticalScrollBar.setValue(verticalScrollBar.getValue() + unitsToScroll);
        });

        codeEditors.add(codeEditor);

        // Create tab component with close button
        JPanel tabPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        tabPanel.setOpaque(false);
        JLabel tabLabel = new JLabel(title);
        tabLabel.setForeground(TEXT_PRIMARY);
        JButton closeButton = new JButton("×") {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                boolean isHovered = getModel().isRollover();
                boolean isPressed = getModel().isPressed();
                g2d.setColor(isHovered || isPressed ? ERROR_COLOR : TEXT_SECONDARY);
                g2d.fillOval(2, 2, getWidth() - 4, getHeight() - 4);
                g2d.setColor(TEXT_PRIMARY);
                g2d.drawString("×", getWidth() / 2 - 3, getHeight() / 2 + 4);
                g2d.dispose();
            }
        };
        closeButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
        closeButton.setPreferredSize(new Dimension(16, 16));
        closeButton.setBorderPainted(false);
        closeButton.setFocusPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.addActionListener(e -> {
            int index = tabbedPane.indexOfTabComponent(tabPanel);
            if (index != -1) {
                tabbedPane.remove(index);
                String tabType = (String) tabbedPane.getClientProperty("tabType" + index);
                if (TAB_TYPE_CODE.equals(tabType)) {
                    codeEditors.remove(index);
                }
            }
        });

        tabPanel.add(tabLabel);
        tabPanel.add(closeButton);

        tabbedPane.addTab(title, codeScrollPane);
        tabbedPane.setTabComponentAt(tabbedPane.getTabCount() - 1, tabPanel);
        tabbedPane.putClientProperty("tabType" + (tabbedPane.getTabCount() - 1), TAB_TYPE_CODE);
        tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
    }

    /**
     * Add a new parse tree tab
     */
    private void addParseTreeTab(String title, Image parseTreeImage) {
        originalParseTreeImage = parseTreeImage;
        zoomScale = 1.0;

        JLabel parseTreeDisplay = new JLabel();
        parseTreeDisplay.setBackground(SECONDARY_COLOR);
        parseTreeDisplay.setOpaque(true);
        parseTreeDisplay.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 1));
        parseTreeDisplay.setHorizontalAlignment(JLabel.CENTER);
        parseTreeDisplay.setVerticalAlignment(JLabel.CENTER);

        JScrollPane treeScrollPane = new JScrollPane(parseTreeDisplay);
        treeScrollPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        treeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        treeScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Update image with initial zoom
        updateParseTreeImage(parseTreeDisplay, treeScrollPane, null);

        // Add mouse wheel listener for zooming
        parseTreeDisplay.addMouseWheelListener(e -> {
            Point mousePoint = e.getPoint();
            double oldZoomScale = zoomScale;
            if (e.getWheelRotation() < 0) {
                zoomScale = Math.min(zoomScale + 0.1, 3.0); // Zoom in, max 3x
            } else {
                zoomScale = Math.max(zoomScale - 0.1, 0.1); // Zoom out, min 0.1x
            }
            updateParseTreeImage(parseTreeDisplay, treeScrollPane, mousePoint);
            e.consume();
        });

        // Create tab component with close button
        JPanel tabPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        tabPanel.setOpaque(false);
        JLabel tabLabel = new JLabel(title);
        tabLabel.setForeground(TEXT_PRIMARY);
        JButton closeButton = new JButton("×") {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                boolean isHovered = getModel().isRollover();
                boolean isPressed = getModel().isPressed();
                g2d.setColor(isHovered || isPressed ? ERROR_COLOR : TEXT_SECONDARY);
                g2d.fillOval(2, 2, getWidth() - 4, getHeight() - 4);
                g2d.setColor(TEXT_PRIMARY);
                g2d.drawString("×", getWidth() / 2 - 3, getHeight() / 2 + 4);
                g2d.dispose();
            }
        };
        closeButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
        closeButton.setPreferredSize(new Dimension(16, 16));
        closeButton.setBorderPainted(false);
        closeButton.setFocusPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.addActionListener(e -> {
            int index = tabbedPane.indexOfTabComponent(tabPanel);
            if (index != -1) {
                tabbedPane.remove(index);
            }
        });

        tabPanel.add(tabLabel);
        tabPanel.add(closeButton);

        tabbedPane.addTab(title, treeScrollPane);
        tabbedPane.setTabComponentAt(tabbedPane.getTabCount() - 1, tabPanel);
        tabbedPane.putClientProperty("tabType" + (tabbedPane.getTabCount() - 1), TAB_TYPE_PARSE_TREE);
        tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
    }

    /**
     * Update the parse tree image with the current zoom scale
     */
    private void updateParseTreeImage(JLabel parseTreeDisplay, JScrollPane treeScrollPane, Point mousePoint) {
        if (originalParseTreeImage == null) {
            parseTreeDisplay.setText("Parse tree image not found");
            parseTreeDisplay.setIcon(null);
            return;
        }

        // Calculate mouse position relative to image before zooming
        JViewport viewport = treeScrollPane.getViewport();
        Point viewPos = viewport.getViewPosition();
        Dimension viewSize = viewport.getExtentSize();
        int mouseX = mousePoint != null ? mousePoint.x + viewPos.x : viewSize.width / 2;
        int mouseY = mousePoint != null ? mousePoint.y + viewPos.y : viewSize.height / 2;

        // Scale image
        int newWidth = (int) (originalParseTreeImage.getWidth(null) * zoomScale);
        int newHeight = (int) (originalParseTreeImage.getHeight(null) * zoomScale);
        Image scaledImage = originalParseTreeImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        parseTreeDisplay.setIcon(new ImageIcon(scaledImage));
        parseTreeDisplay.setText(null);

        // Update label size
        parseTreeDisplay.setPreferredSize(new Dimension(newWidth, newHeight));
        parseTreeDisplay.revalidate();

        // Center the view around the mouse point
        if (mousePoint != null) {
            int newX = (int) (mouseX * zoomScale / (zoomScale + 0.1)) - viewSize.width / 2;
            int newY = (int) (mouseY * zoomScale / (zoomScale + 0.1)) - viewSize.height / 2;
            newX = Math.max(0, Math.min(newX, newWidth - viewSize.width));
            newY = Math.max(0, Math.min(newY, newHeight - viewSize.height));
            viewport.setViewPosition(new Point(newX, newY));
        } else {
            // Center initially
            int newX = Math.max(0, (newWidth - viewSize.width) / 2);
            int newY = Math.max(0, (newHeight - viewSize.height) / 2);
            viewport.setViewPosition(new Point(newX, newY));
        }

        treeScrollPane.revalidate();
        treeScrollPane.repaint();
    }

    /**
     * Compile the code in the active editor
     */
    private void compileCode() {
        try {
            int selectedIndex = tabbedPane.getSelectedIndex();
            if (selectedIndex == -1) {
                outputConsole.setForeground(ERROR_COLOR);
                outputConsole.setText("No file open to compile");
                statusIndicator.setIcon(createColorIcon(ERROR_COLOR));
                return;
            }

            String tabType = (String) tabbedPane.getClientProperty("tabType" + selectedIndex);
            if (!TAB_TYPE_CODE.equals(tabType)) {
                outputConsole.setForeground(ERROR_COLOR);
                outputConsole.setText("Please select a code tab to compile");
                statusIndicator.setIcon(createColorIcon(ERROR_COLOR));
                return;
            }

            JTextArea activeEditor = codeEditors.get(selectedIndex);
            String sourceCode = activeEditor.getText();

            // Create ANTLR input stream
            ANTLRStringStream input = new ANTLRStringStream(sourceCode);
            ProjectFinalASTLexer lexer = new ProjectFinalASTLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new ProjectFinalASTParser(tokens);

            // Parse the input
            CommonTree tree = null;
            StringBuilder errorMessages = new StringBuilder();
            try {
                ProjectFinalASTParser.program_return r = parser.program();
                tree = (CommonTree) r.getTree();
            } catch (RecognitionException e) {
                errorMessages.append("Syntax error: ").append(e.getMessage()).append("\n");
                System.err.println("Parsing error: " + e.getMessage());
            }

            // Check parser errors
            String message = parser.s != null ? parser.s : "";
            if (errorMessages.length() > 0 || !message.isEmpty() && message.contains("line")) {
                outputConsole.setForeground(ERROR_COLOR);
                outputConsole.setText("Error: \n" + (errorMessages.length() > 0 ? errorMessages.toString() : message));
                statusIndicator.setIcon(createColorIcon(ERROR_COLOR));
                return;
            }

            // Proceed only if parsing was successful
            if (tree == null) {
                outputConsole.setForeground(ERROR_COLOR);
                outputConsole.setText("Error: Failed to generate parse tree");
                statusIndicator.setIcon(createColorIcon(ERROR_COLOR));
                return;
            }

            // Generate DOT representation
            DOTTreeGenerator dotGenerator = new DOTTreeGenerator();
            StringTemplate dotTemplate = dotGenerator.toDOT(tree);
            String dotGraph = dotTemplate.toString();
            try (PrintWriter dotFile = new PrintWriter(new File("Dot.dot"))) {
                dotFile.print(dotGraph);
            }

            // Run DOT process and capture output
            String dotOutput = runDotProcess();
            if (dotOutput != null && !dotOutput.isEmpty()) {
                outputConsole.setForeground(ERROR_COLOR);
                outputConsole.setText("Error in DOT processing: \n" + dotOutput);
                statusIndicator.setIcon(createColorIcon(ERROR_COLOR));
                return;
            }

            // Successful compilation
            outputConsole.setForeground(SUCCESS_COLOR);
            outputConsole.setText("Compiled Successfully \n" + message);
            statusIndicator.setIcon(createColorIcon(SUCCESS_COLOR));

        } catch (Exception ex) {
            outputConsole.setForeground(ERROR_COLOR);
            outputConsole.setText("Error during compilation: \n" + ex.getMessage());
            statusIndicator.setIcon(createColorIcon(ERROR_COLOR));
            ex.printStackTrace();
        }
    }

    /**
     * Run the DOT.BAT process and capture its output
     */
    private String runDotProcess() {
        try {
            ProcessBuilder pb = new ProcessBuilder("DOT.BAT");
            pb.redirectErrorStream(true); // Merge stdout and stderr
            Process process = pb.start();

            // Capture output
            StringBuilder output = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    output.append(line).append("\n");
                }
            }

            int exitCode = process.waitFor();
            if (exitCode != 0) {
                return "DOT.BAT failed with exit code " + exitCode + "\n" + output.toString();
            }
            return output.length() > 0 ? output.toString() : null;

        } catch (IOException | InterruptedException e) {
            return "Error running DOT.BAT: " + e.getMessage();
        }
    }

    /**
     * Load a file into a new tab
     */
    private void loadFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (Scanner scanner = new Scanner(selectedFile)) {
                StringBuilder content = new StringBuilder();

                while (scanner.hasNextLine()) {
                    content.append(scanner.nextLine()).append("\n");
                }

                addNewTab(selectedFile.getName());
                JTextArea activeEditor = codeEditors.get(codeEditors.size() - 1);
                activeEditor.setText(content.toString());
                outputConsole.setText("File loaded: " + selectedFile.getName());
                statusIndicator.setIcon(null);

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(
                        this,
                        "Error loading file: " + ex.getMessage(),
                        "File Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    /**
     * Display the parse tree in a new tab
     */
    private void showParseTree() {
        try {
            int selectedIndex = tabbedPane.getSelectedIndex();
            if (selectedIndex == -1) {
                outputConsole.setForeground(ERROR_COLOR);
                outputConsole.setText("No tab selected");
                statusIndicator.setIcon(createColorIcon(ERROR_COLOR));
                return;
            }

            String tabType = (String) tabbedPane.getClientProperty("tabType" + selectedIndex);
            if (!TAB_TYPE_CODE.equals(tabType)) {
                outputConsole.setForeground(ERROR_COLOR);
                outputConsole.setText("Please select a code tab to show its parse tree");
                statusIndicator.setIcon(createColorIcon(ERROR_COLOR));
                return;
            }

            String message = parser != null ? parser.s : "";
            if (message == null || message.contains("line")) {
                outputConsole.setForeground(ERROR_COLOR);
                outputConsole.setText("No valid parse tree available");
                statusIndicator.setIcon(createColorIcon(ERROR_COLOR));
                return;
            }

            File parseTreeFile = new File("Parse.png");
            Image parseTreeImage = null;
            if (parseTreeFile.exists()) {
                parseTreeImage = ImageIO.read(parseTreeFile);
            }

            String tabTitle = tabbedPane.getTitleAt(selectedIndex);
            addParseTreeTab("Parse Tree - " + tabTitle, parseTreeImage);

        } catch (Exception ex) {
            outputConsole.setForeground(ERROR_COLOR);
            outputConsole.setText("Error displaying parse tree: \n" + ex.getMessage());
            statusIndicator.setIcon(createColorIcon(ERROR_COLOR));
        }
    }

    /**
     * Create a styled panel with title and color
     */
    private JPanel createStyledPanel(String title, Color backgroundColor) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(backgroundColor);

        TitledBorder titledBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(ACCENT_COLOR, 2),
                title
        );
        titledBorder.setTitleFont(TITLE_FONT);
        titledBorder.setTitleColor(ACCENT_COLOR);

        panel.setBorder(BorderFactory.createCompoundBorder(
                titledBorder,
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));

        return panel;
    }

    /**
     * Create a styled button for the toolbar
     */
    private JButton createToolbarButton(String text, Color backgroundColor) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                boolean isHovered = getModel().isRollover();
                boolean isPressed = getModel().isPressed();

                // Determine background color
                Color bgColor;
                if (backgroundColor.equals(ACCENT_COLOR)) {
                    bgColor = isPressed ? new Color(0x01579B) : (isHovered ? new Color(0x4FC1E9) : ACCENT_COLOR);
                } else { // SUCCESS_COLOR
                    bgColor = isPressed ? new Color(0x1B5E20) : (isHovered ? new Color(0x4CAF50) : SUCCESS_COLOR);
                }

                // Draw shadow for raised effect
                if (!isPressed) {
                    g2d.setColor(new Color(0, 0, 0, 50));
                    g2d.fillRoundRect(2, 4, getWidth() - 4, getHeight() - 4, 12, 12);
                }

                // Draw button background
                g2d.setColor(bgColor);
                g2d.fillRoundRect(0, 0, getWidth() - 2, getHeight() - 2, 12, 12);

                // Draw text
                super.paintComponent(g);
                g2d.dispose();
            }
        };
        button.setFont(new Font("Segoe UI", Font.BOLD, 13));
        button.setForeground(TEXT_PRIMARY);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return button;
    }

    /**
     * Create a colored icon for status indication
     */
    private ImageIcon createColorIcon(Color color) {
        BufferedImage image = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        g2.setColor(color);
        g2.fillOval(0, 0, 15, 15);
        g2.dispose();
        return new ImageIcon(image);
    }

    /**
     * Main method to start the application
     */
    public static void main(String[] args) {
        // Set modern look and feel
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf"); // Light theme for eye comfort
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ex) {
                // Fallback to default
            }
        }

        // Launch application
        SwingUtilities.invokeLater(() -> {
            EnhancedCompilerGUI app = new EnhancedCompilerGUI();
            app.setVisible(true);
        });
    }

    /**
     * TextLineNumber component to display line numbers in the text editor
     */
    public class TextLineNumber extends JPanel {
        private final JTextComponent textComponent;
        private final FontMetrics fontMetrics;
        private final int height;
        private final int width;

        public TextLineNumber(JTextComponent textComponent) {
            this.textComponent = textComponent;
            this.fontMetrics = textComponent.getFontMetrics(textComponent.getFont());
            this.height = fontMetrics.getHeight();
            this.width = fontMetrics.stringWidth("9999") + 10;

            setPreferredSize(new Dimension(width, Integer.MAX_VALUE));
            setBackground(SECONDARY_COLOR);
            setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, BORDER_COLOR));

            // 🔁 إعادة الطلاء عند تعديل النص
            textComponent.getDocument().addDocumentListener(new DocumentListener() {
                public void insertUpdate(DocumentEvent e) {
                    repaint();
                }

                public void removeUpdate(DocumentEvent e) {
                    repaint();
                }

                public void changedUpdate(DocumentEvent e) {
                    repaint();
                }
            });

            // 🔁 إعادة الطلاء عند تمرير النص
            textComponent.addCaretListener(e -> repaint());

            // 🔁 إعادة الطلاء عند التمرير
            textComponent.addComponentListener(new ComponentAdapter() {
                public void componentResized(ComponentEvent e) {
                    repaint();
                }
            });

            // 🔁 إعادة الطلاء عند التمرير الرأسي
            textComponent.addPropertyChangeListener("document", evt -> repaint());

            textComponent.addMouseWheelListener(e -> repaint());
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            Rectangle bounds = g2d.getClipBounds();
            int startOffset = textComponent.viewToModel(new Point(0, bounds.y));
            int endOffset = textComponent.viewToModel(new Point(0, bounds.y + bounds.height));

            while (startOffset <= endOffset) {
                try {
                    int line = textComponent.getDocument().getDefaultRootElement().getElementIndex(startOffset) + 1;
                    String lineNumber = String.valueOf(line);

                    Rectangle r = textComponent.modelToView(startOffset);
                    if (r == null) break;

                    // Alternating background
                    g2d.setColor(line % 2 == 0 ? new Color(0xEEEEEE) : SECONDARY_COLOR);
                    g2d.fillRect(0, r.y, width, height);

                    int x = width - fontMetrics.stringWidth(lineNumber) - 5;
                    int y = r.y + fontMetrics.getAscent();

                    g2d.setColor(TEXT_SECONDARY);
                    g2d.drawString(lineNumber, x, y);

                    startOffset = Utilities.getRowEnd(textComponent, startOffset) + 1;
                } catch (BadLocationException e) {
                    break;
                }
            }

            g2d.dispose();
        }
    }
}