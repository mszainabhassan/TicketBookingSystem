#!/bin/bash

# Construct classpath for JAR files and resources
classpath=""
for jarfile in lib/*.jar; do
    classpath="$classpath:$jarfile"
done
classpath="$classpath:src/test/resources"

# Compilation command
javac -Xlint:deprecation -Xlint:unchecked -d classes -cp "junit-platform-console-standalone-1.10.1.jar:$classpath" -g $(find src/main/java -name "*.java") $(find src/test/java -name "*.java")

# Execution commands for JUnit and Jacoco
java -cp "classes:junit-platform-console-standalone-1.10.1.jar:$classpath" org.junit.platform.console.ConsoleLauncher --class-path=classes --scan-class-path

java -javaagent:jacoco-0.8.11/lib/jacocoagent.jar -jar jacoco-0.8.11/lib/jacococli.jar report jacoco.exec --classfiles classes --sourcefiles src/main/java --html report

