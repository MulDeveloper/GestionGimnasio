
package Modelo;


public class Tarifas {
    private int idTarifa;
    private String nomTarifa;
    private Double precio;

    public Tarifas() {
    }

    public Tarifas(int idTarifa, String nomTarifa, Double precio) {
        this.idTarifa = idTarifa;
        this.nomTarifa = nomTarifa;
        this.precio = precio;
    }
    

    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getNomTarifa() {
        return nomTarifa;
    }

    public void setNomTarifa(String nomTarifa) {
        this.nomTarifa = nomTarifa;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
}
