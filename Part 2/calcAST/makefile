all:
	java JLex.Main calc.lex
	java java_cup.Main calc.cup
	javac ast/*.java calc.lex.java parser.java sym.java Test.java


clean:
	rm -f ast/*.class calc.lex.java parser.java sym.java *.class *~