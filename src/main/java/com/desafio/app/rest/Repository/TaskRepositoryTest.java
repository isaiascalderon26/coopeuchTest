package com.desafio.app.rest.Repository;
/*import com.desafio.app.rest.repository.TaskRepository;
import com.desafio.app.rest.entity.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;*/
public class TaskRepositoryTest {

    /*@Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    public void setup() {
        // Configurar datos de prueba si es necesario
    }

    @Test
    public void testFindById() {
        // Crear una tarea de prueba
        Task task = new Task();
        task.setIdentificador(1);
        task.setDescripcion("Tarea de prueba");

        // Guardar la tarea en la base de datos
        entityManager.persist(task);
        entityManager.flush();

        // Buscar la tarea por identificador utilizando el repositorio
        Optional<Task> retrievedTask = taskRepository.findById(task.getIdentificador());

        // Verificar que la tarea se haya recuperado correctamente
        Assertions.assertTrue(retrievedTask.isPresent());
        Assertions.assertEquals(task.getIdentificador(), retrievedTask.get().getIdentificador());
        Assertions.assertEquals(task.getDescripcion(), retrievedTask.get().getDescripcion());
    }*/
}
