package com.grupo01;
import  com.grupo01.repoinci.src.entidades.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Alta de Incidente:" );
        Incidente incidente = new Incidente();
        incidente.setIncidenteID(1);
        incidente.setFechaCreacion(new Date());
        incidente.setTecnico(new Tecnico());
        incidente.setFechaAsignacion(new Date());
        incidente.setConsideracion("Consideracion");
        incidente.setEstado(new Estado());
        incidente.setDescripcionCliente("Descripcion Cliente");
        incidente.setTiempoExtra(1);
        incidente.setCliente(new Cliente());
        System.out.println(incidente);
        
    }
}
