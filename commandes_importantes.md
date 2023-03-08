javac -d ./out  ./src/*.java

java -ea -cp ./out Executable

javadoc -d ./doc/  ./src/*.java
