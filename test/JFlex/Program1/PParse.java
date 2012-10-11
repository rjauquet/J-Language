/**
 *	Helper class for creating symbol objects 
 *
 *
 * @author Elias Court
 * @author Lawrence Plaschka
 * @author Luke Richardson
 * @author Michael Gale
 */

import java_cup.runtime.*;

class PParse {
	Lexer lex;

	public PParse(Lexer lex) {
		this.lex = lex;
	}

	/**
	 * Returns symbol object containing an integer
	 * 
	 * @param yytext
	 * @return Symbol object
	 */
	public Symbol intParse(String yytext) {
		return sym(sym.INTEGER, Integer.parseInt(yytext));
	}

	/**
	 * Returns symbol object containing a double
	 * 
	 * @param yytext
	 * @return Symbol object
	 */
	public Symbol floatParse(String yytext) {
		return sym(sym.FLOATNUM, Double.parseDouble(yytext));
	}
	
/**
	 * Returns symbol object containing a boolean
	 * 
	 * @param yytext
	 * @return Symbol object
	 */
	public Symbol boolParse(String yytext) {
		return sym(sym.BOOLEAN, yytext.equals("true"));
	}

	/**
	 * Returns symbol object containing a string The leading and following
	 * quotes are trimmed from the string
	 * 
	 * @param yytext
	 * @return Symbol object
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
	 * @return Symbol object
	 */
	public Symbol tuplesParse(String yytext) {
		return sym(sym.TUPLES, yytext);
	}
	
	
	/**
	 * Creates a symbol object containing its type and position in source code
	 * 
	 * @param type
	 * @return Symbol object
	 */
	public Symbol sym(int type) {
		return new Symbol(type, lex.getLine());
	}

	/**
	 * Creates a symbol object containing its type and position in source code
	 * and value associated with token
	 * 
	 * @param type
	 * @param value
	 * @return
	 */
	public Symbol sym(int type, Object value) {
		return new Symbol(type, lex.getLine(), lex.getCol(), value);
	}
}
