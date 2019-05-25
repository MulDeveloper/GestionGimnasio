
package Modelo;


public class Tarifas {
    private String idTarifa;
    private String nomTarifa;
    private String fechaIncio;
    private String fechaFin;
    private String precio;

    public Tarifas() {
    }
    

    public Tarifas(String idTarifa, String nomTarifa, String fechaIncio, String fechaFin, String precio) {
        this.idTarifa = idTarifa;
        this.nomTarifa = nomTarifa;
        this.fechaIncio = fechaIncio;
        this.fechaFin = fechaFin;
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

    public String getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(String fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
}
