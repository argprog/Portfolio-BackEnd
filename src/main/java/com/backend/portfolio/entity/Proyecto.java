package com.backend.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String institucion;
    private String fecha;
    private String nombre;

    public Proyecto() {
    }

    public Proyecto(String institucion, String fecha, String nombre) {
        this.institucion = institucion;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}