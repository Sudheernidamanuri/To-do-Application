package com.app.todoapp.service;

import com.app.todoapp.model.Task;
import com.app.todoapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    // GET all tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    //POST a task
    public void createTask(String title){
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    //DELETE a task
    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);
    }

    //UPDATE a task
    public void toggleTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task id: " + id));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }
}
