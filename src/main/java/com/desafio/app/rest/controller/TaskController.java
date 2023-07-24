package com.desafio.app.rest.controller;

import com.desafio.app.rest.entity.Task;
import com.desafio.app.rest.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/task")
@Api(value = "TaskController", description = "API para realizar operaciones CRUD en tareas")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @ApiOperation(value = "Obtener todas las tareas", notes = "Obtiene una lista de todas las tareas registradas.")
    @GetMapping
    public List<Task> getAll() {
        return taskService.getTasks();
    }

    @ApiOperation(value = "Obtener una tarea por identificador", notes = "Obtiene una tarea por su identificador.")
    @GetMapping("/{identificador}")
    public ResponseEntity<?> getById(@PathVariable("identificador") Integer id) {
        Optional<Task> taskOptional = taskService.getTask(id);
        if (taskOptional.isPresent()) {
            Task task = taskOptional.get();
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El identificador no existe");
        }
    }

    @ApiOperation(value = "Agregar una nueva tarea", notes = "Agrega una nueva tarea a la lista.")
    @PostMapping
    public ResponseEntity<String> create(@Validated @RequestBody Task task) {
        if (StringUtils.isEmpty(task.getDescripcion()) || task.getFechaCreacion() == null || task.getVigente() == null) {
            return ResponseEntity.badRequest().body("Todos los campos son obligatorios");
        }

        Integer identificador = task.getIdentificador();
        if (identificador != null && taskService.getTask(identificador).isPresent()) {
            return ResponseEntity.badRequest().body("El identificador ya está en uso");
        }

        try {
            taskService.saveOrUpdateTask(task);
            return ResponseEntity.status(HttpStatus.CREATED).body("La tarea se ha creado correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear la tarea");
        }
    }

    @ApiOperation(value = "Actualizar una tarea", notes = "Actualiza una tarea existente.")
    @PutMapping("/{identificador}")
    public ResponseEntity<String> update(@PathVariable("identificador") Integer id, @Validated @RequestBody Task updatedTask) {
        Optional<Task> taskOptional = taskService.getTask(id);
        if (taskOptional.isPresent()) {
            Task task = taskOptional.get();
            if (StringUtils.isEmpty(updatedTask.getDescripcion()) || updatedTask.getFechaCreacion() == null || updatedTask.getVigente() == null) {
                return ResponseEntity.badRequest().body("Todos los campos son obligatorios");
            }

            Integer identificador = updatedTask.getIdentificador();
            if (identificador != null && !identificador.equals(id) && taskService.getTask(identificador).isPresent()) {
                return ResponseEntity.badRequest().body("El identificador ya está en uso");
            }

            task.setDescripcion(updatedTask.getDescripcion());
            task.setFechaCreacion(updatedTask.getFechaCreacion());
            task.setVigente(updatedTask.getVigente());

            try {
                taskService.saveOrUpdateTask(task);
                return ResponseEntity.ok("La tarea se ha actualizado correctamente");
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar la tarea");
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @ApiOperation(value = "Eliminar una tarea", notes = "Elimina una tarea de la lista.")
    @DeleteMapping("/{identificador}")
    public ResponseEntity<String> delete(@PathVariable("identificador") Integer id) {
        Optional<Task> taskOptional = taskService.getTask(id);
        if (taskOptional.isPresent()) {
            taskService.deleteTask(id);
            return ResponseEntity.ok("La tarea se ha eliminado correctamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
