// $ANTLR 3.4 E:\\material\\cs407\\finalProject\\ProjectFinalAST.g 2025-05-15 04:46:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ProjectFinalASTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGS", "ARRAY", "ARROW", "ASSIGN", "ASSIGNMENT", "ASSIGNMENTLIST", "BODY", "BOOL", "CALL", "CALLCLASS", "CHAR", "CIN", "CLASS", "CLASSCALL", "CLASSDECL", "CLASS_DEF", "COLON", "COMMA", "COMMENT", "CONST", "CONSTRUCTOR", "CONTROL", "COUT", "Cstring", "DECLARATION", "DECLARATIONCLASS", "DECLARATIONLIST", "DECLARATOR", "DECR", "DEFINE", "DEFINITION", "DELETE", "DEREF", "DIMENSIONS", "DIV", "DIVEQ", "DOT", "DOUBLE", "DOWHILE", "EQ", "EXPRESSION", "EXTRACT", "FALSE", "FLOAT_LITERAL", "FOR", "FORUPDATE", "FRIEND", "FUNCTION_DEF", "Fstream", "GE", "GT", "IDENTIFIER", "INCLUDE", "INCLUDES", "INCLUDE_KW", "INCR", "INIT", "INSERT", "INT", "INTEGER_LITERAL", "Iostream", "LBRACE", "LBRACK", "LE", "LITERAL", "LPAREN", "LT", "MACRO_DEF", "MARCO_BODY", "MARCO_NAME", "MEMBER", "MINUS", "MINUSEQ", "MOD", "MODEQ", "Map", "NAMESPACE", "NAMESPACE_KW", "NEQ", "NEW", "OR", "PARAMETER", "PARAMETERS", "PLUS", "PLUSEQ", "POINTER", "POSTDECR", "POSTINCR", "PRIVATE", "PROGRAM", "PUBLIC", "RBRACE", "RBRACK", "RETURN", "RPAREN", "SCOPE", "SEMICOLON", "SHARP", "STAR", "STAREQ", "STATEMENTS", "STATIC", "STATTHIS", "STD", "STRING_LITERAL", "Set", "THIS", "TRUE", "TYPE", "USING", "VOID", "Vector", "WHILE", "WHITESPACE", "'!='", "'#'", "'#define'", "'%'", "'%='", "'&&'", "'&'", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'.'", "'/'", "'/='", "':'", "'::'", "';'", "'<'", "'<<'", "'<='", "'<cstring>'", "'<fstream>'", "'<iostream>'", "'<map>'", "'<set>'", "'<vector>'", "'='", "'=='", "'>'", "'>='", "'>>'", "'['", "']'", "'bool'", "'char'", "'cin'", "'class'", "'const'", "'cout'", "'delete'", "'do'", "'double'", "'else'", "'false'", "'for'", "'friend'", "'if'", "'include'", "'int'", "'namespace'", "'new'", "'private:'", "'public:'", "'return'", "'static'", "'std'", "'this'", "'true'", "'using'", "'void'", "'while'", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__136=136;
    public static final int T__137=137;
    public static final int T__138=138;
    public static final int T__139=139;
    public static final int T__140=140;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__147=147;
    public static final int T__148=148;
    public static final int T__149=149;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__158=158;
    public static final int T__159=159;
    public static final int T__160=160;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int T__169=169;
    public static final int T__170=170;
    public static final int T__171=171;
    public static final int T__172=172;
    public static final int T__173=173;
    public static final int T__174=174;
    public static final int T__175=175;
    public static final int T__176=176;
    public static final int T__177=177;
    public static final int T__178=178;
    public static final int T__179=179;
    public static final int T__180=180;
    public static final int T__181=181;
    public static final int T__182=182;
    public static final int T__183=183;
    public static final int T__184=184;
    public static final int T__185=185;
    public static final int T__186=186;
    public static final int T__187=187;
    public static final int T__188=188;
    public static final int T__189=189;
    public static final int T__190=190;
    public static final int AND=4;
    public static final int ARGS=5;
    public static final int ARRAY=6;
    public static final int ARROW=7;
    public static final int ASSIGN=8;
    public static final int ASSIGNMENT=9;
    public static final int ASSIGNMENTLIST=10;
    public static final int BODY=11;
    public static final int BOOL=12;
    public static final int CALL=13;
    public static final int CALLCLASS=14;
    public static final int CHAR=15;
    public static final int CIN=16;
    public static final int CLASS=17;
    public static final int CLASSCALL=18;
    public static final int CLASSDECL=19;
    public static final int CLASS_DEF=20;
    public static final int COLON=21;
    public static final int COMMA=22;
    public static final int COMMENT=23;
    public static final int CONST=24;
    public static final int CONSTRUCTOR=25;
    public static final int CONTROL=26;
    public static final int COUT=27;
    public static final int Cstring=28;
    public static final int DECLARATION=29;
    public static final int DECLARATIONCLASS=30;
    public static final int DECLARATIONLIST=31;
    public static final int DECLARATOR=32;
    public static final int DECR=33;
    public static final int DEFINE=34;
    public static final int DEFINITION=35;
    public static final int DELETE=36;
    public static final int DEREF=37;
    public static final int DIMENSIONS=38;
    public static final int DIV=39;
    public static final int DIVEQ=40;
    public static final int DOT=41;
    public static final int DOUBLE=42;
    public static final int DOWHILE=43;
    public static final int EQ=44;
    public static final int EXPRESSION=45;
    public static final int EXTRACT=46;
    public static final int FALSE=47;
    public static final int FLOAT_LITERAL=48;
    public static final int FOR=49;
    public static final int FORUPDATE=50;
    public static final int FRIEND=51;
    public static final int FUNCTION_DEF=52;
    public static final int Fstream=53;
    public static final int GE=54;
    public static final int GT=55;
    public static final int IDENTIFIER=56;
    public static final int INCLUDE=57;
    public static final int INCLUDES=58;
    public static final int INCLUDE_KW=59;
    public static final int INCR=60;
    public static final int INIT=61;
    public static final int INSERT=62;
    public static final int INT=63;
    public static final int INTEGER_LITERAL=64;
    public static final int Iostream=65;
    public static final int LBRACE=66;
    public static final int LBRACK=67;
    public static final int LE=68;
    public static final int LITERAL=69;
    public static final int LPAREN=70;
    public static final int LT=71;
    public static final int MACRO_DEF=72;
    public static final int MARCO_BODY=73;
    public static final int MARCO_NAME=74;
    public static final int MEMBER=75;
    public static final int MINUS=76;
    public static final int MINUSEQ=77;
    public static final int MOD=78;
    public static final int MODEQ=79;
    public static final int Map=80;
    public static final int NAMESPACE=81;
    public static final int NAMESPACE_KW=82;
    public static final int NEQ=83;
    public static final int NEW=84;
    public static final int OR=85;
    public static final int PARAMETER=86;
    public static final int PARAMETERS=87;
    public static final int PLUS=88;
    public static final int PLUSEQ=89;
    public static final int POINTER=90;
    public static final int POSTDECR=91;
    public static final int POSTINCR=92;
    public static final int PRIVATE=93;
    public static final int PROGRAM=94;
    public static final int PUBLIC=95;
    public static final int RBRACE=96;
    public static final int RBRACK=97;
    public static final int RETURN=98;
    public static final int RPAREN=99;
    public static final int SCOPE=100;
    public static final int SEMICOLON=101;
    public static final int SHARP=102;
    public static final int STAR=103;
    public static final int STAREQ=104;
    public static final int STATEMENTS=105;
    public static final int STATIC=106;
    public static final int STATTHIS=107;
    public static final int STD=108;
    public static final int STRING_LITERAL=109;
    public static final int Set=110;
    public static final int THIS=111;
    public static final int TRUE=112;
    public static final int TYPE=113;
    public static final int USING=114;
    public static final int VOID=115;
    public static final int Vector=116;
    public static final int WHILE=117;
    public static final int WHITESPACE=118;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ProjectFinalASTParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ProjectFinalASTParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ProjectFinalASTParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\material\\cs407\\finalProject\\ProjectFinalAST.g"; }


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


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:164:1: program : ( includes )? ( definition )* EOF -> ^( PROGRAM ( includes )? ( definition )* ) ;
    public final ProjectFinalASTParser.program_return program() throws RecognitionException {
        ProjectFinalASTParser.program_return retval = new ProjectFinalASTParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF3=null;
        ProjectFinalASTParser.includes_return includes1 =null;

        ProjectFinalASTParser.definition_return definition2 =null;


        Object EOF3_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_includes=new RewriteRuleSubtreeStream(adaptor,"rule includes");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:165:5: ( ( includes )? ( definition )* EOF -> ^( PROGRAM ( includes )? ( definition )* ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:165:7: ( includes )? ( definition )* EOF
            {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:165:7: ( includes )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==120) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:165:7: includes
                    {
                    pushFollow(FOLLOW_includes_in_program856);
                    includes1=includes();

                    state._fsp--;

                    stream_includes.add(includes1.getTree());

                    }
                    break;

            }


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:165:17: ( definition )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENTIFIER||LA2_0==121||LA2_0==163||LA2_0==168||LA2_0==175||(LA2_0 >= 185 && LA2_0 <= 186)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:165:17: definition
            	    {
            	    pushFollow(FOLLOW_definition_in_program859);
            	    definition2=definition();

            	    state._fsp--;

            	    stream_definition.add(definition2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program862);  
            stream_EOF.add(EOF3);


            // AST REWRITE
            // elements: definition, includes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 165:33: -> ^( PROGRAM ( includes )? ( definition )* )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:165:36: ^( PROGRAM ( includes )? ( definition )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:165:46: ( includes )?
                if ( stream_includes.hasNext() ) {
                    adaptor.addChild(root_1, stream_includes.nextTree());

                }
                stream_includes.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:165:56: ( definition )*
                while ( stream_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition.nextTree());

                }
                stream_definition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class includes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "includes"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:168:1: includes : ( include )+ -> ^( INCLUDES ( include )+ ) ;
    public final ProjectFinalASTParser.includes_return includes() throws RecognitionException {
        ProjectFinalASTParser.includes_return retval = new ProjectFinalASTParser.includes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.include_return include4 =null;


        RewriteRuleSubtreeStream stream_include=new RewriteRuleSubtreeStream(adaptor,"rule include");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:169:5: ( ( include )+ -> ^( INCLUDES ( include )+ ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:169:7: ( include )+
            {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:169:7: ( include )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==120) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:169:7: include
            	    {
            	    pushFollow(FOLLOW_include_in_includes891);
            	    include4=include();

            	    state._fsp--;

            	    stream_include.add(include4.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            // AST REWRITE
            // elements: include
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 169:16: -> ^( INCLUDES ( include )+ )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:169:19: ^( INCLUDES ( include )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INCLUDES, "INCLUDES")
                , root_1);

                if ( !(stream_include.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_include.hasNext() ) {
                    adaptor.addChild(root_1, stream_include.nextTree());

                }
                stream_include.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "includes"


    public static class include_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "include"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:172:1: include : '#' 'include' library -> ^( INCLUDE '#' 'include' library ) ;
    public final ProjectFinalASTParser.include_return include() throws RecognitionException {
        ProjectFinalASTParser.include_return retval = new ProjectFinalASTParser.include_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal5=null;
        Token string_literal6=null;
        ProjectFinalASTParser.library_return library7 =null;


        Object char_literal5_tree=null;
        Object string_literal6_tree=null;
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_library=new RewriteRuleSubtreeStream(adaptor,"rule library");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:173:5: ( '#' 'include' library -> ^( INCLUDE '#' 'include' library ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:173:7: '#' 'include' library
            {
            char_literal5=(Token)match(input,120,FOLLOW_120_in_include918);  
            stream_120.add(char_literal5);


            string_literal6=(Token)match(input,174,FOLLOW_174_in_include919);  
            stream_174.add(string_literal6);


            pushFollow(FOLLOW_library_in_include921);
            library7=library();

            state._fsp--;

            stream_library.add(library7.getTree());

            // AST REWRITE
            // elements: 120, 174, library
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 173:28: -> ^( INCLUDE '#' 'include' library )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:173:31: ^( INCLUDE '#' 'include' library )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INCLUDE, "INCLUDE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_120.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_174.nextNode()
                );

                adaptor.addChild(root_1, stream_library.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "include"


    public static class library_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "library"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:176:1: library : ( '<iostream>' -> ^( Iostream '<iostream>' ) | '<cstring>' -> ^( Cstring '<cstring>' ) | '<vector>' -> ^( Vector '<vector>' ) | '<map>' -> ^( Map '<map>' ) | '<set>' -> ^( Set '<set>' ) | '<fstream>' -> ^( Fstream '<fstream>' ) );
    public final ProjectFinalASTParser.library_return library() throws RecognitionException {
        ProjectFinalASTParser.library_return retval = new ProjectFinalASTParser.library_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal8=null;
        Token string_literal9=null;
        Token string_literal10=null;
        Token string_literal11=null;
        Token string_literal12=null;
        Token string_literal13=null;

        Object string_literal8_tree=null;
        Object string_literal9_tree=null;
        Object string_literal10_tree=null;
        Object string_literal11_tree=null;
        Object string_literal12_tree=null;
        Object string_literal13_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");

        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:177:5: ( '<iostream>' -> ^( Iostream '<iostream>' ) | '<cstring>' -> ^( Cstring '<cstring>' ) | '<vector>' -> ^( Vector '<vector>' ) | '<map>' -> ^( Map '<map>' ) | '<set>' -> ^( Set '<set>' ) | '<fstream>' -> ^( Fstream '<fstream>' ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 149:
                {
                alt4=1;
                }
                break;
            case 147:
                {
                alt4=2;
                }
                break;
            case 152:
                {
                alt4=3;
                }
                break;
            case 150:
                {
                alt4=4;
                }
                break;
            case 151:
                {
                alt4=5;
                }
                break;
            case 148:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:177:7: '<iostream>'
                    {
                    string_literal8=(Token)match(input,149,FOLLOW_149_in_library949);  
                    stream_149.add(string_literal8);


                    // AST REWRITE
                    // elements: 149
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:20: -> ^( Iostream '<iostream>' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:177:23: ^( Iostream '<iostream>' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Iostream, "Iostream")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_149.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:178:7: '<cstring>'
                    {
                    string_literal9=(Token)match(input,147,FOLLOW_147_in_library965);  
                    stream_147.add(string_literal9);


                    // AST REWRITE
                    // elements: 147
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 178:19: -> ^( Cstring '<cstring>' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:178:22: ^( Cstring '<cstring>' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Cstring, "Cstring")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_147.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:179:7: '<vector>'
                    {
                    string_literal10=(Token)match(input,152,FOLLOW_152_in_library981);  
                    stream_152.add(string_literal10);


                    // AST REWRITE
                    // elements: 152
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:18: -> ^( Vector '<vector>' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:179:21: ^( Vector '<vector>' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Vector, "Vector")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_152.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:180:7: '<map>'
                    {
                    string_literal11=(Token)match(input,150,FOLLOW_150_in_library997);  
                    stream_150.add(string_literal11);


                    // AST REWRITE
                    // elements: 150
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 180:15: -> ^( Map '<map>' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:180:18: ^( Map '<map>' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Map, "Map")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_150.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:181:7: '<set>'
                    {
                    string_literal12=(Token)match(input,151,FOLLOW_151_in_library1013);  
                    stream_151.add(string_literal12);


                    // AST REWRITE
                    // elements: 151
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 181:15: -> ^( Set '<set>' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:181:18: ^( Set '<set>' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Set, "Set")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_151.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:182:7: '<fstream>'
                    {
                    string_literal13=(Token)match(input,148,FOLLOW_148_in_library1029);  
                    stream_148.add(string_literal13);


                    // AST REWRITE
                    // elements: 148
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:19: -> ^( Fstream '<fstream>' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:182:22: ^( Fstream '<fstream>' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Fstream, "Fstream")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_148.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "library"


    public static class definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definition"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:185:1: definition : ( functionDefinition -> ^( DEFINITION functionDefinition ) | classDefinition -> ^( DEFINITION classDefinition ) | macroDefinition -> ^( DEFINITION macroDefinition ) | nameSpace -> ^( DEFINITION nameSpace ) );
    public final ProjectFinalASTParser.definition_return definition() throws RecognitionException {
        ProjectFinalASTParser.definition_return retval = new ProjectFinalASTParser.definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.functionDefinition_return functionDefinition14 =null;

        ProjectFinalASTParser.classDefinition_return classDefinition15 =null;

        ProjectFinalASTParser.macroDefinition_return macroDefinition16 =null;

        ProjectFinalASTParser.nameSpace_return nameSpace17 =null;


        RewriteRuleSubtreeStream stream_functionDefinition=new RewriteRuleSubtreeStream(adaptor,"rule functionDefinition");
        RewriteRuleSubtreeStream stream_nameSpace=new RewriteRuleSubtreeStream(adaptor,"rule nameSpace");
        RewriteRuleSubtreeStream stream_classDefinition=new RewriteRuleSubtreeStream(adaptor,"rule classDefinition");
        RewriteRuleSubtreeStream stream_macroDefinition=new RewriteRuleSubtreeStream(adaptor,"rule macroDefinition");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:186:5: ( functionDefinition -> ^( DEFINITION functionDefinition ) | classDefinition -> ^( DEFINITION classDefinition ) | macroDefinition -> ^( DEFINITION macroDefinition ) | nameSpace -> ^( DEFINITION nameSpace ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 186:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==IDENTIFIER) ) {
                    int LA5_8 = input.LA(3);

                    if ( (LA5_8==126) ) {
                        alt5=1;
                    }
                    else if ( (LA5_8==142) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 8, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
                }
                break;
            case 175:
                {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA5_8 = input.LA(3);

                    if ( (LA5_8==126) ) {
                        alt5=1;
                    }
                    else if ( (LA5_8==142) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 8, input);

                        throw nvae;

                    }
                    }
                    break;
                case 128:
                    {
                    int LA5_9 = input.LA(3);

                    if ( (LA5_9==IDENTIFIER) ) {
                        int LA5_8 = input.LA(4);

                        if ( (LA5_8==126) ) {
                            alt5=1;
                        }
                        else if ( (LA5_8==142) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 9, input);

                        throw nvae;

                    }
                    }
                    break;
                case 125:
                    {
                    int LA5_10 = input.LA(3);

                    if ( (LA5_10==IDENTIFIER) ) {
                        int LA5_8 = input.LA(4);

                        if ( (LA5_8==126) ) {
                            alt5=1;
                        }
                        else if ( (LA5_8==142) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 10, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }

                }
                break;
            case 168:
                {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA5_8 = input.LA(3);

                    if ( (LA5_8==126) ) {
                        alt5=1;
                    }
                    else if ( (LA5_8==142) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 8, input);

                        throw nvae;

                    }
                    }
                    break;
                case 128:
                    {
                    int LA5_11 = input.LA(3);

                    if ( (LA5_11==IDENTIFIER) ) {
                        int LA5_8 = input.LA(4);

                        if ( (LA5_8==126) ) {
                            alt5=1;
                        }
                        else if ( (LA5_8==142) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 11, input);

                        throw nvae;

                    }
                    }
                    break;
                case 125:
                    {
                    int LA5_12 = input.LA(3);

                    if ( (LA5_12==IDENTIFIER) ) {
                        int LA5_8 = input.LA(4);

                        if ( (LA5_8==126) ) {
                            alt5=1;
                        }
                        else if ( (LA5_8==142) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 12, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }

                }
                break;
            case IDENTIFIER:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==IDENTIFIER) ) {
                    int LA5_8 = input.LA(3);

                    if ( (LA5_8==126) ) {
                        alt5=1;
                    }
                    else if ( (LA5_8==142) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 8, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;

                }
                }
                break;
            case 163:
                {
                alt5=2;
                }
                break;
            case 121:
                {
                alt5=3;
                }
                break;
            case 185:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:186:7: functionDefinition
                    {
                    pushFollow(FOLLOW_functionDefinition_in_definition1054);
                    functionDefinition14=functionDefinition();

                    state._fsp--;

                    stream_functionDefinition.add(functionDefinition14.getTree());

                    // AST REWRITE
                    // elements: functionDefinition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 186:26: -> ^( DEFINITION functionDefinition )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:186:29: ^( DEFINITION functionDefinition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DEFINITION, "DEFINITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_functionDefinition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:187:7: classDefinition
                    {
                    pushFollow(FOLLOW_classDefinition_in_definition1070);
                    classDefinition15=classDefinition();

                    state._fsp--;

                    stream_classDefinition.add(classDefinition15.getTree());

                    // AST REWRITE
                    // elements: classDefinition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:23: -> ^( DEFINITION classDefinition )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:187:26: ^( DEFINITION classDefinition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DEFINITION, "DEFINITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_classDefinition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:188:7: macroDefinition
                    {
                    pushFollow(FOLLOW_macroDefinition_in_definition1086);
                    macroDefinition16=macroDefinition();

                    state._fsp--;

                    stream_macroDefinition.add(macroDefinition16.getTree());

                    // AST REWRITE
                    // elements: macroDefinition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 188:23: -> ^( DEFINITION macroDefinition )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:188:26: ^( DEFINITION macroDefinition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DEFINITION, "DEFINITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_macroDefinition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:189:7: nameSpace
                    {
                    pushFollow(FOLLOW_nameSpace_in_definition1102);
                    nameSpace17=nameSpace();

                    state._fsp--;

                    stream_nameSpace.add(nameSpace17.getTree());

                    // AST REWRITE
                    // elements: nameSpace
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:17: -> ^( DEFINITION nameSpace )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:189:20: ^( DEFINITION nameSpace )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DEFINITION, "DEFINITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_nameSpace.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "definition"


    public static class functionDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionDefinition"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:192:1: functionDefinition : returnType functionName '(' ( parameters )? ')' ( body | ';' ) -> ^( FUNCTION_DEF returnType functionName '(' ( parameters )? ')' ( body )? ) ;
    public final ProjectFinalASTParser.functionDefinition_return functionDefinition() throws RecognitionException {
        ProjectFinalASTParser.functionDefinition_return retval = new ProjectFinalASTParser.functionDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal20=null;
        Token char_literal22=null;
        Token char_literal24=null;
        ProjectFinalASTParser.returnType_return returnType18 =null;

        ProjectFinalASTParser.functionName_return functionName19 =null;

        ProjectFinalASTParser.parameters_return parameters21 =null;

        ProjectFinalASTParser.body_return body23 =null;


        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:193:5: ( returnType functionName '(' ( parameters )? ')' ( body | ';' ) -> ^( FUNCTION_DEF returnType functionName '(' ( parameters )? ')' ( body )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:193:7: returnType functionName '(' ( parameters )? ')' ( body | ';' )
            {
            pushFollow(FOLLOW_returnType_in_functionDefinition1127);
            returnType18=returnType();

            state._fsp--;

            stream_returnType.add(returnType18.getTree());

            pushFollow(FOLLOW_functionName_in_functionDefinition1129);
            functionName19=functionName();

            state._fsp--;

            stream_functionName.add(functionName19.getTree());

            char_literal20=(Token)match(input,126,FOLLOW_126_in_functionDefinition1131);  
            stream_126.add(char_literal20);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:193:35: ( parameters )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER||(LA6_0 >= 160 && LA6_0 <= 161)||LA6_0==168||LA6_0==175||LA6_0==186) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:193:35: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_functionDefinition1133);
                    parameters21=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters21.getTree());

                    }
                    break;

            }


            char_literal22=(Token)match(input,127,FOLLOW_127_in_functionDefinition1136);  
            stream_127.add(char_literal22);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:193:51: ( body | ';' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==188) ) {
                alt7=1;
            }
            else if ( (LA7_0==143) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:193:52: body
                    {
                    pushFollow(FOLLOW_body_in_functionDefinition1139);
                    body23=body();

                    state._fsp--;

                    stream_body.add(body23.getTree());

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:193:59: ';'
                    {
                    char_literal24=(Token)match(input,143,FOLLOW_143_in_functionDefinition1143);  
                    stream_143.add(char_literal24);


                    }
                    break;

            }


            // AST REWRITE
            // elements: parameters, 126, returnType, functionName, body, 127
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 194:5: -> ^( FUNCTION_DEF returnType functionName '(' ( parameters )? ')' ( body )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:194:8: ^( FUNCTION_DEF returnType functionName '(' ( parameters )? ')' ( body )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_DEF, "FUNCTION_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_returnType.nextTree());

                adaptor.addChild(root_1, stream_functionName.nextTree());

                adaptor.addChild(root_1, 
                stream_126.nextNode()
                );

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:194:51: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_127.nextNode()
                );

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:194:67: ( body )?
                if ( stream_body.hasNext() ) {
                    adaptor.addChild(root_1, stream_body.nextTree());

                }
                stream_body.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"


    public static class pointer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pointer"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:197:1: pointer : returnType '(' '*' functionName ')' '(' ( parameters )? ')' -> ^( POINTER returnType functionName ( parameters )? ) ;
    public final ProjectFinalASTParser.pointer_return pointer() throws RecognitionException {
        ProjectFinalASTParser.pointer_return retval = new ProjectFinalASTParser.pointer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal26=null;
        Token char_literal27=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        ProjectFinalASTParser.returnType_return returnType25 =null;

        ProjectFinalASTParser.functionName_return functionName28 =null;

        ProjectFinalASTParser.parameters_return parameters31 =null;


        Object char_literal26_tree=null;
        Object char_literal27_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal32_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:198:5: ( returnType '(' '*' functionName ')' '(' ( parameters )? ')' -> ^( POINTER returnType functionName ( parameters )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:198:7: returnType '(' '*' functionName ')' '(' ( parameters )? ')'
            {
            pushFollow(FOLLOW_returnType_in_pointer1186);
            returnType25=returnType();

            state._fsp--;

            stream_returnType.add(returnType25.getTree());

            char_literal26=(Token)match(input,126,FOLLOW_126_in_pointer1188);  
            stream_126.add(char_literal26);


            char_literal27=(Token)match(input,128,FOLLOW_128_in_pointer1190);  
            stream_128.add(char_literal27);


            pushFollow(FOLLOW_functionName_in_pointer1192);
            functionName28=functionName();

            state._fsp--;

            stream_functionName.add(functionName28.getTree());

            char_literal29=(Token)match(input,127,FOLLOW_127_in_pointer1194);  
            stream_127.add(char_literal29);


            char_literal30=(Token)match(input,126,FOLLOW_126_in_pointer1196);  
            stream_126.add(char_literal30);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:198:47: ( parameters )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENTIFIER||(LA8_0 >= 160 && LA8_0 <= 161)||LA8_0==168||LA8_0==175||LA8_0==186) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:198:47: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_pointer1198);
                    parameters31=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters31.getTree());

                    }
                    break;

            }


            char_literal32=(Token)match(input,127,FOLLOW_127_in_pointer1201);  
            stream_127.add(char_literal32);


            // AST REWRITE
            // elements: parameters, returnType, functionName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 198:63: -> ^( POINTER returnType functionName ( parameters )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:198:66: ^( POINTER returnType functionName ( parameters )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(POINTER, "POINTER")
                , root_1);

                adaptor.addChild(root_1, stream_returnType.nextTree());

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:198:100: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pointer"


    public static class returnType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnType"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:201:1: returnType : ( 'void' -> ^( VOID 'void' ) | 'int' -> ^( INT 'int' ) | 'double' -> ^( DOUBLE 'double' ) | customType -> ^( TYPE customType ) | 'int' pointerOp -> ^( INT 'int' pointerOp ) | 'double' pointerOp -> ^( DOUBLE 'double' pointerOp ) );
    public final ProjectFinalASTParser.returnType_return returnType() throws RecognitionException {
        ProjectFinalASTParser.returnType_return retval = new ProjectFinalASTParser.returnType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal33=null;
        Token string_literal34=null;
        Token string_literal35=null;
        Token string_literal37=null;
        Token string_literal39=null;
        ProjectFinalASTParser.customType_return customType36 =null;

        ProjectFinalASTParser.pointerOp_return pointerOp38 =null;

        ProjectFinalASTParser.pointerOp_return pointerOp40 =null;


        Object string_literal33_tree=null;
        Object string_literal34_tree=null;
        Object string_literal35_tree=null;
        Object string_literal37_tree=null;
        Object string_literal39_tree=null;
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_customType=new RewriteRuleSubtreeStream(adaptor,"rule customType");
        RewriteRuleSubtreeStream stream_pointerOp=new RewriteRuleSubtreeStream(adaptor,"rule pointerOp");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:202:5: ( 'void' -> ^( VOID 'void' ) | 'int' -> ^( INT 'int' ) | 'double' -> ^( DOUBLE 'double' ) | customType -> ^( TYPE customType ) | 'int' pointerOp -> ^( INT 'int' pointerOp ) | 'double' pointerOp -> ^( DOUBLE 'double' pointerOp ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 186:
                {
                alt9=1;
                }
                break;
            case 175:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==IDENTIFIER||LA9_2==126) ) {
                    alt9=2;
                }
                else if ( (LA9_2==125||LA9_2==128) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
                }
                break;
            case 168:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==IDENTIFIER||LA9_3==126) ) {
                    alt9=3;
                }
                else if ( (LA9_3==125||LA9_3==128) ) {
                    alt9=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:202:7: 'void'
                    {
                    string_literal33=(Token)match(input,186,FOLLOW_186_in_returnType1231);  
                    stream_186.add(string_literal33);


                    // AST REWRITE
                    // elements: 186
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:14: -> ^( VOID 'void' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:202:17: ^( VOID 'void' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VOID, "VOID")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_186.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:203:7: 'int'
                    {
                    string_literal34=(Token)match(input,175,FOLLOW_175_in_returnType1247);  
                    stream_175.add(string_literal34);


                    // AST REWRITE
                    // elements: 175
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:13: -> ^( INT 'int' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:203:16: ^( INT 'int' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INT, "INT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_175.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:204:7: 'double'
                    {
                    string_literal35=(Token)match(input,168,FOLLOW_168_in_returnType1263);  
                    stream_168.add(string_literal35);


                    // AST REWRITE
                    // elements: 168
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:16: -> ^( DOUBLE 'double' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:204:19: ^( DOUBLE 'double' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DOUBLE, "DOUBLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_168.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:205:7: customType
                    {
                    pushFollow(FOLLOW_customType_in_returnType1279);
                    customType36=customType();

                    state._fsp--;

                    stream_customType.add(customType36.getTree());

                    // AST REWRITE
                    // elements: customType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:18: -> ^( TYPE customType )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:205:21: ^( TYPE customType )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TYPE, "TYPE")
                        , root_1);

                        adaptor.addChild(root_1, stream_customType.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:206:7: 'int' pointerOp
                    {
                    string_literal37=(Token)match(input,175,FOLLOW_175_in_returnType1295);  
                    stream_175.add(string_literal37);


                    pushFollow(FOLLOW_pointerOp_in_returnType1297);
                    pointerOp38=pointerOp();

                    state._fsp--;

                    stream_pointerOp.add(pointerOp38.getTree());

                    // AST REWRITE
                    // elements: 175, pointerOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:23: -> ^( INT 'int' pointerOp )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:206:26: ^( INT 'int' pointerOp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INT, "INT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_175.nextNode()
                        );

                        adaptor.addChild(root_1, stream_pointerOp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:207:7: 'double' pointerOp
                    {
                    string_literal39=(Token)match(input,168,FOLLOW_168_in_returnType1315);  
                    stream_168.add(string_literal39);


                    pushFollow(FOLLOW_pointerOp_in_returnType1317);
                    pointerOp40=pointerOp();

                    state._fsp--;

                    stream_pointerOp.add(pointerOp40.getTree());

                    // AST REWRITE
                    // elements: pointerOp, 168
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:26: -> ^( DOUBLE 'double' pointerOp )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:207:29: ^( DOUBLE 'double' pointerOp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DOUBLE, "DOUBLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_168.nextNode()
                        );

                        adaptor.addChild(root_1, stream_pointerOp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "returnType"


    public static class functionName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionName"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:210:1: functionName : identifier -> ^( IDENTIFIER identifier ) ;
    public final ProjectFinalASTParser.functionName_return functionName() throws RecognitionException {
        ProjectFinalASTParser.functionName_return retval = new ProjectFinalASTParser.functionName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.identifier_return identifier41 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:211:5: ( identifier -> ^( IDENTIFIER identifier ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:211:7: identifier
            {
            pushFollow(FOLLOW_identifier_in_functionName1344);
            identifier41=identifier();

            state._fsp--;

            stream_identifier.add(identifier41.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 211:18: -> ^( IDENTIFIER identifier )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:211:21: ^( IDENTIFIER identifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IDENTIFIER, "IDENTIFIER")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionName"


    public static class parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameters"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:214:1: parameters : ( parameter ( ',' parameter )* -> ^( PARAMETERS ( parameter )+ ) | functionDefinition -> ^( PARAMETERS functionDefinition ) | pointer -> ^( PARAMETERS pointer ) );
    public final ProjectFinalASTParser.parameters_return parameters() throws RecognitionException {
        ProjectFinalASTParser.parameters_return retval = new ProjectFinalASTParser.parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal43=null;
        ProjectFinalASTParser.parameter_return parameter42 =null;

        ProjectFinalASTParser.parameter_return parameter44 =null;

        ProjectFinalASTParser.functionDefinition_return functionDefinition45 =null;

        ProjectFinalASTParser.pointer_return pointer46 =null;


        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_pointer=new RewriteRuleSubtreeStream(adaptor,"rule pointer");
        RewriteRuleSubtreeStream stream_functionDefinition=new RewriteRuleSubtreeStream(adaptor,"rule functionDefinition");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:215:5: ( parameter ( ',' parameter )* -> ^( PARAMETERS ( parameter )+ ) | functionDefinition -> ^( PARAMETERS functionDefinition ) | pointer -> ^( PARAMETERS pointer ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 175:
                {
                switch ( input.LA(2) ) {
                case 128:
                    {
                    switch ( input.LA(3) ) {
                    case IDENTIFIER:
                        {
                        int LA11_8 = input.LA(4);

                        if ( (LA11_8==127||LA11_8==133||LA11_8==158) ) {
                            alt11=1;
                        }
                        else if ( (LA11_8==126) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 125:
                    case 127:
                    case 128:
                    case 133:
                    case 158:
                        {
                        alt11=1;
                        }
                        break;
                    case 126:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 6, input);

                        throw nvae;

                    }

                    }
                    break;
                case 125:
                    {
                    switch ( input.LA(3) ) {
                    case IDENTIFIER:
                        {
                        int LA11_8 = input.LA(4);

                        if ( (LA11_8==127||LA11_8==133||LA11_8==158) ) {
                            alt11=1;
                        }
                        else if ( (LA11_8==126) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 125:
                    case 127:
                    case 128:
                    case 133:
                    case 158:
                        {
                        alt11=1;
                        }
                        break;
                    case 126:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA11_8 = input.LA(3);

                    if ( (LA11_8==127||LA11_8==133||LA11_8==158) ) {
                        alt11=1;
                    }
                    else if ( (LA11_8==126) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 8, input);

                        throw nvae;

                    }
                    }
                    break;
                case 127:
                case 133:
                case 158:
                    {
                    alt11=1;
                    }
                    break;
                case 126:
                    {
                    alt11=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }

                }
                break;
            case 168:
                {
                switch ( input.LA(2) ) {
                case 128:
                    {
                    switch ( input.LA(3) ) {
                    case IDENTIFIER:
                        {
                        int LA11_8 = input.LA(4);

                        if ( (LA11_8==127||LA11_8==133||LA11_8==158) ) {
                            alt11=1;
                        }
                        else if ( (LA11_8==126) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 125:
                    case 127:
                    case 128:
                    case 133:
                    case 158:
                        {
                        alt11=1;
                        }
                        break;
                    case 126:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 10, input);

                        throw nvae;

                    }

                    }
                    break;
                case 125:
                    {
                    switch ( input.LA(3) ) {
                    case IDENTIFIER:
                        {
                        int LA11_8 = input.LA(4);

                        if ( (LA11_8==127||LA11_8==133||LA11_8==158) ) {
                            alt11=1;
                        }
                        else if ( (LA11_8==126) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 125:
                    case 127:
                    case 128:
                    case 133:
                    case 158:
                        {
                        alt11=1;
                        }
                        break;
                    case 126:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 11, input);

                        throw nvae;

                    }

                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA11_8 = input.LA(3);

                    if ( (LA11_8==127||LA11_8==133||LA11_8==158) ) {
                        alt11=1;
                    }
                    else if ( (LA11_8==126) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 8, input);

                        throw nvae;

                    }
                    }
                    break;
                case 127:
                case 133:
                case 158:
                    {
                    alt11=1;
                    }
                    break;
                case 126:
                    {
                    alt11=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }

                }
                break;
            case 160:
            case 161:
                {
                alt11=1;
                }
                break;
            case IDENTIFIER:
                {
                switch ( input.LA(2) ) {
                case 125:
                case 127:
                case 128:
                case 133:
                case 158:
                    {
                    alt11=1;
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA11_8 = input.LA(3);

                    if ( (LA11_8==127||LA11_8==133||LA11_8==158) ) {
                        alt11=1;
                    }
                    else if ( (LA11_8==126) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 8, input);

                        throw nvae;

                    }
                    }
                    break;
                case 126:
                    {
                    alt11=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;

                }

                }
                break;
            case 186:
                {
                int LA11_5 = input.LA(2);

                if ( (LA11_5==IDENTIFIER) ) {
                    alt11=2;
                }
                else if ( (LA11_5==126) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:215:7: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameters1369);
                    parameter42=parameter();

                    state._fsp--;

                    stream_parameter.add(parameter42.getTree());

                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:215:17: ( ',' parameter )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==133) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:215:18: ',' parameter
                    	    {
                    	    char_literal43=(Token)match(input,133,FOLLOW_133_in_parameters1372);  
                    	    stream_133.add(char_literal43);


                    	    pushFollow(FOLLOW_parameter_in_parameters1374);
                    	    parameter44=parameter();

                    	    state._fsp--;

                    	    stream_parameter.add(parameter44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: parameter
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:34: -> ^( PARAMETERS ( parameter )+ )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:215:37: ^( PARAMETERS ( parameter )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETERS, "PARAMETERS")
                        , root_1);

                        if ( !(stream_parameter.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_parameter.hasNext() ) {
                            adaptor.addChild(root_1, stream_parameter.nextTree());

                        }
                        stream_parameter.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:216:7: functionDefinition
                    {
                    pushFollow(FOLLOW_functionDefinition_in_parameters1393);
                    functionDefinition45=functionDefinition();

                    state._fsp--;

                    stream_functionDefinition.add(functionDefinition45.getTree());

                    // AST REWRITE
                    // elements: functionDefinition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:26: -> ^( PARAMETERS functionDefinition )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:216:29: ^( PARAMETERS functionDefinition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETERS, "PARAMETERS")
                        , root_1);

                        adaptor.addChild(root_1, stream_functionDefinition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:217:7: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_parameters1409);
                    pointer46=pointer();

                    state._fsp--;

                    stream_pointer.add(pointer46.getTree());

                    // AST REWRITE
                    // elements: pointer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:15: -> ^( PARAMETERS pointer )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:217:18: ^( PARAMETERS pointer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMETERS, "PARAMETERS")
                        , root_1);

                        adaptor.addChild(root_1, stream_pointer.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameters"


    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:220:1: parameter : typeSpecifier ( identifier )? ( arrayDimensions )? -> ^( PARAMETER typeSpecifier ( identifier )? ( arrayDimensions )? ) ;
    public final ProjectFinalASTParser.parameter_return parameter() throws RecognitionException {
        ProjectFinalASTParser.parameter_return retval = new ProjectFinalASTParser.parameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.typeSpecifier_return typeSpecifier47 =null;

        ProjectFinalASTParser.identifier_return identifier48 =null;

        ProjectFinalASTParser.arrayDimensions_return arrayDimensions49 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_typeSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule typeSpecifier");
        RewriteRuleSubtreeStream stream_arrayDimensions=new RewriteRuleSubtreeStream(adaptor,"rule arrayDimensions");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:221:5: ( typeSpecifier ( identifier )? ( arrayDimensions )? -> ^( PARAMETER typeSpecifier ( identifier )? ( arrayDimensions )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:221:7: typeSpecifier ( identifier )? ( arrayDimensions )?
            {
            pushFollow(FOLLOW_typeSpecifier_in_parameter1434);
            typeSpecifier47=typeSpecifier();

            state._fsp--;

            stream_typeSpecifier.add(typeSpecifier47.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:221:21: ( identifier )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENTIFIER) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:221:21: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_parameter1436);
                    identifier48=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier48.getTree());

                    }
                    break;

            }


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:221:33: ( arrayDimensions )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==158) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:221:33: arrayDimensions
                    {
                    pushFollow(FOLLOW_arrayDimensions_in_parameter1439);
                    arrayDimensions49=arrayDimensions();

                    state._fsp--;

                    stream_arrayDimensions.add(arrayDimensions49.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: arrayDimensions, identifier, typeSpecifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 221:50: -> ^( PARAMETER typeSpecifier ( identifier )? ( arrayDimensions )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:221:53: ^( PARAMETER typeSpecifier ( identifier )? ( arrayDimensions )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETER, "PARAMETER")
                , root_1);

                adaptor.addChild(root_1, stream_typeSpecifier.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:221:79: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:221:91: ( arrayDimensions )?
                if ( stream_arrayDimensions.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayDimensions.nextTree());

                }
                stream_arrayDimensions.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter"


    public static class typeSpecifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeSpecifier"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:224:1: typeSpecifier : baseType ( pointerOp )* -> ^( TYPE baseType ( pointerOp )* ) ;
    public final ProjectFinalASTParser.typeSpecifier_return typeSpecifier() throws RecognitionException {
        ProjectFinalASTParser.typeSpecifier_return retval = new ProjectFinalASTParser.typeSpecifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.baseType_return baseType50 =null;

        ProjectFinalASTParser.pointerOp_return pointerOp51 =null;


        RewriteRuleSubtreeStream stream_pointerOp=new RewriteRuleSubtreeStream(adaptor,"rule pointerOp");
        RewriteRuleSubtreeStream stream_baseType=new RewriteRuleSubtreeStream(adaptor,"rule baseType");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:225:5: ( baseType ( pointerOp )* -> ^( TYPE baseType ( pointerOp )* ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:225:7: baseType ( pointerOp )*
            {
            pushFollow(FOLLOW_baseType_in_typeSpecifier1471);
            baseType50=baseType();

            state._fsp--;

            stream_baseType.add(baseType50.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:225:16: ( pointerOp )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==125||LA14_0==128) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:225:16: pointerOp
            	    {
            	    pushFollow(FOLLOW_pointerOp_in_typeSpecifier1473);
            	    pointerOp51=pointerOp();

            	    state._fsp--;

            	    stream_pointerOp.add(pointerOp51.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // AST REWRITE
            // elements: pointerOp, baseType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 225:27: -> ^( TYPE baseType ( pointerOp )* )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:225:30: ^( TYPE baseType ( pointerOp )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE, "TYPE")
                , root_1);

                adaptor.addChild(root_1, stream_baseType.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:225:46: ( pointerOp )*
                while ( stream_pointerOp.hasNext() ) {
                    adaptor.addChild(root_1, stream_pointerOp.nextTree());

                }
                stream_pointerOp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeSpecifier"


    public static class baseType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "baseType"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:228:1: baseType : ( 'int' -> ^( INT 'int' ) | 'double' -> ^( DOUBLE 'double' ) | 'char' -> ^( CHAR 'char' ) | 'bool' -> ^( BOOL 'bool' ) | customType -> customType );
    public final ProjectFinalASTParser.baseType_return baseType() throws RecognitionException {
        ProjectFinalASTParser.baseType_return retval = new ProjectFinalASTParser.baseType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal52=null;
        Token string_literal53=null;
        Token string_literal54=null;
        Token string_literal55=null;
        ProjectFinalASTParser.customType_return customType56 =null;


        Object string_literal52_tree=null;
        Object string_literal53_tree=null;
        Object string_literal54_tree=null;
        Object string_literal55_tree=null;
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_customType=new RewriteRuleSubtreeStream(adaptor,"rule customType");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:229:5: ( 'int' -> ^( INT 'int' ) | 'double' -> ^( DOUBLE 'double' ) | 'char' -> ^( CHAR 'char' ) | 'bool' -> ^( BOOL 'bool' ) | customType -> customType )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 175:
                {
                alt15=1;
                }
                break;
            case 168:
                {
                alt15=2;
                }
                break;
            case 161:
                {
                alt15=3;
                }
                break;
            case 160:
                {
                alt15=4;
                }
                break;
            case IDENTIFIER:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:229:7: 'int'
                    {
                    string_literal52=(Token)match(input,175,FOLLOW_175_in_baseType1502);  
                    stream_175.add(string_literal52);


                    // AST REWRITE
                    // elements: 175
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:13: -> ^( INT 'int' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:229:16: ^( INT 'int' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INT, "INT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_175.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:230:7: 'double'
                    {
                    string_literal53=(Token)match(input,168,FOLLOW_168_in_baseType1518);  
                    stream_168.add(string_literal53);


                    // AST REWRITE
                    // elements: 168
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:16: -> ^( DOUBLE 'double' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:230:19: ^( DOUBLE 'double' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DOUBLE, "DOUBLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_168.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:231:7: 'char'
                    {
                    string_literal54=(Token)match(input,161,FOLLOW_161_in_baseType1534);  
                    stream_161.add(string_literal54);


                    // AST REWRITE
                    // elements: 161
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:14: -> ^( CHAR 'char' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:231:17: ^( CHAR 'char' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CHAR, "CHAR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_161.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:232:7: 'bool'
                    {
                    string_literal55=(Token)match(input,160,FOLLOW_160_in_baseType1550);  
                    stream_160.add(string_literal55);


                    // AST REWRITE
                    // elements: 160
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:14: -> ^( BOOL 'bool' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:232:17: ^( BOOL 'bool' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL, "BOOL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_160.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:233:7: customType
                    {
                    pushFollow(FOLLOW_customType_in_baseType1566);
                    customType56=customType();

                    state._fsp--;

                    stream_customType.add(customType56.getTree());

                    // AST REWRITE
                    // elements: customType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:18: -> customType
                    {
                        adaptor.addChild(root_0, stream_customType.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "baseType"


    public static class pointerOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pointerOp"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:236:1: pointerOp : ( '*' -> ^( POINTER '*' ) | '&' -> ^( POINTER '&' ) );
    public final ProjectFinalASTParser.pointerOp_return pointerOp() throws RecognitionException {
        ProjectFinalASTParser.pointerOp_return retval = new ProjectFinalASTParser.pointerOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal57=null;
        Token char_literal58=null;

        Object char_literal57_tree=null;
        Object char_literal58_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");

        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:237:5: ( '*' -> ^( POINTER '*' ) | '&' -> ^( POINTER '&' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==128) ) {
                alt16=1;
            }
            else if ( (LA16_0==125) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:237:7: '*'
                    {
                    char_literal57=(Token)match(input,128,FOLLOW_128_in_pointerOp1587);  
                    stream_128.add(char_literal57);


                    // AST REWRITE
                    // elements: 128
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:11: -> ^( POINTER '*' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:237:14: ^( POINTER '*' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER, "POINTER")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_128.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:238:7: '&'
                    {
                    char_literal58=(Token)match(input,125,FOLLOW_125_in_pointerOp1603);  
                    stream_125.add(char_literal58);


                    // AST REWRITE
                    // elements: 125
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:11: -> ^( POINTER '&' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:238:14: ^( POINTER '&' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POINTER, "POINTER")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_125.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pointerOp"


    public static class customType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "customType"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:241:1: customType : identifier -> ^( TYPE identifier ) ;
    public final ProjectFinalASTParser.customType_return customType() throws RecognitionException {
        ProjectFinalASTParser.customType_return retval = new ProjectFinalASTParser.customType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.identifier_return identifier59 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:242:5: ( identifier -> ^( TYPE identifier ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:242:7: identifier
            {
            pushFollow(FOLLOW_identifier_in_customType1628);
            identifier59=identifier();

            state._fsp--;

            stream_identifier.add(identifier59.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 242:18: -> ^( TYPE identifier )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:242:21: ^( TYPE identifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE, "TYPE")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "customType"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:245:1: identifier : IDENTIFIER -> ^( IDENTIFIER IDENTIFIER ) ;
    public final ProjectFinalASTParser.identifier_return identifier() throws RecognitionException {
        ProjectFinalASTParser.identifier_return retval = new ProjectFinalASTParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER60=null;

        Object IDENTIFIER60_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:246:5: ( IDENTIFIER -> ^( IDENTIFIER IDENTIFIER ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:246:7: IDENTIFIER
            {
            IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1653);  
            stream_IDENTIFIER.add(IDENTIFIER60);


            // AST REWRITE
            // elements: IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 246:18: -> ^( IDENTIFIER IDENTIFIER )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:246:21: ^( IDENTIFIER IDENTIFIER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "body"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:249:1: body : '{' ( statement )* '}' -> ^( BODY ( statement )* ) ;
    public final ProjectFinalASTParser.body_return body() throws RecognitionException {
        ProjectFinalASTParser.body_return retval = new ProjectFinalASTParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal61=null;
        Token char_literal63=null;
        ProjectFinalASTParser.statement_return statement62 =null;


        Object char_literal61_tree=null;
        Object char_literal63_tree=null;
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:250:5: ( '{' ( statement )* '}' -> ^( BODY ( statement )* ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:250:7: '{' ( statement )* '}'
            {
            char_literal61=(Token)match(input,188,FOLLOW_188_in_body1678);  
            stream_188.add(char_literal61);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:250:11: ( statement )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==IDENTIFIER||LA17_0==131||LA17_0==135||(LA17_0 >= 160 && LA17_0 <= 162)||(LA17_0 >= 165 && LA17_0 <= 168)||LA17_0==171||LA17_0==173||LA17_0==175||LA17_0==180||LA17_0==183||LA17_0==187) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:250:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_body1680);
            	    statement62=statement();

            	    state._fsp--;

            	    stream_statement.add(statement62.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            char_literal63=(Token)match(input,190,FOLLOW_190_in_body1683);  
            stream_190.add(char_literal63);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 250:26: -> ^( BODY ( statement )* )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:250:29: ^( BODY ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BODY, "BODY")
                , root_1);

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:250:36: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "body"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:253:1: statement : ( declaration -> ^( DECLARATION declaration ) | assignment -> ^( ASSIGNMENT assignment ) | functionCall ';' -> ^( EXPRESSION functionCall ) | controlStructure -> ^( CONTROL controlStructure ) | returnStatement -> ^( RETURN returnStatement ) | coutStatement -> ^( COUT coutStatement ) | pointerDeallocation ';' -> ^( EXPRESSION pointerDeallocation ) | cinStatement -> ^( CIN cinStatement ) | incrementExpr ';' -> ^( EXPRESSION incrementExpr ) | statthis ';' -> ^( EXPRESSION statthis ) | declarationclass ';' -> ^( DECLARATION declarationclass ) | callclass ';' -> ^( EXPRESSION callclass ) | className '::' functionCall ';' -> ^( EXPRESSION ^( SCOPE className functionCall ) ) );
    public final ProjectFinalASTParser.statement_return statement() throws RecognitionException {
        ProjectFinalASTParser.statement_return retval = new ProjectFinalASTParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal67=null;
        Token char_literal72=null;
        Token char_literal75=null;
        Token char_literal77=null;
        Token char_literal79=null;
        Token char_literal81=null;
        Token string_literal83=null;
        Token char_literal85=null;
        ProjectFinalASTParser.declaration_return declaration64 =null;

        ProjectFinalASTParser.assignment_return assignment65 =null;

        ProjectFinalASTParser.functionCall_return functionCall66 =null;

        ProjectFinalASTParser.controlStructure_return controlStructure68 =null;

        ProjectFinalASTParser.returnStatement_return returnStatement69 =null;

        ProjectFinalASTParser.coutStatement_return coutStatement70 =null;

        ProjectFinalASTParser.pointerDeallocation_return pointerDeallocation71 =null;

        ProjectFinalASTParser.cinStatement_return cinStatement73 =null;

        ProjectFinalASTParser.incrementExpr_return incrementExpr74 =null;

        ProjectFinalASTParser.statthis_return statthis76 =null;

        ProjectFinalASTParser.declarationclass_return declarationclass78 =null;

        ProjectFinalASTParser.callclass_return callclass80 =null;

        ProjectFinalASTParser.className_return className82 =null;

        ProjectFinalASTParser.functionCall_return functionCall84 =null;


        Object char_literal67_tree=null;
        Object char_literal72_tree=null;
        Object char_literal75_tree=null;
        Object char_literal77_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        Object string_literal83_tree=null;
        Object char_literal85_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_declarationclass=new RewriteRuleSubtreeStream(adaptor,"rule declarationclass");
        RewriteRuleSubtreeStream stream_callclass=new RewriteRuleSubtreeStream(adaptor,"rule callclass");
        RewriteRuleSubtreeStream stream_incrementExpr=new RewriteRuleSubtreeStream(adaptor,"rule incrementExpr");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_pointerDeallocation=new RewriteRuleSubtreeStream(adaptor,"rule pointerDeallocation");
        RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");
        RewriteRuleSubtreeStream stream_returnStatement=new RewriteRuleSubtreeStream(adaptor,"rule returnStatement");
        RewriteRuleSubtreeStream stream_statthis=new RewriteRuleSubtreeStream(adaptor,"rule statthis");
        RewriteRuleSubtreeStream stream_coutStatement=new RewriteRuleSubtreeStream(adaptor,"rule coutStatement");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_controlStructure=new RewriteRuleSubtreeStream(adaptor,"rule controlStructure");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_cinStatement=new RewriteRuleSubtreeStream(adaptor,"rule cinStatement");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:254:5: ( declaration -> ^( DECLARATION declaration ) | assignment -> ^( ASSIGNMENT assignment ) | functionCall ';' -> ^( EXPRESSION functionCall ) | controlStructure -> ^( CONTROL controlStructure ) | returnStatement -> ^( RETURN returnStatement ) | coutStatement -> ^( COUT coutStatement ) | pointerDeallocation ';' -> ^( EXPRESSION pointerDeallocation ) | cinStatement -> ^( CIN cinStatement ) | incrementExpr ';' -> ^( EXPRESSION incrementExpr ) | statthis ';' -> ^( EXPRESSION statthis ) | declarationclass ';' -> ^( DECLARATION declarationclass ) | callclass ';' -> ^( EXPRESSION callclass ) | className '::' functionCall ';' -> ^( EXPRESSION ^( SCOPE className functionCall ) ) )
            int alt18=13;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:254:7: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_statement1709);
                    declaration64=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration64.getTree());

                    // AST REWRITE
                    // elements: declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 254:19: -> ^( DECLARATION declaration )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:254:22: ^( DECLARATION declaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:255:7: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1725);
                    assignment65=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment65.getTree());

                    // AST REWRITE
                    // elements: assignment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 255:18: -> ^( ASSIGNMENT assignment )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:255:21: ^( ASSIGNMENT assignment )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_assignment.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:256:7: functionCall ';'
                    {
                    pushFollow(FOLLOW_functionCall_in_statement1741);
                    functionCall66=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall66.getTree());

                    char_literal67=(Token)match(input,143,FOLLOW_143_in_statement1743);  
                    stream_143.add(char_literal67);


                    // AST REWRITE
                    // elements: functionCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 256:24: -> ^( EXPRESSION functionCall )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:256:27: ^( EXPRESSION functionCall )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_functionCall.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:257:7: controlStructure
                    {
                    pushFollow(FOLLOW_controlStructure_in_statement1759);
                    controlStructure68=controlStructure();

                    state._fsp--;

                    stream_controlStructure.add(controlStructure68.getTree());

                    // AST REWRITE
                    // elements: controlStructure
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 257:24: -> ^( CONTROL controlStructure )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:257:27: ^( CONTROL controlStructure )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONTROL, "CONTROL")
                        , root_1);

                        adaptor.addChild(root_1, stream_controlStructure.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:258:7: returnStatement
                    {
                    pushFollow(FOLLOW_returnStatement_in_statement1775);
                    returnStatement69=returnStatement();

                    state._fsp--;

                    stream_returnStatement.add(returnStatement69.getTree());

                    // AST REWRITE
                    // elements: returnStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 258:23: -> ^( RETURN returnStatement )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:258:26: ^( RETURN returnStatement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(RETURN, "RETURN")
                        , root_1);

                        adaptor.addChild(root_1, stream_returnStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:259:7: coutStatement
                    {
                    pushFollow(FOLLOW_coutStatement_in_statement1791);
                    coutStatement70=coutStatement();

                    state._fsp--;

                    stream_coutStatement.add(coutStatement70.getTree());

                    // AST REWRITE
                    // elements: coutStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 259:21: -> ^( COUT coutStatement )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:259:24: ^( COUT coutStatement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COUT, "COUT")
                        , root_1);

                        adaptor.addChild(root_1, stream_coutStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:260:7: pointerDeallocation ';'
                    {
                    pushFollow(FOLLOW_pointerDeallocation_in_statement1807);
                    pointerDeallocation71=pointerDeallocation();

                    state._fsp--;

                    stream_pointerDeallocation.add(pointerDeallocation71.getTree());

                    char_literal72=(Token)match(input,143,FOLLOW_143_in_statement1809);  
                    stream_143.add(char_literal72);


                    // AST REWRITE
                    // elements: pointerDeallocation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 260:31: -> ^( EXPRESSION pointerDeallocation )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:260:34: ^( EXPRESSION pointerDeallocation )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_pointerDeallocation.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:261:7: cinStatement
                    {
                    pushFollow(FOLLOW_cinStatement_in_statement1825);
                    cinStatement73=cinStatement();

                    state._fsp--;

                    stream_cinStatement.add(cinStatement73.getTree());

                    // AST REWRITE
                    // elements: cinStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 261:20: -> ^( CIN cinStatement )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:261:23: ^( CIN cinStatement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CIN, "CIN")
                        , root_1);

                        adaptor.addChild(root_1, stream_cinStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:262:7: incrementExpr ';'
                    {
                    pushFollow(FOLLOW_incrementExpr_in_statement1841);
                    incrementExpr74=incrementExpr();

                    state._fsp--;

                    stream_incrementExpr.add(incrementExpr74.getTree());

                    char_literal75=(Token)match(input,143,FOLLOW_143_in_statement1843);  
                    stream_143.add(char_literal75);


                    // AST REWRITE
                    // elements: incrementExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 262:25: -> ^( EXPRESSION incrementExpr )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:262:28: ^( EXPRESSION incrementExpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_incrementExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 10 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:263:7: statthis ';'
                    {
                    pushFollow(FOLLOW_statthis_in_statement1859);
                    statthis76=statthis();

                    state._fsp--;

                    stream_statthis.add(statthis76.getTree());

                    char_literal77=(Token)match(input,143,FOLLOW_143_in_statement1861);  
                    stream_143.add(char_literal77);


                    // AST REWRITE
                    // elements: statthis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 263:20: -> ^( EXPRESSION statthis )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:263:23: ^( EXPRESSION statthis )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_statthis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 11 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:264:7: declarationclass ';'
                    {
                    pushFollow(FOLLOW_declarationclass_in_statement1877);
                    declarationclass78=declarationclass();

                    state._fsp--;

                    stream_declarationclass.add(declarationclass78.getTree());

                    char_literal79=(Token)match(input,143,FOLLOW_143_in_statement1879);  
                    stream_143.add(char_literal79);


                    // AST REWRITE
                    // elements: declarationclass
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 264:28: -> ^( DECLARATION declarationclass )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:264:31: ^( DECLARATION declarationclass )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declarationclass.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 12 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:265:7: callclass ';'
                    {
                    pushFollow(FOLLOW_callclass_in_statement1895);
                    callclass80=callclass();

                    state._fsp--;

                    stream_callclass.add(callclass80.getTree());

                    char_literal81=(Token)match(input,143,FOLLOW_143_in_statement1897);  
                    stream_143.add(char_literal81);


                    // AST REWRITE
                    // elements: callclass
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 265:21: -> ^( EXPRESSION callclass )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:265:24: ^( EXPRESSION callclass )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_callclass.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 13 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:266:7: className '::' functionCall ';'
                    {
                    pushFollow(FOLLOW_className_in_statement1913);
                    className82=className();

                    state._fsp--;

                    stream_className.add(className82.getTree());

                    string_literal83=(Token)match(input,142,FOLLOW_142_in_statement1915);  
                    stream_142.add(string_literal83);


                    pushFollow(FOLLOW_functionCall_in_statement1917);
                    functionCall84=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall84.getTree());

                    char_literal85=(Token)match(input,143,FOLLOW_143_in_statement1919);  
                    stream_143.add(char_literal85);


                    // AST REWRITE
                    // elements: className, functionCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 266:39: -> ^( EXPRESSION ^( SCOPE className functionCall ) )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:266:42: ^( EXPRESSION ^( SCOPE className functionCall ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                        , root_1);

                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:266:55: ^( SCOPE className functionCall )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SCOPE, "SCOPE")
                        , root_2);

                        adaptor.addChild(root_2, stream_className.nextTree());

                        adaptor.addChild(root_2, stream_functionCall.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class declarationclass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarationclass"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:269:1: declarationclass : ( declarationclass1 | declarationclass2 )+ -> ^( DECLARATIONCLASS ( declarationclass1 )* ( declarationclass2 )* ) ;
    public final ProjectFinalASTParser.declarationclass_return declarationclass() throws RecognitionException {
        ProjectFinalASTParser.declarationclass_return retval = new ProjectFinalASTParser.declarationclass_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.declarationclass1_return declarationclass186 =null;

        ProjectFinalASTParser.declarationclass2_return declarationclass287 =null;


        RewriteRuleSubtreeStream stream_declarationclass1=new RewriteRuleSubtreeStream(adaptor,"rule declarationclass1");
        RewriteRuleSubtreeStream stream_declarationclass2=new RewriteRuleSubtreeStream(adaptor,"rule declarationclass2");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:270:5: ( ( declarationclass1 | declarationclass2 )+ -> ^( DECLARATIONCLASS ( declarationclass1 )* ( declarationclass2 )* ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:270:7: ( declarationclass1 | declarationclass2 )+
            {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:270:7: ( declarationclass1 | declarationclass2 )+
            int cnt19=0;
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==IDENTIFIER) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==IDENTIFIER) ) {
                        int LA19_3 = input.LA(3);

                        if ( (LA19_3==126) ) {
                            alt19=1;
                        }
                        else if ( (LA19_3==IDENTIFIER||LA19_3==133||LA19_3==143) ) {
                            alt19=2;
                        }


                    }


                }


                switch (alt19) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:270:8: declarationclass1
            	    {
            	    pushFollow(FOLLOW_declarationclass1_in_declarationclass1951);
            	    declarationclass186=declarationclass1();

            	    state._fsp--;

            	    stream_declarationclass1.add(declarationclass186.getTree());

            	    }
            	    break;
            	case 2 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:270:28: declarationclass2
            	    {
            	    pushFollow(FOLLOW_declarationclass2_in_declarationclass1955);
            	    declarationclass287=declarationclass2();

            	    state._fsp--;

            	    stream_declarationclass2.add(declarationclass287.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            // AST REWRITE
            // elements: declarationclass1, declarationclass2
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 270:48: -> ^( DECLARATIONCLASS ( declarationclass1 )* ( declarationclass2 )* )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:270:51: ^( DECLARATIONCLASS ( declarationclass1 )* ( declarationclass2 )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATIONCLASS, "DECLARATIONCLASS")
                , root_1);

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:270:70: ( declarationclass1 )*
                while ( stream_declarationclass1.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarationclass1.nextTree());

                }
                stream_declarationclass1.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:270:89: ( declarationclass2 )*
                while ( stream_declarationclass2.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarationclass2.nextTree());

                }
                stream_declarationclass2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declarationclass"


    public static class declarationclass1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarationclass1"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:273:1: declarationclass1 : className functionCall -> ^( CLASSCALL className functionCall ) ;
    public final ProjectFinalASTParser.declarationclass1_return declarationclass1() throws RecognitionException {
        ProjectFinalASTParser.declarationclass1_return retval = new ProjectFinalASTParser.declarationclass1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.className_return className88 =null;

        ProjectFinalASTParser.functionCall_return functionCall89 =null;


        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:274:5: ( className functionCall -> ^( CLASSCALL className functionCall ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:274:7: className functionCall
            {
            pushFollow(FOLLOW_className_in_declarationclass11986);
            className88=className();

            state._fsp--;

            stream_className.add(className88.getTree());

            pushFollow(FOLLOW_functionCall_in_declarationclass11988);
            functionCall89=functionCall();

            state._fsp--;

            stream_functionCall.add(functionCall89.getTree());

            // AST REWRITE
            // elements: functionCall, className
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 274:30: -> ^( CLASSCALL className functionCall )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:274:33: ^( CLASSCALL className functionCall )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CLASSCALL, "CLASSCALL")
                , root_1);

                adaptor.addChild(root_1, stream_className.nextTree());

                adaptor.addChild(root_1, stream_functionCall.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declarationclass1"


    public static class declarationclass2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarationclass2"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:277:1: declarationclass2 : className identifier ( ',' identifier )* -> ^( CLASSDECL className ( identifier )+ ) ;
    public final ProjectFinalASTParser.declarationclass2_return declarationclass2() throws RecognitionException {
        ProjectFinalASTParser.declarationclass2_return retval = new ProjectFinalASTParser.declarationclass2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal92=null;
        ProjectFinalASTParser.className_return className90 =null;

        ProjectFinalASTParser.identifier_return identifier91 =null;

        ProjectFinalASTParser.identifier_return identifier93 =null;


        Object char_literal92_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:278:5: ( className identifier ( ',' identifier )* -> ^( CLASSDECL className ( identifier )+ ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:278:7: className identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_className_in_declarationclass22015);
            className90=className();

            state._fsp--;

            stream_className.add(className90.getTree());

            pushFollow(FOLLOW_identifier_in_declarationclass22017);
            identifier91=identifier();

            state._fsp--;

            stream_identifier.add(identifier91.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:278:28: ( ',' identifier )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==133) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:278:29: ',' identifier
            	    {
            	    char_literal92=(Token)match(input,133,FOLLOW_133_in_declarationclass22020);  
            	    stream_133.add(char_literal92);


            	    pushFollow(FOLLOW_identifier_in_declarationclass22022);
            	    identifier93=identifier();

            	    state._fsp--;

            	    stream_identifier.add(identifier93.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // AST REWRITE
            // elements: identifier, className
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 278:46: -> ^( CLASSDECL className ( identifier )+ )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:278:49: ^( CLASSDECL className ( identifier )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CLASSDECL, "CLASSDECL")
                , root_1);

                adaptor.addChild(root_1, stream_className.nextTree());

                if ( !(stream_identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declarationclass2"


    public static class callclass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callclass"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:281:1: callclass : identifier '.' functionCall -> ^( CALLCLASS identifier functionCall ) ;
    public final ProjectFinalASTParser.callclass_return callclass() throws RecognitionException {
        ProjectFinalASTParser.callclass_return retval = new ProjectFinalASTParser.callclass_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal95=null;
        ProjectFinalASTParser.identifier_return identifier94 =null;

        ProjectFinalASTParser.functionCall_return functionCall96 =null;


        Object char_literal95_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:282:5: ( identifier '.' functionCall -> ^( CALLCLASS identifier functionCall ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:282:7: identifier '.' functionCall
            {
            pushFollow(FOLLOW_identifier_in_callclass2052);
            identifier94=identifier();

            state._fsp--;

            stream_identifier.add(identifier94.getTree());

            char_literal95=(Token)match(input,138,FOLLOW_138_in_callclass2054);  
            stream_138.add(char_literal95);


            pushFollow(FOLLOW_functionCall_in_callclass2056);
            functionCall96=functionCall();

            state._fsp--;

            stream_functionCall.add(functionCall96.getTree());

            // AST REWRITE
            // elements: identifier, functionCall
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 282:35: -> ^( CALLCLASS identifier functionCall )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:282:38: ^( CALLCLASS identifier functionCall )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CALLCLASS, "CALLCLASS")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_functionCall.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callclass"


    public static class statthis_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statthis"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:285:1: statthis : 'this' '->' identifier '=' identifier -> ^( STATTHIS THIS ARROW identifier ASSIGN identifier ) ;
    public final ProjectFinalASTParser.statthis_return statthis() throws RecognitionException {
        ProjectFinalASTParser.statthis_return retval = new ProjectFinalASTParser.statthis_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal97=null;
        Token string_literal98=null;
        Token char_literal100=null;
        ProjectFinalASTParser.identifier_return identifier99 =null;

        ProjectFinalASTParser.identifier_return identifier101 =null;


        Object string_literal97_tree=null;
        Object string_literal98_tree=null;
        Object char_literal100_tree=null;
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:286:5: ( 'this' '->' identifier '=' identifier -> ^( STATTHIS THIS ARROW identifier ASSIGN identifier ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:286:7: 'this' '->' identifier '=' identifier
            {
            string_literal97=(Token)match(input,183,FOLLOW_183_in_statthis2083);  
            stream_183.add(string_literal97);


            string_literal98=(Token)match(input,137,FOLLOW_137_in_statthis2085);  
            stream_137.add(string_literal98);


            pushFollow(FOLLOW_identifier_in_statthis2087);
            identifier99=identifier();

            state._fsp--;

            stream_identifier.add(identifier99.getTree());

            char_literal100=(Token)match(input,153,FOLLOW_153_in_statthis2089);  
            stream_153.add(char_literal100);


            pushFollow(FOLLOW_identifier_in_statthis2091);
            identifier101=identifier();

            state._fsp--;

            stream_identifier.add(identifier101.getTree());

            // AST REWRITE
            // elements: identifier, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 286:45: -> ^( STATTHIS THIS ARROW identifier ASSIGN identifier )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:286:48: ^( STATTHIS THIS ARROW identifier ASSIGN identifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATTHIS, "STATTHIS")
                , root_1);

                adaptor.addChild(root_1, 
                (Object)adaptor.create(THIS, "THIS")
                );

                adaptor.addChild(root_1, 
                (Object)adaptor.create(ARROW, "ARROW")
                );

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, 
                (Object)adaptor.create(ASSIGN, "ASSIGN")
                );

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statthis"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:289:1: declaration : ( typeSpecifier identifier ( ',' identifier )* ( arrayDimensions )? ( '{' '}' | '=' arrayInitialization | '=' expression )? ';' -> ^( DECLARATION typeSpecifier ( identifier )+ ( arrayDimensions )? ( arrayInitialization )? ( expression )? ) | pointerDeclaration -> ^( DECLARATION pointerDeclaration ) );
    public final ProjectFinalASTParser.declaration_return declaration() throws RecognitionException {
        ProjectFinalASTParser.declaration_return retval = new ProjectFinalASTParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal104=null;
        Token char_literal107=null;
        Token char_literal108=null;
        Token char_literal109=null;
        Token char_literal111=null;
        Token char_literal113=null;
        ProjectFinalASTParser.typeSpecifier_return typeSpecifier102 =null;

        ProjectFinalASTParser.identifier_return identifier103 =null;

        ProjectFinalASTParser.identifier_return identifier105 =null;

        ProjectFinalASTParser.arrayDimensions_return arrayDimensions106 =null;

        ProjectFinalASTParser.arrayInitialization_return arrayInitialization110 =null;

        ProjectFinalASTParser.expression_return expression112 =null;

        ProjectFinalASTParser.pointerDeclaration_return pointerDeclaration114 =null;


        Object char_literal104_tree=null;
        Object char_literal107_tree=null;
        Object char_literal108_tree=null;
        Object char_literal109_tree=null;
        Object char_literal111_tree=null;
        Object char_literal113_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_typeSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule typeSpecifier");
        RewriteRuleSubtreeStream stream_arrayDimensions=new RewriteRuleSubtreeStream(adaptor,"rule arrayDimensions");
        RewriteRuleSubtreeStream stream_arrayInitialization=new RewriteRuleSubtreeStream(adaptor,"rule arrayInitialization");
        RewriteRuleSubtreeStream stream_pointerDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule pointerDeclaration");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:290:5: ( typeSpecifier identifier ( ',' identifier )* ( arrayDimensions )? ( '{' '}' | '=' arrayInitialization | '=' expression )? ';' -> ^( DECLARATION typeSpecifier ( identifier )+ ( arrayDimensions )? ( arrayInitialization )? ( expression )? ) | pointerDeclaration -> ^( DECLARATION pointerDeclaration ) )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:290:7: typeSpecifier identifier ( ',' identifier )* ( arrayDimensions )? ( '{' '}' | '=' arrayInitialization | '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_typeSpecifier_in_declaration2124);
                    typeSpecifier102=typeSpecifier();

                    state._fsp--;

                    stream_typeSpecifier.add(typeSpecifier102.getTree());

                    pushFollow(FOLLOW_identifier_in_declaration2126);
                    identifier103=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier103.getTree());

                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:290:32: ( ',' identifier )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==133) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:290:33: ',' identifier
                    	    {
                    	    char_literal104=(Token)match(input,133,FOLLOW_133_in_declaration2129);  
                    	    stream_133.add(char_literal104);


                    	    pushFollow(FOLLOW_identifier_in_declaration2131);
                    	    identifier105=identifier();

                    	    state._fsp--;

                    	    stream_identifier.add(identifier105.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:290:50: ( arrayDimensions )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==158) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:290:50: arrayDimensions
                            {
                            pushFollow(FOLLOW_arrayDimensions_in_declaration2135);
                            arrayDimensions106=arrayDimensions();

                            state._fsp--;

                            stream_arrayDimensions.add(arrayDimensions106.getTree());

                            }
                            break;

                    }


                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:290:67: ( '{' '}' | '=' arrayInitialization | '=' expression )?
                    int alt23=4;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==188) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==153) ) {
                        int LA23_2 = input.LA(2);

                        if ( (LA23_2==188) ) {
                            alt23=2;
                        }
                        else if ( (LA23_2==FLOAT_LITERAL||LA23_2==IDENTIFIER||LA23_2==INTEGER_LITERAL||LA23_2==STRING_LITERAL||LA23_2==126||LA23_2==128||LA23_2==131||(LA23_2 >= 134 && LA23_2 <= 135)||LA23_2==170||LA23_2==184) ) {
                            alt23=3;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:290:68: '{' '}'
                            {
                            char_literal107=(Token)match(input,188,FOLLOW_188_in_declaration2139);  
                            stream_188.add(char_literal107);


                            char_literal108=(Token)match(input,190,FOLLOW_190_in_declaration2141);  
                            stream_190.add(char_literal108);


                            }
                            break;
                        case 2 :
                            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:290:78: '=' arrayInitialization
                            {
                            char_literal109=(Token)match(input,153,FOLLOW_153_in_declaration2145);  
                            stream_153.add(char_literal109);


                            pushFollow(FOLLOW_arrayInitialization_in_declaration2147);
                            arrayInitialization110=arrayInitialization();

                            state._fsp--;

                            stream_arrayInitialization.add(arrayInitialization110.getTree());

                            }
                            break;
                        case 3 :
                            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:290:104: '=' expression
                            {
                            char_literal111=(Token)match(input,153,FOLLOW_153_in_declaration2151);  
                            stream_153.add(char_literal111);


                            pushFollow(FOLLOW_expression_in_declaration2153);
                            expression112=expression();

                            state._fsp--;

                            stream_expression.add(expression112.getTree());

                            }
                            break;

                    }


                    char_literal113=(Token)match(input,143,FOLLOW_143_in_declaration2157);  
                    stream_143.add(char_literal113);


                    // AST REWRITE
                    // elements: identifier, expression, arrayInitialization, typeSpecifier, arrayDimensions
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 291:7: -> ^( DECLARATION typeSpecifier ( identifier )+ ( arrayDimensions )? ( arrayInitialization )? ( expression )? )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:291:10: ^( DECLARATION typeSpecifier ( identifier )+ ( arrayDimensions )? ( arrayInitialization )? ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeSpecifier.nextTree());

                        if ( !(stream_identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:291:50: ( arrayDimensions )?
                        if ( stream_arrayDimensions.hasNext() ) {
                            adaptor.addChild(root_1, stream_arrayDimensions.nextTree());

                        }
                        stream_arrayDimensions.reset();

                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:291:67: ( arrayInitialization )?
                        if ( stream_arrayInitialization.hasNext() ) {
                            adaptor.addChild(root_1, stream_arrayInitialization.nextTree());

                        }
                        stream_arrayInitialization.reset();

                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:291:88: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:292:7: pointerDeclaration
                    {
                    pushFollow(FOLLOW_pointerDeclaration_in_declaration2192);
                    pointerDeclaration114=pointerDeclaration();

                    state._fsp--;

                    stream_pointerDeclaration.add(pointerDeclaration114.getTree());

                    // AST REWRITE
                    // elements: pointerDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 292:26: -> ^( DECLARATION pointerDeclaration )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:292:29: ^( DECLARATION pointerDeclaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_pointerDeclaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class intArray_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intArray"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:295:1: intArray : identifier ( arrayDimensions )? -> ^( ARRAY identifier ( arrayDimensions )? ) ;
    public final ProjectFinalASTParser.intArray_return intArray() throws RecognitionException {
        ProjectFinalASTParser.intArray_return retval = new ProjectFinalASTParser.intArray_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.identifier_return identifier115 =null;

        ProjectFinalASTParser.arrayDimensions_return arrayDimensions116 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_arrayDimensions=new RewriteRuleSubtreeStream(adaptor,"rule arrayDimensions");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:296:5: ( identifier ( arrayDimensions )? -> ^( ARRAY identifier ( arrayDimensions )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:296:7: identifier ( arrayDimensions )?
            {
            pushFollow(FOLLOW_identifier_in_intArray2217);
            identifier115=identifier();

            state._fsp--;

            stream_identifier.add(identifier115.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:296:18: ( arrayDimensions )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==158) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:296:18: arrayDimensions
                    {
                    pushFollow(FOLLOW_arrayDimensions_in_intArray2219);
                    arrayDimensions116=arrayDimensions();

                    state._fsp--;

                    stream_arrayDimensions.add(arrayDimensions116.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: arrayDimensions, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 296:35: -> ^( ARRAY identifier ( arrayDimensions )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:296:38: ^( ARRAY identifier ( arrayDimensions )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:296:57: ( arrayDimensions )?
                if ( stream_arrayDimensions.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayDimensions.nextTree());

                }
                stream_arrayDimensions.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "intArray"


    public static class arrayDimensions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayDimensions"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:299:1: arrayDimensions : ( '[' ( expression )? ']' )+ -> ^( DIMENSIONS ( expression )* ) ;
    public final ProjectFinalASTParser.arrayDimensions_return arrayDimensions() throws RecognitionException {
        ProjectFinalASTParser.arrayDimensions_return retval = new ProjectFinalASTParser.arrayDimensions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal117=null;
        Token char_literal119=null;
        ProjectFinalASTParser.expression_return expression118 =null;


        Object char_literal117_tree=null;
        Object char_literal119_tree=null;
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:300:5: ( ( '[' ( expression )? ']' )+ -> ^( DIMENSIONS ( expression )* ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:300:7: ( '[' ( expression )? ']' )+
            {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:300:7: ( '[' ( expression )? ']' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==158) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:300:8: '[' ( expression )? ']'
            	    {
            	    char_literal117=(Token)match(input,158,FOLLOW_158_in_arrayDimensions2249);  
            	    stream_158.add(char_literal117);


            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:300:12: ( expression )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==FLOAT_LITERAL||LA26_0==IDENTIFIER||LA26_0==INTEGER_LITERAL||LA26_0==STRING_LITERAL||LA26_0==126||LA26_0==128||LA26_0==131||(LA26_0 >= 134 && LA26_0 <= 135)||LA26_0==170||LA26_0==184) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:300:12: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_arrayDimensions2251);
            	            expression118=expression();

            	            state._fsp--;

            	            stream_expression.add(expression118.getTree());

            	            }
            	            break;

            	    }


            	    char_literal119=(Token)match(input,159,FOLLOW_159_in_arrayDimensions2254);  
            	    stream_159.add(char_literal119);


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 300:30: -> ^( DIMENSIONS ( expression )* )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:300:33: ^( DIMENSIONS ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DIMENSIONS, "DIMENSIONS")
                , root_1);

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:300:46: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayDimensions"


    public static class arrayInitialization_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayInitialization"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:303:1: arrayInitialization : '{' ( expression ( ',' expression )* )? '}' -> ^( INIT ( expression )* ) ;
    public final ProjectFinalASTParser.arrayInitialization_return arrayInitialization() throws RecognitionException {
        ProjectFinalASTParser.arrayInitialization_return retval = new ProjectFinalASTParser.arrayInitialization_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal120=null;
        Token char_literal122=null;
        Token char_literal124=null;
        ProjectFinalASTParser.expression_return expression121 =null;

        ProjectFinalASTParser.expression_return expression123 =null;


        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:304:5: ( '{' ( expression ( ',' expression )* )? '}' -> ^( INIT ( expression )* ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:304:7: '{' ( expression ( ',' expression )* )? '}'
            {
            char_literal120=(Token)match(input,188,FOLLOW_188_in_arrayInitialization2282);  
            stream_188.add(char_literal120);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:304:11: ( expression ( ',' expression )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==FLOAT_LITERAL||LA29_0==IDENTIFIER||LA29_0==INTEGER_LITERAL||LA29_0==STRING_LITERAL||LA29_0==126||LA29_0==128||LA29_0==131||(LA29_0 >= 134 && LA29_0 <= 135)||LA29_0==170||LA29_0==184) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:304:12: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_arrayInitialization2285);
                    expression121=expression();

                    state._fsp--;

                    stream_expression.add(expression121.getTree());

                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:304:23: ( ',' expression )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==133) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:304:24: ',' expression
                    	    {
                    	    char_literal122=(Token)match(input,133,FOLLOW_133_in_arrayInitialization2288);  
                    	    stream_133.add(char_literal122);


                    	    pushFollow(FOLLOW_expression_in_arrayInitialization2290);
                    	    expression123=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression123.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal124=(Token)match(input,190,FOLLOW_190_in_arrayInitialization2296);  
            stream_190.add(char_literal124);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 304:47: -> ^( INIT ( expression )* )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:304:50: ^( INIT ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT, "INIT")
                , root_1);

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:304:57: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayInitialization"


    public static class pointerDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pointerDeclaration"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:307:1: pointerDeclaration : baseType ( pointerOp )+ identifier ( '=' pointerAssignment )? ';' -> ^( DECLARATION baseType ^( POINTER ( pointerOp )+ ) identifier ( pointerAssignment )? ) ;
    public final ProjectFinalASTParser.pointerDeclaration_return pointerDeclaration() throws RecognitionException {
        ProjectFinalASTParser.pointerDeclaration_return retval = new ProjectFinalASTParser.pointerDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal128=null;
        Token char_literal130=null;
        ProjectFinalASTParser.baseType_return baseType125 =null;

        ProjectFinalASTParser.pointerOp_return pointerOp126 =null;

        ProjectFinalASTParser.identifier_return identifier127 =null;

        ProjectFinalASTParser.pointerAssignment_return pointerAssignment129 =null;


        Object char_literal128_tree=null;
        Object char_literal130_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_pointerOp=new RewriteRuleSubtreeStream(adaptor,"rule pointerOp");
        RewriteRuleSubtreeStream stream_baseType=new RewriteRuleSubtreeStream(adaptor,"rule baseType");
        RewriteRuleSubtreeStream stream_pointerAssignment=new RewriteRuleSubtreeStream(adaptor,"rule pointerAssignment");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:308:5: ( baseType ( pointerOp )+ identifier ( '=' pointerAssignment )? ';' -> ^( DECLARATION baseType ^( POINTER ( pointerOp )+ ) identifier ( pointerAssignment )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:308:7: baseType ( pointerOp )+ identifier ( '=' pointerAssignment )? ';'
            {
            pushFollow(FOLLOW_baseType_in_pointerDeclaration2322);
            baseType125=baseType();

            state._fsp--;

            stream_baseType.add(baseType125.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:308:16: ( pointerOp )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==125||LA30_0==128) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:308:16: pointerOp
            	    {
            	    pushFollow(FOLLOW_pointerOp_in_pointerDeclaration2324);
            	    pointerOp126=pointerOp();

            	    state._fsp--;

            	    stream_pointerOp.add(pointerOp126.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            pushFollow(FOLLOW_identifier_in_pointerDeclaration2327);
            identifier127=identifier();

            state._fsp--;

            stream_identifier.add(identifier127.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:308:38: ( '=' pointerAssignment )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==153) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:308:39: '=' pointerAssignment
                    {
                    char_literal128=(Token)match(input,153,FOLLOW_153_in_pointerDeclaration2330);  
                    stream_153.add(char_literal128);


                    pushFollow(FOLLOW_pointerAssignment_in_pointerDeclaration2332);
                    pointerAssignment129=pointerAssignment();

                    state._fsp--;

                    stream_pointerAssignment.add(pointerAssignment129.getTree());

                    }
                    break;

            }


            char_literal130=(Token)match(input,143,FOLLOW_143_in_pointerDeclaration2336);  
            stream_143.add(char_literal130);


            // AST REWRITE
            // elements: pointerOp, baseType, identifier, pointerAssignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 309:7: -> ^( DECLARATION baseType ^( POINTER ( pointerOp )+ ) identifier ( pointerAssignment )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:309:10: ^( DECLARATION baseType ^( POINTER ( pointerOp )+ ) identifier ( pointerAssignment )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATION, "DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_baseType.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:309:33: ^( POINTER ( pointerOp )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(POINTER, "POINTER")
                , root_2);

                if ( !(stream_pointerOp.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pointerOp.hasNext() ) {
                    adaptor.addChild(root_2, stream_pointerOp.nextTree());

                }
                stream_pointerOp.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:309:66: ( pointerAssignment )?
                if ( stream_pointerAssignment.hasNext() ) {
                    adaptor.addChild(root_1, stream_pointerAssignment.nextTree());

                }
                stream_pointerAssignment.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pointerDeclaration"


    public static class memoryDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "memoryDeclaration"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:312:1: memoryDeclaration : baseType ( pointerOp )+ functionDefinition -> ^( DECLARATION baseType ^( POINTER ( pointerOp )+ ) functionDefinition ) ;
    public final ProjectFinalASTParser.memoryDeclaration_return memoryDeclaration() throws RecognitionException {
        ProjectFinalASTParser.memoryDeclaration_return retval = new ProjectFinalASTParser.memoryDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.baseType_return baseType131 =null;

        ProjectFinalASTParser.pointerOp_return pointerOp132 =null;

        ProjectFinalASTParser.functionDefinition_return functionDefinition133 =null;


        RewriteRuleSubtreeStream stream_pointerOp=new RewriteRuleSubtreeStream(adaptor,"rule pointerOp");
        RewriteRuleSubtreeStream stream_functionDefinition=new RewriteRuleSubtreeStream(adaptor,"rule functionDefinition");
        RewriteRuleSubtreeStream stream_baseType=new RewriteRuleSubtreeStream(adaptor,"rule baseType");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:313:5: ( baseType ( pointerOp )+ functionDefinition -> ^( DECLARATION baseType ^( POINTER ( pointerOp )+ ) functionDefinition ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:313:7: baseType ( pointerOp )+ functionDefinition
            {
            pushFollow(FOLLOW_baseType_in_memoryDeclaration2380);
            baseType131=baseType();

            state._fsp--;

            stream_baseType.add(baseType131.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:313:16: ( pointerOp )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==125||LA32_0==128) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:313:16: pointerOp
            	    {
            	    pushFollow(FOLLOW_pointerOp_in_memoryDeclaration2382);
            	    pointerOp132=pointerOp();

            	    state._fsp--;

            	    stream_pointerOp.add(pointerOp132.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            pushFollow(FOLLOW_functionDefinition_in_memoryDeclaration2385);
            functionDefinition133=functionDefinition();

            state._fsp--;

            stream_functionDefinition.add(functionDefinition133.getTree());

            // AST REWRITE
            // elements: functionDefinition, pointerOp, baseType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 313:46: -> ^( DECLARATION baseType ^( POINTER ( pointerOp )+ ) functionDefinition )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:313:49: ^( DECLARATION baseType ^( POINTER ( pointerOp )+ ) functionDefinition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATION, "DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_baseType.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:313:72: ^( POINTER ( pointerOp )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(POINTER, "POINTER")
                , root_2);

                if ( !(stream_pointerOp.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pointerOp.hasNext() ) {
                    adaptor.addChild(root_2, stream_pointerOp.nextTree());

                }
                stream_pointerOp.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_functionDefinition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "memoryDeclaration"


    public static class pointerAssignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pointerAssignment"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:316:1: pointerAssignment : 'new' baseType ( arrayDimensions arrayInitialization | '(' ( expressionList )? ')' )? -> ^( NEW baseType ( arrayDimensions )? ( arrayInitialization )? ( expressionList )? ) ;
    public final ProjectFinalASTParser.pointerAssignment_return pointerAssignment() throws RecognitionException {
        ProjectFinalASTParser.pointerAssignment_return retval = new ProjectFinalASTParser.pointerAssignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal134=null;
        Token char_literal138=null;
        Token char_literal140=null;
        ProjectFinalASTParser.baseType_return baseType135 =null;

        ProjectFinalASTParser.arrayDimensions_return arrayDimensions136 =null;

        ProjectFinalASTParser.arrayInitialization_return arrayInitialization137 =null;

        ProjectFinalASTParser.expressionList_return expressionList139 =null;


        Object string_literal134_tree=null;
        Object char_literal138_tree=null;
        Object char_literal140_tree=null;
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_arrayDimensions=new RewriteRuleSubtreeStream(adaptor,"rule arrayDimensions");
        RewriteRuleSubtreeStream stream_arrayInitialization=new RewriteRuleSubtreeStream(adaptor,"rule arrayInitialization");
        RewriteRuleSubtreeStream stream_baseType=new RewriteRuleSubtreeStream(adaptor,"rule baseType");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:317:5: ( 'new' baseType ( arrayDimensions arrayInitialization | '(' ( expressionList )? ')' )? -> ^( NEW baseType ( arrayDimensions )? ( arrayInitialization )? ( expressionList )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:317:7: 'new' baseType ( arrayDimensions arrayInitialization | '(' ( expressionList )? ')' )?
            {
            string_literal134=(Token)match(input,177,FOLLOW_177_in_pointerAssignment2419);  
            stream_177.add(string_literal134);


            pushFollow(FOLLOW_baseType_in_pointerAssignment2421);
            baseType135=baseType();

            state._fsp--;

            stream_baseType.add(baseType135.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:317:22: ( arrayDimensions arrayInitialization | '(' ( expressionList )? ')' )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==158) ) {
                alt34=1;
            }
            else if ( (LA34_0==126) ) {
                alt34=2;
            }
            switch (alt34) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:317:23: arrayDimensions arrayInitialization
                    {
                    pushFollow(FOLLOW_arrayDimensions_in_pointerAssignment2424);
                    arrayDimensions136=arrayDimensions();

                    state._fsp--;

                    stream_arrayDimensions.add(arrayDimensions136.getTree());

                    pushFollow(FOLLOW_arrayInitialization_in_pointerAssignment2426);
                    arrayInitialization137=arrayInitialization();

                    state._fsp--;

                    stream_arrayInitialization.add(arrayInitialization137.getTree());

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:317:61: '(' ( expressionList )? ')'
                    {
                    char_literal138=(Token)match(input,126,FOLLOW_126_in_pointerAssignment2430);  
                    stream_126.add(char_literal138);


                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:317:65: ( expressionList )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==FLOAT_LITERAL||LA33_0==IDENTIFIER||LA33_0==INTEGER_LITERAL||LA33_0==STRING_LITERAL||LA33_0==126||LA33_0==128||LA33_0==131||(LA33_0 >= 134 && LA33_0 <= 135)||LA33_0==170||LA33_0==184) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:317:65: expressionList
                            {
                            pushFollow(FOLLOW_expressionList_in_pointerAssignment2432);
                            expressionList139=expressionList();

                            state._fsp--;

                            stream_expressionList.add(expressionList139.getTree());

                            }
                            break;

                    }


                    char_literal140=(Token)match(input,127,FOLLOW_127_in_pointerAssignment2435);  
                    stream_127.add(char_literal140);


                    }
                    break;

            }


            // AST REWRITE
            // elements: expressionList, arrayInitialization, baseType, arrayDimensions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 318:7: -> ^( NEW baseType ( arrayDimensions )? ( arrayInitialization )? ( expressionList )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:318:10: ^( NEW baseType ( arrayDimensions )? ( arrayInitialization )? ( expressionList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NEW, "NEW")
                , root_1);

                adaptor.addChild(root_1, stream_baseType.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:318:25: ( arrayDimensions )?
                if ( stream_arrayDimensions.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayDimensions.nextTree());

                }
                stream_arrayDimensions.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:318:42: ( arrayInitialization )?
                if ( stream_arrayInitialization.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayInitialization.nextTree());

                }
                stream_arrayInitialization.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:318:63: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.nextTree());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pointerAssignment"


    public static class pointerDeallocation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pointerDeallocation"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:321:1: pointerDeallocation : 'delete' ( '[' ']' )? intArray -> ^( DELETE ( '[' ']' )? intArray ) ;
    public final ProjectFinalASTParser.pointerDeallocation_return pointerDeallocation() throws RecognitionException {
        ProjectFinalASTParser.pointerDeallocation_return retval = new ProjectFinalASTParser.pointerDeallocation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal141=null;
        Token char_literal142=null;
        Token char_literal143=null;
        ProjectFinalASTParser.intArray_return intArray144 =null;


        Object string_literal141_tree=null;
        Object char_literal142_tree=null;
        Object char_literal143_tree=null;
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleSubtreeStream stream_intArray=new RewriteRuleSubtreeStream(adaptor,"rule intArray");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:322:5: ( 'delete' ( '[' ']' )? intArray -> ^( DELETE ( '[' ']' )? intArray ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:322:7: 'delete' ( '[' ']' )? intArray
            {
            string_literal141=(Token)match(input,166,FOLLOW_166_in_pointerDeallocation2478);  
            stream_166.add(string_literal141);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:322:16: ( '[' ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==158) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:322:17: '[' ']'
                    {
                    char_literal142=(Token)match(input,158,FOLLOW_158_in_pointerDeallocation2481);  
                    stream_158.add(char_literal142);


                    char_literal143=(Token)match(input,159,FOLLOW_159_in_pointerDeallocation2483);  
                    stream_159.add(char_literal143);


                    }
                    break;

            }


            pushFollow(FOLLOW_intArray_in_pointerDeallocation2487);
            intArray144=intArray();

            state._fsp--;

            stream_intArray.add(intArray144.getTree());

            // AST REWRITE
            // elements: 158, 159, intArray
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 322:36: -> ^( DELETE ( '[' ']' )? intArray )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:322:39: ^( DELETE ( '[' ']' )? intArray )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DELETE, "DELETE")
                , root_1);

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:322:48: ( '[' ']' )?
                if ( stream_158.hasNext()||stream_159.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_158.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_159.nextNode()
                    );

                }
                stream_158.reset();
                stream_159.reset();

                adaptor.addChild(root_1, stream_intArray.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pointerDeallocation"


    public static class pointerDereference_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pointerDereference"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:325:1: pointerDereference : '*' identifier -> ^( DEREF '*' identifier ) ;
    public final ProjectFinalASTParser.pointerDereference_return pointerDereference() throws RecognitionException {
        ProjectFinalASTParser.pointerDereference_return retval = new ProjectFinalASTParser.pointerDereference_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal145=null;
        ProjectFinalASTParser.identifier_return identifier146 =null;


        Object char_literal145_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:326:5: ( '*' identifier -> ^( DEREF '*' identifier ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:326:7: '*' identifier
            {
            char_literal145=(Token)match(input,128,FOLLOW_128_in_pointerDereference2519);  
            stream_128.add(char_literal145);


            pushFollow(FOLLOW_identifier_in_pointerDereference2521);
            identifier146=identifier();

            state._fsp--;

            stream_identifier.add(identifier146.getTree());

            // AST REWRITE
            // elements: 128, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 326:22: -> ^( DEREF '*' identifier )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:326:25: ^( DEREF '*' identifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DEREF, "DEREF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_128.nextNode()
                );

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pointerDereference"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:329:1: assignment : identifier assignmentOperator expression ';' -> ^( ASSIGNMENT identifier assignmentOperator expression ) ;
    public final ProjectFinalASTParser.assignment_return assignment() throws RecognitionException {
        ProjectFinalASTParser.assignment_return retval = new ProjectFinalASTParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal150=null;
        ProjectFinalASTParser.identifier_return identifier147 =null;

        ProjectFinalASTParser.assignmentOperator_return assignmentOperator148 =null;

        ProjectFinalASTParser.expression_return expression149 =null;


        Object char_literal150_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_assignmentOperator=new RewriteRuleSubtreeStream(adaptor,"rule assignmentOperator");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:330:5: ( identifier assignmentOperator expression ';' -> ^( ASSIGNMENT identifier assignmentOperator expression ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:330:7: identifier assignmentOperator expression ';'
            {
            pushFollow(FOLLOW_identifier_in_assignment2548);
            identifier147=identifier();

            state._fsp--;

            stream_identifier.add(identifier147.getTree());

            pushFollow(FOLLOW_assignmentOperator_in_assignment2550);
            assignmentOperator148=assignmentOperator();

            state._fsp--;

            stream_assignmentOperator.add(assignmentOperator148.getTree());

            pushFollow(FOLLOW_expression_in_assignment2552);
            expression149=expression();

            state._fsp--;

            stream_expression.add(expression149.getTree());

            char_literal150=(Token)match(input,143,FOLLOW_143_in_assignment2554);  
            stream_143.add(char_literal150);


            // AST REWRITE
            // elements: identifier, expression, assignmentOperator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 331:7: -> ^( ASSIGNMENT identifier assignmentOperator expression )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:331:10: ^( ASSIGNMENT identifier assignmentOperator expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_assignmentOperator.nextTree());

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:334:1: expression : updateExpression -> ^( EXPRESSION updateExpression ) ;
    public final ProjectFinalASTParser.expression_return expression() throws RecognitionException {
        ProjectFinalASTParser.expression_return retval = new ProjectFinalASTParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.updateExpression_return updateExpression151 =null;


        RewriteRuleSubtreeStream stream_updateExpression=new RewriteRuleSubtreeStream(adaptor,"rule updateExpression");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:335:5: ( updateExpression -> ^( EXPRESSION updateExpression ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:335:7: updateExpression
            {
            pushFollow(FOLLOW_updateExpression_in_expression2590);
            updateExpression151=updateExpression();

            state._fsp--;

            stream_updateExpression.add(updateExpression151.getTree());

            // AST REWRITE
            // elements: updateExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 335:24: -> ^( EXPRESSION updateExpression )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:335:27: ^( EXPRESSION updateExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                , root_1);

                adaptor.addChild(root_1, stream_updateExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class updateExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "updateExpression"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:338:1: updateExpression : ( incrementExpr -> ^( EXPRESSION incrementExpr ) | assignmentExpr -> ^( EXPRESSION assignmentExpr ) | binaryExpression -> ^( EXPRESSION binaryExpression ) );
    public final ProjectFinalASTParser.updateExpression_return updateExpression() throws RecognitionException {
        ProjectFinalASTParser.updateExpression_return retval = new ProjectFinalASTParser.updateExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.incrementExpr_return incrementExpr152 =null;

        ProjectFinalASTParser.assignmentExpr_return assignmentExpr153 =null;

        ProjectFinalASTParser.binaryExpression_return binaryExpression154 =null;


        RewriteRuleSubtreeStream stream_assignmentExpr=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpr");
        RewriteRuleSubtreeStream stream_binaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule binaryExpression");
        RewriteRuleSubtreeStream stream_incrementExpr=new RewriteRuleSubtreeStream(adaptor,"rule incrementExpr");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:339:5: ( incrementExpr -> ^( EXPRESSION incrementExpr ) | assignmentExpr -> ^( EXPRESSION assignmentExpr ) | binaryExpression -> ^( EXPRESSION binaryExpression ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 131:
            case 135:
                {
                alt36=1;
                }
                break;
            case IDENTIFIER:
                {
                switch ( input.LA(2) ) {
                case 131:
                case 135:
                    {
                    alt36=1;
                    }
                    break;
                case 153:
                    {
                    alt36=2;
                    }
                    break;
                case EOF:
                case IDENTIFIER:
                case 119:
                case 121:
                case 122:
                case 124:
                case 126:
                case 127:
                case 128:
                case 130:
                case 133:
                case 134:
                case 139:
                case 143:
                case 144:
                case 145:
                case 146:
                case 154:
                case 155:
                case 156:
                case 159:
                case 163:
                case 168:
                case 175:
                case 185:
                case 186:
                case 189:
                case 190:
                    {
                    alt36=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;

                }

                }
                break;
            case FLOAT_LITERAL:
            case INTEGER_LITERAL:
            case STRING_LITERAL:
            case 126:
            case 128:
            case 134:
            case 170:
            case 184:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:339:7: incrementExpr
                    {
                    pushFollow(FOLLOW_incrementExpr_in_updateExpression2615);
                    incrementExpr152=incrementExpr();

                    state._fsp--;

                    stream_incrementExpr.add(incrementExpr152.getTree());

                    // AST REWRITE
                    // elements: incrementExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 339:21: -> ^( EXPRESSION incrementExpr )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:339:24: ^( EXPRESSION incrementExpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_incrementExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:340:7: assignmentExpr
                    {
                    pushFollow(FOLLOW_assignmentExpr_in_updateExpression2631);
                    assignmentExpr153=assignmentExpr();

                    state._fsp--;

                    stream_assignmentExpr.add(assignmentExpr153.getTree());

                    // AST REWRITE
                    // elements: assignmentExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:22: -> ^( EXPRESSION assignmentExpr )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:340:25: ^( EXPRESSION assignmentExpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_assignmentExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:341:7: binaryExpression
                    {
                    pushFollow(FOLLOW_binaryExpression_in_updateExpression2647);
                    binaryExpression154=binaryExpression();

                    state._fsp--;

                    stream_binaryExpression.add(binaryExpression154.getTree());

                    // AST REWRITE
                    // elements: binaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 341:24: -> ^( EXPRESSION binaryExpression )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:341:27: ^( EXPRESSION binaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_binaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "updateExpression"


    public static class incrementExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "incrementExpr"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:344:1: incrementExpr : ( '++' identifier -> ^( INCR '++' identifier ) | '--' identifier -> ^( DECR '--' identifier ) | identifier '++' -> ^( POSTINCR identifier '++' ) | identifier '--' -> ^( POSTDECR identifier '--' ) );
    public final ProjectFinalASTParser.incrementExpr_return incrementExpr() throws RecognitionException {
        ProjectFinalASTParser.incrementExpr_return retval = new ProjectFinalASTParser.incrementExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal155=null;
        Token string_literal157=null;
        Token string_literal160=null;
        Token string_literal162=null;
        ProjectFinalASTParser.identifier_return identifier156 =null;

        ProjectFinalASTParser.identifier_return identifier158 =null;

        ProjectFinalASTParser.identifier_return identifier159 =null;

        ProjectFinalASTParser.identifier_return identifier161 =null;


        Object string_literal155_tree=null;
        Object string_literal157_tree=null;
        Object string_literal160_tree=null;
        Object string_literal162_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:345:5: ( '++' identifier -> ^( INCR '++' identifier ) | '--' identifier -> ^( DECR '--' identifier ) | identifier '++' -> ^( POSTINCR identifier '++' ) | identifier '--' -> ^( POSTDECR identifier '--' ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt37=1;
                }
                break;
            case 135:
                {
                alt37=2;
                }
                break;
            case IDENTIFIER:
                {
                int LA37_3 = input.LA(2);

                if ( (LA37_3==131) ) {
                    alt37=3;
                }
                else if ( (LA37_3==135) ) {
                    alt37=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:345:7: '++' identifier
                    {
                    string_literal155=(Token)match(input,131,FOLLOW_131_in_incrementExpr2672);  
                    stream_131.add(string_literal155);


                    pushFollow(FOLLOW_identifier_in_incrementExpr2674);
                    identifier156=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier156.getTree());

                    // AST REWRITE
                    // elements: identifier, 131
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 345:23: -> ^( INCR '++' identifier )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:345:26: ^( INCR '++' identifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INCR, "INCR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_131.nextNode()
                        );

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:346:7: '--' identifier
                    {
                    string_literal157=(Token)match(input,135,FOLLOW_135_in_incrementExpr2692);  
                    stream_135.add(string_literal157);


                    pushFollow(FOLLOW_identifier_in_incrementExpr2694);
                    identifier158=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier158.getTree());

                    // AST REWRITE
                    // elements: identifier, 135
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:23: -> ^( DECR '--' identifier )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:346:26: ^( DECR '--' identifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECR, "DECR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_135.nextNode()
                        );

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:347:7: identifier '++'
                    {
                    pushFollow(FOLLOW_identifier_in_incrementExpr2712);
                    identifier159=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier159.getTree());

                    string_literal160=(Token)match(input,131,FOLLOW_131_in_incrementExpr2714);  
                    stream_131.add(string_literal160);


                    // AST REWRITE
                    // elements: identifier, 131
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:23: -> ^( POSTINCR identifier '++' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:347:26: ^( POSTINCR identifier '++' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POSTINCR, "POSTINCR")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_1, 
                        stream_131.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:348:7: identifier '--'
                    {
                    pushFollow(FOLLOW_identifier_in_incrementExpr2732);
                    identifier161=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier161.getTree());

                    string_literal162=(Token)match(input,135,FOLLOW_135_in_incrementExpr2734);  
                    stream_135.add(string_literal162);


                    // AST REWRITE
                    // elements: identifier, 135
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:23: -> ^( POSTDECR identifier '--' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:348:26: ^( POSTDECR identifier '--' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POSTDECR, "POSTDECR")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_1, 
                        stream_135.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "incrementExpr"


    public static class assignmentOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentOperator"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:351:1: assignmentOperator : ( '=' -> ^( ASSIGN '=' ) | '+=' -> ^( PLUSEQ '+=' ) | '-=' -> ^( MINUSEQ '-=' ) | '*=' -> ^( STAREQ '*=' ) | '/=' -> ^( DIVEQ '/=' ) | '%=' -> ^( MODEQ '%=' ) );
    public final ProjectFinalASTParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        ProjectFinalASTParser.assignmentOperator_return retval = new ProjectFinalASTParser.assignmentOperator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal163=null;
        Token string_literal164=null;
        Token string_literal165=null;
        Token string_literal166=null;
        Token string_literal167=null;
        Token string_literal168=null;

        Object char_literal163_tree=null;
        Object string_literal164_tree=null;
        Object string_literal165_tree=null;
        Object string_literal166_tree=null;
        Object string_literal167_tree=null;
        Object string_literal168_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");

        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:352:5: ( '=' -> ^( ASSIGN '=' ) | '+=' -> ^( PLUSEQ '+=' ) | '-=' -> ^( MINUSEQ '-=' ) | '*=' -> ^( STAREQ '*=' ) | '/=' -> ^( DIVEQ '/=' ) | '%=' -> ^( MODEQ '%=' ) )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 153:
                {
                alt38=1;
                }
                break;
            case 132:
                {
                alt38=2;
                }
                break;
            case 136:
                {
                alt38=3;
                }
                break;
            case 129:
                {
                alt38=4;
                }
                break;
            case 140:
                {
                alt38=5;
                }
                break;
            case 123:
                {
                alt38=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:352:7: '='
                    {
                    char_literal163=(Token)match(input,153,FOLLOW_153_in_assignmentOperator2761);  
                    stream_153.add(char_literal163);


                    // AST REWRITE
                    // elements: 153
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 352:11: -> ^( ASSIGN '=' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:352:14: ^( ASSIGN '=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ASSIGN, "ASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_153.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:353:7: '+='
                    {
                    string_literal164=(Token)match(input,132,FOLLOW_132_in_assignmentOperator2777);  
                    stream_132.add(string_literal164);


                    // AST REWRITE
                    // elements: 132
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:12: -> ^( PLUSEQ '+=' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:353:15: ^( PLUSEQ '+=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PLUSEQ, "PLUSEQ")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_132.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:354:7: '-='
                    {
                    string_literal165=(Token)match(input,136,FOLLOW_136_in_assignmentOperator2793);  
                    stream_136.add(string_literal165);


                    // AST REWRITE
                    // elements: 136
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:12: -> ^( MINUSEQ '-=' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:354:15: ^( MINUSEQ '-=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MINUSEQ, "MINUSEQ")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_136.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:355:7: '*='
                    {
                    string_literal166=(Token)match(input,129,FOLLOW_129_in_assignmentOperator2809);  
                    stream_129.add(string_literal166);


                    // AST REWRITE
                    // elements: 129
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 355:12: -> ^( STAREQ '*=' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:355:15: ^( STAREQ '*=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STAREQ, "STAREQ")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_129.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:356:7: '/='
                    {
                    string_literal167=(Token)match(input,140,FOLLOW_140_in_assignmentOperator2825);  
                    stream_140.add(string_literal167);


                    // AST REWRITE
                    // elements: 140
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 356:12: -> ^( DIVEQ '/=' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:356:15: ^( DIVEQ '/=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DIVEQ, "DIVEQ")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_140.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:357:7: '%='
                    {
                    string_literal168=(Token)match(input,123,FOLLOW_123_in_assignmentOperator2841);  
                    stream_123.add(string_literal168);


                    // AST REWRITE
                    // elements: 123
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 357:12: -> ^( MODEQ '%=' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:357:15: ^( MODEQ '%=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MODEQ, "MODEQ")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_123.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"


    public static class binaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "binaryExpression"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:360:1: binaryExpression : primaryExpression ( binaryOp primaryExpression )* -> ^( EXPRESSION primaryExpression ( binaryOp )* ( primaryExpression )* ) ;
    public final ProjectFinalASTParser.binaryExpression_return binaryExpression() throws RecognitionException {
        ProjectFinalASTParser.binaryExpression_return retval = new ProjectFinalASTParser.binaryExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.primaryExpression_return primaryExpression169 =null;

        ProjectFinalASTParser.binaryOp_return binaryOp170 =null;

        ProjectFinalASTParser.primaryExpression_return primaryExpression171 =null;


        RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
        RewriteRuleSubtreeStream stream_binaryOp=new RewriteRuleSubtreeStream(adaptor,"rule binaryOp");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:361:5: ( primaryExpression ( binaryOp primaryExpression )* -> ^( EXPRESSION primaryExpression ( binaryOp )* ( primaryExpression )* ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:361:7: primaryExpression ( binaryOp primaryExpression )*
            {
            pushFollow(FOLLOW_primaryExpression_in_binaryExpression2866);
            primaryExpression169=primaryExpression();

            state._fsp--;

            stream_primaryExpression.add(primaryExpression169.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:361:25: ( binaryOp primaryExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==119||LA39_0==122||LA39_0==124||LA39_0==128||LA39_0==130||LA39_0==134||LA39_0==139||LA39_0==144||LA39_0==146||(LA39_0 >= 154 && LA39_0 <= 156)||LA39_0==189) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:361:26: binaryOp primaryExpression
            	    {
            	    pushFollow(FOLLOW_binaryOp_in_binaryExpression2869);
            	    binaryOp170=binaryOp();

            	    state._fsp--;

            	    stream_binaryOp.add(binaryOp170.getTree());

            	    pushFollow(FOLLOW_primaryExpression_in_binaryExpression2871);
            	    primaryExpression171=primaryExpression();

            	    state._fsp--;

            	    stream_primaryExpression.add(primaryExpression171.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            // AST REWRITE
            // elements: binaryOp, primaryExpression, primaryExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 361:55: -> ^( EXPRESSION primaryExpression ( binaryOp )* ( primaryExpression )* )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:361:58: ^( EXPRESSION primaryExpression ( binaryOp )* ( primaryExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                , root_1);

                adaptor.addChild(root_1, stream_primaryExpression.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:361:89: ( binaryOp )*
                while ( stream_binaryOp.hasNext() ) {
                    adaptor.addChild(root_1, stream_binaryOp.nextTree());

                }
                stream_binaryOp.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:361:99: ( primaryExpression )*
                while ( stream_primaryExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_primaryExpression.nextTree());

                }
                stream_primaryExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "binaryExpression"


    public static class binaryOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "binaryOp"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:364:1: binaryOp : ( '+' -> ^( PLUS '+' ) | '-' -> ^( MINUS '-' ) | '*' -> ^( STAR '*' ) | '/' -> ^( DIV '/' ) | '%' -> ^( MOD '%' ) | '==' -> ^( EQ '==' ) | '!=' -> ^( NEQ '!=' ) | '<' -> ^( LT '<' ) | '>' -> ^( GT '>' ) | '<=' -> ^( LE '<=' ) | '>=' -> ^( GE '>=' ) | '&&' -> ^( AND '&&' ) | '||' -> ^( OR '||' ) );
    public final ProjectFinalASTParser.binaryOp_return binaryOp() throws RecognitionException {
        ProjectFinalASTParser.binaryOp_return retval = new ProjectFinalASTParser.binaryOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal172=null;
        Token char_literal173=null;
        Token char_literal174=null;
        Token char_literal175=null;
        Token char_literal176=null;
        Token string_literal177=null;
        Token string_literal178=null;
        Token char_literal179=null;
        Token char_literal180=null;
        Token string_literal181=null;
        Token string_literal182=null;
        Token string_literal183=null;
        Token string_literal184=null;

        Object char_literal172_tree=null;
        Object char_literal173_tree=null;
        Object char_literal174_tree=null;
        Object char_literal175_tree=null;
        Object char_literal176_tree=null;
        Object string_literal177_tree=null;
        Object string_literal178_tree=null;
        Object char_literal179_tree=null;
        Object char_literal180_tree=null;
        Object string_literal181_tree=null;
        Object string_literal182_tree=null;
        Object string_literal183_tree=null;
        Object string_literal184_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");

        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:365:5: ( '+' -> ^( PLUS '+' ) | '-' -> ^( MINUS '-' ) | '*' -> ^( STAR '*' ) | '/' -> ^( DIV '/' ) | '%' -> ^( MOD '%' ) | '==' -> ^( EQ '==' ) | '!=' -> ^( NEQ '!=' ) | '<' -> ^( LT '<' ) | '>' -> ^( GT '>' ) | '<=' -> ^( LE '<=' ) | '>=' -> ^( GE '>=' ) | '&&' -> ^( AND '&&' ) | '||' -> ^( OR '||' ) )
            int alt40=13;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt40=1;
                }
                break;
            case 134:
                {
                alt40=2;
                }
                break;
            case 128:
                {
                alt40=3;
                }
                break;
            case 139:
                {
                alt40=4;
                }
                break;
            case 122:
                {
                alt40=5;
                }
                break;
            case 154:
                {
                alt40=6;
                }
                break;
            case 119:
                {
                alt40=7;
                }
                break;
            case 144:
                {
                alt40=8;
                }
                break;
            case 155:
                {
                alt40=9;
                }
                break;
            case 146:
                {
                alt40=10;
                }
                break;
            case 156:
                {
                alt40=11;
                }
                break;
            case 124:
                {
                alt40=12;
                }
                break;
            case 189:
                {
                alt40=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:365:7: '+'
                    {
                    char_literal172=(Token)match(input,130,FOLLOW_130_in_binaryOp2904);  
                    stream_130.add(char_literal172);


                    // AST REWRITE
                    // elements: 130
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 365:11: -> ^( PLUS '+' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:365:14: ^( PLUS '+' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PLUS, "PLUS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_130.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:366:7: '-'
                    {
                    char_literal173=(Token)match(input,134,FOLLOW_134_in_binaryOp2920);  
                    stream_134.add(char_literal173);


                    // AST REWRITE
                    // elements: 134
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 366:11: -> ^( MINUS '-' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:366:14: ^( MINUS '-' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MINUS, "MINUS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_134.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:367:7: '*'
                    {
                    char_literal174=(Token)match(input,128,FOLLOW_128_in_binaryOp2936);  
                    stream_128.add(char_literal174);


                    // AST REWRITE
                    // elements: 128
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 367:11: -> ^( STAR '*' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:367:14: ^( STAR '*' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STAR, "STAR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_128.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:368:7: '/'
                    {
                    char_literal175=(Token)match(input,139,FOLLOW_139_in_binaryOp2952);  
                    stream_139.add(char_literal175);


                    // AST REWRITE
                    // elements: 139
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 368:11: -> ^( DIV '/' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:368:14: ^( DIV '/' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DIV, "DIV")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_139.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:369:7: '%'
                    {
                    char_literal176=(Token)match(input,122,FOLLOW_122_in_binaryOp2968);  
                    stream_122.add(char_literal176);


                    // AST REWRITE
                    // elements: 122
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 369:11: -> ^( MOD '%' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:369:14: ^( MOD '%' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MOD, "MOD")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_122.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:370:7: '=='
                    {
                    string_literal177=(Token)match(input,154,FOLLOW_154_in_binaryOp2984);  
                    stream_154.add(string_literal177);


                    // AST REWRITE
                    // elements: 154
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 370:12: -> ^( EQ '==' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:370:15: ^( EQ '==' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EQ, "EQ")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_154.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:371:7: '!='
                    {
                    string_literal178=(Token)match(input,119,FOLLOW_119_in_binaryOp3000);  
                    stream_119.add(string_literal178);


                    // AST REWRITE
                    // elements: 119
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 371:12: -> ^( NEQ '!=' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:371:15: ^( NEQ '!=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NEQ, "NEQ")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_119.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:372:7: '<'
                    {
                    char_literal179=(Token)match(input,144,FOLLOW_144_in_binaryOp3016);  
                    stream_144.add(char_literal179);


                    // AST REWRITE
                    // elements: 144
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 372:11: -> ^( LT '<' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:372:14: ^( LT '<' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LT, "LT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_144.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:373:7: '>'
                    {
                    char_literal180=(Token)match(input,155,FOLLOW_155_in_binaryOp3032);  
                    stream_155.add(char_literal180);


                    // AST REWRITE
                    // elements: 155
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 373:11: -> ^( GT '>' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:373:14: ^( GT '>' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(GT, "GT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_155.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 10 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:374:7: '<='
                    {
                    string_literal181=(Token)match(input,146,FOLLOW_146_in_binaryOp3048);  
                    stream_146.add(string_literal181);


                    // AST REWRITE
                    // elements: 146
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 374:12: -> ^( LE '<=' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:374:15: ^( LE '<=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LE, "LE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_146.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 11 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:375:7: '>='
                    {
                    string_literal182=(Token)match(input,156,FOLLOW_156_in_binaryOp3064);  
                    stream_156.add(string_literal182);


                    // AST REWRITE
                    // elements: 156
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 375:12: -> ^( GE '>=' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:375:15: ^( GE '>=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(GE, "GE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_156.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 12 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:376:7: '&&'
                    {
                    string_literal183=(Token)match(input,124,FOLLOW_124_in_binaryOp3080);  
                    stream_124.add(string_literal183);


                    // AST REWRITE
                    // elements: 124
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 376:12: -> ^( AND '&&' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:376:15: ^( AND '&&' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AND, "AND")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_124.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 13 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:377:7: '||'
                    {
                    string_literal184=(Token)match(input,189,FOLLOW_189_in_binaryOp3096);  
                    stream_189.add(string_literal184);


                    // AST REWRITE
                    // elements: 189
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 377:12: -> ^( OR '||' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:377:15: ^( OR '||' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(OR, "OR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_189.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "binaryOp"


    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primaryExpression"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:380:1: primaryExpression : ( identifier -> ^( IDENTIFIER identifier ) | literal -> ^( LITERAL literal ) | functionCall -> ^( CALL functionCall ) | pointerDereference -> ^( DEREF pointerDereference ) | '(' expression ')' -> ^( EXPRESSION expression ) );
    public final ProjectFinalASTParser.primaryExpression_return primaryExpression() throws RecognitionException {
        ProjectFinalASTParser.primaryExpression_return retval = new ProjectFinalASTParser.primaryExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal189=null;
        Token char_literal191=null;
        ProjectFinalASTParser.identifier_return identifier185 =null;

        ProjectFinalASTParser.literal_return literal186 =null;

        ProjectFinalASTParser.functionCall_return functionCall187 =null;

        ProjectFinalASTParser.pointerDereference_return pointerDereference188 =null;

        ProjectFinalASTParser.expression_return expression190 =null;


        Object char_literal189_tree=null;
        Object char_literal191_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_pointerDereference=new RewriteRuleSubtreeStream(adaptor,"rule pointerDereference");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:381:5: ( identifier -> ^( IDENTIFIER identifier ) | literal -> ^( LITERAL literal ) | functionCall -> ^( CALL functionCall ) | pointerDereference -> ^( DEREF pointerDereference ) | '(' expression ')' -> ^( EXPRESSION expression ) )
            int alt41=5;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==EOF||LA41_1==IDENTIFIER||LA41_1==119||(LA41_1 >= 121 && LA41_1 <= 122)||LA41_1==124||(LA41_1 >= 127 && LA41_1 <= 128)||LA41_1==130||(LA41_1 >= 133 && LA41_1 <= 134)||LA41_1==139||(LA41_1 >= 143 && LA41_1 <= 146)||(LA41_1 >= 154 && LA41_1 <= 156)||LA41_1==159||LA41_1==163||LA41_1==168||LA41_1==175||(LA41_1 >= 185 && LA41_1 <= 186)||(LA41_1 >= 189 && LA41_1 <= 190)) ) {
                    alt41=1;
                }
                else if ( (LA41_1==126) ) {
                    alt41=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT_LITERAL:
            case INTEGER_LITERAL:
            case STRING_LITERAL:
            case 134:
            case 170:
            case 184:
                {
                alt41=2;
                }
                break;
            case 128:
                {
                alt41=4;
                }
                break;
            case 126:
                {
                alt41=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:381:7: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_primaryExpression3121);
                    identifier185=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier185.getTree());

                    // AST REWRITE
                    // elements: identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 381:18: -> ^( IDENTIFIER identifier )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:381:21: ^( IDENTIFIER identifier )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IDENTIFIER, "IDENTIFIER")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:382:7: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression3137);
                    literal186=literal();

                    state._fsp--;

                    stream_literal.add(literal186.getTree());

                    // AST REWRITE
                    // elements: literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 382:15: -> ^( LITERAL literal )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:382:18: ^( LITERAL literal )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LITERAL, "LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, stream_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:383:7: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpression3153);
                    functionCall187=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall187.getTree());

                    // AST REWRITE
                    // elements: functionCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 383:20: -> ^( CALL functionCall )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:383:23: ^( CALL functionCall )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        adaptor.addChild(root_1, stream_functionCall.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:384:7: pointerDereference
                    {
                    pushFollow(FOLLOW_pointerDereference_in_primaryExpression3169);
                    pointerDereference188=pointerDereference();

                    state._fsp--;

                    stream_pointerDereference.add(pointerDereference188.getTree());

                    // AST REWRITE
                    // elements: pointerDereference
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 384:26: -> ^( DEREF pointerDereference )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:384:29: ^( DEREF pointerDereference )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DEREF, "DEREF")
                        , root_1);

                        adaptor.addChild(root_1, stream_pointerDereference.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:385:7: '(' expression ')'
                    {
                    char_literal189=(Token)match(input,126,FOLLOW_126_in_primaryExpression3185);  
                    stream_126.add(char_literal189);


                    pushFollow(FOLLOW_expression_in_primaryExpression3187);
                    expression190=expression();

                    state._fsp--;

                    stream_expression.add(expression190.getTree());

                    char_literal191=(Token)match(input,127,FOLLOW_127_in_primaryExpression3189);  
                    stream_127.add(char_literal191);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 385:26: -> ^( EXPRESSION expression )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:385:29: ^( EXPRESSION expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EXPRESSION, "EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"


    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:388:1: literal : ( INTEGER_LITERAL -> ^( LITERAL INTEGER_LITERAL ) | FLOAT_LITERAL -> ^( LITERAL FLOAT_LITERAL ) | '-' INTEGER_LITERAL -> ^( MINUS INTEGER_LITERAL ) | '-' FLOAT_LITERAL -> ^( MINUS FLOAT_LITERAL ) | STRING_LITERAL -> ^( LITERAL STRING_LITERAL ) | 'true' -> ^( TRUE 'true' ) | 'false' -> ^( FALSE 'false' ) );
    public final ProjectFinalASTParser.literal_return literal() throws RecognitionException {
        ProjectFinalASTParser.literal_return retval = new ProjectFinalASTParser.literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER_LITERAL192=null;
        Token FLOAT_LITERAL193=null;
        Token char_literal194=null;
        Token INTEGER_LITERAL195=null;
        Token char_literal196=null;
        Token FLOAT_LITERAL197=null;
        Token STRING_LITERAL198=null;
        Token string_literal199=null;
        Token string_literal200=null;

        Object INTEGER_LITERAL192_tree=null;
        Object FLOAT_LITERAL193_tree=null;
        Object char_literal194_tree=null;
        Object INTEGER_LITERAL195_tree=null;
        Object char_literal196_tree=null;
        Object FLOAT_LITERAL197_tree=null;
        Object STRING_LITERAL198_tree=null;
        Object string_literal199_tree=null;
        Object string_literal200_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_FLOAT_LITERAL=new RewriteRuleTokenStream(adaptor,"token FLOAT_LITERAL");
        RewriteRuleTokenStream stream_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token INTEGER_LITERAL");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");

        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:389:5: ( INTEGER_LITERAL -> ^( LITERAL INTEGER_LITERAL ) | FLOAT_LITERAL -> ^( LITERAL FLOAT_LITERAL ) | '-' INTEGER_LITERAL -> ^( MINUS INTEGER_LITERAL ) | '-' FLOAT_LITERAL -> ^( MINUS FLOAT_LITERAL ) | STRING_LITERAL -> ^( LITERAL STRING_LITERAL ) | 'true' -> ^( TRUE 'true' ) | 'false' -> ^( FALSE 'false' ) )
            int alt42=7;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
                {
                alt42=1;
                }
                break;
            case FLOAT_LITERAL:
                {
                alt42=2;
                }
                break;
            case 134:
                {
                int LA42_3 = input.LA(2);

                if ( (LA42_3==INTEGER_LITERAL) ) {
                    alt42=3;
                }
                else if ( (LA42_3==FLOAT_LITERAL) ) {
                    alt42=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 3, input);

                    throw nvae;

                }
                }
                break;
            case STRING_LITERAL:
                {
                alt42=5;
                }
                break;
            case 184:
                {
                alt42=6;
                }
                break;
            case 170:
                {
                alt42=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:389:7: INTEGER_LITERAL
                    {
                    INTEGER_LITERAL192=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_literal3214);  
                    stream_INTEGER_LITERAL.add(INTEGER_LITERAL192);


                    // AST REWRITE
                    // elements: INTEGER_LITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 389:23: -> ^( LITERAL INTEGER_LITERAL )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:389:26: ^( LITERAL INTEGER_LITERAL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LITERAL, "LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INTEGER_LITERAL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:390:7: FLOAT_LITERAL
                    {
                    FLOAT_LITERAL193=(Token)match(input,FLOAT_LITERAL,FOLLOW_FLOAT_LITERAL_in_literal3230);  
                    stream_FLOAT_LITERAL.add(FLOAT_LITERAL193);


                    // AST REWRITE
                    // elements: FLOAT_LITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 390:21: -> ^( LITERAL FLOAT_LITERAL )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:390:24: ^( LITERAL FLOAT_LITERAL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LITERAL, "LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FLOAT_LITERAL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:391:7: '-' INTEGER_LITERAL
                    {
                    char_literal194=(Token)match(input,134,FOLLOW_134_in_literal3246);  
                    stream_134.add(char_literal194);


                    INTEGER_LITERAL195=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_literal3248);  
                    stream_INTEGER_LITERAL.add(INTEGER_LITERAL195);


                    // AST REWRITE
                    // elements: INTEGER_LITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 391:27: -> ^( MINUS INTEGER_LITERAL )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:391:30: ^( MINUS INTEGER_LITERAL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MINUS, "MINUS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INTEGER_LITERAL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:392:7: '-' FLOAT_LITERAL
                    {
                    char_literal196=(Token)match(input,134,FOLLOW_134_in_literal3264);  
                    stream_134.add(char_literal196);


                    FLOAT_LITERAL197=(Token)match(input,FLOAT_LITERAL,FOLLOW_FLOAT_LITERAL_in_literal3266);  
                    stream_FLOAT_LITERAL.add(FLOAT_LITERAL197);


                    // AST REWRITE
                    // elements: FLOAT_LITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 392:25: -> ^( MINUS FLOAT_LITERAL )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:392:28: ^( MINUS FLOAT_LITERAL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MINUS, "MINUS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FLOAT_LITERAL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:393:7: STRING_LITERAL
                    {
                    STRING_LITERAL198=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal3282);  
                    stream_STRING_LITERAL.add(STRING_LITERAL198);


                    // AST REWRITE
                    // elements: STRING_LITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 393:22: -> ^( LITERAL STRING_LITERAL )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:393:25: ^( LITERAL STRING_LITERAL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LITERAL, "LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING_LITERAL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:394:7: 'true'
                    {
                    string_literal199=(Token)match(input,184,FOLLOW_184_in_literal3298);  
                    stream_184.add(string_literal199);


                    // AST REWRITE
                    // elements: 184
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 394:14: -> ^( TRUE 'true' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:394:17: ^( TRUE 'true' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TRUE, "TRUE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_184.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:395:7: 'false'
                    {
                    string_literal200=(Token)match(input,170,FOLLOW_170_in_literal3314);  
                    stream_170.add(string_literal200);


                    // AST REWRITE
                    // elements: 170
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 395:15: -> ^( FALSE 'false' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:395:18: ^( FALSE 'false' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FALSE, "FALSE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_170.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class functionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:398:1: functionCall : functionName '(' ( expressionList )? ')' -> ^( CALL functionName ( expressionList )? ) ;
    public final ProjectFinalASTParser.functionCall_return functionCall() throws RecognitionException {
        ProjectFinalASTParser.functionCall_return retval = new ProjectFinalASTParser.functionCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal202=null;
        Token char_literal204=null;
        ProjectFinalASTParser.functionName_return functionName201 =null;

        ProjectFinalASTParser.expressionList_return expressionList203 =null;


        Object char_literal202_tree=null;
        Object char_literal204_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:399:5: ( functionName '(' ( expressionList )? ')' -> ^( CALL functionName ( expressionList )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:399:7: functionName '(' ( expressionList )? ')'
            {
            pushFollow(FOLLOW_functionName_in_functionCall3339);
            functionName201=functionName();

            state._fsp--;

            stream_functionName.add(functionName201.getTree());

            char_literal202=(Token)match(input,126,FOLLOW_126_in_functionCall3341);  
            stream_126.add(char_literal202);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:399:24: ( expressionList )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==FLOAT_LITERAL||LA43_0==IDENTIFIER||LA43_0==INTEGER_LITERAL||LA43_0==STRING_LITERAL||LA43_0==126||LA43_0==128||LA43_0==131||(LA43_0 >= 134 && LA43_0 <= 135)||LA43_0==170||LA43_0==184) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:399:24: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_functionCall3343);
                    expressionList203=expressionList();

                    state._fsp--;

                    stream_expressionList.add(expressionList203.getTree());

                    }
                    break;

            }


            char_literal204=(Token)match(input,127,FOLLOW_127_in_functionCall3346);  
            stream_127.add(char_literal204);


            // AST REWRITE
            // elements: expressionList, functionName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 399:44: -> ^( CALL functionName ( expressionList )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:399:47: ^( CALL functionName ( expressionList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CALL, "CALL")
                , root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:399:67: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.nextTree());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionCall"


    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:402:1: expressionList : expression ( ',' expression )* -> ^( ARGS ( expression )+ ) ;
    public final ProjectFinalASTParser.expressionList_return expressionList() throws RecognitionException {
        ProjectFinalASTParser.expressionList_return retval = new ProjectFinalASTParser.expressionList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal206=null;
        ProjectFinalASTParser.expression_return expression205 =null;

        ProjectFinalASTParser.expression_return expression207 =null;


        Object char_literal206_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:403:5: ( expression ( ',' expression )* -> ^( ARGS ( expression )+ ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:403:7: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList3374);
            expression205=expression();

            state._fsp--;

            stream_expression.add(expression205.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:403:18: ( ',' expression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==133) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:403:19: ',' expression
            	    {
            	    char_literal206=(Token)match(input,133,FOLLOW_133_in_expressionList3377);  
            	    stream_133.add(char_literal206);


            	    pushFollow(FOLLOW_expression_in_expressionList3379);
            	    expression207=expression();

            	    state._fsp--;

            	    stream_expression.add(expression207.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 403:36: -> ^( ARGS ( expression )+ )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:403:39: ^( ARGS ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGS, "ARGS")
                , root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionList"


    public static class returnStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnStatement"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:406:1: returnStatement : 'return' ( expression | pointerAssignment )? ';' -> ^( RETURN ( expression )? ( pointerAssignment )? ) ;
    public final ProjectFinalASTParser.returnStatement_return returnStatement() throws RecognitionException {
        ProjectFinalASTParser.returnStatement_return retval = new ProjectFinalASTParser.returnStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal208=null;
        Token char_literal211=null;
        ProjectFinalASTParser.expression_return expression209 =null;

        ProjectFinalASTParser.pointerAssignment_return pointerAssignment210 =null;


        Object string_literal208_tree=null;
        Object char_literal211_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_pointerAssignment=new RewriteRuleSubtreeStream(adaptor,"rule pointerAssignment");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:407:5: ( 'return' ( expression | pointerAssignment )? ';' -> ^( RETURN ( expression )? ( pointerAssignment )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:407:7: 'return' ( expression | pointerAssignment )? ';'
            {
            string_literal208=(Token)match(input,180,FOLLOW_180_in_returnStatement3407);  
            stream_180.add(string_literal208);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:407:16: ( expression | pointerAssignment )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==FLOAT_LITERAL||LA45_0==IDENTIFIER||LA45_0==INTEGER_LITERAL||LA45_0==STRING_LITERAL||LA45_0==126||LA45_0==128||LA45_0==131||(LA45_0 >= 134 && LA45_0 <= 135)||LA45_0==170||LA45_0==184) ) {
                alt45=1;
            }
            else if ( (LA45_0==177) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:407:17: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement3410);
                    expression209=expression();

                    state._fsp--;

                    stream_expression.add(expression209.getTree());

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:407:30: pointerAssignment
                    {
                    pushFollow(FOLLOW_pointerAssignment_in_returnStatement3414);
                    pointerAssignment210=pointerAssignment();

                    state._fsp--;

                    stream_pointerAssignment.add(pointerAssignment210.getTree());

                    }
                    break;

            }


            char_literal211=(Token)match(input,143,FOLLOW_143_in_returnStatement3418);  
            stream_143.add(char_literal211);


            // AST REWRITE
            // elements: expression, pointerAssignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 407:54: -> ^( RETURN ( expression )? ( pointerAssignment )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:407:57: ^( RETURN ( expression )? ( pointerAssignment )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETURN, "RETURN")
                , root_1);

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:407:66: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:407:78: ( pointerAssignment )?
                if ( stream_pointerAssignment.hasNext() ) {
                    adaptor.addChild(root_1, stream_pointerAssignment.nextTree());

                }
                stream_pointerAssignment.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "returnStatement"


    public static class controlStructure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "controlStructure"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:410:1: controlStructure : ( ifStatement -> ^( CONTROL ifStatement ) | forLoop -> ^( CONTROL forLoop ) | whileLoop -> ^( CONTROL whileLoop ) | doWhileLoop -> ^( CONTROL doWhileLoop ) );
    public final ProjectFinalASTParser.controlStructure_return controlStructure() throws RecognitionException {
        ProjectFinalASTParser.controlStructure_return retval = new ProjectFinalASTParser.controlStructure_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.ifStatement_return ifStatement212 =null;

        ProjectFinalASTParser.forLoop_return forLoop213 =null;

        ProjectFinalASTParser.whileLoop_return whileLoop214 =null;

        ProjectFinalASTParser.doWhileLoop_return doWhileLoop215 =null;


        RewriteRuleSubtreeStream stream_whileLoop=new RewriteRuleSubtreeStream(adaptor,"rule whileLoop");
        RewriteRuleSubtreeStream stream_ifStatement=new RewriteRuleSubtreeStream(adaptor,"rule ifStatement");
        RewriteRuleSubtreeStream stream_forLoop=new RewriteRuleSubtreeStream(adaptor,"rule forLoop");
        RewriteRuleSubtreeStream stream_doWhileLoop=new RewriteRuleSubtreeStream(adaptor,"rule doWhileLoop");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:411:5: ( ifStatement -> ^( CONTROL ifStatement ) | forLoop -> ^( CONTROL forLoop ) | whileLoop -> ^( CONTROL whileLoop ) | doWhileLoop -> ^( CONTROL doWhileLoop ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 173:
                {
                alt46=1;
                }
                break;
            case 171:
                {
                alt46=2;
                }
                break;
            case 187:
                {
                alt46=3;
                }
                break;
            case 167:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:411:7: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_controlStructure3447);
                    ifStatement212=ifStatement();

                    state._fsp--;

                    stream_ifStatement.add(ifStatement212.getTree());

                    // AST REWRITE
                    // elements: ifStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 411:19: -> ^( CONTROL ifStatement )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:411:22: ^( CONTROL ifStatement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONTROL, "CONTROL")
                        , root_1);

                        adaptor.addChild(root_1, stream_ifStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:412:7: forLoop
                    {
                    pushFollow(FOLLOW_forLoop_in_controlStructure3463);
                    forLoop213=forLoop();

                    state._fsp--;

                    stream_forLoop.add(forLoop213.getTree());

                    // AST REWRITE
                    // elements: forLoop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 412:15: -> ^( CONTROL forLoop )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:412:18: ^( CONTROL forLoop )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONTROL, "CONTROL")
                        , root_1);

                        adaptor.addChild(root_1, stream_forLoop.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:413:7: whileLoop
                    {
                    pushFollow(FOLLOW_whileLoop_in_controlStructure3479);
                    whileLoop214=whileLoop();

                    state._fsp--;

                    stream_whileLoop.add(whileLoop214.getTree());

                    // AST REWRITE
                    // elements: whileLoop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 413:17: -> ^( CONTROL whileLoop )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:413:20: ^( CONTROL whileLoop )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONTROL, "CONTROL")
                        , root_1);

                        adaptor.addChild(root_1, stream_whileLoop.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:414:7: doWhileLoop
                    {
                    pushFollow(FOLLOW_doWhileLoop_in_controlStructure3495);
                    doWhileLoop215=doWhileLoop();

                    state._fsp--;

                    stream_doWhileLoop.add(doWhileLoop215.getTree());

                    // AST REWRITE
                    // elements: doWhileLoop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 414:19: -> ^( CONTROL doWhileLoop )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:414:22: ^( CONTROL doWhileLoop )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONTROL, "CONTROL")
                        , root_1);

                        adaptor.addChild(root_1, stream_doWhileLoop.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "controlStructure"


    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStatement"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:417:1: ifStatement : 'if' '(' expression ')' ( body | singleStatement ) ( elsePart )? -> ^( CONTROL 'if' expression ( body )? ( singleStatement )? ( elsePart )? ) ;
    public final ProjectFinalASTParser.ifStatement_return ifStatement() throws RecognitionException {
        ProjectFinalASTParser.ifStatement_return retval = new ProjectFinalASTParser.ifStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal216=null;
        Token char_literal217=null;
        Token char_literal219=null;
        ProjectFinalASTParser.expression_return expression218 =null;

        ProjectFinalASTParser.body_return body220 =null;

        ProjectFinalASTParser.singleStatement_return singleStatement221 =null;

        ProjectFinalASTParser.elsePart_return elsePart222 =null;


        Object string_literal216_tree=null;
        Object char_literal217_tree=null;
        Object char_literal219_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_elsePart=new RewriteRuleSubtreeStream(adaptor,"rule elsePart");
        RewriteRuleSubtreeStream stream_singleStatement=new RewriteRuleSubtreeStream(adaptor,"rule singleStatement");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:418:5: ( 'if' '(' expression ')' ( body | singleStatement ) ( elsePart )? -> ^( CONTROL 'if' expression ( body )? ( singleStatement )? ( elsePart )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:418:7: 'if' '(' expression ')' ( body | singleStatement ) ( elsePart )?
            {
            string_literal216=(Token)match(input,173,FOLLOW_173_in_ifStatement3520);  
            stream_173.add(string_literal216);


            char_literal217=(Token)match(input,126,FOLLOW_126_in_ifStatement3522);  
            stream_126.add(char_literal217);


            pushFollow(FOLLOW_expression_in_ifStatement3524);
            expression218=expression();

            state._fsp--;

            stream_expression.add(expression218.getTree());

            char_literal219=(Token)match(input,127,FOLLOW_127_in_ifStatement3526);  
            stream_127.add(char_literal219);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:418:31: ( body | singleStatement )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==188) ) {
                alt47=1;
            }
            else if ( (LA47_0==IDENTIFIER||LA47_0==131||LA47_0==135||(LA47_0 >= 160 && LA47_0 <= 162)||(LA47_0 >= 165 && LA47_0 <= 168)||LA47_0==171||LA47_0==173||LA47_0==175||LA47_0==180||LA47_0==183||LA47_0==187) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:418:32: body
                    {
                    pushFollow(FOLLOW_body_in_ifStatement3529);
                    body220=body();

                    state._fsp--;

                    stream_body.add(body220.getTree());

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:418:39: singleStatement
                    {
                    pushFollow(FOLLOW_singleStatement_in_ifStatement3533);
                    singleStatement221=singleStatement();

                    state._fsp--;

                    stream_singleStatement.add(singleStatement221.getTree());

                    }
                    break;

            }


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:418:56: ( elsePart )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==169) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:418:56: elsePart
                    {
                    pushFollow(FOLLOW_elsePart_in_ifStatement3536);
                    elsePart222=elsePart();

                    state._fsp--;

                    stream_elsePart.add(elsePart222.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: 173, expression, singleStatement, body, elsePart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 418:66: -> ^( CONTROL 'if' expression ( body )? ( singleStatement )? ( elsePart )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:418:69: ^( CONTROL 'if' expression ( body )? ( singleStatement )? ( elsePart )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONTROL, "CONTROL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_173.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:418:95: ( body )?
                if ( stream_body.hasNext() ) {
                    adaptor.addChild(root_1, stream_body.nextTree());

                }
                stream_body.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:418:101: ( singleStatement )?
                if ( stream_singleStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_singleStatement.nextTree());

                }
                stream_singleStatement.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:418:118: ( elsePart )?
                if ( stream_elsePart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elsePart.nextTree());

                }
                stream_elsePart.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifStatement"


    public static class elsePart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elsePart"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:421:1: elsePart : 'else' ( body | singleStatement ) -> ^( CONTROL 'else' ( body )? ( singleStatement )? ) ;
    public final ProjectFinalASTParser.elsePart_return elsePart() throws RecognitionException {
        ProjectFinalASTParser.elsePart_return retval = new ProjectFinalASTParser.elsePart_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal223=null;
        ProjectFinalASTParser.body_return body224 =null;

        ProjectFinalASTParser.singleStatement_return singleStatement225 =null;


        Object string_literal223_tree=null;
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleSubtreeStream stream_singleStatement=new RewriteRuleSubtreeStream(adaptor,"rule singleStatement");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:422:5: ( 'else' ( body | singleStatement ) -> ^( CONTROL 'else' ( body )? ( singleStatement )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:422:7: 'else' ( body | singleStatement )
            {
            string_literal223=(Token)match(input,169,FOLLOW_169_in_elsePart3573);  
            stream_169.add(string_literal223);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:422:14: ( body | singleStatement )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==188) ) {
                alt49=1;
            }
            else if ( (LA49_0==IDENTIFIER||LA49_0==131||LA49_0==135||(LA49_0 >= 160 && LA49_0 <= 162)||(LA49_0 >= 165 && LA49_0 <= 168)||LA49_0==171||LA49_0==173||LA49_0==175||LA49_0==180||LA49_0==183||LA49_0==187) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }
            switch (alt49) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:422:15: body
                    {
                    pushFollow(FOLLOW_body_in_elsePart3576);
                    body224=body();

                    state._fsp--;

                    stream_body.add(body224.getTree());

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:422:22: singleStatement
                    {
                    pushFollow(FOLLOW_singleStatement_in_elsePart3580);
                    singleStatement225=singleStatement();

                    state._fsp--;

                    stream_singleStatement.add(singleStatement225.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: 169, body, singleStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 422:39: -> ^( CONTROL 'else' ( body )? ( singleStatement )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:422:42: ^( CONTROL 'else' ( body )? ( singleStatement )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONTROL, "CONTROL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_169.nextNode()
                );

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:422:59: ( body )?
                if ( stream_body.hasNext() ) {
                    adaptor.addChild(root_1, stream_body.nextTree());

                }
                stream_body.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:422:65: ( singleStatement )?
                if ( stream_singleStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_singleStatement.nextTree());

                }
                stream_singleStatement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elsePart"


    public static class singleStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "singleStatement"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:425:1: singleStatement : statement -> ^( STATEMENTS statement ) ;
    public final ProjectFinalASTParser.singleStatement_return singleStatement() throws RecognitionException {
        ProjectFinalASTParser.singleStatement_return retval = new ProjectFinalASTParser.singleStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.statement_return statement226 =null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:426:5: ( statement -> ^( STATEMENTS statement ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:426:7: statement
            {
            pushFollow(FOLLOW_statement_in_singleStatement3612);
            statement226=statement();

            state._fsp--;

            stream_statement.add(statement226.getTree());

            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 426:17: -> ^( STATEMENTS statement )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:426:20: ^( STATEMENTS statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "singleStatement"


    public static class forLoop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forLoop"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:429:1: forLoop : 'for' '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' body -> ^( FOR ( forInit )? ( expression )? ( forUpdate )? body ) ;
    public final ProjectFinalASTParser.forLoop_return forLoop() throws RecognitionException {
        ProjectFinalASTParser.forLoop_return retval = new ProjectFinalASTParser.forLoop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal227=null;
        Token char_literal228=null;
        Token char_literal230=null;
        Token char_literal232=null;
        Token char_literal234=null;
        ProjectFinalASTParser.forInit_return forInit229 =null;

        ProjectFinalASTParser.expression_return expression231 =null;

        ProjectFinalASTParser.forUpdate_return forUpdate233 =null;

        ProjectFinalASTParser.body_return body235 =null;


        Object string_literal227_tree=null;
        Object char_literal228_tree=null;
        Object char_literal230_tree=null;
        Object char_literal232_tree=null;
        Object char_literal234_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleSubtreeStream stream_forUpdate=new RewriteRuleSubtreeStream(adaptor,"rule forUpdate");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:430:5: ( 'for' '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' body -> ^( FOR ( forInit )? ( expression )? ( forUpdate )? body ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:430:7: 'for' '(' ( forInit )? ';' ( expression )? ';' ( forUpdate )? ')' body
            {
            string_literal227=(Token)match(input,171,FOLLOW_171_in_forLoop3637);  
            stream_171.add(string_literal227);


            char_literal228=(Token)match(input,126,FOLLOW_126_in_forLoop3639);  
            stream_126.add(char_literal228);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:430:17: ( forInit )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==IDENTIFIER||(LA50_0 >= 160 && LA50_0 <= 161)||LA50_0==168||LA50_0==175) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:430:17: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_forLoop3641);
                    forInit229=forInit();

                    state._fsp--;

                    stream_forInit.add(forInit229.getTree());

                    }
                    break;

            }


            char_literal230=(Token)match(input,143,FOLLOW_143_in_forLoop3644);  
            stream_143.add(char_literal230);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:430:30: ( expression )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==FLOAT_LITERAL||LA51_0==IDENTIFIER||LA51_0==INTEGER_LITERAL||LA51_0==STRING_LITERAL||LA51_0==126||LA51_0==128||LA51_0==131||(LA51_0 >= 134 && LA51_0 <= 135)||LA51_0==170||LA51_0==184) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:430:30: expression
                    {
                    pushFollow(FOLLOW_expression_in_forLoop3646);
                    expression231=expression();

                    state._fsp--;

                    stream_expression.add(expression231.getTree());

                    }
                    break;

            }


            char_literal232=(Token)match(input,143,FOLLOW_143_in_forLoop3649);  
            stream_143.add(char_literal232);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:430:46: ( forUpdate )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==FLOAT_LITERAL||LA52_0==IDENTIFIER||LA52_0==INTEGER_LITERAL||LA52_0==STRING_LITERAL||LA52_0==126||LA52_0==128||LA52_0==131||(LA52_0 >= 134 && LA52_0 <= 135)||LA52_0==170||LA52_0==184) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:430:46: forUpdate
                    {
                    pushFollow(FOLLOW_forUpdate_in_forLoop3651);
                    forUpdate233=forUpdate();

                    state._fsp--;

                    stream_forUpdate.add(forUpdate233.getTree());

                    }
                    break;

            }


            char_literal234=(Token)match(input,127,FOLLOW_127_in_forLoop3654);  
            stream_127.add(char_literal234);


            pushFollow(FOLLOW_body_in_forLoop3656);
            body235=body();

            state._fsp--;

            stream_body.add(body235.getTree());

            // AST REWRITE
            // elements: body, expression, forUpdate, forInit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 431:7: -> ^( FOR ( forInit )? ( expression )? ( forUpdate )? body )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:431:10: ^( FOR ( forInit )? ( expression )? ( forUpdate )? body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FOR, "FOR")
                , root_1);

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:431:16: ( forInit )?
                if ( stream_forInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_forInit.nextTree());

                }
                stream_forInit.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:431:25: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:431:37: ( forUpdate )?
                if ( stream_forUpdate.hasNext() ) {
                    adaptor.addChild(root_1, stream_forUpdate.nextTree());

                }
                stream_forUpdate.reset();

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forLoop"


    public static class forInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forInit"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:434:1: forInit : ( declarationList -> ^( DECLARATIONLIST declarationList ) | assignmentList -> ^( ASSIGNMENTLIST assignmentList ) );
    public final ProjectFinalASTParser.forInit_return forInit() throws RecognitionException {
        ProjectFinalASTParser.forInit_return retval = new ProjectFinalASTParser.forInit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.declarationList_return declarationList236 =null;

        ProjectFinalASTParser.assignmentList_return assignmentList237 =null;


        RewriteRuleSubtreeStream stream_declarationList=new RewriteRuleSubtreeStream(adaptor,"rule declarationList");
        RewriteRuleSubtreeStream stream_assignmentList=new RewriteRuleSubtreeStream(adaptor,"rule assignmentList");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:435:5: ( declarationList -> ^( DECLARATIONLIST declarationList ) | assignmentList -> ^( ASSIGNMENTLIST assignmentList ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0 >= 160 && LA53_0 <= 161)||LA53_0==168||LA53_0==175) ) {
                alt53=1;
            }
            else if ( (LA53_0==IDENTIFIER) ) {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==IDENTIFIER||LA53_2==125||LA53_2==128) ) {
                    alt53=1;
                }
                else if ( (LA53_2==153) ) {
                    alt53=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:435:7: declarationList
                    {
                    pushFollow(FOLLOW_declarationList_in_forInit3697);
                    declarationList236=declarationList();

                    state._fsp--;

                    stream_declarationList.add(declarationList236.getTree());

                    // AST REWRITE
                    // elements: declarationList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 435:23: -> ^( DECLARATIONLIST declarationList )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:435:26: ^( DECLARATIONLIST declarationList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATIONLIST, "DECLARATIONLIST")
                        , root_1);

                        adaptor.addChild(root_1, stream_declarationList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:436:7: assignmentList
                    {
                    pushFollow(FOLLOW_assignmentList_in_forInit3713);
                    assignmentList237=assignmentList();

                    state._fsp--;

                    stream_assignmentList.add(assignmentList237.getTree());

                    // AST REWRITE
                    // elements: assignmentList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 436:22: -> ^( ASSIGNMENTLIST assignmentList )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:436:25: ^( ASSIGNMENTLIST assignmentList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ASSIGNMENTLIST, "ASSIGNMENTLIST")
                        , root_1);

                        adaptor.addChild(root_1, stream_assignmentList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forInit"


    public static class declarationList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarationList"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:439:1: declarationList : typeSpecifier declarator ( ',' declarator )* -> ^( DECLARATIONLIST typeSpecifier ( declarator )+ ) ;
    public final ProjectFinalASTParser.declarationList_return declarationList() throws RecognitionException {
        ProjectFinalASTParser.declarationList_return retval = new ProjectFinalASTParser.declarationList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal240=null;
        ProjectFinalASTParser.typeSpecifier_return typeSpecifier238 =null;

        ProjectFinalASTParser.declarator_return declarator239 =null;

        ProjectFinalASTParser.declarator_return declarator241 =null;


        Object char_literal240_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_typeSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule typeSpecifier");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:440:5: ( typeSpecifier declarator ( ',' declarator )* -> ^( DECLARATIONLIST typeSpecifier ( declarator )+ ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:440:7: typeSpecifier declarator ( ',' declarator )*
            {
            pushFollow(FOLLOW_typeSpecifier_in_declarationList3738);
            typeSpecifier238=typeSpecifier();

            state._fsp--;

            stream_typeSpecifier.add(typeSpecifier238.getTree());

            pushFollow(FOLLOW_declarator_in_declarationList3740);
            declarator239=declarator();

            state._fsp--;

            stream_declarator.add(declarator239.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:440:32: ( ',' declarator )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==133) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:440:33: ',' declarator
            	    {
            	    char_literal240=(Token)match(input,133,FOLLOW_133_in_declarationList3743);  
            	    stream_133.add(char_literal240);


            	    pushFollow(FOLLOW_declarator_in_declarationList3745);
            	    declarator241=declarator();

            	    state._fsp--;

            	    stream_declarator.add(declarator241.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            // AST REWRITE
            // elements: declarator, typeSpecifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 441:7: -> ^( DECLARATIONLIST typeSpecifier ( declarator )+ )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:441:10: ^( DECLARATIONLIST typeSpecifier ( declarator )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATIONLIST, "DECLARATIONLIST")
                , root_1);

                adaptor.addChild(root_1, stream_typeSpecifier.nextTree());

                if ( !(stream_declarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declarator.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarator.nextTree());

                }
                stream_declarator.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declarationList"


    public static class declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarator"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:444:1: declarator : identifier ( '=' expression )? -> ^( DECLARATOR identifier ( expression )? ) ;
    public final ProjectFinalASTParser.declarator_return declarator() throws RecognitionException {
        ProjectFinalASTParser.declarator_return retval = new ProjectFinalASTParser.declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal243=null;
        ProjectFinalASTParser.identifier_return identifier242 =null;

        ProjectFinalASTParser.expression_return expression244 =null;


        Object char_literal243_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:445:5: ( identifier ( '=' expression )? -> ^( DECLARATOR identifier ( expression )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:445:7: identifier ( '=' expression )?
            {
            pushFollow(FOLLOW_identifier_in_declarator3782);
            identifier242=identifier();

            state._fsp--;

            stream_identifier.add(identifier242.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:445:18: ( '=' expression )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==153) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:445:19: '=' expression
                    {
                    char_literal243=(Token)match(input,153,FOLLOW_153_in_declarator3785);  
                    stream_153.add(char_literal243);


                    pushFollow(FOLLOW_expression_in_declarator3787);
                    expression244=expression();

                    state._fsp--;

                    stream_expression.add(expression244.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 445:36: -> ^( DECLARATOR identifier ( expression )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:445:39: ^( DECLARATOR identifier ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATOR, "DECLARATOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:445:63: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declarator"


    public static class assignmentList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentList"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:448:1: assignmentList : assignmentExpr ( ',' assignmentExpr )* -> ^( ASSIGNMENTLIST ( assignmentExpr )+ ) ;
    public final ProjectFinalASTParser.assignmentList_return assignmentList() throws RecognitionException {
        ProjectFinalASTParser.assignmentList_return retval = new ProjectFinalASTParser.assignmentList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal246=null;
        ProjectFinalASTParser.assignmentExpr_return assignmentExpr245 =null;

        ProjectFinalASTParser.assignmentExpr_return assignmentExpr247 =null;


        Object char_literal246_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_assignmentExpr=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpr");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:449:5: ( assignmentExpr ( ',' assignmentExpr )* -> ^( ASSIGNMENTLIST ( assignmentExpr )+ ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:449:7: assignmentExpr ( ',' assignmentExpr )*
            {
            pushFollow(FOLLOW_assignmentExpr_in_assignmentList3817);
            assignmentExpr245=assignmentExpr();

            state._fsp--;

            stream_assignmentExpr.add(assignmentExpr245.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:449:22: ( ',' assignmentExpr )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==133) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:449:23: ',' assignmentExpr
            	    {
            	    char_literal246=(Token)match(input,133,FOLLOW_133_in_assignmentList3820);  
            	    stream_133.add(char_literal246);


            	    pushFollow(FOLLOW_assignmentExpr_in_assignmentList3822);
            	    assignmentExpr247=assignmentExpr();

            	    state._fsp--;

            	    stream_assignmentExpr.add(assignmentExpr247.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            // AST REWRITE
            // elements: assignmentExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 449:44: -> ^( ASSIGNMENTLIST ( assignmentExpr )+ )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:449:47: ^( ASSIGNMENTLIST ( assignmentExpr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ASSIGNMENTLIST, "ASSIGNMENTLIST")
                , root_1);

                if ( !(stream_assignmentExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_assignmentExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignmentExpr.nextTree());

                }
                stream_assignmentExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignmentList"


    public static class assignmentExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentExpr"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:452:1: assignmentExpr : identifier '=' expression -> ^( ASSIGN identifier expression ) ;
    public final ProjectFinalASTParser.assignmentExpr_return assignmentExpr() throws RecognitionException {
        ProjectFinalASTParser.assignmentExpr_return retval = new ProjectFinalASTParser.assignmentExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal249=null;
        ProjectFinalASTParser.identifier_return identifier248 =null;

        ProjectFinalASTParser.expression_return expression250 =null;


        Object char_literal249_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:453:5: ( identifier '=' expression -> ^( ASSIGN identifier expression ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:453:7: identifier '=' expression
            {
            pushFollow(FOLLOW_identifier_in_assignmentExpr3850);
            identifier248=identifier();

            state._fsp--;

            stream_identifier.add(identifier248.getTree());

            char_literal249=(Token)match(input,153,FOLLOW_153_in_assignmentExpr3852);  
            stream_153.add(char_literal249);


            pushFollow(FOLLOW_expression_in_assignmentExpr3854);
            expression250=expression();

            state._fsp--;

            stream_expression.add(expression250.getTree());

            // AST REWRITE
            // elements: expression, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 453:33: -> ^( ASSIGN identifier expression )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:453:36: ^( ASSIGN identifier expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ASSIGN, "ASSIGN")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignmentExpr"


    public static class forUpdate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forUpdate"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:456:1: forUpdate : expression ( ',' expression )* -> ^( FORUPDATE ( expression )+ ) ;
    public final ProjectFinalASTParser.forUpdate_return forUpdate() throws RecognitionException {
        ProjectFinalASTParser.forUpdate_return retval = new ProjectFinalASTParser.forUpdate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal252=null;
        ProjectFinalASTParser.expression_return expression251 =null;

        ProjectFinalASTParser.expression_return expression253 =null;


        Object char_literal252_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:457:5: ( expression ( ',' expression )* -> ^( FORUPDATE ( expression )+ ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:457:7: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_forUpdate3881);
            expression251=expression();

            state._fsp--;

            stream_expression.add(expression251.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:457:18: ( ',' expression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==133) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:457:19: ',' expression
            	    {
            	    char_literal252=(Token)match(input,133,FOLLOW_133_in_forUpdate3884);  
            	    stream_133.add(char_literal252);


            	    pushFollow(FOLLOW_expression_in_forUpdate3886);
            	    expression253=expression();

            	    state._fsp--;

            	    stream_expression.add(expression253.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 457:36: -> ^( FORUPDATE ( expression )+ )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:457:39: ^( FORUPDATE ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FORUPDATE, "FORUPDATE")
                , root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forUpdate"


    public static class whileLoop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileLoop"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:460:1: whileLoop : 'while' '(' expression ')' body -> ^( WHILE expression body ) ;
    public final ProjectFinalASTParser.whileLoop_return whileLoop() throws RecognitionException {
        ProjectFinalASTParser.whileLoop_return retval = new ProjectFinalASTParser.whileLoop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal254=null;
        Token char_literal255=null;
        Token char_literal257=null;
        ProjectFinalASTParser.expression_return expression256 =null;

        ProjectFinalASTParser.body_return body258 =null;


        Object string_literal254_tree=null;
        Object char_literal255_tree=null;
        Object char_literal257_tree=null;
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:461:5: ( 'while' '(' expression ')' body -> ^( WHILE expression body ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:461:7: 'while' '(' expression ')' body
            {
            string_literal254=(Token)match(input,187,FOLLOW_187_in_whileLoop3914);  
            stream_187.add(string_literal254);


            char_literal255=(Token)match(input,126,FOLLOW_126_in_whileLoop3916);  
            stream_126.add(char_literal255);


            pushFollow(FOLLOW_expression_in_whileLoop3918);
            expression256=expression();

            state._fsp--;

            stream_expression.add(expression256.getTree());

            char_literal257=(Token)match(input,127,FOLLOW_127_in_whileLoop3920);  
            stream_127.add(char_literal257);


            pushFollow(FOLLOW_body_in_whileLoop3922);
            body258=body();

            state._fsp--;

            stream_body.add(body258.getTree());

            // AST REWRITE
            // elements: body, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 461:39: -> ^( WHILE expression body )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:461:42: ^( WHILE expression body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WHILE, "WHILE")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileLoop"


    public static class doWhileLoop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doWhileLoop"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:464:1: doWhileLoop : 'do' body 'while' '(' expression ')' ';' -> ^( DOWHILE body expression ) ;
    public final ProjectFinalASTParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
        ProjectFinalASTParser.doWhileLoop_return retval = new ProjectFinalASTParser.doWhileLoop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal259=null;
        Token string_literal261=null;
        Token char_literal262=null;
        Token char_literal264=null;
        Token char_literal265=null;
        ProjectFinalASTParser.body_return body260 =null;

        ProjectFinalASTParser.expression_return expression263 =null;


        Object string_literal259_tree=null;
        Object string_literal261_tree=null;
        Object char_literal262_tree=null;
        Object char_literal264_tree=null;
        Object char_literal265_tree=null;
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:465:5: ( 'do' body 'while' '(' expression ')' ';' -> ^( DOWHILE body expression ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:465:7: 'do' body 'while' '(' expression ')' ';'
            {
            string_literal259=(Token)match(input,167,FOLLOW_167_in_doWhileLoop3949);  
            stream_167.add(string_literal259);


            pushFollow(FOLLOW_body_in_doWhileLoop3951);
            body260=body();

            state._fsp--;

            stream_body.add(body260.getTree());

            string_literal261=(Token)match(input,187,FOLLOW_187_in_doWhileLoop3953);  
            stream_187.add(string_literal261);


            char_literal262=(Token)match(input,126,FOLLOW_126_in_doWhileLoop3955);  
            stream_126.add(char_literal262);


            pushFollow(FOLLOW_expression_in_doWhileLoop3957);
            expression263=expression();

            state._fsp--;

            stream_expression.add(expression263.getTree());

            char_literal264=(Token)match(input,127,FOLLOW_127_in_doWhileLoop3959);  
            stream_127.add(char_literal264);


            char_literal265=(Token)match(input,143,FOLLOW_143_in_doWhileLoop3961);  
            stream_143.add(char_literal265);


            // AST REWRITE
            // elements: body, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 465:48: -> ^( DOWHILE body expression )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:465:51: ^( DOWHILE body expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DOWHILE, "DOWHILE")
                , root_1);

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "doWhileLoop"


    public static class classDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDefinition"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:468:1: classDefinition : ( 'class' className ( '{' ( classBody )* '}' )? ';' -> ^( CLASS_DEF className ( classBody )* ) | voidHelper ( body )? -> ^( CLASS_DEF voidHelper ( body )? ) );
    public final ProjectFinalASTParser.classDefinition_return classDefinition() throws RecognitionException {
        ProjectFinalASTParser.classDefinition_return retval = new ProjectFinalASTParser.classDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal266=null;
        Token char_literal268=null;
        Token char_literal270=null;
        Token char_literal271=null;
        ProjectFinalASTParser.className_return className267 =null;

        ProjectFinalASTParser.classBody_return classBody269 =null;

        ProjectFinalASTParser.voidHelper_return voidHelper272 =null;

        ProjectFinalASTParser.body_return body273 =null;


        Object string_literal266_tree=null;
        Object char_literal268_tree=null;
        Object char_literal270_tree=null;
        Object char_literal271_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_voidHelper=new RewriteRuleSubtreeStream(adaptor,"rule voidHelper");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:469:5: ( 'class' className ( '{' ( classBody )* '}' )? ';' -> ^( CLASS_DEF className ( classBody )* ) | voidHelper ( body )? -> ^( CLASS_DEF voidHelper ( body )? ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==163) ) {
                alt61=1;
            }
            else if ( (LA61_0==IDENTIFIER||LA61_0==168||LA61_0==175||LA61_0==186) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:469:7: 'class' className ( '{' ( classBody )* '}' )? ';'
                    {
                    string_literal266=(Token)match(input,163,FOLLOW_163_in_classDefinition3988);  
                    stream_163.add(string_literal266);


                    pushFollow(FOLLOW_className_in_classDefinition3990);
                    className267=className();

                    state._fsp--;

                    stream_className.add(className267.getTree());

                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:469:25: ( '{' ( classBody )* '}' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==188) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:469:26: '{' ( classBody )* '}'
                            {
                            char_literal268=(Token)match(input,188,FOLLOW_188_in_classDefinition3993);  
                            stream_188.add(char_literal268);


                            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:469:30: ( classBody )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( ((LA58_0 >= 178 && LA58_0 <= 179)) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:469:30: classBody
                            	    {
                            	    pushFollow(FOLLOW_classBody_in_classDefinition3995);
                            	    classBody269=classBody();

                            	    state._fsp--;

                            	    stream_classBody.add(classBody269.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            char_literal270=(Token)match(input,190,FOLLOW_190_in_classDefinition3998);  
                            stream_190.add(char_literal270);


                            }
                            break;

                    }


                    char_literal271=(Token)match(input,143,FOLLOW_143_in_classDefinition4002);  
                    stream_143.add(char_literal271);


                    // AST REWRITE
                    // elements: className, classBody
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 469:51: -> ^( CLASS_DEF className ( classBody )* )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:469:54: ^( CLASS_DEF className ( classBody )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CLASS_DEF, "CLASS_DEF")
                        , root_1);

                        adaptor.addChild(root_1, stream_className.nextTree());

                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:469:76: ( classBody )*
                        while ( stream_classBody.hasNext() ) {
                            adaptor.addChild(root_1, stream_classBody.nextTree());

                        }
                        stream_classBody.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:470:7: voidHelper ( body )?
                    {
                    pushFollow(FOLLOW_voidHelper_in_classDefinition4021);
                    voidHelper272=voidHelper();

                    state._fsp--;

                    stream_voidHelper.add(voidHelper272.getTree());

                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:470:18: ( body )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==188) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:470:18: body
                            {
                            pushFollow(FOLLOW_body_in_classDefinition4023);
                            body273=body();

                            state._fsp--;

                            stream_body.add(body273.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: voidHelper, body
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 470:24: -> ^( CLASS_DEF voidHelper ( body )? )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:470:27: ^( CLASS_DEF voidHelper ( body )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CLASS_DEF, "CLASS_DEF")
                        , root_1);

                        adaptor.addChild(root_1, stream_voidHelper.nextTree());

                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:470:50: ( body )?
                        if ( stream_body.hasNext() ) {
                            adaptor.addChild(root_1, stream_body.nextTree());

                        }
                        stream_body.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classDefinition"


    public static class className_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "className"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:473:1: className : identifier -> ^( IDENTIFIER identifier ) ;
    public final ProjectFinalASTParser.className_return className() throws RecognitionException {
        ProjectFinalASTParser.className_return retval = new ProjectFinalASTParser.className_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.identifier_return identifier274 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:474:5: ( identifier -> ^( IDENTIFIER identifier ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:474:7: identifier
            {
            pushFollow(FOLLOW_identifier_in_className4052);
            identifier274=identifier();

            state._fsp--;

            stream_identifier.add(identifier274.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 474:18: -> ^( IDENTIFIER identifier )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:474:21: ^( IDENTIFIER identifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IDENTIFIER, "IDENTIFIER")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "className"


    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBody"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:477:1: classBody : privpub ( member )* -> ^( BODY privpub ( member )* ) ;
    public final ProjectFinalASTParser.classBody_return classBody() throws RecognitionException {
        ProjectFinalASTParser.classBody_return retval = new ProjectFinalASTParser.classBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.privpub_return privpub275 =null;

        ProjectFinalASTParser.member_return member276 =null;


        RewriteRuleSubtreeStream stream_member=new RewriteRuleSubtreeStream(adaptor,"rule member");
        RewriteRuleSubtreeStream stream_privpub=new RewriteRuleSubtreeStream(adaptor,"rule privpub");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:478:5: ( privpub ( member )* -> ^( BODY privpub ( member )* ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:478:7: privpub ( member )*
            {
            pushFollow(FOLLOW_privpub_in_classBody4077);
            privpub275=privpub();

            state._fsp--;

            stream_privpub.add(privpub275.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:478:15: ( member )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==IDENTIFIER||(LA62_0 >= 160 && LA62_0 <= 161)||LA62_0==168||LA62_0==172||LA62_0==175||LA62_0==181||LA62_0==186) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:478:15: member
            	    {
            	    pushFollow(FOLLOW_member_in_classBody4079);
            	    member276=member();

            	    state._fsp--;

            	    stream_member.add(member276.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            // AST REWRITE
            // elements: member, privpub
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 478:23: -> ^( BODY privpub ( member )* )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:478:26: ^( BODY privpub ( member )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BODY, "BODY")
                , root_1);

                adaptor.addChild(root_1, stream_privpub.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:478:41: ( member )*
                while ( stream_member.hasNext() ) {
                    adaptor.addChild(root_1, stream_member.nextTree());

                }
                stream_member.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classBody"


    public static class privpub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "privpub"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:481:1: privpub : ( 'public:' -> ^( PUBLIC 'public:' ) | 'private:' -> ^( PRIVATE 'private:' ) );
    public final ProjectFinalASTParser.privpub_return privpub() throws RecognitionException {
        ProjectFinalASTParser.privpub_return retval = new ProjectFinalASTParser.privpub_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal277=null;
        Token string_literal278=null;

        Object string_literal277_tree=null;
        Object string_literal278_tree=null;
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");

        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:482:5: ( 'public:' -> ^( PUBLIC 'public:' ) | 'private:' -> ^( PRIVATE 'private:' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==179) ) {
                alt63=1;
            }
            else if ( (LA63_0==178) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:482:7: 'public:'
                    {
                    string_literal277=(Token)match(input,179,FOLLOW_179_in_privpub4108);  
                    stream_179.add(string_literal277);


                    // AST REWRITE
                    // elements: 179
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 482:17: -> ^( PUBLIC 'public:' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:482:20: ^( PUBLIC 'public:' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PUBLIC, "PUBLIC")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_179.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:483:7: 'private:'
                    {
                    string_literal278=(Token)match(input,178,FOLLOW_178_in_privpub4124);  
                    stream_178.add(string_literal278);


                    // AST REWRITE
                    // elements: 178
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 483:18: -> ^( PRIVATE 'private:' )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:483:21: ^( PRIVATE 'private:' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRIVATE, "PRIVATE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_178.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "privpub"


    public static class member_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "member"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:486:1: member : ( declaration -> ^( DECLARATION declaration ) | classFunction -> ^( FUNCTION_DEF classFunction ) | constructorDefinition -> ^( CONSTRUCTOR constructorDefinition ) | friendFunction ';' -> ^( FRIEND friendFunction ) | staticMember -> ^( STATIC staticMember ) | staticFunctionDefinition -> ^( FUNCTION_DEF staticFunctionDefinition ) );
    public final ProjectFinalASTParser.member_return member() throws RecognitionException {
        ProjectFinalASTParser.member_return retval = new ProjectFinalASTParser.member_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal283=null;
        ProjectFinalASTParser.declaration_return declaration279 =null;

        ProjectFinalASTParser.classFunction_return classFunction280 =null;

        ProjectFinalASTParser.constructorDefinition_return constructorDefinition281 =null;

        ProjectFinalASTParser.friendFunction_return friendFunction282 =null;

        ProjectFinalASTParser.staticMember_return staticMember284 =null;

        ProjectFinalASTParser.staticFunctionDefinition_return staticFunctionDefinition285 =null;


        Object char_literal283_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleSubtreeStream stream_friendFunction=new RewriteRuleSubtreeStream(adaptor,"rule friendFunction");
        RewriteRuleSubtreeStream stream_staticFunctionDefinition=new RewriteRuleSubtreeStream(adaptor,"rule staticFunctionDefinition");
        RewriteRuleSubtreeStream stream_staticMember=new RewriteRuleSubtreeStream(adaptor,"rule staticMember");
        RewriteRuleSubtreeStream stream_classFunction=new RewriteRuleSubtreeStream(adaptor,"rule classFunction");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_constructorDefinition=new RewriteRuleSubtreeStream(adaptor,"rule constructorDefinition");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:487:5: ( declaration -> ^( DECLARATION declaration ) | classFunction -> ^( FUNCTION_DEF classFunction ) | constructorDefinition -> ^( CONSTRUCTOR constructorDefinition ) | friendFunction ';' -> ^( FRIEND friendFunction ) | staticMember -> ^( STATIC staticMember ) | staticFunctionDefinition -> ^( FUNCTION_DEF staticFunctionDefinition ) )
            int alt64=6;
            switch ( input.LA(1) ) {
            case 175:
                {
                switch ( input.LA(2) ) {
                case 128:
                    {
                    int LA64_8 = input.LA(3);

                    if ( (LA64_8==IDENTIFIER) ) {
                        int LA64_19 = input.LA(4);

                        if ( (LA64_19==133||LA64_19==143||LA64_19==153||LA64_19==158||LA64_19==188) ) {
                            alt64=1;
                        }
                        else if ( (LA64_19==126) ) {
                            alt64=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 19, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA64_8==125||LA64_8==128) ) {
                        alt64=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 8, input);

                        throw nvae;

                    }
                    }
                    break;
                case 125:
                    {
                    int LA64_9 = input.LA(3);

                    if ( (LA64_9==IDENTIFIER) ) {
                        int LA64_19 = input.LA(4);

                        if ( (LA64_19==133||LA64_19==143||LA64_19==153||LA64_19==158||LA64_19==188) ) {
                            alt64=1;
                        }
                        else if ( (LA64_19==126) ) {
                            alt64=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 19, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA64_9==125||LA64_9==128) ) {
                        alt64=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 9, input);

                        throw nvae;

                    }
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA64_10 = input.LA(3);

                    if ( (LA64_10==133||LA64_10==143||LA64_10==153||LA64_10==158||LA64_10==188) ) {
                        alt64=1;
                    }
                    else if ( (LA64_10==126) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 10, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;

                }

                }
                break;
            case 168:
                {
                switch ( input.LA(2) ) {
                case 128:
                    {
                    int LA64_11 = input.LA(3);

                    if ( (LA64_11==IDENTIFIER) ) {
                        int LA64_19 = input.LA(4);

                        if ( (LA64_19==133||LA64_19==143||LA64_19==153||LA64_19==158||LA64_19==188) ) {
                            alt64=1;
                        }
                        else if ( (LA64_19==126) ) {
                            alt64=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 19, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA64_11==125||LA64_11==128) ) {
                        alt64=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 11, input);

                        throw nvae;

                    }
                    }
                    break;
                case 125:
                    {
                    int LA64_12 = input.LA(3);

                    if ( (LA64_12==IDENTIFIER) ) {
                        int LA64_19 = input.LA(4);

                        if ( (LA64_19==133||LA64_19==143||LA64_19==153||LA64_19==158||LA64_19==188) ) {
                            alt64=1;
                        }
                        else if ( (LA64_19==126) ) {
                            alt64=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 19, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA64_12==125||LA64_12==128) ) {
                        alt64=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 12, input);

                        throw nvae;

                    }
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA64_10 = input.LA(3);

                    if ( (LA64_10==133||LA64_10==143||LA64_10==153||LA64_10==158||LA64_10==188) ) {
                        alt64=1;
                    }
                    else if ( (LA64_10==126) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 10, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;

                }

                }
                break;
            case 160:
            case 161:
                {
                alt64=1;
                }
                break;
            case IDENTIFIER:
                {
                switch ( input.LA(2) ) {
                case 125:
                case 128:
                    {
                    alt64=1;
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA64_10 = input.LA(3);

                    if ( (LA64_10==133||LA64_10==143||LA64_10==153||LA64_10==158||LA64_10==188) ) {
                        alt64=1;
                    }
                    else if ( (LA64_10==126) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 10, input);

                        throw nvae;

                    }
                    }
                    break;
                case 126:
                    {
                    alt64=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 4, input);

                    throw nvae;

                }

                }
                break;
            case 186:
                {
                alt64=2;
                }
                break;
            case 172:
                {
                alt64=4;
                }
                break;
            case 181:
                {
                switch ( input.LA(2) ) {
                case 175:
                    {
                    switch ( input.LA(3) ) {
                    case 128:
                        {
                        int LA64_20 = input.LA(4);

                        if ( (LA64_20==IDENTIFIER) ) {
                            int LA64_25 = input.LA(5);

                            if ( (LA64_25==133||LA64_25==143||LA64_25==153||LA64_25==158||LA64_25==188) ) {
                                alt64=5;
                            }
                            else if ( (LA64_25==126) ) {
                                alt64=6;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 25, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA64_20==125||LA64_20==128) ) {
                            alt64=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 20, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 125:
                        {
                        int LA64_21 = input.LA(4);

                        if ( (LA64_21==IDENTIFIER) ) {
                            int LA64_25 = input.LA(5);

                            if ( (LA64_25==133||LA64_25==143||LA64_25==153||LA64_25==158||LA64_25==188) ) {
                                alt64=5;
                            }
                            else if ( (LA64_25==126) ) {
                                alt64=6;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 25, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA64_21==125||LA64_21==128) ) {
                            alt64=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 21, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA64_22 = input.LA(4);

                        if ( (LA64_22==133||LA64_22==143||LA64_22==153||LA64_22==158||LA64_22==188) ) {
                            alt64=5;
                        }
                        else if ( (LA64_22==126) ) {
                            alt64=6;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 22, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 14, input);

                        throw nvae;

                    }

                    }
                    break;
                case 168:
                    {
                    switch ( input.LA(3) ) {
                    case 128:
                        {
                        int LA64_23 = input.LA(4);

                        if ( (LA64_23==IDENTIFIER) ) {
                            int LA64_25 = input.LA(5);

                            if ( (LA64_25==133||LA64_25==143||LA64_25==153||LA64_25==158||LA64_25==188) ) {
                                alt64=5;
                            }
                            else if ( (LA64_25==126) ) {
                                alt64=6;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 25, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA64_23==125||LA64_23==128) ) {
                            alt64=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 23, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 125:
                        {
                        int LA64_24 = input.LA(4);

                        if ( (LA64_24==IDENTIFIER) ) {
                            int LA64_25 = input.LA(5);

                            if ( (LA64_25==133||LA64_25==143||LA64_25==153||LA64_25==158||LA64_25==188) ) {
                                alt64=5;
                            }
                            else if ( (LA64_25==126) ) {
                                alt64=6;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 25, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA64_24==125||LA64_24==128) ) {
                            alt64=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 24, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA64_22 = input.LA(4);

                        if ( (LA64_22==133||LA64_22==143||LA64_22==153||LA64_22==158||LA64_22==188) ) {
                            alt64=5;
                        }
                        else if ( (LA64_22==126) ) {
                            alt64=6;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 22, input);

                            throw nvae;

                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 15, input);

                        throw nvae;

                    }

                    }
                    break;
                case 160:
                case 161:
                    {
                    alt64=5;
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA64_17 = input.LA(3);

                    if ( (LA64_17==125||LA64_17==128) ) {
                        alt64=5;
                    }
                    else if ( (LA64_17==IDENTIFIER) ) {
                        int LA64_22 = input.LA(4);

                        if ( (LA64_22==133||LA64_22==143||LA64_22==153||LA64_22==158||LA64_22==188) ) {
                            alt64=5;
                        }
                        else if ( (LA64_22==126) ) {
                            alt64=6;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 22, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 17, input);

                        throw nvae;

                    }
                    }
                    break;
                case 186:
                    {
                    alt64=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 7, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:487:7: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_member4149);
                    declaration279=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration279.getTree());

                    // AST REWRITE
                    // elements: declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 487:19: -> ^( DECLARATION declaration )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:487:22: ^( DECLARATION declaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:488:7: classFunction
                    {
                    pushFollow(FOLLOW_classFunction_in_member4165);
                    classFunction280=classFunction();

                    state._fsp--;

                    stream_classFunction.add(classFunction280.getTree());

                    // AST REWRITE
                    // elements: classFunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 488:21: -> ^( FUNCTION_DEF classFunction )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:488:24: ^( FUNCTION_DEF classFunction )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION_DEF, "FUNCTION_DEF")
                        , root_1);

                        adaptor.addChild(root_1, stream_classFunction.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:489:7: constructorDefinition
                    {
                    pushFollow(FOLLOW_constructorDefinition_in_member4181);
                    constructorDefinition281=constructorDefinition();

                    state._fsp--;

                    stream_constructorDefinition.add(constructorDefinition281.getTree());

                    // AST REWRITE
                    // elements: constructorDefinition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 489:29: -> ^( CONSTRUCTOR constructorDefinition )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:489:32: ^( CONSTRUCTOR constructorDefinition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONSTRUCTOR, "CONSTRUCTOR")
                        , root_1);

                        adaptor.addChild(root_1, stream_constructorDefinition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:490:7: friendFunction ';'
                    {
                    pushFollow(FOLLOW_friendFunction_in_member4197);
                    friendFunction282=friendFunction();

                    state._fsp--;

                    stream_friendFunction.add(friendFunction282.getTree());

                    char_literal283=(Token)match(input,143,FOLLOW_143_in_member4199);  
                    stream_143.add(char_literal283);


                    // AST REWRITE
                    // elements: friendFunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 490:26: -> ^( FRIEND friendFunction )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:490:29: ^( FRIEND friendFunction )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FRIEND, "FRIEND")
                        , root_1);

                        adaptor.addChild(root_1, stream_friendFunction.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:491:7: staticMember
                    {
                    pushFollow(FOLLOW_staticMember_in_member4215);
                    staticMember284=staticMember();

                    state._fsp--;

                    stream_staticMember.add(staticMember284.getTree());

                    // AST REWRITE
                    // elements: staticMember
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 491:20: -> ^( STATIC staticMember )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:491:23: ^( STATIC staticMember )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATIC, "STATIC")
                        , root_1);

                        adaptor.addChild(root_1, stream_staticMember.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:492:7: staticFunctionDefinition
                    {
                    pushFollow(FOLLOW_staticFunctionDefinition_in_member4231);
                    staticFunctionDefinition285=staticFunctionDefinition();

                    state._fsp--;

                    stream_staticFunctionDefinition.add(staticFunctionDefinition285.getTree());

                    // AST REWRITE
                    // elements: staticFunctionDefinition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 492:32: -> ^( FUNCTION_DEF staticFunctionDefinition )
                    {
                        // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:492:35: ^( FUNCTION_DEF staticFunctionDefinition )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION_DEF, "FUNCTION_DEF")
                        , root_1);

                        adaptor.addChild(root_1, stream_staticFunctionDefinition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "member"


    public static class staticFunctionDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "staticFunctionDefinition"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:495:1: staticFunctionDefinition : 'static' returnType functionName '(' ( parameter )? ')' body -> ^( FUNCTION_DEF 'static' returnType functionName ( parameter )? body ) ;
    public final ProjectFinalASTParser.staticFunctionDefinition_return staticFunctionDefinition() throws RecognitionException {
        ProjectFinalASTParser.staticFunctionDefinition_return retval = new ProjectFinalASTParser.staticFunctionDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal286=null;
        Token char_literal289=null;
        Token char_literal291=null;
        ProjectFinalASTParser.returnType_return returnType287 =null;

        ProjectFinalASTParser.functionName_return functionName288 =null;

        ProjectFinalASTParser.parameter_return parameter290 =null;

        ProjectFinalASTParser.body_return body292 =null;


        Object string_literal286_tree=null;
        Object char_literal289_tree=null;
        Object char_literal291_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:496:5: ( 'static' returnType functionName '(' ( parameter )? ')' body -> ^( FUNCTION_DEF 'static' returnType functionName ( parameter )? body ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:496:7: 'static' returnType functionName '(' ( parameter )? ')' body
            {
            string_literal286=(Token)match(input,181,FOLLOW_181_in_staticFunctionDefinition4256);  
            stream_181.add(string_literal286);


            pushFollow(FOLLOW_returnType_in_staticFunctionDefinition4258);
            returnType287=returnType();

            state._fsp--;

            stream_returnType.add(returnType287.getTree());

            pushFollow(FOLLOW_functionName_in_staticFunctionDefinition4260);
            functionName288=functionName();

            state._fsp--;

            stream_functionName.add(functionName288.getTree());

            char_literal289=(Token)match(input,126,FOLLOW_126_in_staticFunctionDefinition4262);  
            stream_126.add(char_literal289);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:496:44: ( parameter )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==IDENTIFIER||(LA65_0 >= 160 && LA65_0 <= 161)||LA65_0==168||LA65_0==175) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:496:44: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_staticFunctionDefinition4264);
                    parameter290=parameter();

                    state._fsp--;

                    stream_parameter.add(parameter290.getTree());

                    }
                    break;

            }


            char_literal291=(Token)match(input,127,FOLLOW_127_in_staticFunctionDefinition4267);  
            stream_127.add(char_literal291);


            pushFollow(FOLLOW_body_in_staticFunctionDefinition4269);
            body292=body();

            state._fsp--;

            stream_body.add(body292.getTree());

            // AST REWRITE
            // elements: returnType, 181, body, functionName, parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 497:7: -> ^( FUNCTION_DEF 'static' returnType functionName ( parameter )? body )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:497:10: ^( FUNCTION_DEF 'static' returnType functionName ( parameter )? body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_DEF, "FUNCTION_DEF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_181.nextNode()
                );

                adaptor.addChild(root_1, stream_returnType.nextTree());

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:497:58: ( parameter )?
                if ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter.nextTree());

                }
                stream_parameter.reset();

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "staticFunctionDefinition"


    public static class staticMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "staticMember"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:500:1: staticMember : 'static' declaration -> ^( STATIC declaration ) ;
    public final ProjectFinalASTParser.staticMember_return staticMember() throws RecognitionException {
        ProjectFinalASTParser.staticMember_return retval = new ProjectFinalASTParser.staticMember_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal293=null;
        ProjectFinalASTParser.declaration_return declaration294 =null;


        Object string_literal293_tree=null;
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:501:5: ( 'static' declaration -> ^( STATIC declaration ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:501:7: 'static' declaration
            {
            string_literal293=(Token)match(input,181,FOLLOW_181_in_staticMember4310);  
            stream_181.add(string_literal293);


            pushFollow(FOLLOW_declaration_in_staticMember4312);
            declaration294=declaration();

            state._fsp--;

            stream_declaration.add(declaration294.getTree());

            // AST REWRITE
            // elements: declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 501:28: -> ^( STATIC declaration )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:501:31: ^( STATIC declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATIC, "STATIC")
                , root_1);

                adaptor.addChild(root_1, stream_declaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "staticMember"


    public static class classFunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classFunction"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:504:1: classFunction : returnType functionName '(' ( parameter )? ')' ( constSpecifier )? ( body | ';' ) -> ^( FUNCTION_DEF returnType functionName ( parameter )? ( constSpecifier )? ( body )? ) ;
    public final ProjectFinalASTParser.classFunction_return classFunction() throws RecognitionException {
        ProjectFinalASTParser.classFunction_return retval = new ProjectFinalASTParser.classFunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal297=null;
        Token char_literal299=null;
        Token char_literal302=null;
        ProjectFinalASTParser.returnType_return returnType295 =null;

        ProjectFinalASTParser.functionName_return functionName296 =null;

        ProjectFinalASTParser.parameter_return parameter298 =null;

        ProjectFinalASTParser.constSpecifier_return constSpecifier300 =null;

        ProjectFinalASTParser.body_return body301 =null;


        Object char_literal297_tree=null;
        Object char_literal299_tree=null;
        Object char_literal302_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
        RewriteRuleSubtreeStream stream_constSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule constSpecifier");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:505:5: ( returnType functionName '(' ( parameter )? ')' ( constSpecifier )? ( body | ';' ) -> ^( FUNCTION_DEF returnType functionName ( parameter )? ( constSpecifier )? ( body )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:505:7: returnType functionName '(' ( parameter )? ')' ( constSpecifier )? ( body | ';' )
            {
            pushFollow(FOLLOW_returnType_in_classFunction4337);
            returnType295=returnType();

            state._fsp--;

            stream_returnType.add(returnType295.getTree());

            pushFollow(FOLLOW_functionName_in_classFunction4339);
            functionName296=functionName();

            state._fsp--;

            stream_functionName.add(functionName296.getTree());

            char_literal297=(Token)match(input,126,FOLLOW_126_in_classFunction4341);  
            stream_126.add(char_literal297);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:505:35: ( parameter )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==IDENTIFIER||(LA66_0 >= 160 && LA66_0 <= 161)||LA66_0==168||LA66_0==175) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:505:35: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_classFunction4343);
                    parameter298=parameter();

                    state._fsp--;

                    stream_parameter.add(parameter298.getTree());

                    }
                    break;

            }


            char_literal299=(Token)match(input,127,FOLLOW_127_in_classFunction4346);  
            stream_127.add(char_literal299);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:505:50: ( constSpecifier )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==164) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:505:50: constSpecifier
                    {
                    pushFollow(FOLLOW_constSpecifier_in_classFunction4348);
                    constSpecifier300=constSpecifier();

                    state._fsp--;

                    stream_constSpecifier.add(constSpecifier300.getTree());

                    }
                    break;

            }


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:505:66: ( body | ';' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==188) ) {
                alt68=1;
            }
            else if ( (LA68_0==143) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }
            switch (alt68) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:505:67: body
                    {
                    pushFollow(FOLLOW_body_in_classFunction4352);
                    body301=body();

                    state._fsp--;

                    stream_body.add(body301.getTree());

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:505:74: ';'
                    {
                    char_literal302=(Token)match(input,143,FOLLOW_143_in_classFunction4356);  
                    stream_143.add(char_literal302);


                    }
                    break;

            }


            // AST REWRITE
            // elements: functionName, returnType, body, parameter, constSpecifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 506:7: -> ^( FUNCTION_DEF returnType functionName ( parameter )? ( constSpecifier )? ( body )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:506:10: ^( FUNCTION_DEF returnType functionName ( parameter )? ( constSpecifier )? ( body )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_DEF, "FUNCTION_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_returnType.nextTree());

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:506:49: ( parameter )?
                if ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter.nextTree());

                }
                stream_parameter.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:506:60: ( constSpecifier )?
                if ( stream_constSpecifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_constSpecifier.nextTree());

                }
                stream_constSpecifier.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:506:76: ( body )?
                if ( stream_body.hasNext() ) {
                    adaptor.addChild(root_1, stream_body.nextTree());

                }
                stream_body.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classFunction"


    public static class constSpecifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constSpecifier"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:509:1: constSpecifier : 'const' -> ^( CONST 'const' ) ;
    public final ProjectFinalASTParser.constSpecifier_return constSpecifier() throws RecognitionException {
        ProjectFinalASTParser.constSpecifier_return retval = new ProjectFinalASTParser.constSpecifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal303=null;

        Object string_literal303_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");

        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:510:5: ( 'const' -> ^( CONST 'const' ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:510:7: 'const'
            {
            string_literal303=(Token)match(input,164,FOLLOW_164_in_constSpecifier4400);  
            stream_164.add(string_literal303);


            // AST REWRITE
            // elements: 164
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 510:15: -> ^( CONST 'const' )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:510:18: ^( CONST 'const' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONST, "CONST")
                , root_1);

                adaptor.addChild(root_1, 
                stream_164.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constSpecifier"


    public static class constructorDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructorDefinition"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:513:1: constructorDefinition : constructorDefinitionBody ( ':' constructorDefinitionBody )* body -> ^( CONSTRUCTOR ( constructorDefinitionBody )+ body ) ;
    public final ProjectFinalASTParser.constructorDefinition_return constructorDefinition() throws RecognitionException {
        ProjectFinalASTParser.constructorDefinition_return retval = new ProjectFinalASTParser.constructorDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal305=null;
        ProjectFinalASTParser.constructorDefinitionBody_return constructorDefinitionBody304 =null;

        ProjectFinalASTParser.constructorDefinitionBody_return constructorDefinitionBody306 =null;

        ProjectFinalASTParser.body_return body307 =null;


        Object char_literal305_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_constructorDefinitionBody=new RewriteRuleSubtreeStream(adaptor,"rule constructorDefinitionBody");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:514:5: ( constructorDefinitionBody ( ':' constructorDefinitionBody )* body -> ^( CONSTRUCTOR ( constructorDefinitionBody )+ body ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:514:7: constructorDefinitionBody ( ':' constructorDefinitionBody )* body
            {
            pushFollow(FOLLOW_constructorDefinitionBody_in_constructorDefinition4425);
            constructorDefinitionBody304=constructorDefinitionBody();

            state._fsp--;

            stream_constructorDefinitionBody.add(constructorDefinitionBody304.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:514:33: ( ':' constructorDefinitionBody )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==141) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:514:34: ':' constructorDefinitionBody
            	    {
            	    char_literal305=(Token)match(input,141,FOLLOW_141_in_constructorDefinition4428);  
            	    stream_141.add(char_literal305);


            	    pushFollow(FOLLOW_constructorDefinitionBody_in_constructorDefinition4430);
            	    constructorDefinitionBody306=constructorDefinitionBody();

            	    state._fsp--;

            	    stream_constructorDefinitionBody.add(constructorDefinitionBody306.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            pushFollow(FOLLOW_body_in_constructorDefinition4434);
            body307=body();

            state._fsp--;

            stream_body.add(body307.getTree());

            // AST REWRITE
            // elements: body, constructorDefinitionBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 515:7: -> ^( CONSTRUCTOR ( constructorDefinitionBody )+ body )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:515:10: ^( CONSTRUCTOR ( constructorDefinitionBody )+ body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONSTRUCTOR, "CONSTRUCTOR")
                , root_1);

                if ( !(stream_constructorDefinitionBody.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_constructorDefinitionBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_constructorDefinitionBody.nextTree());

                }
                stream_constructorDefinitionBody.reset();

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructorDefinition"


    public static class constructorDefinitionBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructorDefinitionBody"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:518:1: constructorDefinitionBody : className '(' ( parameter )? ')' -> ^( CONSTRUCTOR className ( parameter )? ) ;
    public final ProjectFinalASTParser.constructorDefinitionBody_return constructorDefinitionBody() throws RecognitionException {
        ProjectFinalASTParser.constructorDefinitionBody_return retval = new ProjectFinalASTParser.constructorDefinitionBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal309=null;
        Token char_literal311=null;
        ProjectFinalASTParser.className_return className308 =null;

        ProjectFinalASTParser.parameter_return parameter310 =null;


        Object char_literal309_tree=null;
        Object char_literal311_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:519:5: ( className '(' ( parameter )? ')' -> ^( CONSTRUCTOR className ( parameter )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:519:7: className '(' ( parameter )? ')'
            {
            pushFollow(FOLLOW_className_in_constructorDefinitionBody4469);
            className308=className();

            state._fsp--;

            stream_className.add(className308.getTree());

            char_literal309=(Token)match(input,126,FOLLOW_126_in_constructorDefinitionBody4471);  
            stream_126.add(char_literal309);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:519:21: ( parameter )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==IDENTIFIER||(LA70_0 >= 160 && LA70_0 <= 161)||LA70_0==168||LA70_0==175) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:519:21: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_constructorDefinitionBody4473);
                    parameter310=parameter();

                    state._fsp--;

                    stream_parameter.add(parameter310.getTree());

                    }
                    break;

            }


            char_literal311=(Token)match(input,127,FOLLOW_127_in_constructorDefinitionBody4476);  
            stream_127.add(char_literal311);


            // AST REWRITE
            // elements: parameter, className
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 519:36: -> ^( CONSTRUCTOR className ( parameter )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:519:39: ^( CONSTRUCTOR className ( parameter )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONSTRUCTOR, "CONSTRUCTOR")
                , root_1);

                adaptor.addChild(root_1, stream_className.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:519:63: ( parameter )?
                if ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter.nextTree());

                }
                stream_parameter.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructorDefinitionBody"


    public static class friendFunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "friendFunction"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:522:1: friendFunction : 'friend' voidHelper -> ^( FRIEND voidHelper ) ;
    public final ProjectFinalASTParser.friendFunction_return friendFunction() throws RecognitionException {
        ProjectFinalASTParser.friendFunction_return retval = new ProjectFinalASTParser.friendFunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal312=null;
        ProjectFinalASTParser.voidHelper_return voidHelper313 =null;


        Object string_literal312_tree=null;
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleSubtreeStream stream_voidHelper=new RewriteRuleSubtreeStream(adaptor,"rule voidHelper");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:523:5: ( 'friend' voidHelper -> ^( FRIEND voidHelper ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:523:7: 'friend' voidHelper
            {
            string_literal312=(Token)match(input,172,FOLLOW_172_in_friendFunction4504);  
            stream_172.add(string_literal312);


            pushFollow(FOLLOW_voidHelper_in_friendFunction4506);
            voidHelper313=voidHelper();

            state._fsp--;

            stream_voidHelper.add(voidHelper313.getTree());

            // AST REWRITE
            // elements: voidHelper
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 523:27: -> ^( FRIEND voidHelper )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:523:30: ^( FRIEND voidHelper )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FRIEND, "FRIEND")
                , root_1);

                adaptor.addChild(root_1, stream_voidHelper.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "friendFunction"


    public static class voidHelper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "voidHelper"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:526:1: voidHelper : returnType functionName '::' ( functionName '(' parameter ')' | assignment ) -> ^( FUNCTION_DEF returnType functionName ( functionName )? ( parameter )? ( assignment )? ) ;
    public final ProjectFinalASTParser.voidHelper_return voidHelper() throws RecognitionException {
        ProjectFinalASTParser.voidHelper_return retval = new ProjectFinalASTParser.voidHelper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal316=null;
        Token char_literal318=null;
        Token char_literal320=null;
        ProjectFinalASTParser.returnType_return returnType314 =null;

        ProjectFinalASTParser.functionName_return functionName315 =null;

        ProjectFinalASTParser.functionName_return functionName317 =null;

        ProjectFinalASTParser.parameter_return parameter319 =null;

        ProjectFinalASTParser.assignment_return assignment321 =null;


        Object string_literal316_tree=null;
        Object char_literal318_tree=null;
        Object char_literal320_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:527:5: ( returnType functionName '::' ( functionName '(' parameter ')' | assignment ) -> ^( FUNCTION_DEF returnType functionName ( functionName )? ( parameter )? ( assignment )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:527:7: returnType functionName '::' ( functionName '(' parameter ')' | assignment )
            {
            pushFollow(FOLLOW_returnType_in_voidHelper4531);
            returnType314=returnType();

            state._fsp--;

            stream_returnType.add(returnType314.getTree());

            pushFollow(FOLLOW_functionName_in_voidHelper4533);
            functionName315=functionName();

            state._fsp--;

            stream_functionName.add(functionName315.getTree());

            string_literal316=(Token)match(input,142,FOLLOW_142_in_voidHelper4535);  
            stream_142.add(string_literal316);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:527:36: ( functionName '(' parameter ')' | assignment )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==IDENTIFIER) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==126) ) {
                    alt71=1;
                }
                else if ( (LA71_1==123||LA71_1==129||LA71_1==132||LA71_1==136||LA71_1==140||LA71_1==153) ) {
                    alt71=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }
            switch (alt71) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:527:37: functionName '(' parameter ')'
                    {
                    pushFollow(FOLLOW_functionName_in_voidHelper4538);
                    functionName317=functionName();

                    state._fsp--;

                    stream_functionName.add(functionName317.getTree());

                    char_literal318=(Token)match(input,126,FOLLOW_126_in_voidHelper4540);  
                    stream_126.add(char_literal318);


                    pushFollow(FOLLOW_parameter_in_voidHelper4542);
                    parameter319=parameter();

                    state._fsp--;

                    stream_parameter.add(parameter319.getTree());

                    char_literal320=(Token)match(input,127,FOLLOW_127_in_voidHelper4544);  
                    stream_127.add(char_literal320);


                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:527:70: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_voidHelper4548);
                    assignment321=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment321.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: assignment, functionName, functionName, returnType, parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 528:7: -> ^( FUNCTION_DEF returnType functionName ( functionName )? ( parameter )? ( assignment )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:528:10: ^( FUNCTION_DEF returnType functionName ( functionName )? ( parameter )? ( assignment )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_DEF, "FUNCTION_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_returnType.nextTree());

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:528:49: ( functionName )?
                if ( stream_functionName.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionName.nextTree());

                }
                stream_functionName.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:528:63: ( parameter )?
                if ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter.nextTree());

                }
                stream_parameter.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:528:74: ( assignment )?
                if ( stream_assignment.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignment.nextTree());

                }
                stream_assignment.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "voidHelper"


    public static class friendFunctionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "friendFunctionCall"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:531:1: friendFunctionCall : functionName '(' ( expressionList )? ')' -> ^( CALL functionName ( expressionList )? ) ;
    public final ProjectFinalASTParser.friendFunctionCall_return friendFunctionCall() throws RecognitionException {
        ProjectFinalASTParser.friendFunctionCall_return retval = new ProjectFinalASTParser.friendFunctionCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal323=null;
        Token char_literal325=null;
        ProjectFinalASTParser.functionName_return functionName322 =null;

        ProjectFinalASTParser.expressionList_return expressionList324 =null;


        Object char_literal323_tree=null;
        Object char_literal325_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:532:5: ( functionName '(' ( expressionList )? ')' -> ^( CALL functionName ( expressionList )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:532:7: functionName '(' ( expressionList )? ')'
            {
            pushFollow(FOLLOW_functionName_in_friendFunctionCall4592);
            functionName322=functionName();

            state._fsp--;

            stream_functionName.add(functionName322.getTree());

            char_literal323=(Token)match(input,126,FOLLOW_126_in_friendFunctionCall4594);  
            stream_126.add(char_literal323);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:532:24: ( expressionList )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==FLOAT_LITERAL||LA72_0==IDENTIFIER||LA72_0==INTEGER_LITERAL||LA72_0==STRING_LITERAL||LA72_0==126||LA72_0==128||LA72_0==131||(LA72_0 >= 134 && LA72_0 <= 135)||LA72_0==170||LA72_0==184) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:532:24: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_friendFunctionCall4596);
                    expressionList324=expressionList();

                    state._fsp--;

                    stream_expressionList.add(expressionList324.getTree());

                    }
                    break;

            }


            char_literal325=(Token)match(input,127,FOLLOW_127_in_friendFunctionCall4599);  
            stream_127.add(char_literal325);


            // AST REWRITE
            // elements: expressionList, functionName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 532:44: -> ^( CALL functionName ( expressionList )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:532:47: ^( CALL functionName ( expressionList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CALL, "CALL")
                , root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:532:67: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.nextTree());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "friendFunctionCall"


    public static class coutStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coutStatement"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:535:1: coutStatement : 'cout' ( coutOp )+ ';' -> ^( COUT ( coutOp )+ ';' ) ;
    public final ProjectFinalASTParser.coutStatement_return coutStatement() throws RecognitionException {
        ProjectFinalASTParser.coutStatement_return retval = new ProjectFinalASTParser.coutStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal326=null;
        Token char_literal328=null;
        ProjectFinalASTParser.coutOp_return coutOp327 =null;


        Object string_literal326_tree=null;
        Object char_literal328_tree=null;
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleSubtreeStream stream_coutOp=new RewriteRuleSubtreeStream(adaptor,"rule coutOp");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:536:5: ( 'cout' ( coutOp )+ ';' -> ^( COUT ( coutOp )+ ';' ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:536:7: 'cout' ( coutOp )+ ';'
            {
            string_literal326=(Token)match(input,165,FOLLOW_165_in_coutStatement4627);  
            stream_165.add(string_literal326);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:536:14: ( coutOp )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==145) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:536:14: coutOp
            	    {
            	    pushFollow(FOLLOW_coutOp_in_coutStatement4629);
            	    coutOp327=coutOp();

            	    state._fsp--;

            	    stream_coutOp.add(coutOp327.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);


            char_literal328=(Token)match(input,143,FOLLOW_143_in_coutStatement4632);  
            stream_143.add(char_literal328);


            // AST REWRITE
            // elements: coutOp, 143
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 536:26: -> ^( COUT ( coutOp )+ ';' )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:536:29: ^( COUT ( coutOp )+ ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COUT, "COUT")
                , root_1);

                if ( !(stream_coutOp.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_coutOp.hasNext() ) {
                    adaptor.addChild(root_1, stream_coutOp.nextTree());

                }
                stream_coutOp.reset();

                adaptor.addChild(root_1, 
                stream_143.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "coutStatement"


    public static class cinStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cinStatement"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:539:1: cinStatement : 'cin' ( cinOp )+ ';' -> ^( CIN ( cinOp )+ ) ;
    public final ProjectFinalASTParser.cinStatement_return cinStatement() throws RecognitionException {
        ProjectFinalASTParser.cinStatement_return retval = new ProjectFinalASTParser.cinStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal329=null;
        Token char_literal331=null;
        ProjectFinalASTParser.cinOp_return cinOp330 =null;


        Object string_literal329_tree=null;
        Object char_literal331_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleSubtreeStream stream_cinOp=new RewriteRuleSubtreeStream(adaptor,"rule cinOp");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:540:5: ( 'cin' ( cinOp )+ ';' -> ^( CIN ( cinOp )+ ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:540:7: 'cin' ( cinOp )+ ';'
            {
            string_literal329=(Token)match(input,162,FOLLOW_162_in_cinStatement4660);  
            stream_162.add(string_literal329);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:540:13: ( cinOp )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==157) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:540:13: cinOp
            	    {
            	    pushFollow(FOLLOW_cinOp_in_cinStatement4662);
            	    cinOp330=cinOp();

            	    state._fsp--;

            	    stream_cinOp.add(cinOp330.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);


            char_literal331=(Token)match(input,143,FOLLOW_143_in_cinStatement4665);  
            stream_143.add(char_literal331);


            // AST REWRITE
            // elements: cinOp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 540:24: -> ^( CIN ( cinOp )+ )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:540:27: ^( CIN ( cinOp )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CIN, "CIN")
                , root_1);

                if ( !(stream_cinOp.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_cinOp.hasNext() ) {
                    adaptor.addChild(root_1, stream_cinOp.nextTree());

                }
                stream_cinOp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cinStatement"


    public static class cinOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cinOp"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:543:1: cinOp : '>>' identifier -> ^( EXTRACT '>>' identifier ) ;
    public final ProjectFinalASTParser.cinOp_return cinOp() throws RecognitionException {
        ProjectFinalASTParser.cinOp_return retval = new ProjectFinalASTParser.cinOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal332=null;
        ProjectFinalASTParser.identifier_return identifier333 =null;


        Object string_literal332_tree=null;
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:544:5: ( '>>' identifier -> ^( EXTRACT '>>' identifier ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:544:7: '>>' identifier
            {
            string_literal332=(Token)match(input,157,FOLLOW_157_in_cinOp4691);  
            stream_157.add(string_literal332);


            pushFollow(FOLLOW_identifier_in_cinOp4693);
            identifier333=identifier();

            state._fsp--;

            stream_identifier.add(identifier333.getTree());

            // AST REWRITE
            // elements: 157, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 544:23: -> ^( EXTRACT '>>' identifier )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:544:26: ^( EXTRACT '>>' identifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXTRACT, "EXTRACT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_157.nextNode()
                );

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cinOp"


    public static class coutOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "coutOp"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:547:1: coutOp : '<<' ( functionCall | STRING_LITERAL | intArray | literal | expression | memberAccess ) -> ^( INSERT '<<' ( functionCall )? ( STRING_LITERAL )? ( intArray )? ( literal )? ( expression )? ( memberAccess )? ) ;
    public final ProjectFinalASTParser.coutOp_return coutOp() throws RecognitionException {
        ProjectFinalASTParser.coutOp_return retval = new ProjectFinalASTParser.coutOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal334=null;
        Token STRING_LITERAL336=null;
        ProjectFinalASTParser.functionCall_return functionCall335 =null;

        ProjectFinalASTParser.intArray_return intArray337 =null;

        ProjectFinalASTParser.literal_return literal338 =null;

        ProjectFinalASTParser.expression_return expression339 =null;

        ProjectFinalASTParser.memberAccess_return memberAccess340 =null;


        Object string_literal334_tree=null;
        Object STRING_LITERAL336_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleSubtreeStream stream_memberAccess=new RewriteRuleSubtreeStream(adaptor,"rule memberAccess");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_intArray=new RewriteRuleSubtreeStream(adaptor,"rule intArray");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:548:5: ( '<<' ( functionCall | STRING_LITERAL | intArray | literal | expression | memberAccess ) -> ^( INSERT '<<' ( functionCall )? ( STRING_LITERAL )? ( intArray )? ( literal )? ( expression )? ( memberAccess )? ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:548:7: '<<' ( functionCall | STRING_LITERAL | intArray | literal | expression | memberAccess )
            {
            string_literal334=(Token)match(input,145,FOLLOW_145_in_coutOp4720);  
            stream_145.add(string_literal334);


            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:548:12: ( functionCall | STRING_LITERAL | intArray | literal | expression | memberAccess )
            int alt75=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                switch ( input.LA(2) ) {
                case 126:
                    {
                    alt75=1;
                    }
                    break;
                case 143:
                case 145:
                case 158:
                    {
                    alt75=3;
                    }
                    break;
                case 138:
                    {
                    alt75=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;

                }

                }
                break;
            case STRING_LITERAL:
                {
                alt75=2;
                }
                break;
            case INTEGER_LITERAL:
                {
                alt75=4;
                }
                break;
            case FLOAT_LITERAL:
                {
                alt75=4;
                }
                break;
            case 134:
                {
                int LA75_5 = input.LA(2);

                if ( (LA75_5==INTEGER_LITERAL) ) {
                    alt75=4;
                }
                else if ( (LA75_5==FLOAT_LITERAL) ) {
                    alt75=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 5, input);

                    throw nvae;

                }
                }
                break;
            case 184:
                {
                alt75=4;
                }
                break;
            case 170:
                {
                alt75=4;
                }
                break;
            case 126:
            case 128:
            case 131:
            case 135:
                {
                alt75=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }

            switch (alt75) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:548:13: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_coutOp4723);
                    functionCall335=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall335.getTree());

                    }
                    break;
                case 2 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:548:28: STRING_LITERAL
                    {
                    STRING_LITERAL336=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_coutOp4727);  
                    stream_STRING_LITERAL.add(STRING_LITERAL336);


                    }
                    break;
                case 3 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:548:45: intArray
                    {
                    pushFollow(FOLLOW_intArray_in_coutOp4731);
                    intArray337=intArray();

                    state._fsp--;

                    stream_intArray.add(intArray337.getTree());

                    }
                    break;
                case 4 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:548:56: literal
                    {
                    pushFollow(FOLLOW_literal_in_coutOp4735);
                    literal338=literal();

                    state._fsp--;

                    stream_literal.add(literal338.getTree());

                    }
                    break;
                case 5 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:548:66: expression
                    {
                    pushFollow(FOLLOW_expression_in_coutOp4739);
                    expression339=expression();

                    state._fsp--;

                    stream_expression.add(expression339.getTree());

                    }
                    break;
                case 6 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:548:79: memberAccess
                    {
                    pushFollow(FOLLOW_memberAccess_in_coutOp4743);
                    memberAccess340=memberAccess();

                    state._fsp--;

                    stream_memberAccess.add(memberAccess340.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: memberAccess, literal, STRING_LITERAL, expression, functionCall, intArray, 145
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 549:7: -> ^( INSERT '<<' ( functionCall )? ( STRING_LITERAL )? ( intArray )? ( literal )? ( expression )? ( memberAccess )? )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:549:10: ^( INSERT '<<' ( functionCall )? ( STRING_LITERAL )? ( intArray )? ( literal )? ( expression )? ( memberAccess )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INSERT, "INSERT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_145.nextNode()
                );

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:549:24: ( functionCall )?
                if ( stream_functionCall.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionCall.nextTree());

                }
                stream_functionCall.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:549:38: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING_LITERAL.nextNode()
                    );

                }
                stream_STRING_LITERAL.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:549:54: ( intArray )?
                if ( stream_intArray.hasNext() ) {
                    adaptor.addChild(root_1, stream_intArray.nextTree());

                }
                stream_intArray.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:549:64: ( literal )?
                if ( stream_literal.hasNext() ) {
                    adaptor.addChild(root_1, stream_literal.nextTree());

                }
                stream_literal.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:549:73: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:549:85: ( memberAccess )?
                if ( stream_memberAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_memberAccess.nextTree());

                }
                stream_memberAccess.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "coutOp"


    public static class memberAccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "memberAccess"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:552:1: memberAccess : identifier '.' identifier -> ^( MEMBER identifier '.' identifier ) ;
    public final ProjectFinalASTParser.memberAccess_return memberAccess() throws RecognitionException {
        ProjectFinalASTParser.memberAccess_return retval = new ProjectFinalASTParser.memberAccess_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal342=null;
        ProjectFinalASTParser.identifier_return identifier341 =null;

        ProjectFinalASTParser.identifier_return identifier343 =null;


        Object char_literal342_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:553:5: ( identifier '.' identifier -> ^( MEMBER identifier '.' identifier ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:553:7: identifier '.' identifier
            {
            pushFollow(FOLLOW_identifier_in_memberAccess4794);
            identifier341=identifier();

            state._fsp--;

            stream_identifier.add(identifier341.getTree());

            char_literal342=(Token)match(input,138,FOLLOW_138_in_memberAccess4796);  
            stream_138.add(char_literal342);


            pushFollow(FOLLOW_identifier_in_memberAccess4798);
            identifier343=identifier();

            state._fsp--;

            stream_identifier.add(identifier343.getTree());

            // AST REWRITE
            // elements: 138, identifier, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 553:33: -> ^( MEMBER identifier '.' identifier )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:553:36: ^( MEMBER identifier '.' identifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MEMBER, "MEMBER")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, 
                stream_138.nextNode()
                );

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "memberAccess"


    public static class nameSpace_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nameSpace"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:556:1: nameSpace : 'using' 'namespace' 'std' ';' -> ^( NAMESPACE 'using' 'namespace' 'std' ) ;
    public final ProjectFinalASTParser.nameSpace_return nameSpace() throws RecognitionException {
        ProjectFinalASTParser.nameSpace_return retval = new ProjectFinalASTParser.nameSpace_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal344=null;
        Token string_literal345=null;
        Token string_literal346=null;
        Token char_literal347=null;

        Object string_literal344_tree=null;
        Object string_literal345_tree=null;
        Object string_literal346_tree=null;
        Object char_literal347_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");

        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:557:5: ( 'using' 'namespace' 'std' ';' -> ^( NAMESPACE 'using' 'namespace' 'std' ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:557:7: 'using' 'namespace' 'std' ';'
            {
            string_literal344=(Token)match(input,185,FOLLOW_185_in_nameSpace4827);  
            stream_185.add(string_literal344);


            string_literal345=(Token)match(input,176,FOLLOW_176_in_nameSpace4829);  
            stream_176.add(string_literal345);


            string_literal346=(Token)match(input,182,FOLLOW_182_in_nameSpace4831);  
            stream_182.add(string_literal346);


            char_literal347=(Token)match(input,143,FOLLOW_143_in_nameSpace4833);  
            stream_143.add(char_literal347);


            // AST REWRITE
            // elements: 176, 182, 185
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 557:37: -> ^( NAMESPACE 'using' 'namespace' 'std' )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:557:40: ^( NAMESPACE 'using' 'namespace' 'std' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAMESPACE, "NAMESPACE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_185.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_176.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_182.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nameSpace"


    public static class macroDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "macroDefinition"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:560:1: macroDefinition : '#define' macroName ( macroArgs )? macroBody -> ^( MACRO_DEF macroName ( macroArgs )? macroBody ) ;
    public final ProjectFinalASTParser.macroDefinition_return macroDefinition() throws RecognitionException {
        ProjectFinalASTParser.macroDefinition_return retval = new ProjectFinalASTParser.macroDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal348=null;
        ProjectFinalASTParser.macroName_return macroName349 =null;

        ProjectFinalASTParser.macroArgs_return macroArgs350 =null;

        ProjectFinalASTParser.macroBody_return macroBody351 =null;


        Object string_literal348_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleSubtreeStream stream_macroName=new RewriteRuleSubtreeStream(adaptor,"rule macroName");
        RewriteRuleSubtreeStream stream_macroArgs=new RewriteRuleSubtreeStream(adaptor,"rule macroArgs");
        RewriteRuleSubtreeStream stream_macroBody=new RewriteRuleSubtreeStream(adaptor,"rule macroBody");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:561:5: ( '#define' macroName ( macroArgs )? macroBody -> ^( MACRO_DEF macroName ( macroArgs )? macroBody ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:561:7: '#define' macroName ( macroArgs )? macroBody
            {
            string_literal348=(Token)match(input,121,FOLLOW_121_in_macroDefinition4862);  
            stream_121.add(string_literal348);


            pushFollow(FOLLOW_macroName_in_macroDefinition4864);
            macroName349=macroName();

            state._fsp--;

            stream_macroName.add(macroName349.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:561:27: ( macroArgs )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==126) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==IDENTIFIER) ) {
                    int LA76_3 = input.LA(3);

                    if ( (LA76_3==133) ) {
                        alt76=1;
                    }
                    else if ( (LA76_3==127) ) {
                        switch ( input.LA(4) ) {
                            case FLOAT_LITERAL:
                            case INTEGER_LITERAL:
                            case STRING_LITERAL:
                            case 126:
                            case 131:
                            case 135:
                            case 170:
                            case 184:
                                {
                                alt76=1;
                                }
                                break;
                            case IDENTIFIER:
                                {
                                int LA76_6 = input.LA(5);

                                if ( (LA76_6==EOF||LA76_6==119||(LA76_6 >= 121 && LA76_6 <= 122)||LA76_6==124||LA76_6==126||LA76_6==128||(LA76_6 >= 130 && LA76_6 <= 131)||(LA76_6 >= 134 && LA76_6 <= 135)||LA76_6==139||LA76_6==144||LA76_6==146||(LA76_6 >= 153 && LA76_6 <= 156)||LA76_6==163||LA76_6==168||LA76_6==175||(LA76_6 >= 185 && LA76_6 <= 186)||LA76_6==189) ) {
                                    alt76=1;
                                }
                                else if ( (LA76_6==IDENTIFIER) ) {
                                    int LA76_9 = input.LA(6);

                                    if ( (LA76_9==IDENTIFIER) ) {
                                        alt76=1;
                                    }
                                }
                                }
                                break;
                            case 134:
                                {
                                int LA76_7 = input.LA(5);

                                if ( (LA76_7==INTEGER_LITERAL) ) {
                                    alt76=1;
                                }
                                else if ( (LA76_7==FLOAT_LITERAL) ) {
                                    alt76=1;
                                }
                                }
                                break;
                            case 128:
                                {
                                int LA76_8 = input.LA(5);

                                if ( (LA76_8==IDENTIFIER) ) {
                                    alt76=1;
                                }
                                }
                                break;
                        }

                    }
                }
            }
            switch (alt76) {
                case 1 :
                    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:561:27: macroArgs
                    {
                    pushFollow(FOLLOW_macroArgs_in_macroDefinition4866);
                    macroArgs350=macroArgs();

                    state._fsp--;

                    stream_macroArgs.add(macroArgs350.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_macroBody_in_macroDefinition4869);
            macroBody351=macroBody();

            state._fsp--;

            stream_macroBody.add(macroBody351.getTree());

            // AST REWRITE
            // elements: macroBody, macroArgs, macroName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 561:48: -> ^( MACRO_DEF macroName ( macroArgs )? macroBody )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:561:51: ^( MACRO_DEF macroName ( macroArgs )? macroBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MACRO_DEF, "MACRO_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_macroName.nextTree());

                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:561:73: ( macroArgs )?
                if ( stream_macroArgs.hasNext() ) {
                    adaptor.addChild(root_1, stream_macroArgs.nextTree());

                }
                stream_macroArgs.reset();

                adaptor.addChild(root_1, stream_macroBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "macroDefinition"


    public static class macroName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "macroName"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:564:1: macroName : identifier -> ^( MARCO_NAME identifier ) ;
    public final ProjectFinalASTParser.macroName_return macroName() throws RecognitionException {
        ProjectFinalASTParser.macroName_return retval = new ProjectFinalASTParser.macroName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.identifier_return identifier352 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:565:5: ( identifier -> ^( MARCO_NAME identifier ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:565:7: identifier
            {
            pushFollow(FOLLOW_identifier_in_macroName4899);
            identifier352=identifier();

            state._fsp--;

            stream_identifier.add(identifier352.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 565:18: -> ^( MARCO_NAME identifier )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:565:21: ^( MARCO_NAME identifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MARCO_NAME, "MARCO_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "macroName"


    public static class macroArgs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "macroArgs"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:568:1: macroArgs : '(' identifier ( ',' identifier )* ')' -> ^( PARAMETERS ( identifier )+ ) ;
    public final ProjectFinalASTParser.macroArgs_return macroArgs() throws RecognitionException {
        ProjectFinalASTParser.macroArgs_return retval = new ProjectFinalASTParser.macroArgs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal353=null;
        Token char_literal355=null;
        Token char_literal357=null;
        ProjectFinalASTParser.identifier_return identifier354 =null;

        ProjectFinalASTParser.identifier_return identifier356 =null;


        Object char_literal353_tree=null;
        Object char_literal355_tree=null;
        Object char_literal357_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:569:5: ( '(' identifier ( ',' identifier )* ')' -> ^( PARAMETERS ( identifier )+ ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:569:7: '(' identifier ( ',' identifier )* ')'
            {
            char_literal353=(Token)match(input,126,FOLLOW_126_in_macroArgs4924);  
            stream_126.add(char_literal353);


            pushFollow(FOLLOW_identifier_in_macroArgs4926);
            identifier354=identifier();

            state._fsp--;

            stream_identifier.add(identifier354.getTree());

            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:569:22: ( ',' identifier )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==133) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:569:23: ',' identifier
            	    {
            	    char_literal355=(Token)match(input,133,FOLLOW_133_in_macroArgs4929);  
            	    stream_133.add(char_literal355);


            	    pushFollow(FOLLOW_identifier_in_macroArgs4931);
            	    identifier356=identifier();

            	    state._fsp--;

            	    stream_identifier.add(identifier356.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            char_literal357=(Token)match(input,127,FOLLOW_127_in_macroArgs4935);  
            stream_127.add(char_literal357);


            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 569:44: -> ^( PARAMETERS ( identifier )+ )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:569:47: ^( PARAMETERS ( identifier )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETERS, "PARAMETERS")
                , root_1);

                if ( !(stream_identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "macroArgs"


    public static class macroBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "macroBody"
    // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:572:1: macroBody : expression -> ^( MARCO_BODY expression ) ;
    public final ProjectFinalASTParser.macroBody_return macroBody() throws RecognitionException {
        ProjectFinalASTParser.macroBody_return retval = new ProjectFinalASTParser.macroBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ProjectFinalASTParser.expression_return expression358 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:573:5: ( expression -> ^( MARCO_BODY expression ) )
            // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:573:7: expression
            {
            pushFollow(FOLLOW_expression_in_macroBody4961);
            expression358=expression();

            state._fsp--;

            stream_expression.add(expression358.getTree());

            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 573:18: -> ^( MARCO_BODY expression )
            {
                // E:\\material\\cs407\\finalProject\\ProjectFinalAST.g:573:21: ^( MARCO_BODY expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MARCO_BODY, "MARCO_BODY")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (org.antlr.runtime.RecognitionException e) {
                s += getErrorMessage(e, new String[]{e.input.toString()}) + ": " + getErrorHeader(e) + "\n";
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "macroBody"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA18_eotS =
        "\23\uffff";
    static final String DFA18_eofS =
        "\23\uffff";
    static final String DFA18_minS =
        "\1\70\1\uffff\1\70\7\uffff\1\70\4\uffff\1\70\2\uffff\1\70";
    static final String DFA18_maxS =
        "\1\u00bb\1\uffff\1\u0099\7\uffff\1\u00bc\4\uffff\1\70\2\uffff\1"+
        "\u00bc";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\2"+
        "\1\3\1\14\1\15\1\uffff\1\1\1\13\1\uffff";
    static final String DFA18_specialS =
        "\23\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\112\uffff\1\10\3\uffff\1\10\30\uffff\2\1\1\7\2\uffff\1"+
            "\5\1\6\1\3\1\1\2\uffff\1\3\1\uffff\1\3\1\uffff\1\1\4\uffff\1"+
            "\4\2\uffff\1\11\3\uffff\1\3",
            "",
            "\1\12\102\uffff\1\13\1\uffff\1\1\1\14\1\uffff\1\1\1\13\1\uffff"+
            "\1\10\1\13\2\uffff\1\10\1\13\1\uffff\1\15\1\uffff\1\13\1\uffff"+
            "\1\16\12\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\105\uffff\1\21\6\uffff\1\17\11\uffff\1\20\11\uffff\1"+
            "\1\4\uffff\1\1\35\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\22",
            "",
            "",
            "\1\21\114\uffff\1\17\11\uffff\1\20\11\uffff\1\20\4\uffff\1"+
            "\20\35\uffff\1\20"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "253:1: statement : ( declaration -> ^( DECLARATION declaration ) | assignment -> ^( ASSIGNMENT assignment ) | functionCall ';' -> ^( EXPRESSION functionCall ) | controlStructure -> ^( CONTROL controlStructure ) | returnStatement -> ^( RETURN returnStatement ) | coutStatement -> ^( COUT coutStatement ) | pointerDeallocation ';' -> ^( EXPRESSION pointerDeallocation ) | cinStatement -> ^( CIN cinStatement ) | incrementExpr ';' -> ^( EXPRESSION incrementExpr ) | statthis ';' -> ^( EXPRESSION statthis ) | declarationclass ';' -> ^( DECLARATION declarationclass ) | callclass ';' -> ^( EXPRESSION callclass ) | className '::' functionCall ';' -> ^( EXPRESSION ^( SCOPE className functionCall ) ) );";
        }
    }
    static final String DFA24_eotS =
        "\15\uffff";
    static final String DFA24_eofS =
        "\15\uffff";
    static final String DFA24_minS =
        "\10\70\1\uffff\1\u0085\1\60\2\uffff";
    static final String DFA24_maxS =
        "\1\u00af\7\u0080\1\uffff\2\u00bc\2\uffff";
    static final String DFA24_acceptS =
        "\10\uffff\1\1\2\uffff\1\1\1\2";
    static final String DFA24_specialS =
        "\15\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\5\147\uffff\1\4\1\3\6\uffff\1\2\6\uffff\1\1",
            "\1\10\104\uffff\1\7\2\uffff\1\6",
            "\1\10\104\uffff\1\7\2\uffff\1\6",
            "\1\10\104\uffff\1\7\2\uffff\1\6",
            "\1\10\104\uffff\1\7\2\uffff\1\6",
            "\1\10\104\uffff\1\7\2\uffff\1\6",
            "\1\11\104\uffff\1\7\2\uffff\1\6",
            "\1\11\104\uffff\1\7\2\uffff\1\6",
            "",
            "\1\10\11\uffff\1\13\11\uffff\1\12\4\uffff\1\10\35\uffff\1\10",
            "\1\13\7\uffff\1\13\7\uffff\1\13\54\uffff\1\13\20\uffff\1\13"+
            "\1\uffff\1\13\2\uffff\1\13\2\uffff\2\13\42\uffff\1\13\6\uffff"+
            "\1\14\6\uffff\1\13\3\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "289:1: declaration : ( typeSpecifier identifier ( ',' identifier )* ( arrayDimensions )? ( '{' '}' | '=' arrayInitialization | '=' expression )? ';' -> ^( DECLARATION typeSpecifier ( identifier )+ ( arrayDimensions )? ( arrayInitialization )? ( expression )? ) | pointerDeclaration -> ^( DECLARATION pointerDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_includes_in_program856 = new BitSet(new long[]{0x0100000000000000L,0x0200000000000000L,0x0600810800000000L});
    public static final BitSet FOLLOW_definition_in_program859 = new BitSet(new long[]{0x0100000000000000L,0x0200000000000000L,0x0600810800000000L});
    public static final BitSet FOLLOW_EOF_in_program862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_in_includes891 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_include918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_174_in_include919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_library_in_include921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_library949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_library965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_library981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_library997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_library1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_library1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_definition1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_definition1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macroDefinition_in_definition1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameSpace_in_definition1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnType_in_functionDefinition1127 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_functionName_in_functionDefinition1129 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_functionDefinition1131 = new BitSet(new long[]{0x0100000000000000L,0x8000000000000000L,0x0400810300000000L});
    public static final BitSet FOLLOW_parameters_in_functionDefinition1133 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_functionDefinition1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000008000L});
    public static final BitSet FOLLOW_body_in_functionDefinition1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_functionDefinition1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnType_in_pointer1186 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_pointer1188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_pointer1190 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_functionName_in_pointer1192 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_pointer1194 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_pointer1196 = new BitSet(new long[]{0x0100000000000000L,0x8000000000000000L,0x0400810300000000L});
    public static final BitSet FOLLOW_parameters_in_pointer1198 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_pointer1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_returnType1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_returnType1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_returnType1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_customType_in_returnType1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_returnType1295 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_pointerOp_in_returnType1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_returnType1315 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_pointerOp_in_returnType1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_functionName1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_parameters1372 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000810300000000L});
    public static final BitSet FOLLOW_parameter_in_parameters1374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionDefinition_in_parameters1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_parameters1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameter1434 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_parameter1436 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_arrayDimensions_in_parameter1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseType_in_typeSpecifier1471 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_pointerOp_in_typeSpecifier1473 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_175_in_baseType1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_baseType1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_baseType1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_baseType1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_customType_in_baseType1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_pointerOp1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_pointerOp1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_customType1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_body1678 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x4890A9E700000088L});
    public static final BitSet FOLLOW_statement_in_body1680 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x4890A9E700000088L});
    public static final BitSet FOLLOW_190_in_body1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_statement1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement1741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_statement1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_controlStructure_in_statement1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statement1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coutStatement_in_statement1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointerDeallocation_in_statement1807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_statement1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cinStatement_in_statement1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incrementExpr_in_statement1841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_statement1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statthis_in_statement1859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_statement1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationclass_in_statement1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_statement1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callclass_in_statement1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_statement1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_className_in_statement1913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_statement1915 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_functionCall_in_statement1917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_statement1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationclass1_in_declarationclass1951 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_declarationclass2_in_declarationclass1955 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_className_in_declarationclass11986 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_functionCall_in_declarationclass11988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_className_in_declarationclass22015 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_declarationclass22017 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_declarationclass22020 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_declarationclass22022 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_identifier_in_callclass2052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_callclass2054 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_functionCall_in_callclass2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_statthis2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_statthis2085 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_statthis2087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_statthis2089 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_statthis2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_declaration2124 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_declaration2126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000042008020L});
    public static final BitSet FOLLOW_133_in_declaration2129 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_declaration2131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000042008020L});
    public static final BitSet FOLLOW_arrayDimensions_in_declaration2135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000002008000L});
    public static final BitSet FOLLOW_188_in_declaration2139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_declaration2141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_153_in_declaration2145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_arrayInitialization_in_declaration2147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_153_in_declaration2151 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expression_in_declaration2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_declaration2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointerDeclaration_in_declaration2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_intArray2217 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_arrayDimensions_in_intArray2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_arrayDimensions2249 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400800000C9L});
    public static final BitSet FOLLOW_expression_in_arrayDimensions2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_arrayDimensions2254 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_188_in_arrayInitialization2282 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x41000400000000C9L});
    public static final BitSet FOLLOW_expression_in_arrayInitialization2285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_133_in_arrayInitialization2288 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expression_in_arrayInitialization2290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_190_in_arrayInitialization2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseType_in_pointerDeclaration2322 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_pointerOp_in_pointerDeclaration2324 = new BitSet(new long[]{0x0100000000000000L,0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_identifier_in_pointerDeclaration2327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002008000L});
    public static final BitSet FOLLOW_153_in_pointerDeclaration2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_pointerAssignment_in_pointerDeclaration2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_pointerDeclaration2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseType_in_memoryDeclaration2380 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_pointerOp_in_memoryDeclaration2382 = new BitSet(new long[]{0x0100000000000000L,0x2000000000000000L,0x0400810000000001L});
    public static final BitSet FOLLOW_functionDefinition_in_memoryDeclaration2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_pointerAssignment2419 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000810300000000L});
    public static final BitSet FOLLOW_baseType_in_pointerAssignment2421 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_arrayDimensions_in_pointerAssignment2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_arrayInitialization_in_pointerAssignment2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_pointerAssignment2430 = new BitSet(new long[]{0x0101000000000000L,0xC000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expressionList_in_pointerAssignment2432 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_pointerAssignment2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_pointerDeallocation2478 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_pointerDeallocation2481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_pointerDeallocation2483 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_intArray_in_pointerDeallocation2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_pointerDereference2519 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_pointerDereference2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignment2548 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000002001112L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignment2550 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expression_in_assignment2552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_assignment2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateExpression_in_expression2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incrementExpr_in_updateExpression2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpr_in_updateExpression2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryExpression_in_updateExpression2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_incrementExpr2672 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_incrementExpr2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_incrementExpr2692 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_incrementExpr2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_incrementExpr2712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_incrementExpr2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_incrementExpr2732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_incrementExpr2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_assignmentOperator2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_assignmentOperator2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_assignmentOperator2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_assignmentOperator2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_assignmentOperator2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_assignmentOperator2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_binaryExpression2866 = new BitSet(new long[]{0x0000000000000002L,0x1480000000000000L,0x200000001C050845L});
    public static final BitSet FOLLOW_binaryOp_in_binaryExpression2869 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x0100040000000041L});
    public static final BitSet FOLLOW_primaryExpression_in_binaryExpression2871 = new BitSet(new long[]{0x0000000000000002L,0x1480000000000000L,0x200000001C050845L});
    public static final BitSet FOLLOW_130_in_binaryOp2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_binaryOp2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_binaryOp2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_binaryOp2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_binaryOp2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_binaryOp2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_binaryOp3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_binaryOp3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_binaryOp3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_binaryOp3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_binaryOp3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_binaryOp3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_binaryOp3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primaryExpression3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpression3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointerDereference_in_primaryExpression3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_primaryExpression3185 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3187 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_primaryExpression3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_literal3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_LITERAL_in_literal3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_literal3246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_literal3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_literal3264 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_FLOAT_LITERAL_in_literal3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_literal3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_literal3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_literal3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_functionCall3339 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_functionCall3341 = new BitSet(new long[]{0x0101000000000000L,0xC000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expressionList_in_functionCall3343 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_functionCall3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList3374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_expressionList3377 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expression_in_expressionList3379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_180_in_returnStatement3407 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01020400000080C9L});
    public static final BitSet FOLLOW_expression_in_returnStatement3410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_pointerAssignment_in_returnStatement3414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_returnStatement3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_controlStructure3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forLoop_in_controlStructure3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileLoop_in_controlStructure3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileLoop_in_controlStructure3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_ifStatement3520 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_ifStatement3522 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expression_in_ifStatement3524 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ifStatement3526 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x1890A9E700000088L});
    public static final BitSet FOLLOW_body_in_ifStatement3529 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_singleStatement_in_ifStatement3533 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_elsePart_in_ifStatement3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_elsePart3573 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x1890A9E700000088L});
    public static final BitSet FOLLOW_body_in_elsePart3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleStatement_in_elsePart3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_singleStatement3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_forLoop3637 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_forLoop3639 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000810300008000L});
    public static final BitSet FOLLOW_forInit_in_forLoop3641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_forLoop3644 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000080C9L});
    public static final BitSet FOLLOW_expression_in_forLoop3646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_forLoop3649 = new BitSet(new long[]{0x0101000000000000L,0xC000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_forUpdate_in_forLoop3651 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_forLoop3654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_body_in_forLoop3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationList_in_forInit3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentList_in_forInit3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_declarationList3738 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_declarator_in_declarationList3740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_declarationList3743 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_declarator_in_declarationList3745 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_identifier_in_declarator3782 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_declarator3785 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expression_in_declarator3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpr_in_assignmentList3817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_assignmentList3820 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_assignmentExpr_in_assignmentList3822 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_identifier_in_assignmentExpr3850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_assignmentExpr3852 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expression_in_assignmentExpr3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forUpdate3881 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_forUpdate3884 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expression_in_forUpdate3886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_187_in_whileLoop3914 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_whileLoop3916 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expression_in_whileLoop3918 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_whileLoop3920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_body_in_whileLoop3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_doWhileLoop3949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_body_in_doWhileLoop3951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_187_in_doWhileLoop3953 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_doWhileLoop3955 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expression_in_doWhileLoop3957 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_doWhileLoop3959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_doWhileLoop3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_classDefinition3988 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_className_in_classDefinition3990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000008000L});
    public static final BitSet FOLLOW_188_in_classDefinition3993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_classBody_in_classDefinition3995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x400C000000000000L});
    public static final BitSet FOLLOW_190_in_classDefinition3998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_classDefinition4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_voidHelper_in_classDefinition4021 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_body_in_classDefinition4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_className4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privpub_in_classBody4077 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0420910300000000L});
    public static final BitSet FOLLOW_member_in_classBody4079 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0420910300000000L});
    public static final BitSet FOLLOW_179_in_privpub4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_privpub4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_member4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classFunction_in_member4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorDefinition_in_member4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_friendFunction_in_member4197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_member4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticMember_in_member4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticFunctionDefinition_in_member4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_staticFunctionDefinition4256 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0400810000000000L});
    public static final BitSet FOLLOW_returnType_in_staticFunctionDefinition4258 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_functionName_in_staticFunctionDefinition4260 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_staticFunctionDefinition4262 = new BitSet(new long[]{0x0100000000000000L,0x8000000000000000L,0x0000810300000000L});
    public static final BitSet FOLLOW_parameter_in_staticFunctionDefinition4264 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_staticFunctionDefinition4267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_body_in_staticFunctionDefinition4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_staticMember4310 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000810300000000L});
    public static final BitSet FOLLOW_declaration_in_staticMember4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnType_in_classFunction4337 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_functionName_in_classFunction4339 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_classFunction4341 = new BitSet(new long[]{0x0100000000000000L,0x8000000000000000L,0x0000810300000000L});
    public static final BitSet FOLLOW_parameter_in_classFunction4343 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_classFunction4346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000001000008000L});
    public static final BitSet FOLLOW_constSpecifier_in_classFunction4348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000008000L});
    public static final BitSet FOLLOW_body_in_classFunction4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_classFunction4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_constSpecifier4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorDefinitionBody_in_constructorDefinition4425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000002000L});
    public static final BitSet FOLLOW_141_in_constructorDefinition4428 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_constructorDefinitionBody_in_constructorDefinition4430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000002000L});
    public static final BitSet FOLLOW_body_in_constructorDefinition4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_className_in_constructorDefinitionBody4469 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_constructorDefinitionBody4471 = new BitSet(new long[]{0x0100000000000000L,0x8000000000000000L,0x0000810300000000L});
    public static final BitSet FOLLOW_parameter_in_constructorDefinitionBody4473 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_constructorDefinitionBody4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_friendFunction4504 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0400810000000000L});
    public static final BitSet FOLLOW_voidHelper_in_friendFunction4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnType_in_voidHelper4531 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_functionName_in_voidHelper4533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_voidHelper4535 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_functionName_in_voidHelper4538 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_voidHelper4540 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000000L,0x0000810300000000L});
    public static final BitSet FOLLOW_parameter_in_voidHelper4542 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_voidHelper4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_voidHelper4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_friendFunctionCall4592 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_friendFunctionCall4594 = new BitSet(new long[]{0x0101000000000000L,0xC000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_expressionList_in_friendFunctionCall4596 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_friendFunctionCall4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_coutStatement4627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_coutOp_in_coutStatement4629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_143_in_coutStatement4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_cinStatement4660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_cinOp_in_cinStatement4662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020008000L});
    public static final BitSet FOLLOW_143_in_cinStatement4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_cinOp4691 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_cinOp4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_coutOp4720 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_functionCall_in_coutOp4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_coutOp4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intArray_in_coutOp4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_coutOp4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_coutOp4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_coutOp4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_memberAccess4794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_memberAccess4796 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_memberAccess4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_nameSpace4827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_nameSpace4829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_182_in_nameSpace4831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_nameSpace4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_macroDefinition4862 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_macroName_in_macroDefinition4864 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_macroArgs_in_macroDefinition4866 = new BitSet(new long[]{0x0101000000000000L,0x4000200000000001L,0x01000400000000C9L});
    public static final BitSet FOLLOW_macroBody_in_macroDefinition4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_macroName4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_macroArgs4924 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_macroArgs4926 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_macroArgs4929 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_macroArgs4931 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_127_in_macroArgs4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_macroBody4961 = new BitSet(new long[]{0x0000000000000002L});

}