/**
 *  Name: Robert Jauquet
 *	Helper class for creating symbol objects and parsing
 *
 */

import java_cup.runtime.*;

class PParse {
	Lexer lex;

	public PParse(Lexer lex) {
		this.lex = lex;
	}

	/**
	 * create INTEGER symbol
	 * 
	 * @param yytext
	 * @return INTEGER
	 */
	public Symbol intParse(String yytext) {
		return sym(sym.INTEGER, Integer.parseInt(yytext));
	}

	/**
	 * create FLOATNUM symbol
	 * 
	 * @param yytext
	 * @return FLOATNUM
	 */
	public Symbol floatParse(String yytext) {
		return sym(sym.FLOATNUM, Double.parseDouble(yytext));
	}
	
/**
	 * create BOOLEAN symbol
	 * 
	 * @param yytext
	 * @return BOOLEAN
	 */
	public Symbol boolParse(String yytext) {
		return sym(sym.BOOLEAN, yytext.equals("true"));
	}
	
	/**
	 * parses chars, and prints error if it's more than one character
	 * 
	 * @param yytext
	 * @return CHARS
	 */
	public Symbol charParse(String yytext) {
		if (yytext.length() != 3){
			System.out.println("Error: chars cannot have more than one symbol");
		}
			return sym(sym.CHARS, yytext.substring(1, yytext.length() - 1));
		
	}	
	
	/**
	 * parses strings
	 * 
	 * @param yytext
	 * @return STRING
	 */
	public Symbol stringParse(String yytext) {
		return sym(sym.STRING, yytext.substring(1, yytext.length() - 1));
	}

/**
	 * Returns symbol object containing a string The leading and following
	 * quotes are trimmed from the string
	 * 
	 * @param yytext
	 * @return Symbol object
	 */
	public Symbol listsParse(String yytext) {
		return sym(sym.LISTS, yytext.substring(1, yytext.length() - 1));
	}
	
/**
	 * Returns symbol object containing a string The leading and following
	 * quotes are trimmed from the string
	 * 
	 * @param yytext
	 * @return TUPLES
	 */
	public Symbol tuplesParse(String yytext) {
		return sym(sym.TUPLES, yytext.substring(2, yytext.length() - 2));
	}
	
	
	/**
	 * Creates a symbol object containing its type and position in source code
	 * 
	 * @param type
	 * @return Symbol
	 */
	public Symbol sym(int type) {
		return new Symbol(type, lex.getLine());
	}

	/**
	 * Creates a symbol location and type and value associated with token
	 * 
	 * @param type
	 * @param value
	 * @return Symbol
	 */
	public Symbol sym(int type, Object value) {
		return new Symbol(type, lex.getLine(), lex.getCol(), value);
	}
}
