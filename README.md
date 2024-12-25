# InventoryManagement


# Spring Boot CRUD API for Inventory Management
## Overview
This project is a Spring Boot application that demonstrates CRUD (Create, Read, Update, Delete) operations for managing items in a MySQL database.

## Features
- RESTful API Endpoints
- MySQL database integration
- Full CRUD functionality
- Structured project with services, repositories, and controllers

---

## Setup Instructions

### Prerequisites
1. **Java**: Ensure you have Java 11 or later installed.
2. **Maven**: Install Maven for building and managing the project.
3. **MySQL**: Install and configure MySQL.

### Steps
1. Clone this repository:
   git clone [https://github.com/your-repo-url.git](https://github.com/Chaudhary-Kirti/InventoryManagement.git)

2. Navigate to the project directory:
   cd your-project-directory
   
3. Configure the database in src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

4. Run the application:
   ./mvnw spring-boot:run


API Endpoints
1. Create a New Item
URL: http://localhost:8080/items
Method: POST
Request Body:
   {
        "name": "Laptop",
        "price": 999,
        "quantity": 30,
        "description": "Personal computer"
    },
Response:

    {
        "id": 52,
        "name": "Laptop",
        "price": 999,
        "quantity": 30,
        "description": "Personal computer"
    },


Retrieve All Items
URL: http://localhost:8080/items
Method: GET

Retrieve an Item by ID
URL: /items/{id}
Method: GET
Path Parameter: id (e.g., /items/1

Update an Item
URL: /items/{id}
Method: PUT
Path Parameter: id (e.g., /items/1)

Delete an Item
URL: /items/{id}
Method: DELETE
Path Parameter: id (e.g., /items/1)


Using Postman:
Open Postman.
Set the request method and URL.
Provide request parameters or body (if needed).
Send the request and view the response.


Technologies Used
Java: Programming language.
Spring Boot: Framework for building RESTful APIs.
MySQL: Relational database.
Maven: Dependency and build management.




