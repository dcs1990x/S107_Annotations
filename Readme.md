# Sprint 1, Task 2: Annotations
This repository contains the implementation of object-oriented programming exercises focused on inheritance, method overriding, static attributes, and annotations like @Override and @SuppressWarnings.   

## 📁 Project Structure
The project is structured using packages and classes according to their responsibility, applying the Single Responsibility Principle. The classes are logically grouped under a base package and clearly demonstrate inheritance and polymorphism.

## 💻 Technologies Used
Java 17+  
IntelliJ IDEA (Recommended)  
No external libraries or frameworks used (pure Java)  

## 🌍 Language
All classes, methods, variables, and comments are written in English for clarity and consistency.

## ✅ Base Class: Worker

Attributes:

`String name`  
`String surname`  
`double hourlyRate` 

Method:

`public double calculateSalary(int hoursWorked) → Returns hourlyRate * hoursWorked.`

This method is marked as @Override in child classes.

## ‍💼 Subclass: OnsiteWorker
Inherits from Worker.

Static Attribute:

`static double gasolineCost = 100.0;`

Overridden Method:

`calculateSalary() returns (hourlyRate * hoursWorked) + gasolineCost.`

## 🌐 Subclass: OnlineWorker
Inherits from Worker.

Constant:

`static final double INTERNET_FLAT_RATE = 50.0;`  

Overridden Method:

`calculateSalary() returns (hourlyRate * hoursWorked) + INTERNET_FLAT_RATE`  

## 📝 Annotations Used
@Override
Each subclass overrides the method calculateSalary() to demonstrate polymorphism. The annotation ensures that the parent method is properly overridden.

@SuppressWarnings("deprecation")
Some legacy methods have been added in subclasses and marked as @Deprecated.

Example:

`@Override
public double calculateSalary(int hours){
return (this.getHourlySalary() * hours) + FLAT_RATE;
}`  

From a separate class, deprecated methods are called with suppression:

`@SuppressWarnings("deprecation")
onsiteWorker.oldBonusMethod();`  

## 🧪 Demonstration – Main Class
Class: RunMain
Instantiates both OnlineWorker and OnsiteWorker.
Invokes calculateSalary() for each.
Calls deprecated methods using @SuppressWarnings.
Demonstrates inheritance, method overriding, and the effect of static/constant values on salary computation.

## 🔍 Key OOP Concepts Demonstrated
Inheritance: Common behavior defined in Worker, extended by child classes.  
Polymorphism: calculateSalary() behaves differently depending on the subclass.  
Static Fields: Used for shared costs like gasoline.  
Constants: INTERNET_FLAT_RATE is defined as a fixed value.  
Annotations: Proper use of @Override and @SuppressWarnings.  

## 🛠️ How to Run
Clone the repository.  
Open the project using IntelliJ IDEA.  
Run the Main.java class located in the main package.

## 👨‍💻 Author
Developed by Daniel Caldito Serrano as part of the Java Back-end Development Bootcamp organized by IT Academy.