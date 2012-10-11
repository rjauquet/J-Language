HOW TO USE pcc (equivalent to Test.java)

[[How to build]]
Run the build.sh script. Note that this script is designed to run on the CS dept
machines. If running on another machine, you will need to edit this script to
have appropriate paths.

If building manually, note that JFlex 1.4.3 and cup 11a are required. JLex is
not supported.

[[Running lexer/parser]]
Use the pcc.sh script. Again, if running from a non-CS machine, edit the script
to use appropriate classpath.
USAGE:
./pcc.sh [--lex] [filename]
If no filename is provided, will read from standard input.

[[How to enable lexical analysis alone]]
If you use the flag --lex, syntax analysis will be skipped and only lexical
analysis will be performed, outputting each token on a separate line in the form
#<token_number>(<token_value>)