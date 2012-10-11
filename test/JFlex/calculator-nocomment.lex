class Yytoken {
  String token;
  int value;
  String name;

  Yytoken (String token) {
    this.token = token;
  }

  Yytoken (String token, int value) {
    this.token=token;
    this.value=value;
  }

  Yytoken (String token, String name) {
    this.token=token;
    this.name=name;
  }

  String getToken() {
    return token;
  }

  int getValue() {
    return value;
  }

  String getName() {
    return name;
  }
}

%%

%line

digit = [0-9]
number = {digit}+
letter = [a-zA-Z]
identifier = {letter}+
whitespace = [ \t\n\r\f]

%%

"+" {return new Yytoken("PLUS");}
"*" {return new Yytoken("TIMES");}
"-" {return new Yytoken("MINUS");}
"/" {return new Yytoken("DIVIDE");}
"(" {return new Yytoken("LPAREN");}
")" {return new Yytoken("RPAREN");}
{number} {return new Yytoken("NUMBER", (new Integer(yytext())).intValue());}
{identifier} {return new Yytoken("ID", yytext());}
{whitespace} {}
. {System.out.println("error: unknown character " + yytext() + " found at line " + yyline);}
