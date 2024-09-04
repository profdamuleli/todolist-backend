# To-Do List Web App

## Description

This is a simple to-do list web application built with ReactJS for the frontend, Spring Boot for the backend, and PostgreSQL for the database. Users can create, read, update, and delete to-do items.

## Technologies Used

- **Frontend:** ReactJS
- **Backend:** Spring Boot
- **Database:** PostgreSQL

## Getting Started

### Prerequisites

- [Java 11+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)
- [Node.js](https://nodejs.org/)
- [PostgreSQL](https://www.postgresql.org/)

### Setup

#### Backend Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your_username/your_repository_name.git
   cd your_repository_name/spring-boot-project

2. Update the PostgreSQL configuration in `src/main/resources/application.properties`:
   ```bash
   spring.datasource.url=jdbc:postgresql://localhost:5432/todolist
   spring.datasource.username=your_username
   spring.datasource.password=your_password

3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
