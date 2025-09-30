package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.model.Task.Status;
import com.example.demo.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task addTask(String description) {
        Task task = new Task();
        task.setDescription(description);
        task.setStatus(Status.TODO);
        return repository.save(task);
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public List<Task> getTasksByStatus(Status status) {
        return repository.findByStatus(status);
    }

    public Optional<Task> updateTask(Long id, String description) {
        return repository.findById(id).map(task -> {
            task.setDescription(description);
            return repository.save(task);
        });
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }

    public Optional<Task> markTask(Long id, Status status) {
        return repository.findById(id).map(task -> {
            task.setStatus(status);
            return repository.save(task);
        });
    }
}
