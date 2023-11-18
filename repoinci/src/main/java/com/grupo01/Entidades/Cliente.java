
package com.grupo01.Entidades;

import java.util.List;


public class Cliente extends Persona implements MedioNotificacion{
    private int idCliente;
    private String razonSocial;
    private int cuit;
    private List<ServicioContratado> serviciosContratados;
    private String eMail;

    public Cliente() {
    }

    public Cliente(int idCliente, String razonSocial, int cuit, List<ServicioContratado> serviciosContratados, String eMail) {
        this.idCliente = idCliente;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.serviciosContratados = serviciosContratados;
        this.eMail = eMail;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public List<ServicioContratado> getServiciosContratados() {
        return serviciosContratados;
    }

    public void setServiciosContratados(List<ServicioContratado> serviciosContratados) {
        this.serviciosContratados = serviciosContratados;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", razonSocial=" + razonSocial + ", cuit=" + cuit + ", serviciosContratados=" + serviciosContratados + ", eMail=" + eMail + '}';
    }
    
    
    public void enviarAviso(Mensaje mensaje){
        
    }
    
}
