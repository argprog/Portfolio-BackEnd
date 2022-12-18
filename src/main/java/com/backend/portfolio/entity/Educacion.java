package com.backend.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String institucion;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String titulo;

    public Educacion() {
    }

    public Educacion(String institucion, Date fecha, String titulo) {
        this.institucion = institucion;
        this.fecha = fecha;
        this.titulo = titulo;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
