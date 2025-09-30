package com.example.demo.repository;

import com.example.demo.model.Task;
import com.example.demo.model.Task.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Método para filtrar tareas por estado
    List<Task> findByStatus(Status status);
}
