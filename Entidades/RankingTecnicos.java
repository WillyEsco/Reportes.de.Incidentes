
package Entidades;

public class RankingTecnicos implements Reporte{

  private int idReporrte;
  private String tituloRporte;
  private int idEspecilidad;
  private int dias;

    public RankingTecnicos() {
    }

    public RankingTecnicos(int idReporrte, String tituloRporte, int idEspecilidad, int dias) {
        this.idReporrte = idReporrte;
        this.tituloRporte = tituloRporte;
        this.idEspecilidad = idEspecilidad;
        this.dias = dias;
    }

    public int getIdReporrte() {
        return idReporrte;
    }

    public void setIdReporrte(int idReporrte) {
        this.idReporrte = idReporrte;
    }

    public String getTituloRporte() {
        return tituloRporte;
    }

    public void setTituloRporte(String tituloRporte) {
        this.tituloRporte = tituloRporte;
    }

    public int getIdEspecilidad() {
        return idEspecilidad;
    }

    public void setIdEspecilidad(int idEspecilidad) {
        this.idEspecilidad = idEspecilidad;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
  
  public void topResueltos(int dias){
      
  }
  
  public void rankingRapidez(){
      
  }
    
  public void topResueltosEspecialidad(int dias, Especialidad especialidad){
      
  }
    
    @Override
    public void generarReporte(int idReporte) {

    }
}
