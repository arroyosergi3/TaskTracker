# TaskTracker
API RESTful para gestionar tareas con Spring Boot

Task Tracker API

Task Tracker es una API RESTful desarrollada con Spring Boot para gestionar tareas de forma sencilla. Permite a los usuarios crear, actualizar, listar, marcar y eliminar tareas, sirviendo como una herramienta práctica para organizar el trabajo diario o proyectos personales.

Características

Crear tareas: Agrega nuevas tareas con descripción y estado inicial TODO.

Listar tareas: Recupera todas las tareas o filtra por estado (TODO, IN_PROGRESS, DONE).

Actualizar tareas: Modifica la descripción de una tarea existente.

Marcar tareas: Cambia el estado de una tarea a IN_PROGRESS o DONE.

Eliminar tareas: Elimina tareas completadas o innecesarias.

Tecnologías

Java 23

Spring Boot 3.x

Spring Data JPA

H2 Database (base de datos en memoria, fácil de reemplazar por MySQL, PostgreSQL, etc.)

Jackson para serialización JSON

Endpoints
Método	URL	Descripción	Parámetros
POST	/tasks	Crear nueva tarea	description (query param)
GET	/tasks	Listar todas las tareas	status (opcional)
PUT	/tasks/{id}	Actualizar descripción	description (query param)
PUT	/tasks/{id}/mark	Cambiar estado de la tarea	status (TODO, IN_PROGRESS, DONE)
DELETE	/tasks/{id}	Eliminar tarea	-
Ejemplo de respuesta JSON
{
  "id": 1,
  "description": "Comprar leche",
  "status": "TODO",
  "createdAt": "2025-09-30T18:20:00",
  "updatedAt": "2025-09-30T18:20:00"
}

Cómo ejecutar

Clonar el repositorio:

git clone https://github.com/tu-usuario/demo.git


Abrir el proyecto en VSCode o IntelliJ.

Ejecutar con Maven:

mvn spring-boot:run


La API correrá en http://localhost:8080.

Próximos pasos / mejoras

Persistencia en base de datos real (MySQL, PostgreSQL).

Validación de entradas y manejo de errores más detallado.

Frontend web o app móvil para interactuar con la API.
