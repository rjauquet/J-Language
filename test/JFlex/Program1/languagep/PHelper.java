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

class PHelper {
	Lexer lex;

	public PHelper(Lexer lex) {
		this.lex = lex;
	}

	/**
	 * Returns symbol object containing a boolean
	 * 
	 * @param yytext
	 * @return Symbol object
	 */
	public Symbol parseBool(String yytext) {
		return sym(sym.BOOLLITERAL, yytext.equals("TT"));
	}

	/**
	 * Returns symbol object containing an integer
	 * 
	 * @param yytext
	 * @return Symbol object
	 */
	public Symbol parseInteger(String yytext) {
		return sym(sym.INTLITERAL, Integer.parseInt(yytext));
	}

	/**
	 * Returns symbol object containing a double
	 * 
	 * @param yytext
	 * @return Symbol object
	 */
	public Symbol parseReal(String yytext) {
		return sym(sym.REALLITERAL, Double.parseDouble(yytext));
	}

	/**
	 * Returns symbol object containing a string The leading and following
	 * quotes are trimmed from the string
	 * 
	 * @param yytext
	 * @return Symbol object
	 */
	public Symbol parseString(String yytext) {
		return sym(sym.STRINGLITERAL, yytext.substring(1, yytext.length() - 1));
	}

	/**
	 * Creates a symbol object containing its type and position in source code
	 * 
	 * @param type
	 * @return Symbol object
	 */
	public Symbol sym(int type) {
		return new Symbol(type, lex.getLine(), lex.getCol());
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
