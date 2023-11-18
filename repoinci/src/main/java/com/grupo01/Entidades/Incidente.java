package com.grupo01.Entidades;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Incidente {
    private Integer incidenteID;
    private Date fechaCreacion;
    private Tecnico tecnico;
    private Date fechaAsignacion;
    private String consideracion;
    private Estado estado;
    private String descripcionCliente;
    private List<Problema> problemas;
    private Servicio servicio;
    private boolean complejidadAlta;
    private double tiempoUtilizadoTecnico;
    private double tiempoEstimadoSistema;
    private Time tiempoExtra;
    private Cliente cliente;


    public Incidente() {
    }
    public Incidente(Integer incidenteID, Date fechaCreacion, Tecnico tecnico, Date fechaAsignacion, String consideracion,
                     Estado estado, String descripcionCliente, List<Problema> problemas, Servicio servicio, boolean complejidadAlta,
                     double tiempoUtilizadoTecnico, double tiempoEstimadoSistema, Time tiempoExtra, Cliente cliente) {
        this.incidenteID = incidenteID;
        this.fechaCreacion = fechaCreacion;
        this.tecnico = tecnico;
        this.fechaAsignacion = fechaAsignacion;
        this.consideracion = consideracion;
        this.estado = estado;
        this.descripcionCliente = descripcionCliente;
        this.problemas = problemas;
        this.servicio = servicio;
        this.complejidadAlta = complejidadAlta;
        this.tiempoUtilizadoTecnico = tiempoUtilizadoTecnico;
        this.tiempoEstimadoSistema = tiempoEstimadoSistema;
        this.tiempoExtra = tiempoExtra;
        this.cliente = cliente;
    }

    public Integer getIncidenteID() {
        return incidenteID;
    }

    public void setIncidenteID(Integer incidenteID) {
        this.incidenteID = incidenteID;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getConsideracion() {
        return consideracion;
    }

    public void setConsideracion(String consideracion) {
        this.consideracion = consideracion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getDescripcionCliente() {
        return descripcionCliente;
    }

    public void setDescripcionCliente(String descripcionCliente) {
        this.descripcionCliente = descripcionCliente;
    }

    public List<Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(List<Problema> problemas) {
        this.problemas = problemas;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public boolean isComplejidadAlta() {
        return complejidadAlta;
    }

    public void setComplejidadAlta(boolean complejidadAlta) {
        this.complejidadAlta = complejidadAlta;
    }

    public double getTiempoUtilizadoTecnico() {
        return tiempoUtilizadoTecnico;
    }

    public void setTiempoUtilizadoTecnico(double tiempoUtilizadoTecnico) {
        this.tiempoUtilizadoTecnico = tiempoUtilizadoTecnico;
    }

    public double getTiempoEstimadoSistema() {
        return tiempoEstimadoSistema;
    }

    public void setTiempoEstimadoSistema(double tiempoEstimadoSistema) {
        this.tiempoEstimadoSistema = tiempoEstimadoSistema;
    }

    public Time getTiempoExtra() {
        return tiempoExtra;
    }

    public void setTiempoExtra(Time tiempoExtra) {
        this.tiempoExtra = tiempoExtra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Integer asignarTiempoEstimadoTecnico(){

        return n;
    }
    public Integer calcularTiempoEstimadoResolucion(){

        return n;
    }
    public Tecnico obtenerTecnicosDisponibles(){

        return t;
    }
    public void asignarIncidente(){

    }
    public Integer asignarHorasExtra(){

        return n;
    }
    public Estado actualizarEstado(){

        return e;
    }
    public void asignarConsideracionTecnica(){

    }
    public Estado generarReporte(Integer reporteID){

        return e;
    }


}
