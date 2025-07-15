# JAVA Project

This repository contains a Java project that demonstrates Object-Oriented Programming (OOP) principles through a Shape Calculator application. The project showcases encapsulation, inheritance, and polymorphism, and is designed for educational purposes to illustrate how OOP concepts can be applied to real-world scenarios such as calculating the area and perimeter of different geometric shapes.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- (Optional) An IDE like IntelliJ IDEA, Eclipse, NetBeans, or VS Code for easier code navigation

## Installation

1. **Clone the repository** (if not already downloaded):
   ```sh
   git clone <repository-url>
   cd Shape-Calculator-main
   ```
2. **Compile the source code:**
   Navigate to the `src` directory and compile the Java source files:
   ```sh
   javac -d ../bin src/*.java
   ```
   This will compile the Java files and place the `.class` files in the `bin` directory.

## How to Run

After compiling, run the main class for the Shape Calculator application:

```sh
java -cp bin Main
```

Or, if you use an IDE, simply open the project folder and run `Main.java` from the IDE.

## Project Structure

```
Shape-Calculator-main/
├── src/
│   ├── Circle.java
│   ├── Main.java
│   ├── Rectangle.java
│   ├── Shape.java
│   └── Triangle.java
├── bin/
│   ├── Circle.class
│   ├── Main.class
│   ├── Rectangle.class
│   ├── Shape.class
│   └── Triangle.class
└── README.md
```

- The `src/` directory contains the Java source files for the main application and its shape classes.
- The `bin/` directory contains the compiled `.class` files after building the project.

## Learn More

- [Java Documentation](https://docs.oracle.com/javase/tutorial/)
- [How to Compile and Run Java](https://www.oracle.com/java/technologies/javase/codeconventions-137265.html)
- For questions or contributions, please open an issue or pull request.
