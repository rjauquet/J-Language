/**
 * Starts lexical analyser and parser. 
 * If flag --lex is used only lexical analysis occurs. 
 * 
 * @author Elias Court
 * @author Lawrence Plaschka
 * @author Luke Richardson
 * @author Michael Gale
 * 
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java_cup.runtime.Symbol;

public class pcc {
	private static Lexer lex;
	private static parser pccParser;
        private static InputStream input = System.in;

	/**
	 * Prints the int value of tokens created by the lexer object and values
	 * within the token object (if any)
	 * 
	 * @throws IOException
	 */
	private static void lexicalAnalysisOnly() throws IOException {
		Symbol token;
		while ((token = lex.next_token()).sym != 0) {
			System.out.print(token.toString());
			System.out.println(token.value != null ? "(" + token.value.toString() + ")" : "");
		}
	}

        private static boolean processCommandLine(String[] args) throws FileNotFoundException {
            boolean lexOnly = false;
                for (String arg : args) {
                    if (arg.equalsIgnoreCase("--lex")) {
                        lexOnly = true;
                    } else {
                        input = new FileInputStream(arg);
                    }
                }
            return lexOnly;
        }

	public static void main(String[] args) {
		try {
                    boolean lexOnly = processCommandLine(args);
                    lex = new Lexer(input);
                    pccParser = new parser(lex);
                    if (lexOnly) {
                        lexicalAnalysisOnly();
                    } else {
                        pccParser.parse();
                    }
                    } catch  (Exception ex) {
			ex.printStackTrace();
			System.exit(1);
		}
	}
}
