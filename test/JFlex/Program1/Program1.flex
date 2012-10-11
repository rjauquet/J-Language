import java_cup.runtime.*;


%%

%cup
%line

%{
  

  private Symbol symbol(int type, Object value) {
    return new JavaSymbol(type, yyline+1, yycolumn+1, value);
  }

  
%}

digit = [0-9]
char = [a-zA-Z]
bool = ("true"|"false")
int = 0 | [1-9]({digit}*)
float = ({int})(".")({digit}+)
str = {char}*
list = ({char}|{bool}|{int}|{float}|{str})((",")({char}|{bool}|{int}|{float}|{str}))*
tuple = ({char}|{bool}|{int}|{float}|{str})((",")({char}|{bool}|{int}|{float}|{str}))*
comment = ("/*")[^("/*")("*/")]("*/")
whitespace = {comment}|[ \t\n\r\f]
identifier = ({char})([a-zA-Z0-9]*)
functionId = ({char})([a-zA-Z0-9]*)


%state STRING, LIST, TUPLE
%%
	\"				{string.setLength(0); yybegin(STRING);}
	"["				{ string.setLength(0); yybegin(LIST);}
	"[|"			{string.setLength(0); yybegin(TUPLE);}
	"=" 			{return new Symbol(sym.EQ);}
	"==" 			{return new Symbol(sym.EQEQ);}
	"<" 			{return new Symbol(sym.LT);}
	">" 			{return new Symbol(sym.GT);}
	"<=" 			{return new Symbol(sym.LTEQ);}
	">=" 			{return new Symbol(sym.GTEQ);}
	"!="			{return new Symbol(sym.NOTEQ);}

	"!" 			{return new Symbol(sym.NOT);}
	"||" 			{return new Symbol(sym.OR);}
	"&&"	 		{return new Symbol(sym.AND);}
	
	";"				{return new Symbol(sym.SEMI);}
	","				{return new Symbol(sym.COMMA);}
	"."				{return new Symbol(sym.DOT);}
	
	"::"			{return new Symbol(sym.CONCAT);}	
	"+" 			{return new Symbol(sym.PLUS);}
	"-" 			{return new Symbol(sym.MINUS);}
	"*" 			{return new Symbol(sym.TIMES);}
	"/" 			{return new Symbol(sym.DIV);}
	"^" 			{return new Symbol(sym.TOPOWER);}
	"(" 			{return new Symbol(sym.LPAREN);}
	")" 			{return new Symbol(sym.RPAREN);}
	"{" 			{return new Symbol(sym.LBRACE);}
	"}" 			{return new Symbol(sym.RBRACE);}
	"[" 			{return new Symbol(sym.LBRACKET);}
	"]" 			{return new Symbol(sym.RBRACKET);}
	":"				{return new Symbol(sym.COL);}
	"void"			{return new Symbol(sym.VOID);}
	"return"		{return new Symbol(sym.RETURN);}
<YYINITIAL> {

	\"				{string.setLength(0); yybegin(STRING);}
	"["				{ string.setLength(0); yybegin(LIST);}
	"[|"			{string.setLength(0); yybegin(TUPLE);}
	"=" 			{return new Symbol(sym.EQ);}
	"==" 			{return new Symbol(sym.EQEQ);}
	"<" 			{return new Symbol(sym.LT);}
	">" 			{return new Symbol(sym.GT);}
	"<=" 			{return new Symbol(sym.LTEQ);}
	">=" 			{return new Symbol(sym.GTEQ);}
	"!="			{return new Symbol(sym.NOTEQ);}

	"!" 			{return new Symbol(sym.NOT);}
	"||" 			{return new Symbol(sym.OR);}
	"&&"	 		{return new Symbol(sym.AND);}
	
	";"				{return new Symbol(sym.SEMI);}
	","				{return new Symbol(sym.COMMA);}
	"."				{return new Symbol(sym.DOT);}
	
	"::"			{return new Symbol(sym.CONCAT);}	
	"+" 			{return new Symbol(sym.PLUS);}
	"-" 			{return new Symbol(sym.MINUS);}
	"*" 			{return new Symbol(sym.TIMES);}
	"/" 			{return new Symbol(sym.DIV);}
	"^" 			{return new Symbol(sym.TOPOWER);}
	"(" 			{return new Symbol(sym.LPAREN);}
	")" 			{return new Symbol(sym.RPAREN);}
	"{" 			{return new Symbol(sym.LBRACE);}
	"}" 			{return new Symbol(sym.RBRACE);}
	"[" 			{return new Symbol(sym.LBRACKET);}
	"]" 			{return new Symbol(sym.RBRACKET);}
	":"				{return new Symbol(sym.COL);}
	"void"			{return new Symbol(sym.VOID);}
	"return"		{return new Symbol(sym.RETURN);}
	}
	
<STRING> { 
	\" 				{yybegin(YYINITIAL); return new Symbol(sym.STR, string.toString());} 
	{char}*			{string.append(yytext());} 
}
<TUPLE>{ 
	 "|]"			{yybegin(YYINITIAL); return new Symbol(sym.TUPLE);} 
	{tuple}			{} 
}
<LIST> { 
	"]"				{yybegin(YYINITIAL); return new Symbol(sym.LIST);} 
	{list}			{}
}

	
	{identifier} 	{return new Symbol(sym.ID, yytext());}
	{functionId} 	{return new Symbol(sym.FID, yytext());}
	
	{int} 			{System.out.print(yytext()); return symbol(sym.NUMBER, new Integer(yytext())); }
	{float} 		{return new Symbol(sym.FLOAT, new Double(yytext()));}
	{bool} 			{return new Symbol(sym.BOOL, yytext());}


	{whitespace} {}