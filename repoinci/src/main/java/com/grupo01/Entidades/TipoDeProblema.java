package com.grupo01.Entidades;

import java.util.List;

public class TipoDeProblema {
    private Integer tipoDeProblemaID;
    private String  nombreTipoProblema;
    private String  descripcion;
    private List<Especialidad> especialidades;
    private List<Servicio>  servicios;

    public TipoDeProblema() {

    }
    public TipoDeProblema(Integer tipoDeProblemaID, String nombreTipoProblema, String descripcion, List<Especialidad> especialidades, List<Servicio> servicios) {
        this.tipoDeProblemaID = tipoDeProblemaID;
        this.nombreTipoProblema = nombreTipoProblema;
        this.descripcion = descripcion;
        this.especialidades = especialidades;
        this.servicios = servicios;
    }

    public Integer getTipoDeProblemaID() {
        return tipoDeProblemaID;
    }

    public void setTipoDeProblemaID(Integer tipoDeProblemaID) {
        this.tipoDeProblemaID = tipoDeProblemaID;
    }

    public String getNombreTipoProblema() {
        return nombreTipoProblema;
    }

    public void setNombreTipoProblema(String nombreTipoProblema) {
        this.nombreTipoProblema = nombreTipoProblema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}
