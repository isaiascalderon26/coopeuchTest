    package com.desafio.app.rest.controller;
    /*import com.desafio.app.rest.entity.task;
    //import com.desafio.app.rest.service.taskservice;
    import org.junit.jupiter.api.beforeeach;
    import org.junit.jupiter.api.test;
    import org.mockito.injectmocks;
    import org.mockito.mock;
    import org.mockito.mockitoannotations;
    import org.springframework.http.httpstatus;
    import org.springframework.http.responseentity;
    import org.springframework.util.stringutils;

    import java.util.optional;

    import static org.junit.jupiter.api.assertions.assertequals;
    import static org.mockito.mockito.*; */
    public class taskcontrollertest {
       /* @mock
        private taskservice taskservice;

        @injectmocks
        private taskcontroller taskcontroller;

        @beforeeach
        void setup() {
            mockitoannotations.openmocks(this);
        }

        @test
        void testgetall() {
            // arrange
            // mock the behavior of taskservice.gettasks() method
            list<task> tasks = createdummytasks();
            when(taskservice.gettasks()).thenreturn(tasks);

            // act
            list<task> result = taskcontroller.getall();

            // assert
            assertequals(tasks, result);
            // verify that taskservice.gettasks() method was called once
            verify(taskservice, times(1)).gettasks();
        }

        @test
        void testgetbyid_existingid() {
            // arrange
            integer taskid = 1;
            task task = createdummytask(taskid);
            when(taskservice.gettask(taskid)).thenreturn(optional.of(task));

            // act
            responseentity<?> response = taskcontroller.getbyid(taskid);

            // assert
            assertequals(httpstatus.ok, response.getstatuscode());
            assertequals(task, response.getbody());
            verify(taskservice, times(1)).gettask(taskid);
        }

        @test
        void testgetbyid_nonexistingid() {
            // arrange
            integer taskid = 1;
            when(taskservice.gettask(taskid)).thenreturn(optional.empty());

            // act
            responseentity<?> response = taskcontroller.getbyid(taskid);

            // assert
            assertequals(httpstatus.not_found, response.getstatuscode());
            assertequals("el identificador no existe", response.getbody());
            verify(taskservice, times(1)).gettask(taskid);
        }

        @test
        void testcreate_validtask() {
            // arrange
            task task = createdummytask(null);
            when(taskservice.gettask(null)).thenreturn(optional.empty());

            // act
            responseentity<string> response = taskcontroller.create(task);

            // assert
            assertequals(httpstatus.created, response.getstatuscode());
            assertequals("la tarea se ha creado correctamente", response.getbody());
            verify(taskservice, times(1)).saveorupdatetask(task);
        }

        @test
        void testcreate_existingid() {
            // arrange
            integer taskid = 1;
            task task = createdummytask(taskid);
            when(taskservice.gettask(taskid)).thenreturn(optional.of(task));

            // act
            responseentity<string> response = taskcontroller.create(task);

            // assert
            assertequals(httpstatus.bad_request, response.getstatuscode());
            assertequals("el identificador ya está en uso", response.getbody());
            verify(taskservice, never()).saveorupdatetask(task);
        }

        @test
        void testcreate_invalidtask() {
            // arrange
            task task = new task(); // create an invalid task with missing fields

            // act
            responseentity<string> response = taskcontroller.create(task);

            // assert
            assertequals(httpstatus.bad_request, response.getstatuscode());
            assertequals("todos los campos son obligatorios", response.getbody());
            verify(taskservice, never()).saveorupdatetask(task);
        }

        @test
        void testupdate_existingid() {
            // arrange
            integer taskid = 1;
            task existingtask = createdummytask(taskid);
            task updatedtask = createdummytask(taskid);
            updatedtask.setdescripcion("descripción actualizada");
            when(taskservice.gettask(taskid)).thenreturn(optional.of(existingtask));
            when(taskservice.gettask(updatedtask.getidentificador())).thenreturn(optional.empty());

            // act
            responseentity<string> response = taskcontroller.update(taskid, updatedtask);

            // assert
            assertequals(httpstatus.ok, response.getstatuscode());
            assertequals("la tarea se ha actualizado correctamente", response.getbody());
            verify(taskservice, times(1)).saveorupdatetask(existingtask);
        }

        @test
        void testupdate_nonexistingid() {
            // arrange
            integer taskid = 1;
            task updatedtask = createdummytask(taskid);
            when(taskservice.gettask(taskid)).thenreturn(optional.empty());

            // act
            responseentity<string> response = taskcontroller.update(taskid, updatedtask);

            // assert
            assertequals(httpstatus.not_found, response.getstatuscode());
            verify(taskservice, never()).saveorupdatetask(updatedtask);
        }

        @test
        void testupdate_invalidtask() {
            // arrange
            integer taskid = 1;
            task existingtask = createdummytask(taskid);
            task updatedtask = new task(); // create an invalid task with missing fields
            when(taskservice.gettask(taskid)).thenreturn(optional.of(existingtask));

            // act
            responseentity<string> response = taskcontroller.update(taskid, updatedtask);

            // assert
            assertequals(httpstatus.bad_request, response.getstatuscode());
            assertequals("todos los campos son obligatorios", response.getbody());
            verify(taskservice, never()).saveorupdatetask(updatedtask);
        }

        @test
        void testdelete_existingid() {
            // arrange
            integer taskid = 1;
            when(taskservice.gettask(taskid)).thenreturn(optional.of(createdummytask(taskid)));

            // act
            responseentity<string> response = taskcontroller.delete(taskid);

            // assert
            assertequals(httpstatus.ok, response.getstatuscode());
            assertequals("la tarea se ha eliminado correctamente", response.getbody());
            verify(taskservice, times(1)).deletetask(taskid);
        }

        @test
        void testdelete_nonexistingid() {
            // arrange
            integer taskid = 1;
            when(taskservice.gettask(taskid)).thenreturn(optional.empty());

            // act
            responseentity<string> response = taskcontroller.delete(taskid);

            // assert
            assertequals(httpstatus.not_found, response.getstatuscode());
            verify(taskservice, never()).deletetask(taskid);
        }

        private list<task> createdummytasks() {
            // create and return a list of dummy tasks for testing
            // ...
        }

        private task createdummytask(integer taskid) {
            // create and return a dummy task with the given taskid for testing
            // ...
        }*/

    }
