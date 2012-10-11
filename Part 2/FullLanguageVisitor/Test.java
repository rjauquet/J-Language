import ast.*;
import java_cup.runtime.*;

public class Test {

    public static void main(String args[]) throws Exception {

	/* initialise the automatically generated scanner from calc.lex */
	Yylex myScanner = new Yylex(System.in);

	/* initialise the automatically generated parser from calc.cup */
	parser myParser = new parser(myScanner);

	/* parse the input program from stdin */
	Symbol result = myParser.parse();

	/* get the root of the AST built using semantic actions as specified in calc.cup */
	/* root == null in case there were parsing errors in the input program */
	List root = (List)result.value;
	

	/* simple traversal of the tree */
	if (root !=null) {
	    System.out.println("\nParsing completed\n\n");

	    SimpleVisitor simpleVisitor = new SimpleVisitor();
	    root.accept(simpleVisitor);

	} else
            System.out.println("Parsing failed");
		    	
   }


}