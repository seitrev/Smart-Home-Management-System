# Lab 05 – School Management System

## Description
This laboratory activity focuses on **object-oriented programming concepts of inheritance and aggregation** in Java.  
The task involves modeling a simple school management system where all people are considered `Person`s, and there are specific roles such as `Student` and `Teacher`.  
Teachers are associated with one or more `Course`s, demonstrating **HAS-A relationships**, while inheritance is demonstrated through `Student` and `Teacher` extending `Person` (IS-A relationship).  
The program applies constructors, the `super` keyword, and aggregation in a real-world context.

---

## Objectives
- Implement inheritance using the `extends` keyword  
- Differentiate IS-A and HAS-A relationships in class design  
- Demonstrate how aggregation works between related classes  
- Apply constructors and the `super` keyword in multilevel relationships  
- Design and test a Java application using both inheritance and aggregation concepts

---

## Concepts Applied
- Classes and objects  
- Inheritance (IS-A relationship)  
- Aggregation / composition (HAS-A relationship)  
- Constructors and the `super` keyword  
- Method overriding  
- Real-world OOP modeling

---

## Project Structure
Lab05-SchoolManagement/
├── src/
│ └── TeacherStudentAssignment.java
└── README.md

---


### File Description
- **TeacherStudentAssignment.java** – Contains all class definitions and the main method:
  - `Person` class: base class with `name`, `age`, `gender` and method `displayInfo()`  
  - `Student` class: extends `Person`, adds `studentId` and method `displayStudent()`  
  - `Teacher` class: extends `Person`, adds `department` and method `displayTeacher()`; aggregates one or more `Course` objects  
  - `Course` class: defines `courseCode`, `courseName` and method `displayCourse()`  
  - Main method demonstrates creating a student, a teacher, and courses, then displays information for all

---

## How to Run the Program
1. Save `TeacherStudentAssignment.java` in the `src` folder of your project.  
2. Open the project in a Java IDE (IntelliJ IDEA, Eclipse, or NetBeans).  
3. Run `TeacherStudentAssignment.java`.  
4. Observe the output displaying student information, teacher information, and course details.

---

## System Features
- **Student Management**
  - Stores student attributes and displays student information  
  - Inherits from `Person` to reuse common attributes

- **Teacher Management**
  - Stores teacher attributes and displays teacher information  
  - Aggregates multiple courses using an array or list  
  - Inherits from `Person` to reuse common attributes

- **Course Management**
  - Defines course code and name  
  - Displays course details  
  - Associated with teachers (HAS-A relationship)

- **Inheritance and Aggregation**
  - `Student` and `Teacher` are special types of `Person` (IS-A)  
  - `Teacher` contains one or more `Course` objects (HAS-A)  
  - Demonstrates constructor chaining using `super` keyword

---

## Notes
- The program models a simple school management system to practice OOP concepts  
- Demonstrates proper use of inheritance, aggregation, and constructors  
- Shows a real-world application of object-oriented principles in Java

