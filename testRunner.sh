#!/bin/sh

javac -d classes -cp junit-platform-console-standalone-1.10.1.jar:classes -g src/main/java/com/uol/smqa/**/*.java && \
java -cp classes -javaagent:jacoco-0.8.11/lib/jacocoagent.jar -jar &&  \
junit-platform-console-standalone-1.10.1.jar execute --class-path classes --scan-class-path && \
java -jar jacoco-0.8.11/lib/jacococli.jar report jacoco.exec --classfiles classes --sourcefiles src --html report