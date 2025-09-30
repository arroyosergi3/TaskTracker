package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.model.Task.Status;
import com.example.demo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public Task addTask(@RequestParam String description) {
        return service.addTask(description);
    }

    @GetMapping
    public List<Task> getAllTasks(@RequestParam(required = false) Status status) {
        if (status != null) return service.getTasksByStatus(status);
        return service.getAllTasks();
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestParam String description) {
        return service.updateTask(id, description).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }

    @PutMapping("/{id}/mark")
    public Task markTask(@PathVariable Long id, @RequestParam Status status) {
        return service.markTask(id, status).orElseThrow();
    }
}
