
package Modelo;


public class Tarifas {
    private String idTarifa;
    private String nomTarifa;
    private String precio;

    public Tarifas() {
    }

    public Tarifas(String idTarifa, String nomTarifa, String precio) {
        this.idTarifa = idTarifa;
        this.nomTarifa = nomTarifa;
        this.precio = precio;
    }
    

    public String getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(String idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getNomTarifa() {
        return nomTarifa;
    }

    public void setNomTarifa(String nomTarifa) {
        this.nomTarifa = nomTarifa;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
}
