package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    @GetMapping
    public List<TaskDto> getTasks() {
        return new ArrayList<>();
    }

    @GetMapping("{id}")
    public TaskDto getTask(@PathVariable(name = "id") Long taskId) {
        return new TaskDto(1L, "test title", "test_content");
    }

    @DeleteMapping("delete/{id}")
    public void deleteTask(@PathVariable(name = "id") Long taskId) {
    }

    @PostMapping(value = "update")
    public TaskDto updateTask(@RequestBody TaskDto taskDto) {
        return new TaskDto(1L, "Edited test title", "Test content");
    }

    @PutMapping(value =  "create")
    public void createTask(@RequestBody TaskDto taskDto) {

    }
}