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

# Execution command for JUnit tests
echo "Execution command for JUnit tests"
java -cp "classes:junit-platform-console-standalone-1.10.1.jar:$classpath" org.junit.platform.console.ConsoleLauncher --class-path=classes --scan-class-path

# Execution command for Jacoco report generation
echo "Execution command for Jacoco report generation"
java -javaagent:jacoco-0.8.8/lib/jacocoagent.jar=output=tcpserver -cp "junit-platform-console-standalone-1.10.1.jar:$classpath:classes" org.junit.runner.JUnitCore $(find src/test/java -name "*.java")
java -jar jacoco-0.8.8/lib/jacococli.jar report target/coverage.exec --classfiles classes --html reports --sourcefiles src/main/java

