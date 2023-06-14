package com.crud.tasks;

import com.crud.tasks.domain.TaskDto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        TaskDto taskDto = new TaskDto(
                (long) 1L,
                "Test title",
                "I want to be a coder!");

        Long id = taskDto.getId();
        String title = taskDto.getTitle();
        String content = taskDto.getContent();
        System.out.println(id + " " + title + " " + content);
//        SpringApplication.run(TasksApplication.class, args);
    }
}
