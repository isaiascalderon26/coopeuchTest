package com.desafio.app.rest.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "tbl_task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer identificador;

    private String descripcion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    private Boolean vigente;


}
