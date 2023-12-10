#!/bin/sh

# Constructing classpath for JAR files and resources
classpath=""
for jarfile in lib/*.jar; do
    classpath="$classpath:$jarfile"
done
classpath="$classpath:src/test/resources"

# Compilation command using the generated classpath
java -cp "randoop-all-4.3.2.jar:./target/classes:$classpath" randoop.main.Main gentests --classlist=./myTestClasses.txt --junit-output-dir="./src/test/java/com/uol/smqa/blackbox/randoop" --time-limit=30
