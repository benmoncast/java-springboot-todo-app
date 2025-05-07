# Java Spring Boot TODO List App

A simple TODO List web application built with **Java Spring Boot**, **Thymeleaf**, and **in-memory data storage**. The app allows users to create, view, update, and delete tasks with details such as the task name, description, person in charge, target date, and status.

---

## 📋 Table of Contents

- [Features](#-features)  
- [Project Structure](#-project-structure)  
- [Configuration](#-configuration)  
- [Getting Started](#-getting-started)  
  - [Prerequisites](#prerequisites)  
  - [Run Locally](#run-locally)  
- [Endpoints](#-endpoints)  
- [Technologies Used](#-technologies-used)  
- [Sample Data](#-sample-data)  
- [Model Overview](#-model-overview)  
- [Author](#-author)  
- [License](#-license)

---

## 🛠️ Features

- ✅ List all TODO items  
- ➕ Add new tasks  
- ✏️ Edit existing tasks  
- ❌ Delete tasks  
- 🧠 In-memory storage (no database required)  
- 🎨 Uses Thymeleaf for server-side rendering  

---

## 📁 Project Structure

```
todo-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── benmoncast/com/todo_app/
│   │   │       ├── controller/
│   │   │       │   └── TodoController.java
│   │   │       ├── repository/
│   │   │       │   └── TodoRepository.java
│   │   │       └── todo/
│   │   │           └── Todo.java
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── index.html
│   │       │   └── form.html
│   │       └── application.properties
├── pom.xml
└── README.md
```

---

## 🔧 Configuration

`src/main/resources/application.properties`:

```properties
spring.application.name=todo-app
server.port=8080
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
spring.thymeleaf.cache=false
```

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven

### Run Locally

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/java-springboot-todo-list-app.git
   cd java-springboot-todo-list-app
   ```

2. **Build and run the application:**
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Access the app:**
   Open your browser and visit [http://localhost:8080](http://localhost:8080)

---

## 🌐 Endpoints

| Method | Endpoint      | Description         |
|--------|---------------|---------------------|
| GET    | `/`           | List all tasks      |
| GET    | `/add`        | Show add task form  |
| POST   | `/save`       | Save new/updated task |
| GET    | `/edit/{id}`  | Edit existing task  |
| GET    | `/delete/{id}`| Delete a task       |

---

## 📚 Technologies Used

- Java 17  
- Spring Boot  
- Spring MVC  
- Thymeleaf  
- Maven  

---

## 🧪 Sample Data

Initial tasks are automatically created on application startup using `@PostConstruct` in `TodoRepository.java`:

```
1. Write Docs - In Progress  
2. Fix Bugs - Not Started  
3. Deploy App - Completed  
```

---

## 📂 Model Overview

### `Todo.java` Fields

| Field          | Type      | Description             |
|----------------|-----------|--------------------------|
| `id`           | int       | Unique task identifier   |
| `name`         | String    | Task title              |
| `description`  | String    | Task description        |
| `personInCharge`| String   | Assigned team member    |
| `targetDate`   | LocalDate | Target completion date  |
| `status`       | String    | Task status (`Not Started`, `In Progress`, `Completed`) |

---

## 📄 Author

**Benedict M. Castro**  
🔗 [LinkedIn](https://www.linkedin.com/in/benedictmcastro)  
💻 [GitHub](https://github.com/benmoncast)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 📸 Screenshots (Optional)

_Add screenshots of the app's main UI pages here._

---

### 📌 Notes

- Data is stored in memory and will reset after restarting the application.
- Add database integration (e.g., MySQL or H2) if persistent storage is required.
