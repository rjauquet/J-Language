%%

%class Lexer
%unicode
%cup
%line
%column

%{
  PHelper h;
  public int getLine() { return yyline; }
  public int getCol() {return yycolumn; }
  private StringBuilder badinput = null;
%}

%init{
	h = new PHelper(this);
%init}


/* Macros */
Whitespace = [\ \t\n\r]+
Identifier = [:jletter:] [:jletterdigit:]*
BooleanLiteral = {TrueLiteral} | {FalseLiteral}
TrueLiteral = "TT"
FalseLiteral = "FF"
IntegerLiteral = [:digit:]+
RealLiteral = [:digit:]+\.[:digit:]+
StringLiteral = "\"" ~"\"" 
Bool = "bool"
Int = "int"
Real = "real"
Chrlist = "chrlist"

%states ERROR

%%

<YYINITIAL> {
{Whitespace} {}
"[[" ~"]]" { }

// Variable types

{Bool}      {return h.sym(sym.BOOL); }
{Int}       {return h.sym(sym.INT); }
{Real}      {return h.sym(sym.REAL); }
{Chrlist}   {return h.sym(sym.CHRLIST); }

// Operators

//Logical Operators
"\!"        {return h.sym(sym.NOT); }
"||"        {return h.sym(sym.OR); }
"&&"        {return h.sym(sym.AND); }

//Numeric Operators
"\+"        {return h.sym(sym.PLUS); }
"-"         {return h.sym(sym.MINUS); }
"\*"        {return h.sym(sym.MULTIPLY); }
"/"         {return h.sym(sym.DIVIDE); }
"\^"        {return h.sym(sym.POWER); }

//String operators
"in"        {return h.sym(sym.IN); }
"not in"    {return h.sym(sym.NOTIN); }
"length"    {return h.sym(sym.LENGTH); }

//Comparison Operators
"<"         {return h.sym(sym.LESSTHAN); }
"<="        {return h.sym(sym.LESSTHANEQUAL); }
">"         {return h.sym(sym.GREATERTHAN); }
">="        {return h.sym(sym.GREATERTHANEQUAL); }
"=="        {return h.sym(sym.EQUAL); }
"!="        {return h.sym(sym.NOTEQUAL); }

// Class Declaration
":"          {return h.sym(sym.COLON); }
"class"      {return h.sym(sym.CLASS); }
"{"          {return h.sym(sym.LEFTBRACE); }
"}"          {return h.sym(sym.RIGHTBRACE); }

"public"     {return h.sym(sym.PUBLIC); }
"private"    {return h.sym(sym.PRIVATE); }
";"          {return h.sym(sym.SEMICOLON); }

"="          {return h.sym(sym.ASSIGN); }

// Literals
{BooleanLiteral} {return h.parseBool(yytext()); }
{RealLiteral}    {return h.parseReal(yytext()); }
{IntegerLiteral} {return h.parseInteger(yytext()); }
{StringLiteral}  {return h.parseString(yytext()); }

"("              {return h.sym(sym.LEFTPAREN); }
")"              {return h.sym(sym.RIGHTPAREN); }
"return"         {return h.sym(sym.RETURN); }
"null"           {return h.sym(sym.NULL); }
","              {return h.sym(sym.COMMA); }
"new"            {return h.sym(sym.NEW); }
"."              {return h.sym(sym.DOT); }

// Control Flow
"if"             {return h.sym(sym.IF); }
"else"           {return h.sym(sym.ELSE); }
"repeat"         {return h.sym(sym.REPEAT); }
"until"          {return h.sym(sym.UNTIL); }

// Main block
"start"          {return h.sym(sym.START); }

// Identifier
{Identifier} {return h.sym(sym.ID, yytext());}

// Error Handling
.           { yybegin(ERROR);
              badinput = new StringBuilder(yytext());}
}

<ERROR> {
[\{\}\(\);] | {Whitespace} { yypushback(1);
                             yybegin(YYINITIAL);
                             System.err.println("error: unknown input " + badinput + " found at line " + yyline);
                            } //Recover from end of statement
. {badinput.append(yytext());}
}
