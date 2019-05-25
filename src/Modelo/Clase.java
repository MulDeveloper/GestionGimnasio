
package Modelo;


public class Clase {
    private String idClase;
    private String nombreClase;
    private String horaClase;
    private String idMonitor;

    public Clase() {
    }

    public Clase(String idClase, String nombreClase, String horaClase, String idMonitor) {
        this.idClase = idClase;
        this.nombreClase = nombreClase;
        this.horaClase = horaClase;
        this.idMonitor = idMonitor;
    }

    public String getIdClase() {
        return idClase;
    }

    public void setIdClase(String idClase) {
        this.idClase = idClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getHoraClase() {
        return horaClase;
    }

    public void setHoraClase(String horaClase) {
        this.horaClase = horaClase;
    }

    public String getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(String idMonitor) {
        this.idMonitor = idMonitor;
    }
    
}
