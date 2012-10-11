#!/bin/sh

### DESIGNED TO WORK ON CS LAB MACHINES!
### PATHS MAY NEED ALTERING IF RUNNING ON YOUR OWN MACHINE

export CLASSPATH="/opt/UCLCScourseware/java/contrib/java_cup:/opt/UCLCScourseware/java/contrib/java-cup-11a-runtime.jar:."
export CUP_JAR="/opt/UCLCScourseware/java/contrib/java-cup-11a.jar"
export JFLEX_CMD="/usr/opt/UCLCScourseware/java/contrib/jflex-1.4.3/bin/jflex"

echo "+++ Generating Parser (CUP)"
java -jar $CUP_JAR P.cup &&

echo "+++ Generating Scanner (JLEX)" &&
$JFLEX_CMD P.lex &&

echo "+++ Compiling" &&

javac *.java

