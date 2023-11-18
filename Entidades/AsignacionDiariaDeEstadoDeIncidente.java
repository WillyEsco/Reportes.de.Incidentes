
package Entidades;

public class AsignacionDiariaDeEstadoDeIncidente implements Reporte{
    
    private int idReporte;
    private String tituloReporte;

    public AsignacionDiariaDeEstadoDeIncidente() {
    }

    
    public AsignacionDiariaDeEstadoDeIncidente(int idReporte, String tituloReporte) {
        this.idReporte = idReporte;
        this.tituloReporte = tituloReporte;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getTituloReporte() {
        return tituloReporte;
    }

    public void setTituloReporte(String tituloReporte) {
        this.tituloReporte = tituloReporte;
    }
    
    @Override
    public void generarReporte(int idReporte) {
        
    }
    
    public void generarAsignaciones(){
        
    }
}    
            
