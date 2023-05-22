package com.desafio.app.rest.service;
/* import com.desafio.app.rest.entity.Task;
import com.desafio.app.rest.repository.TaskRepository;
import com.desafio.app.rest.service.TaskService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;*/
public class TaskServiceTest {

    /*@MockBean
    private TaskRepository taskRepository;

    private TaskService taskService;

    @BeforeEach
    public void setup() {
        taskService = new TaskService(taskRepository);
    }

    @Test
    public void testGetTasks() {
        // Crear una lista de tareas de prueba
        List<Task> tasks = new ArrayList<>();
        Task task1 = new Task();
        task1.setIdentificador(1);
        task1.setDescripcion("Tarea 1");
        tasks.add(task1);

        Task task2 = new Task();
        task2.setIdentificador(2);
        task2.setDescripcion("Tarea 2");
        tasks.add(task2);

        // Configurar el comportamiento del repositorio simulado (mock)
        Mockito.when(taskRepository.findAll()).thenReturn(tasks);

        // Obtener todas las tareas utilizando el servicio
        List<Task> retrievedTasks = taskService.getTasks();

        // Verificar que se hayan obtenido todas las tareas correctamente
        Assertions.assertEquals(tasks.size(), retrievedTasks.size());
        Assertions.assertEquals(tasks.get(0).getIdentificador(), retrievedTasks.get(0).getIdentificador());
        Assertions.assertEquals(tasks.get(0).getDescripcion(), retrievedTasks.get(0).getDescripcion());
        Assertions.assertEquals(tasks.get(1).getIdentificador(), retrievedTasks.get(1).getIdentificador());
        Assertions.assertEquals(tasks.get(1).getDescripcion(), retrievedTasks.get(1).getDescripcion());
    }

    @Test
    public void testGetTaskById() {
        // Crear una tarea de prueba
        Task task = new Task();
        task.setIdentificador(1);
        task.setDescripcion("Tarea de prueba");

        // Configurar el comportamiento del repositorio simulado (mock)
        Mockito.when(taskRepository.findById(1)).thenReturn(Optional.of(task));

        // Obtener la tarea por identificador utilizando el servicio
        Optional<Task> retrievedTaskOptional = taskService.getTask(1);

        // Verificar que se haya obtenido la tarea correctamente
        Assertions.assertTrue(retrievedTaskOptional.isPresent());
        Task retrievedTask = retrievedTaskOptional.get();
        Assertions.assertEquals(task.getIdentificador(), retrievedTask.getIdentificador());
        Assertions.assertEquals(task.getDescripcion(), retrievedTask.getDescripcion());
    }

    @Test
    public void testSaveOrUpdateTask() {
        // Crear una tarea de prueba
        Task task = new Task();
        task.setIdentificador(1);
        task.setDescripcion("Tarea de prueba");

        // Guardar o actualizar la tarea utilizando el servicio
        taskService.saveOrUpdateTask(task);

        // Verificar que la tarea se haya guardado o actualizado correctamente
        Mockito.verify(taskRepository, Mockito.times(1)).save(task);
    }

    @Test
    public void testDeleteTask() {
        // Eliminar una tarea utilizando el servicio
        taskService.deleteTask(1);

        // Verificar que la tarea se haya eliminado correctamente
        Mockito.verify(taskRepository, Mockito.times(1)).deleteById(1);
    }*/
}
