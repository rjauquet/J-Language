#!/bin/sh

### DESIGNED TO WORK ON CS LAB MACHINES!
### PATHS MAY NEED ALTERING IF RUNNING ON YOUR OWN MACHINE

export CLASSPATH="/opt/UCLCScourseware/java/contrib/java-cup-11a-runtime.jar:."
java pcc $*
