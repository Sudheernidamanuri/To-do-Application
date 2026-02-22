# <p align="center">🌍 Todo Application</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" alt="Java 21">
  <img src="https://img.shields.io/badge/Spring_Boot-3.3.5-green?style=for-the-badge&logo=springboot" alt="Spring Boot 3">
  <img src="https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql" alt="MySQL">
  <img src="https://img.shields.io/badge/Bootstrap-5.3-purple?style=for-the-badge&logo=bootstrap" alt="Bootstrap 5">
</p>

<p align="center">
  <b>A professional and aesthetically pleasing Todo application built with Spring Boot, Java 21, and MySQL.</b><br>
  <i>Features a responsive, journal-inspired web interface with smooth animations and full CRUD capabilities.</i>
</p>

---

### 🚀 Key Features
- **✨ Dynamic Task Management**: Create, view, toggle (complete/undo), and delete tasks instantly.
- **🎨 Responsive UI**: A modern "Earth-Toned" journal interface using Bootstrap 5 and custom CSS animations.
- **💾 State Persistence**: Robust data persistence using MySQL and Spring Data JPA.
- **⚡ Real-time Feedback**: Interactive hover effects and status-based styling (strike-through for completed tasks).
- **🌱 Server-Side Rendering**: Optimized dynamic content delivery using Thymeleaf templates.

---

### 🛠 Tech Stack

<details open>
<summary><b>Click to toggle Stack Details</b></summary>

| Category      | Technology |
|--------------|------------|
| **Backend**   | `Java 21`, `Spring Boot 3.3.5`, `Spring Data JPA` |
| **Frontend**  | `Thymeleaf`, `Bootstrap 5`, `Bootstrap Icons`, `CSS3` |
| **Database**  | `MySQL 8.0+` |
| **Tools**     | `Maven`, `Lombok`, `Spring Boot DevTools` |

</details>

---

### 🏗 Architecture Overview
The project follows a standard **Layered Architecture** (part of the MVC pattern):

1.  **🎮 Controller Layer (`TaskController`)**: Handles HTTP requests, manages routing, and interfaces with the Service layer.
2.  **⚙️ Service Layer (`TaskService`)**: Contains business logic (e.g., toggling task status) and mediates between the Controller and Repository.
3.  **📦 Repository Layer (`TaskRepository`)**: Data access layer using Spring Data JPA for CRUD operations on the MySQL database.
4.  **💾 Model Layer (`Task`)**: Represents the JPA Entity mapped to the database table.
5.  **🖼 View Layer (Thymeleaf)**: Server-side rendered HTML templates with dynamic data binding.

---

### 📂 Project Structure
```text
todoapp/
├── src/
│   ├── main/
│   │   ├── java/com/app/todoapp/
│   │   │   ├── controller/    # Web Request Handlers
│   │   │   ├── model/         # JPA Entities
│   │   │   ├── repository/    # Data Access Objects
│   │   │   └── service/       # Business Logic
│   │   └── resources/
│   │       ├── templates/     # Thymeleaf HTML files
│   │       └── application.properties # Configuration
├── pom.xml                    # Maven Dependencies
└── mvnw                       # Maven Wrapper
```

---

### 🗄 Database Setup
1.  **Install MySQL**: Ensure MySQL Server is running on your machine.
2.  **Create Database**:
    ```sql
    CREATE DATABASE todo_db;
    ```
3.  **Configure Credentials**: Update `src/main/resources/application.properties`:
    ```properties
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```

---

### 🏁 Getting Started

#### Prerequisites
- **Java 21** or higher
- **Maven** (or use the provided `./mvnw`)
- **MySQL**

#### Local Run
1.  Clone the repository.
2.  Ensure your MySQL service is active.
3.  Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  Access the app: [http://localhost:8080](http://localhost:8080)

---

### 🔌 API Endpoint Summary

| Method | Endpoint      | Description                  |
|--------|---------------|------------------------------|
| `GET`    | `/`           | View all tasks               |
| `POST`   | `/`           | Create a new task            |
| `GET`    | `/{id}/toggle`| Toggle task completion status|
| `GET`    | `/{id}/delete`| Delete a task                |

---

### 🛡 Security
- **Current State**: The application does not currently implement authentication or authorization (Public Access).
- **Recommendations**: For production use, integrate **Spring Security** with OAuth2 or JWT-based authentication.

---

### 🧠 Design Decisions & Trade-offs
- **Thymeleaf vs. SPA**: Chose Thymeleaf for server-side rendering to reduce architectural complexity and SEO overhead, as the app is a productivity tool where fast initial load and simplicity are valued.
- **Bootstrap 5 & Custom CSS**: Leveraged Bootstrap for layout but heavily customized the CSS with `@keyframes` (`sandDrift`, `floatCard`) to provide a unique, high-end "Journal" feel.
- **Lombok**: Integrated Lombok to reduce boilerplate code in the `Task` model, keeping the entity clean and readable.

---

### 🔮 Future Improvements
- [ ] 🔑 Add User Accounts (Spring Security).
- [ ] 🏷 Implement Task Categories and Labels.
- [ ] 📅 Add Due Dates and Priority Levels.
- [ ] 🔍 Implement Search and Filter functionality.
- [ ] 📱 Add a REST API layer for mobile app integration.

---

### 👨‍💻 Author
**Sudheer Nidamanuri** - *Senior Software Architect*

### 📄 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
