grammar ProjectFinalAST;

options {
  language = Java;
  output = AST;
}

tokens {
    PROGRAM;
    INCLUDES;
    INCLUDE;
    Iostream;
    Cstring;
    Vector;
    Map;
    Set;
    Fstream;
    DEFINITION;
    FUNCTION_DEF;
    CLASS_DEF;
    MACRO_DEF;
    NAMESPACE;
    PARAMETERS;
    BODY;
    STATEMENTS;
    DECLARATION;
    ASSIGNMENT;
    RETURN;
    CONTROL;
    EXPRESSION;
    TYPE;
    POINTER;
    ARRAY;
    MEMBER;
    CONSTRUCTOR;
    PARAMETER;
    MARCO_BODY; 
    MARCO_NAME;
    LITERAL;
    VOID;
    INT;
    DOUBLE;
    CHAR;
    BOOL;
    FOR;
    WHILE;
    NEW;
    DELETE;
    STATIC;
    CONST;
    FRIEND;
    CLASS;
    PUBLIC;
    PRIVATE;
    THIS;
    USING;
    NAMESPACE_KW;
    STD;
    COUT;
    CIN;
    TRUE;
    FALSE;
    PLUS;
    MINUS;
    STAR;
    DIV;
    MOD;
    EQ;
    NEQ;
    LT;
    GT;
    LE;
    GE;
    AND;
    OR;
    ASSIGN;
    PLUSEQ;
    MINUSEQ;
    STAREQ;
    DIVEQ;
    MODEQ;
    INCR;
    DECR;
    DOT;
    ARROW;
    SCOPE;
    COMMA;
    SEMICOLON;
    LPAREN;
    RPAREN;
    LBRACE;
    RBRACE;
    LBRACK;
    RBRACK;
    SHARP;
    INCLUDE_KW;
    DEFINE;
    STRING_LITERAL;
    INTEGER_LITERAL;
    FLOAT_LITERAL;
    IDENTIFIER;
    DECLARATIONCLASS;
    CLASSCALL;
    CLASSDECL;
    CALLCLASS;
    STATTHIS;
    DIMENSIONS;
    INIT;
    DEREF;
    POSTINCR;
    POSTDECR;
    ARGS;
    CALL;
    ASSIGNMENTLIST;
    EXTRACT;
    COLON;
    INSERT;
    DECLARATIONLIST;
    DECLARATOR;
    DOWHILE;
    FORUPDATE;
}

@members {
    String s = "";
    
    // Override displayRecognitionError to capture errors
    public void displayRecognitionError(String[] tokenNames, org.antlr.runtime.RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        s += msg + ": " + hdr + "\n";
    }
    
    // Override reportError to append to s
    public void reportError(org.antlr.runtime.RecognitionException e) {
        displayRecognitionError(getTokenNames(), e);
    }
}

@lexer::members {
    // Override displayRecognitionError for lexer errors
    public void displayRecognitionError(String[] tokenNames, org.antlr.runtime.RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        parser.s += msg + ": " + hdr + "\n";
    }
    
    // Override reportError for lexer
    public void reportError(org.antlr.runtime.RecognitionException e) {
        displayRecognitionError(getTokenNames(), e);
    }
    
    // Reference to parser for appending errors
    public ProjectFinalASTParser parser;
}

// Apply catch block to all rules
@rulecatch {
    catch (org.antlr.runtime.RecognitionException e) {
        s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
    }
}

program
    : includes? definition* EOF -> ^(PROGRAM includes? definition*)
    ;

includes
    : include+ -> ^(INCLUDES include+)
    ;

include
    : '#''include' library -> ^(INCLUDE '#''include' library)
    ;

library
    : '<iostream>' -> ^(Iostream '<iostream>')
    | '<cstring>' -> ^(Cstring '<cstring>')
    | '<vector>' -> ^(Vector '<vector>')
    | '<map>' -> ^(Map '<map>')
    | '<set>' -> ^(Set '<set>')
    | '<fstream>' -> ^(Fstream '<fstream>')
    ;

definition
    : functionDefinition -> ^(DEFINITION functionDefinition)
    | classDefinition -> ^(DEFINITION classDefinition)
    | macroDefinition -> ^(DEFINITION macroDefinition)
    | nameSpace -> ^(DEFINITION nameSpace)
    ;

functionDefinition
    : returnType functionName '(' parameters? ')' (body | ';') 
    -> ^(FUNCTION_DEF returnType functionName '(' parameters? ')' body?)
    ;

