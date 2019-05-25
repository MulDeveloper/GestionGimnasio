
package Modelo;


public class Personal {
    private int idPersonal;
    private String nombrePersonal;
    private String apellidoPersonal;
    private String segundoApellido;
    private String nif;
    private String tipoTurno;
    private String sueldo;
    private String puesto;

    public Personal() {
    }

    public Personal(int idPersonal, String nombrePersonal, String apellidoPersonal, String segundoApellido, String nif, String tipoTurno, String sueldo, String puesto) {
        this.idPersonal = idPersonal;
        this.nombrePersonal = nombrePersonal;
        this.apellidoPersonal = apellidoPersonal;
        this.segundoApellido = segundoApellido;
        this.nif = nif;
        this.tipoTurno = tipoTurno;
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNombrePersonal() {
        return nombrePersonal;
    }

    public void setNombrePersonal(String nombrePersonal) {
        this.nombrePersonal = nombrePersonal;
    }

    public String getApellidoPersonal() {
        return apellidoPersonal;
    }

    public void setApellidoPersonal(String apellidoPersonal) {
        this.apellidoPersonal = apellidoPersonal;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(String tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
}
