# 📦 Microservicio de Envíos

Microservicio de gestión de envíos desarrollado con **Spring Boot**, conectado a una base de datos **Oracle XE** ejecutándose en **Docker**, con funcionalidades completas **CRUD**, validaciones automáticas y manejo global de excepciones.

---

## 🚀 Tecnologías utilizadas

- Java 21  
- Spring Boot 3.2.12  
- Spring Data JPA  
- Oracle XE 21c (Docker)  
- Docker Desktop  
- Git & GitHub  
- Visual Studio Code  

---

## ⚙️ Configuración de la base de datos

Este microservicio se conecta a una base de datos Oracle XE que debe estar en ejecución dentro de un contenedor Docker. La configuración actual del archivo `application.properties` es la siguiente:

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XEPDB1
spring.datasource.username=system
spring.datasource.password=admin123
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
✅ Funcionalidades implementadas
CRUD completo para entidades: Envio, Usuario, Paquete.

Validaciones con anotaciones @Valid y javax.validation.constraints.

Control global de excepciones con @ControllerAdvice.

Manejo de relaciones con @ManyToOne entre entidades.

Respuestas HTTP claras para errores y validaciones.

Inicialización automática de tablas con Hibernate.

📂 Estructura del proyecto
matlab
Copiar
Editar
envios-service/
├── controller/
│   ├── EnvioController.java
│   ├── UsuarioController.java
│   └── PaqueteController.java
├── entity/
│   ├── Envio.java
│   ├── Usuario.java
│   └── Paquete.java
├── repository/
│   ├── EnvioRepository.java
│   ├── UsuarioRepository.java
│   └── PaqueteRepository.java
├── exception/
│   ├── GlobalExceptionHandler.java
│   └── CustomNotFoundException.java
├── resources/
│   └── application.properties
└── EnviosServiceApplication.java
🧪 Pruebas de funcionamiento
Las pruebas básicas del servicio se realizan ejecutando el proyecto desde tu entorno local y utilizando herramientas como Postman o VSCode HTTP Client. Se puede probar cada endpoint CRUD para las tres entidades.
✅ EnvioController (/envios)EnvioController
GET /envios → Obtener todos los envíos.

GET /envios/{id} → Obtener un envío por ID.

POST /envios → Crear un nuevo envío.

PUT /envios/{id} → Actualizar un envío existente.

DELETE /envios/{id} → Eliminar un envío por ID.

✅ UsuarioController (/usuarios)UsuarioController
GET /usuarios → Obtener todos los usuarios.

GET /usuarios/{id} → Obtener un usuario por ID.

POST /usuarios → Crear un nuevo usuario.

✅ PaqueteController (/paquetes)PaqueteController
GET /paquetes → Obtener todos los paquetes.

GET /paquetes/{id} → Obtener un paquete por ID.

POST /paquetes → Crear un nuevo paquete.