pointer
    : returnType '(' '*' functionName ')' '(' parameters? ')' -> ^(POINTER returnType functionName parameters?)
    ;

returnType
    : 'void' -> ^(VOID 'void')
    | 'int' -> ^(INT 'int')
    | 'double' -> ^(DOUBLE 'double')
    | customType -> ^(TYPE customType)
    | 'int' pointerOp -> ^(INT 'int' pointerOp)
    | 'double' pointerOp -> ^(DOUBLE 'double' pointerOp)
    ;

functionName
    : identifier -> ^(IDENTIFIER identifier)
    ;

parameters
    : parameter (',' parameter)* -> ^(PARAMETERS parameter+)
    | functionDefinition -> ^(PARAMETERS functionDefinition)
    | pointer -> ^(PARAMETERS pointer)
    ;

parameter
    : typeSpecifier identifier? arrayDimensions? -> ^(PARAMETER typeSpecifier identifier? arrayDimensions?)
    ;

typeSpecifier
    : baseType pointerOp* -> ^(TYPE baseType pointerOp*)
    ;

baseType
    : 'int' -> ^(INT 'int')
    | 'double' -> ^(DOUBLE 'double')
    | 'char' -> ^(CHAR 'char')
    | 'bool' -> ^(BOOL 'bool')
    | customType -> customType
    ;

pointerOp
    : '*' -> ^(POINTER '*')
    | '&' -> ^(POINTER '&')
    ;

customType
    : identifier -> ^(TYPE identifier)
    ;

identifier
    : IDENTIFIER -> ^(IDENTIFIER IDENTIFIER)
    ;

body
    : '{' statement* '}' -> ^(BODY statement*)
    ;

statement
    : declaration -> ^(DECLARATION declaration)
    | assignment -> ^(ASSIGNMENT assignment)
    | functionCall ';' -> ^(EXPRESSION functionCall)
    | controlStructure -> ^(CONTROL controlStructure)
    | returnStatement -> ^(RETURN returnStatement)
    | coutStatement -> ^(COUT coutStatement)
    | pointerDeallocation ';' -> ^(EXPRESSION pointerDeallocation)
    | cinStatement -> ^(CIN cinStatement)
    | incrementExpr ';' -> ^(EXPRESSION incrementExpr)
    | statthis ';' -> ^(EXPRESSION statthis)
    | declarationclass ';' -> ^(DECLARATION declarationclass)
    | callclass ';' -> ^(EXPRESSION callclass)
    | className '::' functionCall ';' -> ^(EXPRESSION ^(SCOPE className functionCall))
    ;

declarationclass
    : (declarationclass1 | declarationclass2)+ -> ^(DECLARATIONCLASS declarationclass1* declarationclass2*)
    ;

declarationclass1
    : className functionCall -> ^(CLASSCALL className functionCall)
    ;

declarationclass2
    : className identifier (',' identifier)* -> ^(CLASSDECL className identifier+)
    ;

callclass
    : identifier '.' functionCall -> ^(CALLCLASS identifier functionCall)
    ;

statthis
    : 'this' '->' identifier '=' identifier -> ^(STATTHIS THIS ARROW identifier ASSIGN identifier)
    ;

declaration
    : typeSpecifier identifier (',' identifier)* arrayDimensions? ('{' '}' | '=' arrayInitialization | '=' expression)? ';' 
      -> ^(DECLARATION typeSpecifier identifier+ arrayDimensions? arrayInitialization? expression?)
    | pointerDeclaration -> ^(DECLARATION pointerDeclaration)
    ;

intArray
    : identifier arrayDimensions? -> ^(ARRAY identifier arrayDimensions?)
    ;

arrayDimensions
    : ('[' expression? ']')+ -> ^(DIMENSIONS expression*)
    ;

arrayInitialization
    : '{' (expression (',' expression)*)? '}' -> ^(INIT expression*)
    ;

pointerDeclaration
    : baseType pointerOp+ identifier ('=' pointerAssignment)? ';' 
      -> ^(DECLARATION baseType ^(POINTER pointerOp+) identifier pointerAssignment?)
    ;

memoryDeclaration
    : baseType pointerOp+ functionDefinition -> ^(DECLARATION baseType ^(POINTER pointerOp+) functionDefinition)
    ;

pointerAssignment
    : 'new' baseType (arrayDimensions arrayInitialization | '(' expressionList? ')')? 
      -> ^(NEW baseType arrayDimensions? arrayInitialization? expressionList?)
    ;

pointerDeallocation
    : 'delete' ('[' ']')? intArray -> ^(DELETE ('[' ']')? intArray)
    ;

