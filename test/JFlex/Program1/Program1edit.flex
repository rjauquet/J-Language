/* 
	Name: Rob Jauquet
	Language P: part 1

	this file contains the flex specification for the language P
 */


import java_cup.runtime.*;


%%

%class Lexer
%unicode
%cup
%line
%column

/* use the helper class to parse complex types */

%{

	private StringBuilder errMsg = null;
	PParse p;
	public int getLine() {return yyline;}
	public int getCol() {return yycolumn;}
  
%}

%init{
	p = new PParse(this);
%init}

character = [a-zA-Z]
identifier = ({character})([a-zA-Z0-9]*)

integer = 0 | [1-9]([:digit:]*)
floatNum = [:digit:]+\.[:digit:]+

boolean = ({true}|{false})
true = "true"
false = "false"

chars = "\'" ~"\'"
string = "\"" ~"\""
lists = "[" ~"]"
tuples = "[|" ~"|]"

comment = ("/*")[^("/*")("*/")]*~("*/")
whitespace = {comment}|[\ \t\n\r\f]+

int = "int"
float = "float"
bool = "bool"
str = "str"
list = "list"
tuple = "tuple"
char = "char"

%states ERROR

%%

<YYINITIAL> {

	{whitespace}		{}
	
/* vars */	
	{int}				{return p.sym(sym.INT);}
	{float}				{return p.sym(sym.FLOAT);}
	{bool}				{return p.sym(sym.BOOL);}
	{char}				{return p.sym(sym.CHAR);}
	{str}				{return p.sym(sym.STR);}
	{list}				{return p.sym(sym.LIST);}
	{tuple}				{return p.sym(sym.TUPLE);}

/* bool ops */	
	"=" 				{return p.sym(sym.EQ);}
	"==" 				{return p.sym(sym.EQEQ);}
	"<" 				{return p.sym(sym.LT);}
	">" 				{return p.sym(sym.GT);}
	"<=" 				{return p.sym(sym.LTEQ);}
	">=" 				{return p.sym(sym.GTEQ);}
	"!="				{return p.sym(sym.NOTEQ);}
	"\!"				{return p.sym(sym.NOT);}
	"||"				{return p.sym(sym.OR);}
	"&&"				{return p.sym(sym.AND);}
	
	
/* math ops */	
	"\+" 				{return p.sym(sym.PLUS);}
	"-" 				{return p.sym(sym.MINUS);}
	"\*" 				{return p.sym(sym.TIMES);}
	"/" 				{return p.sym(sym.DIV);}
	"\^" 				{return p.sym(sym.TOPOWER);}
	
/* str, list, tuple ops */
	"::"				{return p.sym(sym.CONCAT);}
	"len"				{return p.sym(sym.LEN);}
	"in"				{return p.sym(sym.IN);}
	"not in"			{return p.sym(sym.NOTIN);}
	
/* values */	
	{integer} 			{return p.intParse(yytext());}
	{floatNum} 			{return p.floatParse(yytext());}
	{boolean} 			{return p.boolParse(yytext());}
	{chars}				{return p.charParse(yytext());}
	{string} 			{return p.stringParse(yytext());}
	{tuples} 			{return p.tuplesParse(yytext());}
	{lists} 			{return p.listsParse(yytext());}

	
/* syntax */
	";"					{return  p.sym(sym.SEMI);}
	","					{return  p.sym(sym.COMMA);}
	"."					{return  p.sym(sym.DOT);}
	"(" 				{return  p.sym(sym.LPAREN);}
	")" 				{return  p.sym(sym.RPAREN);}
	"{" 				{return  p.sym(sym.LBRACE);}
	"}" 				{return  p.sym(sym.RBRACE);}
	"[" 				{return  p.sym(sym.LBRACKET);}
	"]" 				{return  p.sym(sym.RBRACKET);}
	":"					{return  p.sym(sym.COL);}
	
/* control flow */
	"if"				{return  p.sym(sym.IF);}	
	"else"				{return  p.sym(sym.ELSE);}
	"while"				{return  p.sym(sym.WHILE);}
	"do"				{return  p.sym(sym.DO);}
	"repeat"			{return  p.sym(sym.REPEAT);}
	"until"				{return  p.sym(sym.UNTIL);}
	"void"				{return  p.sym(sym.VOID);}
	"return"			{return  p.sym(sym.RETURN);}

/* other */
	"fdef"				{return  p.sym(sym.FDEF);}
	"tdef"				{return  p.sym(sym.TDEF);}
	{identifier} 		{return p.sym(sym.ID, yytext());}
	.   		        {yybegin(ERROR); errMsg = new StringBuilder(yytext());}	
}

/* error state. prints error if char is unknown */
<ERROR> {
({whitespace})			{yypushback(1); yybegin(YYINITIAL); System.err.println("error: unknown input " + errMsg + " found at line " + yyline);}
		. 				{errMsg.append(yytext());}
}

	