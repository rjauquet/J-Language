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

%state COMMENT

digit = [0-9]
number = {digit}+
letter = [a-zA-Z]
identifier = {letter}+
whitespace = [ \t\r\n\f]

%%

<YYINITIAL>"+" {return new Yytoken("PLUS");}
<YYINITIAL>"*" {return new Yytoken("TIMES");}
<YYINITIAL>"-" {return new Yytoken("MINUS");}
<YYINITIAL>"/" {return new Yytoken("DIVIDE");}
<YYINITIAL>"(" {return new Yytoken("LPAREN");}
<YYINITIAL>")" {return new Yytoken("RPAREN");}
<YYINITIAL>{number} {return new Yytoken("NUMBER", (new Integer(yytext())).intValue());}
<YYINITIAL>{identifier} {return new Yytoken("ID", yytext());}
<YYINITIAL>{whitespace} {}
<YYINITIAL>"/*" {yybegin(COMMENT);}
<COMMENT>"*/" {yybegin(YYINITIAL);}
<COMMENT>. {}
<YYINITIAL>. {System.out.println("error: unknown character " + yytext() + " found at line " + yyline);}