pointerDereference
    : '*' identifier -> ^(DEREF '*' identifier)
    ;

assignment
    : identifier assignmentOperator expression ';' 
      -> ^(ASSIGNMENT identifier assignmentOperator expression)
    ;

expression
    : updateExpression -> ^(EXPRESSION updateExpression)
    ;

updateExpression
    : incrementExpr -> ^(EXPRESSION incrementExpr)
    | assignmentExpr -> ^(EXPRESSION assignmentExpr)
    | binaryExpression -> ^(EXPRESSION binaryExpression)
    ;

incrementExpr
    : '++' identifier -> ^(INCR '++' identifier)
    | '--' identifier -> ^(DECR '--' identifier)
    | identifier '++' -> ^(POSTINCR identifier '++')
    | identifier '--' -> ^(POSTDECR identifier '--')
    ;

assignmentOperator
    : '=' -> ^(ASSIGN '=')
    | '+=' -> ^(PLUSEQ '+=')
    | '-=' -> ^(MINUSEQ '-=')
    | '*=' -> ^(STAREQ '*=')
    | '/=' -> ^(DIVEQ '/=')
    | '%=' -> ^(MODEQ '%=')
    ;

binaryExpression
    : primaryExpression (binaryOp primaryExpression)* -> ^(EXPRESSION primaryExpression binaryOp* primaryExpression*)
    ;

binaryOp
    : '+' -> ^(PLUS '+')
    | '-' -> ^(MINUS '-')
    | '*' -> ^(STAR '*')
    | '/' -> ^(DIV '/')
    | '%' -> ^(MOD '%')
    | '==' -> ^(EQ '==')
    | '!=' -> ^(NEQ '!=')
    | '<' -> ^(LT '<')
    | '>' -> ^(GT '>')
    | '<=' -> ^(LE '<=')
    | '>=' -> ^(GE '>=')
    | '&&' -> ^(AND '&&')
    | '||' -> ^(OR '||')
    ;

primaryExpression
    : identifier -> ^(IDENTIFIER identifier)
    | literal -> ^(LITERAL literal)
    | functionCall -> ^(CALL functionCall)
    | pointerDereference -> ^(DEREF pointerDereference)
    | '(' expression ')' -> ^(EXPRESSION expression)
    ;

literal
    : INTEGER_LITERAL -> ^(LITERAL INTEGER_LITERAL)
    | FLOAT_LITERAL -> ^(LITERAL FLOAT_LITERAL)
    | '-' INTEGER_LITERAL -> ^(MINUS INTEGER_LITERAL)
    | '-' FLOAT_LITERAL -> ^(MINUS FLOAT_LITERAL)
    | STRING_LITERAL -> ^(LITERAL STRING_LITERAL)
    | 'true' -> ^(TRUE 'true')
    | 'false' -> ^(FALSE 'false')
    ;

functionCall
    : functionName '(' expressionList? ')' -> ^(CALL functionName expressionList?)
    ;

expressionList
    : expression (',' expression)* -> ^(ARGS expression+)
    ;

returnStatement
    : 'return' (expression | pointerAssignment)? ';' -> ^(RETURN expression? pointerAssignment?)
    ;

controlStructure
    : ifStatement -> ^(CONTROL ifStatement)
    | forLoop -> ^(CONTROL forLoop)
    | whileLoop -> ^(CONTROL whileLoop)
    | doWhileLoop -> ^(CONTROL doWhileLoop)
    ;

ifStatement
    : 'if' '(' expression ')' (body | singleStatement) elsePart? -> ^(CONTROL 'if' expression body? singleStatement? elsePart?)
    ;

elsePart
    : 'else' (body | singleStatement) -> ^(CONTROL 'else' body? singleStatement?)
    ;

singleStatement
    : statement -> ^(STATEMENTS statement)
    ;

forLoop
    : 'for' '(' forInit? ';' expression? ';' forUpdate? ')' body 
      -> ^(FOR forInit? expression? forUpdate? body)
    ;

forInit
    : declarationList -> ^(DECLARATIONLIST declarationList)
    | assignmentList -> ^(ASSIGNMENTLIST assignmentList)
    ;

declarationList
    : typeSpecifier declarator (',' declarator)* 
      -> ^(DECLARATIONLIST typeSpecifier declarator+)
    ;

declarator
    : identifier ('=' expression)? -> ^(DECLARATOR identifier expression?)
    ;

assignmentList
    : assignmentExpr (',' assignmentExpr)* -> ^(ASSIGNMENTLIST assignmentExpr+)
    ;

