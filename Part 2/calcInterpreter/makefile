all:
	java JLex.Main calc.lex
	java java_cup.Main calc.cup
	javac calc.lex.java parser.java sym.java Test.java


clean:
	rm -f calc.lex.java parser.java sym.java *.class *~