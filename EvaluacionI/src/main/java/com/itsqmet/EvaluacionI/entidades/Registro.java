package com.itsqmet.EvaluacionI.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String placa;
    private String marca;
    private int kilometraje;
    private String color;
    private int anio;
}
