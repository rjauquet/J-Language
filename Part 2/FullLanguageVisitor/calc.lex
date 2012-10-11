import java_cup.runtime.Symbol;

%%

%cup
%line

digit = [0-9]
letter = [a-zA-Z]
id = {letter}+
number = {digit}+
whitespace = [ \t\n\r\f]

%%
"=" {return new Symbol(sym.EQUALS);}
";" {return new Symbol(sym.SEMI);}
"+" {return new Symbol(sym.PLUS);}
"*" {return new Symbol(sym.TIMES);}
"(" {return new Symbol(sym.LPAREN);}
")" {return new Symbol(sym.RPAREN);}
"int" {return new Symbol(sym.INT);}
"double" {return new Symbol(sym.DOUBLE);}
{number} {return new Symbol(sym.NUMBER, new Integer(yytext())); }
{id} {return new Symbol(sym.ID, yytext()); }
{whitespace} {}
. {System.out.println("error: unknown character " + yytext() + " found at line " + yyline);}
