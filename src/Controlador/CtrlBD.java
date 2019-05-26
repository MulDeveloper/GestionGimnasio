
package Controlador;

import Modelo.Clase;
import Modelo.Incidencia;
import Modelo.Tarifas;
import Modelo.Usuario;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class CtrlBD {
    private Connection conexion;
    private Statement instruccion;
    private ResultSet rs;
    private ArrayList listaClases;
    private ArrayList listaUser;
    private ArrayList listaInci;
    private ArrayList listaTari;
    private PreparedStatement pstmt;
    private InputStream in;
    private BufferedImage img;

    public CtrlBD() {
    }
    
    public boolean conectarBd(){
        try{
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CONEX", "EJEMPLO1");
            return true;
        }
        catch(SQLException e){
            return false;
        }
    }
    
    public boolean conectaAdmin(String usuario, String pass){
        String cons = "SELECT * FROM ADMINISTRADORES WHERE USUARIO='"+usuario+"' AND PASSADMIN='"+pass+"'";
        try{
            instruccion = conexion.createStatement();
            rs = instruccion.executeQuery(cons);
            if(rs.next()){
                return true;
            }
            instruccion.close();
            rs.close();
        }
        catch(SQLException e){
            return false;
        }
        return false;
    }
    
    public ArrayList getClases(int op){
        String cons = "SELECT * FROM CLASES WHERE DIA = ? ORDER BY HORAINICIO";
        listaClases = new ArrayList ();
        try{
            pstmt = conexion.prepareStatement("SELECT * FROM CLASES WHERE DIA = ? ORDER BY HORAINICIO");
            switch(op){
                case 1:
                    pstmt.setString(1, "LUNES");
                    break;
                case 2:
                    pstmt.setString(1, "MARTES");
                    break;
                case 3:
                    pstmt.setString(1, "MIERCOLES");
                    break;
                case 4:
                    pstmt.setString(1, "JUEVES");
                    break;
                case 5:
                    pstmt.setString(1, "VIERNES");
                    break;
                case 6:
                    pstmt.setString(1, "SABADO");
                    break;
                case 7:
                    pstmt.setString(1, "DOMINGO");
                    break;
            }
            rs = pstmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("IDCLASE");
                String nom = rs.getString("NOMBRECLASE");
                int hora = rs.getInt("HORAINICIO");
                int monitor = rs.getInt("IDMONITOR");
                listaClases.add(new Clase(id,nom,hora,monitor));
            }
            pstmt.close();
            rs.close();
            return listaClases;
        }
        catch(SQLException e){
            e.getMessage();
            return null;
        }
    }
    
    public ArrayList getUsuarios(){
        String cons = "SELECT * FROM USUARIOS ORDER BY IDUSUARIO";
        listaUser = new ArrayList ();
        try{
            instruccion = conexion.createStatement();
            rs = instruccion.executeQuery(cons);
            while(rs.next()){
                int id = rs.getInt("IDUSUARIO");
                String nom = rs.getString("NOMBRE");
                String ape = rs.getString("APELLIDO");
                String segundoape = rs.getString("SEGUNDOAPELLIDO");
                String nif = rs.getString("NIF");
                int idtarifa = rs.getInt("IDTARIFA");
                String direccion = rs.getString("DIRECCION");
                listaUser.add(new Usuario(id,nom,ape,segundoape,nif,idtarifa,direccion));
            }
            instruccion.close();
            rs.close();
            return listaUser;
        }
        catch(SQLException e){
            return null;
        }
    }
    
    public ArrayList busquedaUsuariosApellido(String apellido){
        String cons = "SELECT * FROM USUARIOS WHERE APELLIDO LIKE'%"+apellido+"%' ORDER BY IDUSUARIO";
        listaUser = new ArrayList ();
        try{
            instruccion = conexion.createStatement();
            rs = instruccion.executeQuery(cons);
            while(rs.next()){
                int id = rs.getInt("IDUSUARIO");
                String nom = rs.getString("NOMBRE");
                String ape = rs.getString("APELLIDO");
                String segundoape = rs.getString("SEGUNDOAPELLIDO");
                String nif = rs.getString("NIF");
                int idtarifa = rs.getInt("IDTARIFA");
                String direccion = rs.getString("DIRECCION");
                listaUser.add(new Usuario(id,nom,ape,segundoape,nif,idtarifa,direccion));
            }
            instruccion.close();
            rs.close();
            return listaUser;
        }
        catch(SQLException e){
            return null;
        }
    }
    
    
    public ArrayList getTarifas(){
        String cons = "SELECT * FROM TARIFAS ORDER BY IDTARIFA";
        listaTari = new ArrayList ();
        try{
            instruccion = conexion.createStatement();
            rs = instruccion.executeQuery(cons);
            while(rs.next()){
                int id = rs.getInt("IDTARIFA");
                String nom = rs.getString("NOMTARIFA");
                Double precio = rs.getDouble("PRECIO");
                listaTari.add(new Tarifas(id,nom,precio));
            }
            instruccion.close();
            rs.close();
            return listaTari;
        }
        catch(SQLException e){
            return null;
        }
    }
    
    public int estadoPago(int id){
        String cons = "SELECT ESTADO FROM ESTADOPAGO WHERE IDUSUARIO="+id;
        try{
            instruccion = conexion.createStatement();
            rs = instruccion.executeQuery(cons);
            if(rs.next()){
                return rs.getInt("ESTADO");
            }
            instruccion.close();
            rs.close();
        }
        catch(SQLException e){
            return -1;
        }
        return 0;
    }
    
    public int getId(){
        String cons = "SELECT MAX(IDUSUARIO) AS MAX FROM USUARIOS";
        try{
            instruccion = conexion.createStatement();
            rs = instruccion.executeQuery(cons);
            if(rs.next()){
                return rs.getInt("MAX");
            }
            instruccion.close();
            rs.close();
        }
        catch(SQLException e){
            return -1;
        }
        return -1;
    }
    public int insertarUsuario(Usuario u){
        String cons = "INSERT INTO USUARIOS VALUES("+u.getIdUsuario()+",'"+u.getNombreUsuario()+"'"
                + ",'"+u.getApellidoUsuario()+"','"+u.getSegundoApellidoUsuario()+"','"+u.getNif()+"',"
                + u.getTipoTarifa()+",'"+u.getDireccion()+"')";
        try{
            instruccion = conexion.createStatement();
            int nreg = instruccion.executeUpdate(cons);
            instruccion.close();
            return nreg;
        }
        catch(SQLException e){
            return -1;
        }
    }
    public int bajaUsuario(int cod){
        String cons = "DELETE FROM USUARIOS WHERE IDUSUARIO="+cod;
        try{
            instruccion = conexion.createStatement();
            int nreg = instruccion.executeUpdate(cons);
            instruccion.close();
            return nreg;
        }
        catch(SQLException e){
            return -1;
        }
    }
    public int modificarUsuario(Usuario u){
        String cons = "UPDATE USUARIOS SET NOMBRE='"+u.getNombreUsuario()+"'"
                + ",APELLIDO='"+u.getApellidoUsuario()+"', SEGUNDOAPELLIDO='"+u.getSegundoApellidoUsuario()+"', NIF='"+u.getNif()+"',IDTARIFA="
                + u.getTipoTarifa()+",DIRECCION='"+u.getDireccion()+"' WHERE IDUSUARIO="+u.getIdUsuario();
        try{
            instruccion = conexion.createStatement();
            int nreg = instruccion.executeUpdate(cons);
            instruccion.close();
            return nreg;
        }
        catch(SQLException e){
            return -1;
        }
    }
    
    public ArrayList getIncidencia(){
        String cons = "SELECT * FROM INCIDENCIAS";
        listaInci = new ArrayList();
        try{
            instruccion = conexion.createStatement();
            rs = instruccion.executeQuery(cons);
            while(rs.next()){
                listaInci.add(new Incidencia(rs.getInt("IDINCIDENCIA"), rs.getString("DESCRIPCION")));
            }
            instruccion.close();
            rs.close();
            return listaInci;
        }
        catch(SQLException e){
            return null;
        }
    }
    
    public int insertarIncidencia(Incidencia i){
        String cons = "INSERT INTO INCIDENCIAS VALUES("+i.getIdIncidencia()+",'"+i.getDescpricionIncidencia()+"')";
        try{
            instruccion = conexion.createStatement();
            int nreg = instruccion.executeUpdate(cons);
            instruccion.close();
            return nreg;
        }
        catch(SQLException e){
            return -1;
        }
    }
    
    public int getIdInci(){
        String cons = "SELECT MAX(IDINCIDENCIA) AS MAX FROM INCIDENCIAS";
        try{
            instruccion = conexion.createStatement();
            rs = instruccion.executeQuery(cons);
            if(rs.next()){
                return rs.getInt("MAX");
            }
            instruccion.close();
            rs.close();
        }
        catch(SQLException e){
            return -1;
        }
        return -1;
    }
    
    public Double getFacturacion(){
        String cons = "SELECT SUM(PRECIO) AS ENTRADAS FROM TARIFAS INNER JOIN USUARIOS ON TARIFAS.IDTARIFA = USUARIOS.IDTARIFA";
        try{
            instruccion = conexion.createStatement();
            rs = instruccion.executeQuery(cons);
            if(rs.next()){
                return rs.getDouble("ENTRADAS");
            }
            instruccion.close();
            rs.close();
        }
        catch(SQLException e){
            return -1.0;
        }
        return -1.0;
    }
    public Double getSueldos(){
        String cons = "SELECT SUM(SUELDO) AS SALIDAS FROM PERSONAL";
        try{
            instruccion = conexion.createStatement();
            rs = instruccion.executeQuery(cons);
            if(rs.next()){
                return rs.getDouble("SALIDAS");
            }
            instruccion.close();
            rs.close();
        }
        catch(SQLException e){
            return -1.0;
        }
        return -1.0;
    }

    
}
