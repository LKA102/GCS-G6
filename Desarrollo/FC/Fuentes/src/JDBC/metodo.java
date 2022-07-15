/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LENOVO
 */
public class metodo {

    /**
     *
     */
    public static ConexionBD conexion = new ConexionBD();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero=0;
    
    public int guardar (String nombre, String apellido, String correo, String contraseña)
    {
        int resultado=0;
        Connection  conexion = null;
        
        String sentencia_guardar=("INSERT INTO tabla(nombre, apellido, correo, contraseña)VALUES (?,?,?,?)");
        try {
            conexion = (Connection) ConexionBD.conectar();
            
        } catch (Exception e) {
        }
        
        return 0;
    }
       
}
