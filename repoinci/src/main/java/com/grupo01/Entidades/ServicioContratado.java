package com.grupo01.Entidades;

import java.util.Date;

public class ServicioContratado {
    private Servicio servicio;
    private Cliente cliente;
    private Date fechaInicio;
    private Date fechaVto;
    private Integer horasConsumidas;

    public ServicioContratado() {
    }

    public ServicioContratado(Servicio servicio, Cliente cliente, Date fechaInicio, Date fechaVto, Integer horasConsumidas) {
        this.servicio = servicio;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaVto = fechaVto;
        this.horasConsumidas = horasConsumidas;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(Date fechaVto) {
        this.fechaVto = fechaVto;
    }

    public Integer getHorasConsumidas() {
        return horasConsumidas;
    }

    public void setHorasConsumidas(Integer horasConsumidas) {
        this.horasConsumidas = horasConsumidas;
    }
}
