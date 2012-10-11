import java_cup.runtime.Symbol;

%%

%cup
%line

digit = [0-9]
number = {digit}+
whitespace = [ \t\n\r\f]

%%

"+" {return new Symbol(sym.PLUS);}
"*" {return new Symbol(sym.TIMES);}
"(" {return new Symbol(sym.LPAREN);}
")" {return new Symbol(sym.RPAREN);}
{number} {return new Symbol(sym.NUMBER, new Integer(yytext())); }
{whitespace} {}
. {System.out.println("error: unknown character " + yytext() + " found at line " + yyline);}
