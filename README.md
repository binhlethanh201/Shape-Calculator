# Getting Started with Java Application

This project was built with core Java and is structured for easy compilation and execution.

## Available Scripts

In the project directory, you can run:

### `javac Main.java`

Compiles the Java source file.\
Make sure you're in the directory where `Main.java` exists.

```bash
javac Main.java
java Main
Runs the compiled Java program.
This command will execute the Main class and display the output in your console.

bash
Copy
Edit
java Main
mvn compile
Compiles the project using Maven (if a pom.xml file is provided).
You can use this when working in a larger modular Java project.

bash
Copy
Edit
mvn compile
mvn exec:java
Executes the main class using Maven.
Requires configuration in pom.xml to specify the main class.

bash
Copy
Edit
mvn exec:java -Dexec.mainClass="com.example.Main"
gradle build
Builds the project using Gradle (if a build.gradle file is provided).
Useful for managing dependencies and packaging your Java application.

bash
Copy
Edit
gradle build
gradle run
Runs the application using Gradle.
This requires setting up the application plugin in your build.gradle.

bash
Copy
Edit
gradle run
Learn More
You can learn more in the official Java and build tool documentation:

Java Tutorials

Maven Documentation

Gradle Documentation

Packaging into a JAR
Learn how to package your Java project as a .jar file:
https://docs.oracle.com/javase/tutorial/deployment/jar/build.html

Using External Libraries
To manage libraries and dependencies easily, use a build tool like Maven or Gradle.

IDE Integration
Popular IDEs like IntelliJ IDEA or Eclipse provide built-in tools for running, debugging, and managing Java projects efficiently.
