package com.grupo01.Entidades;

import java.util.List;

public class Tecnico extends Persona{
    private Integer tecnicoID;
    private String  nombre;
    private String  apellido;
    private String  medioComunicacion;
    private List<Especialidad>  especialidadServicio;

    public Tecnico() {
    }
    public Tecnico(Integer tecnicoID, String nombre, String apellido, String medioComunicacion, List<Especialidad> especialidadServicio) {
        this.tecnicoID = tecnicoID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.medioComunicacion = medioComunicacion;
        this.especialidadServicio = especialidadServicio;
    }

    public Integer getTecnicoID() {
        return tecnicoID;
    }

    public void setTecnicoID(Integer tecnicoID) {
        this.tecnicoID = tecnicoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMedioComunicacion() {
        return medioComunicacion;
    }

    public void setMedioComunicacion(String medioComunicacion) {
        this.medioComunicacion = medioComunicacion;
    }

    public List<Especialidad> getEspecialidadServicio() {
        return especialidadServicio;
    }

    public void setEspecialidadServicio(List<Especialidad> especialidadServicio) {
        this.especialidadServicio = especialidadServicio;
    }

    public void determinarMedioComunicacion(Integer tecnicoID){

    }

    public void sendNotificacion(String medioComunicacion, Mensaje mensaje){

    };


}
