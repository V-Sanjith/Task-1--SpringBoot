package com.example.taskrunner.controller;

import com.example.taskrunner.model.Task;
import com.example.taskrunner.service.TaskService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task, Authentication auth) {
        task.setCreatedBy(auth.getName());
        task.setStatus("PENDING");
        return taskService.createTask(task);
    }

    @GetMapping
    public List<Task> getUserTasks(Authentication auth) {
        return taskService.getTasksByUser(auth.getName());
    }

    @PutMapping("/{id}/status")
    public Task updateStatus(@PathVariable String id, @RequestBody Task task) {
        return taskService.updateStatus(id, task.getStatus());
    }
}
