# 🚀 Backend API

A scalable backend application built with Spring Boot, designed with clean architecture principles, RESTful APIs, and modern backend development practices.

This project focuses on performance, maintainability, and production-ready deployment workflows using CI/CD automation.

### Note: The backend is hosted on Render's free tier, so it may take up to ~1 minute to wake up after a period of inactivity. Once awake, the application should respond normally.

---

## ✨ Overview

The backend handles core application logic, API communication, and data management through a modular and scalable architecture.

The application emphasizes:

* Clean and maintainable code structure
* RESTful API development
* Secure and efficient backend architecture
* Scalable service-layer organization
* Automated deployment workflows
* Containerized deployment using Docker
* Production-ready configuration

---

## ⚡ Key Features

* 🛠️ RESTful API architecture
* 🔐 Secure backend configuration
* 🧩 Layered architecture design
* 📦 Modular and maintainable codebase
* ⚡ Fast application startup with Spring Boot
* 🗄️ Database integration using JPA/Hibernate
* 🐳 Dockerized application deployment
* 🚀 Automated CI/CD deployment pipeline
* 🌍 Production deployment on Render
* ☁️ Managed PostgreSQL database with Supabase

---

## 🛠️ Tech Stack

* Java – Core programming language
* Spring Boot – Backend framework
* Spring Web – REST API development
* Spring Data JPA – Database interaction
* Hibernate – ORM framework
* Maven / Gradle – Dependency management
* PostgreSQL – Relational database
* Docker – Containerization platform
* Docker Hub – Container image registry
* GitHub Actions – CI/CD automation
* Render – Cloud deployment platform
* Supabase – Hosted PostgreSQL database

---

## 🔄 CI/CD Pipeline

This project uses a CI/CD workflow for automated build and deployment.

### Continuous Integration

On every push to the repository:

* Dependencies are installed
* The project is built using Maven
* Build validation checks are executed
* Application integrity is verified
* Docker image is generated automatically
* Docker image is pushed to Docker Hub

### Continuous Deployment

After successful builds:

* Render pulls the latest Docker image from Docker Hub
* The backend application is redeployed automatically
* Production updates are applied seamlessly
* Deployment workflow ensures reliable and consistent releases

---

## 🐳 Docker Deployment Workflow

The application follows a container-based deployment workflow:

1. Source code is pushed to GitHub
2. GitHub Actions builds the Spring Boot application
3. A Docker image is created using the Dockerfile
4. The image is pushed to Docker Hub
5. Render pulls the latest image from Docker Hub
6. The container is deployed automatically in production

This workflow improves deployment consistency, scalability, and portability across environments.

---

## 🗄️ Database

The application uses PostgreSQL hosted on Supabase for production data management.

### Database Features

* Managed PostgreSQL infrastructure
* Secure cloud-hosted database
* Reliable backups and availability
* Scalable production-ready environment
* Seamless integration with Spring Data JPA and Hibernate

---

## 🌍 Deployment

The application is deployed on Render using Docker-based deployment workflows.

### Production Infrastructure

* Backend hosting on Render
* Docker image registry via Docker Hub
* PostgreSQL database hosted on Supabase
* Automated CI/CD using GitHub Actions

---

## 📄 License

This project is open source and available under the MIT License.
