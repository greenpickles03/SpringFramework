# Spring Framework Project

This project demonstrates a basic **Spring Boot** application structure following best practices such as **Controller-Service-Repository pattern**, **DTO usage**, and **Global Exception Handling**.

---

## 📁 Project Structure

```
src/main/java
└── com.springframework.Spring.Framework
    ├── controller
    │   └── UserController
    ├── dto
    │   └── UserDTO
    ├── handler
    │   └── GlobalExceptionHandler
    ├── model
    │   └── User
    ├── repository
    │   └── UserRepository
    ├── service
    │   ├── UserService
    │   └── UserServiceImp
    ├── ServletInitializer
    └── SpringFrameworkApplication

src/main/resources
└── application.yaml
```

---

## ✅ Features

* **REST API** for user operations
* **DTO pattern** for clean data transfer
* **Service layer abstraction**
* **Repository pattern** using Spring Data JPA
* **Global Exception Handling** to manage API errors
* **YAML configuration** for cleaner setup

---

## 📌 Layer Responsibilities

### **Controller Layer**

Handles incoming REST requests and returns responses.

* `UserController`: Manages user endpoints.

### **DTO Layer**

Used to expose safe and structured response/request bodies.

* `UserDTO`

### **Service Layer**

Contains business logic.

* `UserService`
* `UserServiceImp`

### **Repository Layer**

Handles persistence logic.

* `UserRepository`

### **Model Layer**

Represents database entities.

* `User`

### **Exception Handler**

Centralized error processing.

* `GlobalExceptionHandler`

---

## ▶️ Running the Application

1. Make sure you have **Java 17+** and **Maven** installed.
2. Navigate to project folder:

```bash
mvn spring-boot:run
```

3. Application starts at:
   `http://localhost:8080`

---

## 🛠 Technologies Used

* Spring Boot
* Spring MVC
* Spring Data JPA
* Maven
* Java
* YAML Configuration

---

## 🧪 Testing

Run:

```bash
mvn test
```

---

## 📄 License

This project is for educational and personal development purposes.
