# An application with recipes.
Select entities.  
Define properties.  
Endow an entity with actions.

In this application there will be a list of dishes divided into categories.  
There will be cooking instructions for the recipe. You can add it to your  
favorites or send it to someone from your contacts.  
Added work with the primary and secondary constructors.

# Application for classifying fictional spaceships.
Designing a hypothetical application for classifying fictional spaceships.  
We need to describe entities in the form of classes.  
Basic properties and methods.  

All ships will have properties such as:
* name
* speed
* unmanned
 
There are methods:
* switch to warp mode
* run system diagnostics

Ships are divided into types:
* scout
* industrial

# Abstract class and Space Shuttle interface.
Let`s make an abstract Space Shuttle class and interfaces to it.

# Encapsulation and access modifiers.
* public
* private
* protected
* internal

# Setters and Getters.
Setters and Getters, field, how to customize them.

# Polymorphism.
Polymorphism is when one interface is used for different types.

Polymorphism is about the fact that we can supply parameters  
of different types to one condition function.

There are 3 types of polymorphism:
1. Ad hoc.
2. Subtyping.
3. Parametric.

## Ad hoc.
When one function is defined for different data types.

Several function are prescribed in the class that take different  
parameters.

When calling this function, the compiler determines which function  
will work by the number and types of parameters passed.

The disadvantage of this approach is that you need to make many  
implementations of this function.

## Subtyping.
This is an implementation through the substitution  
principle of Barbara Liskov.

This is one of the principle of OOP from the abbreviation SOLID.

Function that use the base type should be able to use subtype of the  
base type without knowing about it.

That is, an object of a narrower type can always be used where  
an object of a wider type can be used.

It is implemented using inheritance.

# ENUM, TODO() and the Nothing type.
ENUM enumeration classes.

# Circle class.
Create a Circle class with two properties: radius of type Double  
and area of type Double.

The program should:
1. Read the radius of the circle from the standard input.
2. Create an instance of the Circle class with a given radius.
3. Calculate the area of the circle.
4. Output the radius and area of the circle to the standard output.

# Student Class.
Create a student class with two properties: name of type String  
and age of type Int. Implement an auxiliary constructor that will  
take the student's name and age and initialize the corresponding  
properties.

The program should:
1. Read the number of students from the standard input.
2. Read student data (name and age) from the standard input.
3. Create a list of students.
4. Display the names and ages of students on the screen.

# Singleton Logger
Create a Singleton object named Logger, which will be used  
for logging messages.

Implement the log (message: String) method, which will output  
the messages to the console.

The program must:
1. Read the number of logs from the standard input.
2. Read logging message from standard input.
3. Use the Logger object to log messages.
4. Output each message in the Log: <message> format.
