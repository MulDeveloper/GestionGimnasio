
package Controlador;

import Modelo.Clase;
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
    private PreparedStatement pstmt;

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
    
}
