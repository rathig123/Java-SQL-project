# Java-SQL-project

📘 Student Management System (Java + SQLite)

A simple Java console-based application that performs CRUD operations (Create, Read, Update, Delete) on student records using SQLite database and JDBC.

This project demonstrates:

Java Core (OOP, classes, objects)

JDBC Database Connectivity

SQLite database usage

Simple console-based UI (menu-driven)

📂 Project Structure
StudentProject/
 ├── Main.java
 ├── Student.java
 ├── StudentDAO.java
 ├── DBConnection.java
 ├── students.db              # Auto-created SQLite database
 └── lib/
      └── sqlite-jdbc-3.51.0.0.jar

🚀 Features

✔ Add new student
✔ Store marks and subjects
✔ View all students
✔ Auto-create database
✔ Uses SQLite (no installation required)
✔ Fully menu-driven

🛠️ Technologies Used

Java 8+

SQLite Database

JDBC Driver (sqlite-jdbc)

📥 How to Run the Project
1️⃣ Compile the project

Linux / Mac / GitHub Codespaces:

javac -cp ".:lib/sqlite-jdbc-3.51.0.0.jar" *.java


Windows:

javac -cp ".;lib/sqlite-jdbc-3.51.0.0.jar" *.java

2️⃣ Run the project

Linux / Mac / GitHub Codespaces:

java -cp ".:lib/sqlite-jdbc-3.51.0.0.jar" Main


Windows:

java -cp ".;lib/sqlite-jdbc-3.51.0.0.jar" Main

🧰 SQLite Database

The database file:

students.db


is automatically created when the application runs for the first time.