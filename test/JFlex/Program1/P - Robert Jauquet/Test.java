/**
 *  Name: Robert Jauquet
 *	Tester class for reading test files
 *
 */

import java.io.*;
import java.util.Scanner;

	/**
	 * Test: reads in a file from the command line,
	 * and checks if it's a language in P
	 * 
	 */
public class Test {

  public static void main(String args[]) throws Exception {
	
	
	Scanner in = null;
	InputStream input = null;
	Lexer myScanner = null;
	
	// make sure there is only one item in args
	if(args.length != 1){
		System.out.println("Usage: java Test fileName");
		System.exit(0);
	}
	
	try{
		File inFile = new File(args[0]);
		in = new Scanner(inFile);
		input = new FileInputStream(inFile);
	}
	catch (FileNotFoundException e) {
		System.out.println("Error: Cannot access input file");
		System.exit(0);
	}
	
	myScanner = new Lexer(input);
	parser myParser = new parser(myScanner);
  	myParser.parse();
    }

}