
package Modelo;


public class Clase {
    private int idClase;
    private String nombreClase;
    private int  horaClase;
    private int idMonitor;

    public Clase() {
    }

    public Clase(int idClase, String nombreClase, int horaClase, int idMonitor) {
        this.idClase = idClase;
        this.nombreClase = nombreClase;
        this.horaClase = horaClase;
        this.idMonitor = idMonitor;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public int getHoraClase() {
        return horaClase;
    }

    public void setHoraClase(int horaClase) {
        this.horaClase = horaClase;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    

    

    
    
}
