
package Modelo;


public class Incidencia {
    private int idIncidencia;
    private String descpricionIncidencia;

    public Incidencia() {
    }

    public Incidencia(int idIncidencia, String descpricionIncidencia) {
        this.idIncidencia = idIncidencia;
        this.descpricionIncidencia = descpricionIncidencia;
    }

    public int getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public String getDescpricionIncidencia() {
        return descpricionIncidencia;
    }

    public void setDescpricionIncidencia(String descpricionIncidencia) {
        this.descpricionIncidencia = descpricionIncidencia;
    }
    
}
