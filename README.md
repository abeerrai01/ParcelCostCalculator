Java Inheritance Example: Amazon Shipping Cost Calculation
Overview
This program demonstrates the concept of inheritance in Java by modeling a simple shipping calculation system for a fictional "Amazon" class hierarchy. The program calculates the shipping cost based on the volume and weight of a package.

Classes and Purpose
Amazon:

The base class with properties width, height, and depth representing the dimensions of a package.
Contains constructors to initialize these properties and a method vol() to calculate the volume of the package.
Order:

A subclass of Amazon that adds an additional property weight for the weight of the package.
Contains constructors to initialize the dimensions and weight.
Includes a method further() that computes a weighted volume based on the weight and volume of the package.
Shipment:

A subclass of Order that adds a property cost to represent the cost per unit of weighted volume.
Contains constructors to initialize dimensions, weight, and cost.
Includes a method cost() to compute and print the total cost of shipping based on the package's weighted volume.
Program Workflow
The user is prompted to input the dimensions (width, height, depth), weight, and cost per unit for a package.
An object of the Shipment class is created using these inputs.
The program computes the total shipping cost using the provided dimensions, weight, and cost rate.
The calculated shipping cost is displayed to the user.
Key Concepts
Inheritance: The program uses inheritance to extend the functionality of the base class (Amazon) into more specialized classes (Order and Shipment), demonstrating the "is-a" relationship in object-oriented programming.
Constructor Overloading: Each class provides multiple constructors to initialize objects either by copying from another object or by using specific values.
Encapsulation: The use of private attributes and public methods encapsulates the internal data, exposing only what is necessary to other classes or the user.
Purpose
The purpose of this program is to illustrate how inheritance and object-oriented principles can be used to model a real-world scenario, such as calculating the shipping cost of a package based on its dimensions and weight.

Usage
Compile and run the program in a Java-supported environment. Input the required dimensions, weight, and cost rate when prompted. The program will output the total amount to be paid for shipping.
