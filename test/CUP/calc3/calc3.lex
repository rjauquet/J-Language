import java_cup.runtime.Symbol;

%%

%cup
%line

digit = [0-9]
number = {digit}+
whitespace = [ \t\n\r\f]
letter = [a-zA-Z_]
identifier = {letter}({letter})*


%%
"=" {return new Symbol(sym.EQ);}
"int" {return new Symbol(sym.INT);}
";" {return new Symbol(sym.SEMI);}
"+" {return new Symbol(sym.PLUS);}
"*" {return new Symbol(sym.TIMES);}
"(" {return new Symbol(sym.LPAREN);}
")" {return new Symbol(sym.RPAREN);}
"main" {return new Symbol(sym.MAIN);}
{number} {return new Symbol(sym.NUMBER, new Integer(yytext()));}
{identifier} {return new Symbol(sym.ID, yytext());}
{whitespace} {}
. {System.out.println("error: unknown character " + yytext() + " found at line " + yyline);}
