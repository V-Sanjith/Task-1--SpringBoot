# Task 1 - Spring Boot Task Runner API

## Overview

This project is a **Task Runner API** built using **Spring Boot**, **MongoDB**, and **JWT-based authentication**. It allows users to manage tasks with features like creation, updating, deletion, and viewing. The API is secured using Spring Security and JWT tokens.

---

## Features

* **User Authentication**: Login and register users with JWT.
* **Task Management**: Create, read, update, and delete tasks.
* **MongoDB Integration**: Stores user and task data.
* **Spring Boot Security**: Secures API endpoints.
* **RESTful API**: Clean and structured endpoints.

---

## Technologies Used

* Java 17
* Spring Boot 3.3.4
* Spring Data MongoDB
* Spring Security
* JWT (JSON Web Token)
* Maven for build management
* MongoDB Atlas (cloud database)

---

## Prerequisites

* Java 17 installed
* Maven installed
* MongoDB Atlas account (or local MongoDB)
* Postman or any API client to test endpoints

---

## Configuration

1. Rename `application.properties.example` to `application.properties`.
2. Update MongoDB connection string:

   ```properties
   spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster0.mongodb.net/
   spring.data.mongodb.database=taskdb
   ```
3. JWT configuration:

   ```properties
   jwt.secret=MySuperSecretKey12345
   jwt.expiration=86400000
   ```
4. Server port (optional):

   ```properties
   server.port=8080
   ```

---

## Running the Project

1. **Clone the repository**

   ```bash
   git clone https://github.com/V-Sanjith/Task-1--SpringBoot.git
   cd Task-1--SpringBoot
   ```
2. **Build the project**

   ```bash
   mvn clean install
   ```
3. **Run the Spring Boot application**

   ```bash
   mvn spring-boot:run
   ```
4. Application will start at `http://localhost:8080`

   <img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/9d1018db-5672-4986-9095-2bd4773f0b21" />
   <img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/244d5e3e-878a-430c-a458-a3cc8b596f2f" />



---

## API Endpoints

* **POST /api/auth/register** - Register a new user
* **POST /api/auth/login** - Login and get JWT token
* **GET /api/tasks** - Get all tasks (requires JWT)
* **POST /api/tasks** - Create a new task (requires JWT)
* **PUT /api/tasks/{id}** - Update task by ID (requires JWT)
* **DELETE /api/tasks/{id}** - Delete task by ID (requires JWT)

---

## Notes

* Make sure your **MongoDB Atlas cluster** is running and IP access is allowed.
* Use **Postman** or similar tools to test the API.
* JWT token must be included in **Authorization header** as `Bearer <token>`.
