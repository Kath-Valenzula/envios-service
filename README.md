# 📦 envios-service

Microservicio de gestión de envíos desarrollado con **Spring Boot**, conectado a base de datos **Oracle XE** en **Docker**, con funcionalidades completas CRUD (Create, Read, Update, Delete), validaciones automáticas y control global de excepciones.

---

## 🚀 Tecnologías utilizadas
- Java 21
- Spring Boot 3.2.12
- Spring Data JPA
- Oracle XE 21c (en contenedor Docker)
- Docker Desktop
- Maven
- Git / GitHub
- Visual Studio Code

---

## ⚙️ Configuración de la base de datos
El microservicio se conecta a una base Oracle XE que debe estar corriendo en Docker.  
Configuración utilizada en `application.properties`:

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XEPDB1
spring.datasource.username=system
spring.datasource.password=admin123
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
