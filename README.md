# Subject Management CRUD Application

## Overview
This is a Spring Boot based RESTful application that performs CRUD (Create, Read, Update, Delete) operations on subjects.  
Each subject has a subject code and subject name. The application uses REST APIs and a MySQL database.

---

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

---

## Features
- Add a new subject
- View all subjects
- Update subject details
- Delete a subject
- REST API tested using Postman

---

## REST API Endpoints
- **POST** `/subjects` → Add subject  
- **GET** `/subjects` → Get all subjects  
- **PUT** `/subjects/{id}` → Update subject  
- **DELETE** `/subjects/{id}` → Delete subject  

---

## How to Run
1. Start MySQL and create database `subjectdb`
2. Update database credentials in `application.properties`
3. Run the application:
   ```bash
   mvn spring-boot:run
