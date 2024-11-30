# Nimap_Assessment
This repository contains a simple Spring Boot application designed to demonstrate basic CRUD operations using Spring Data JPA, Hibernate, and MySQL.

Features
Spring Boot 3: Uses Spring Boot 3 for easy configuration and application management.
Spring Data JPA: Provides an abstraction layer over Hibernate for database operations.
MySQL Integration: Configured to work with a MySQL database using HikariCP as a connection pool.
Simple CRUD Operations: Implements basic create, read, update, and delete operations for entities in the database.
Prerequisites
Before running the application, make sure you have the following:

Java 17 or later: The application is built with Java 23.
MySQL Database: Set up MySQL locally or remotely. Ensure a database is created (e.g., cpdatabase) and configured correctly.
Setup
Clone the repository:

bash
Copy code
git clone https://github.com/Shivansh73/demo-application.git
cd demo-application
Configure the MySQL database: In src/main/resources/application.properties, update the following properties with your MySQL credentials:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/cpdatabase
spring.datasource.username=root
spring.datasource.password=Lnct@2024
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
Install dependencies: If you’re using Maven:

bash
Copy code
mvn clean install
Run the application: Once the setup is complete, you can run the Spring Boot application with:

bash
Copy code
mvn spring-boot:run
Alternatively, you can run the application directly using the Java command:

bash
Copy code
java -jar target/demo-application.jar
The application will start on port 8080 by default.


API Endpoints
POST /api/categories : Create a new product.
GET /api/categories?page=3: Retrieve all products.
GET /api/categories/{di}: Retrieve a product by ID.
PUT /api/categories/{di}: Update a product by ID.
DELETE /api/categories/{di}: Delete a product by ID.


POST /api/products: Create a new product.
GET /api/products: Retrieve all products.
GET /api/products/{id}: Retrieve a product by ID.
PUT /api/products/{id}: Update a product by ID.
DELETE /api/products/{id}: Delete a product by ID.


Running Tests
To run tests, use the following command:

bash
Copy code
mvn test
Troubleshooting
Error: Unknown database 'cpdatabase': Ensure that your MySQL database is created and the connection properties are correctly set in application.properties.

Error: Unable to determine Dialect: Ensure that you have set the correct database URL and dialect in application.properties.

Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.