assignmentExpr
    : identifier '=' expression -> ^(ASSIGN identifier expression)
    ;

forUpdate
    : expression (',' expression)* -> ^(FORUPDATE expression+)
    ;

whileLoop
    : 'while' '(' expression ')' body -> ^(WHILE expression body)
    ;

doWhileLoop
    : 'do' body 'while' '(' expression ')' ';' -> ^(DOWHILE body expression)
    ;

classDefinition
    : 'class' className ('{' classBody* '}')? ';' -> ^(CLASS_DEF className classBody*)
    | voidHelper body? -> ^(CLASS_DEF voidHelper body?)
    ;

className
    : identifier -> ^(IDENTIFIER identifier)
    ;

classBody
    : privpub member* -> ^(BODY privpub member*)
    ;

privpub
    : 'public:' -> ^(PUBLIC 'public:')
    | 'private:' -> ^(PRIVATE 'private:')
    ;

member
    : declaration -> ^(DECLARATION declaration)
    | classFunction -> ^(FUNCTION_DEF classFunction)
    | constructorDefinition -> ^(CONSTRUCTOR constructorDefinition)
    | friendFunction ';' -> ^(FRIEND friendFunction)
    | staticMember -> ^(STATIC staticMember)
    | staticFunctionDefinition -> ^(FUNCTION_DEF staticFunctionDefinition)
    ;

staticFunctionDefinition
    : 'static' returnType functionName '(' parameter? ')' body 
      -> ^(FUNCTION_DEF 'static' returnType functionName parameter? body)
    ;

staticMember
    : 'static' declaration -> ^(STATIC declaration)
    ;

classFunction
    : returnType functionName '(' parameter? ')' constSpecifier? (body | ';') 
      -> ^(FUNCTION_DEF returnType functionName parameter? constSpecifier? body?)
    ;

constSpecifier
    : 'const' -> ^(CONST 'const')
    ;

constructorDefinition
    : constructorDefinitionBody (':' constructorDefinitionBody)* body 
      -> ^(CONSTRUCTOR constructorDefinitionBody+ body)
    ;

constructorDefinitionBody
    : className '(' parameter? ')' -> ^(CONSTRUCTOR className parameter?)
    ;

friendFunction
    : 'friend' voidHelper -> ^(FRIEND voidHelper)
    ;

voidHelper
    : returnType functionName '::' (functionName '(' parameter ')' | assignment) 
      -> ^(FUNCTION_DEF returnType functionName functionName? parameter? assignment?)
    ;

friendFunctionCall
    : functionName '(' expressionList? ')' -> ^(CALL functionName expressionList?)
    ;

coutStatement
    : 'cout' coutOp+ ';' -> ^(COUT coutOp+ ';')
    ;

cinStatement
    : 'cin' cinOp+ ';' -> ^(CIN cinOp+)
    ;

cinOp
    : '>>' identifier -> ^(EXTRACT '>>' identifier)
    ;

coutOp
    : '<<' (functionCall | STRING_LITERAL | intArray | literal | expression | memberAccess) 
      -> ^(INSERT '<<' functionCall? STRING_LITERAL? intArray? literal? expression? memberAccess?)
    ;

memberAccess
    : identifier '.' identifier -> ^(MEMBER identifier '.' identifier)
    ;

nameSpace
    : 'using' 'namespace' 'std' ';' -> ^(NAMESPACE 'using' 'namespace' 'std')
    ;

macroDefinition
    : '#define' macroName macroArgs? macroBody -> ^(MACRO_DEF macroName macroArgs? macroBody)
    ;

macroName
    : identifier -> ^(MARCO_NAME identifier)
    ;

macroArgs
    : '(' identifier (',' identifier)* ')' -> ^(PARAMETERS identifier+)
    ;

macroBody
    : expression -> ^(MARCO_BODY expression)
    ;

// Lexer rules
IDENTIFIER
    : ('a'..'z'|'A'..'Z'|'_'|'$') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$')*
    ;

INTEGER_LITERAL
    : ('0'..'9')+
    ;

FLOAT_LITERAL
    : ('0'..'9')* '.' ('0'..'9')+
    ;

STRING_LITERAL
    : '"' ( ~('"'|'\\') | '\\' . )* '"'
    ;

WHITESPACE
    : (' '|'\t'|'\n'|'\r')+ { $channel = HIDDEN; }
    ;

COMMENT
    : '//' ~('\n'|'\r')* ('\n'|'\r'('\n')?) { $channel = HIDDEN; }
    | '/*' .* '*/' { $channel = HIDDEN; }
    ;