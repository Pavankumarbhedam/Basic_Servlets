# Login Servlet Project

This project is a basic implementation of a login system using Java Servlets and MySQL. The `LoginServlet` processes user login requests by validating the username and password against stored records in the database.

## Features

- Handles login requests using HTTP POST or GET.
- Connects to a MySQL database to verify user credentials.
- Redirects users based on the login outcome:
  - **Correct credentials**: Redirects to the "correct" page.
  - **Incorrect credentials**: Redirects to the "incorrect" page.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- Apache Tomcat or any other servlet container.
- MySQL database server.
- Git (optional, for version control).

File Structure:

      Basic_Servlets/
      ├── src/
      │   └── com/
      │       └── pavan/
      │           └── LoginServlet.java
      ├── WEB-INF/
      │   ├── web.xml
      │   └── classes/
      └── README.md


## Database Setup

1. Create a database named `pavan` in MySQL.
2. Create a table named `login` with the following structure:
   ```sql
   CREATE TABLE login (
       username VARCHAR(50) PRIMARY KEY,
       password VARCHAR(50)
   );
3.Insert sample data into the login table:
   INSERT INTO login (username, password) VALUES ('testuser', 'testpass');

   
HOW TO RUN :
1.Clone this repository:
    git clone https://github.com/Pavankumarbhedam/Basic_Servlets.git
2.Open the project in your favorite IDE (e.g., Eclipse).
3.Configure your MySQL database credentials in "LoginServlet.java":
   String url = "jdbc:mysql://localhost:3306/pavan"; 
   String user = "root"; 
   String pass = "1618";
4.Build and deploy the project to your servlet container.

