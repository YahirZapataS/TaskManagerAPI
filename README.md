# API TaskManager

La API TaskManager proporciona un sistema de gestión de tareas simple y eficiente, desarrollado con Spring Boot y MongoDB. Permite a los usuarios realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre tareas individuales, gestionando fácilmente sus listas de quehaceres.

## Características principales

- **Operaciones CRUD**: Crear, Leer, Actualizar y Eliminar tareas.
- **Autenticación básica**: Requiere autenticación para asegurar las operaciones.
- **Documentación automática**: Utiliza Swagger/OpenAPI para documentar y probar la API fácilmente.
- **Despliegue en Docker**: Facilita el empaquetado y despliegue en contenedores Docker.
- **Integración continua**: Implementado con Jenkins para integración y despliegue continuo.

## Tecnologías utilizadas

- **Spring Boot**: Framework para aplicaciones Java basadas en Spring.
- **MongoDB**: Base de datos NoSQL para almacenar datos de las tareas.
- **Lombok**: Reduce el código boilerplate en las clases Java.
- **MapStruct**: Para mapeo de objetos entre capas del sistema.

## Diagrama de Despliegue

![Diagrama de Despliegue](deployment-diagram.png)

## Documentación

Para más detalles sobre cómo usar la API, consulta la documentación generada automáticamente con Swagger. La API proporciona endpoints RESTful para realizar las siguientes operaciones:

- **POST `/tasks`**: Crea una nueva tarea.
- **GET `/tasks`**: Obtiene todas las tareas.
- **GET `/tasks/{id}`**: Obtiene una tarea específica por su ID.
- **PUT `/tasks/{id}`**: Actualiza una tarea existente.
- **DELETE `/tasks/{id}`**: Elimina una tarea por su ID.

## Uso

1. Clona el repositorio: `git clone https://github.com/tu-usuario/taskmanager.git`
2. Construye la aplicación: `mvn clean package`
3. Ejecuta la aplicación: `java -jar target/taskmanager-0.0.1-SNAPSHOT.jar`
