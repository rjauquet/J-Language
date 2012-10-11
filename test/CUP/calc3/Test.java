
public class Test {

  public static void main(String args[]) throws Exception {

	Yylex myScanner = new Yylex(System.in);
	parser myParser = new parser(myScanner);

  	myParser.parse();
    }

}