# 🚀 TaskTracker

[![Java](https://img.shields.io/badge/Java-23-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)
[![H2 Database](https://img.shields.io/badge/H2%20DB-in-memory-orange)](https://www.h2database.com/html/main.html)

**API RESTful para gestionar tareas con Spring Boot**  

TaskTracker es una API diseñada para **crear, listar, actualizar, marcar y eliminar tareas**, ideal para organizar el trabajo diario o proyectos personales.

---

## ✨ Características

- ✅ **Crear tareas** con estado inicial `TODO`  
- 📋 **Listar tareas** o filtrar por estado (`TODO`, `IN_PROGRESS`, `DONE`)  
- ✏️ **Actualizar tareas** modificando la descripción  
- 🔄 **Marcar tareas** como `IN_PROGRESS` o `DONE`  
- 🗑 **Eliminar tareas** completadas o innecesarias  

---

## 🛠 Tecnologías

- **Java 23**  
- **Spring Boot 3.x**  
- **Spring Data JPA**  
- **H2 Database** (base de datos en memoria; fácil de reemplazar por MySQL/PostgreSQL)  
- **Jackson** para serialización JSON  

---

## 🔗 Endpoints

| Método | URL | Descripción | Parámetros |
|--------|-----|------------|------------|
| POST   | `/tasks` | Crear nueva tarea | `description` (query param) |
| GET    | `/tasks` | Listar todas las tareas | `status` (opcional) |
| PUT    | `/tasks/{id}` | Actualizar descripción | `description` (query param) |
| PUT    | `/tasks/{id}/mark` | Cambiar estado | `status` (`TODO`, `IN_PROGRESS`, `DONE`) |
| DELETE | `/tasks/{id}` | Eliminar tarea | - |

---

## 📄 Ejemplo de respuesta JSON

```json
{
  "id": 1,
  "description": "Comprar leche",
  "status": "TODO",
  "createdAt": "2025-09-30T18:20:00",
  "updatedAt": "2025-09-30T18:20:00"
}
