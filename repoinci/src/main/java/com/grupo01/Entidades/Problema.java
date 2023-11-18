package com.grupo01.Entidades;

import java.sql.Time;

public class Problema {
    private TipoDeProblema tipo;
    private String nombreProblema;
    private String descripcion;
    private Time tiempoResolucion;

    public Problema() {
    }

    public Problema(TipoDeProblema tipo, String nombreProblema, String descripcion, Time tiempoResolucion) {
        this.tipo = tipo;
        this.nombreProblema = nombreProblema;
        this.descripcion = descripcion;
        this.tiempoResolucion = tiempoResolucion;
    }

    public TipoDeProblema getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeProblema tipo) {
        this.tipo = tipo;
    }

    public String getNombreProblema() {
        return nombreProblema;
    }

    public void setNombreProblema(String nombreProblema) {
        this.nombreProblema = nombreProblema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Time getTiempoResolucion() {
        return tiempoResolucion;
    }

    public void setTiempoResolucion(Time tiempoResolucion) {
        this.tiempoResolucion = tiempoResolucion;
    }
}
