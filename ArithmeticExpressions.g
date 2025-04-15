grammar ArithmeticExpressions;

options {output=AST;}

tokens{
StartgeneralArithExpr;
GeneralArithExpr;
Term;
Factor;
}
@members {
String s="";
}
// Arithmetic Expressions
startgeneralArithExpr: (generalArithExpr+) 
	-> ^(StartgeneralArithExpr generalArithExpr+) 
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
  // The finally clause is the last part a rule executes before returning.
  finally { s = s + "Exit..."+"\n"; }
  
generalArithExpr: term (('+' | '-')^  term)*
	//-> ^(GeneralArithExpr term (('+' | '-')  term)*)	
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  
term	: factor ( ( '*' | '/' )^ factor)* 
	//-> ^(Term factor ( ( '*' | '/' ) factor)*)
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

factor	:  ID -> ^(Factor ID)
	|INT -> ^(Factor INT)
	|DOUBLE -> ^(Factor DOUBLE)
	| '-'  ID -> ^(Factor  '-' ID)
	| '-'  INT -> ^(Factor  '-' INT)
	| '-'  DOUBLE  -> ^(Factor  '-' DOUBLE)
	| '(' generalArithExpr ')' -> ^(Factor  '(' generalArithExpr ')')
	| Fun '(' generalArithExpr ')' -> ^(Factor Fun '(' generalArithExpr ')')
	;
	
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
Fun	: 'sin' | 'cos'| 'tan' ;


ID 	:	('a'..'z'|'A'..'Z'|'_')  ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*  ;
INT	:	 ('0'..'9')+ ;
DOUBLE	:	INT '.' INT;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;// ignore whitespace