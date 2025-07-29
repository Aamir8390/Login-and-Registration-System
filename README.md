# 🛡️ Login & Registration System

A full-stack ready backend project for **user authentication**, developed using **Spring Boot** and **PostgreSQL**. This system allows users to register and log in securely with encrypted credentials. It’s designed with a modular structure, making it easy to connect with any frontend client or API testing tool like Postman.

---

## 📚 Table of Contents

- [📌 Introduction](#-introduction)
- [✨ Features](#-features)
- [🧰 Tech Stack](#-tech-stack)
- [⚙️ Installation](#️-Installation)
- [🧩 Future Improvements](#-future-improvements)
- [📁 Project Structure](#-project-structure)
- [📄 License](#-license)

---

## 📌 Introduction

This project is a **Login and Registration System** built with Spring Boot, designed to provide secure and RESTful user authentication services. The backend handles:
- Secure password storage (BCrypt)
- Registration validation
- Login authentication
- Database integration with PostgreSQL

It’s ideal for beginners in Java and Spring Boot who want hands-on experience building authentication systems.

---

## ✨ Features

- ✅ Register new users with validation
- ✅ PostgreSQL database integration
- ✅ REST API structure (no frontend dependency)
- ✅ Spring Boot auto-configuration
- ✅ Testable using Postman or frontend UI
- ✅ Modular code structure (MVC)

---

## 🧰 Tech Stack

| Layer       | Technology         |
|-------------|--------------------|
| Language    | Java 17+           |
| Framework   | Spring Boot        |
| Database    | PostgreSQL         |
| ORM         | Spring Data JPA    |
| Security    | BCrypt (Spring Security Crypto) |
| API Testing | Postman            |
| Build Tool  | Maven / Gradle     |

---
## Demo
You can view live demo here :- 
## Getting Started

Prerequisites

- Java 17+ (or relevant version)

- Maven or Gradle

- Database server (MySQL/PostgreSQL) or use in-memory H2 for testing
---




## Installation

**1.Clone the repository**

```bash
git clone https://github.com/Aamir8390/Login-and-Registration-System 

```
**2.Configure database**
``` bash
Update src/main/resources/application.yaml with DB connection info.
```

**3.Build the project**
``` bash

mvn clean install

```
or (if you use Gradle)
``` bash
./gradlew build

```
**4.Run the application**
``` bash
mvn spring-boot:run
```
or

``` bash
java -jar target/your-jar-name.jar
```
**The server starts at http://localhost:8080**
## Future Improvements
- JWT-based Authentication

- Secure Password Hashing (BCrypt)
## Project Structure
```
LoginAndRegistration
│
├── src/main/java/com/example/
│   ├── controllers
│   ├── model
│   ├── repositories
│   ├── services
│   └── security
├── src/main/resources/
│   └── application.yaml
├── pom.xml / build.gradle
└── README.md
```
## License
This project is licensed under the MIT License

---

