# Proyecto DTO - Spring Boot

## Descripción
API REST desarrollada en Spring Boot que implementa el patrón DTO (Data Transfer Object) para controlar la información enviada y recibida por el sistema. El proyecto gestiona usuarios asegurando que información sensible como la contraseña nunca sea expuesta en las respuestas.

## Tecnologías utilizadas
- Java 21
- Spring Boot 4.x
- Spring Web
- Spring Data JPA
- MySQL
- Postman (pruebas)

## Estructura del proyecto
com.usuarios
├── controlador
│   └── UsuarioController.java
├── modelo
│   ├── dto
│   │   ├── UsuarioDTO.java
│   │   └── UsuarioResponseDTO.java
│   ├── entidad
│   │   └── Usuario.java
│   ├── repositorio
│   │   └── UsuarioRepositorio.java
│   └── servicio
│       └── UsuarioServicio.java
└── UsuariosApplication.java
## Patrón DTO aplicado
El patrón DTO separa la información que viaja entre las capas de la aplicación.

- **UsuarioDTO** — objeto de entrada para registrar usuarios (contiene password)
- **UsuarioResponseDTO** — objeto de salida para listar usuarios (sin password)

### Flujo de la aplicación

Cliente (Postman)
↓
UsuarioController
↓
UsuarioDTO / UsuarioResponseDTO
↓
UsuarioServicio
↓
UsuarioRepositorio
↓
MySQL (usuarios_db)