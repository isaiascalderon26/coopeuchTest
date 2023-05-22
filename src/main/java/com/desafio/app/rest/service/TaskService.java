package com.desafio.app.rest.service;

import com.desafio.app.rest.Repository.TaskRepository;
import com.desafio.app.rest.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public List<Task> getTasks(){
        return taskRepository.findAll();
    }
    public Optional<Task> getTask(Integer identificador){
        return taskRepository.findById(identificador);
    }

    public  void saveOrUpdateTask (Task task){
        taskRepository.save(task);
    }

    public  void deleteTask (Integer identificador){
        taskRepository.deleteById(identificador);
    }
}
