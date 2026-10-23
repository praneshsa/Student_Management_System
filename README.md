# Student Management System

## Project Overview
A console-based Student Management System developed using Java, Hibernate ORM, and MySQL to manage student records efficiently. The project demonstrates object-relational mapping and database operations using Hibernate.

## Features
- **Add Students:** Create and store student records.
- **View Students:** Retrieve and display student information.
- **Search Students:** Find students by ID, name, or marks.
- **Update Students:** Modify existing student details.
- **Delete Students:** Remove student records from the database.
- **Database Integration:** Use Hibernate ORM to interact with MySQL.

## Technologies Used
- Java
- Hibernate ORM
- MySQL
- HQL (Hibernate Query Language), where implemented
- IntelliJ IDEA

## Project Structure

```text
Student_Management_System/
└── src/
    ├── DTO/
    │   └── Student.java
    └── main/
        ├── Main.java
        └── StudentDAOImpl.java
```

*Adjust the structure above to match your actual source folders and class names.*

## Getting Started

### Prerequisites
- Java JDK
- MySQL Server
- IntelliJ IDEA
- Hibernate libraries and MySQL Connector/J

### Setup Instructions
1. Clone the repository:

   ```bash
   git clone https://github.com/praneshsa/Student_Management_System.git
   ```

2. Open the project in IntelliJ IDEA.
3. Create a MySQL database for the application.
4. Configure the database connection and Hibernate settings in `hibernate.cfg.xml`.
5. Ensure the required Hibernate and MySQL dependencies are available.
6. Run the main class to start the application.

## Learning Outcomes
- Practiced implementing CRUD operations using Hibernate.
- Learned entity mapping between Java classes and database tables.
- Gained experience writing database queries and managing transactions.
- Improved understanding of Java-based persistence applications.

## Author
**Pranesh S A**

GitHub: [@praneshsa](https://github.com/praneshsa)

---

*Developed as a learning project to practice Java, Hibernate ORM, and database management.*
