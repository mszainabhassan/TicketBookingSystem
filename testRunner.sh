#!/bin/sh

# Constructing classpath for JAR files and resources
classpath=""
for jarfile in lib/*.jar; do
    classpath="$classpath:$jarfile"
done
classpath="$classpath:src/test/resources"

# Compilation command using the generated classpath
echo "Compilation command using the generated classpath"
javac -Xlint:deprecation -Xlint:unchecked -d classes -cp "junit-platform-console-standalone-1.10.1.jar:$classpath:classes" -g $(find src/main/java -name "*.java") $(find src/test/java -name "*.java")


java -javaagent:jacoco-0.8.8/lib/jacocoagent.jar=destfile=target/coverage.exec -cp "classes:junit-platform-console-standalone-1.10.1.jar:$classpath" org.junit.runner.JUnitCore $(find src/test/java -name "*.java" -exec basename {} \; | sed 's/\.java$//' | tr '\n' ' ')
