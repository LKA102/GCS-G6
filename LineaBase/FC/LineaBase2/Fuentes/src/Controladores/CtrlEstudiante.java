package Controladores;

import Entidades.Estudiante;
import JDBC.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTextField;

public class CtrlEstudiante {
    
    Connection conn;
    
    public CtrlEstudiante(){
        conn = ConexionBD.conectar();
    }
    
    public void registrar(Estudiante objEstudiante) throws SQLException{
        //Estableciendo la sentencia de inserción SQL
        String sql = "INSERT INTO estudiante (nombre_apellido, email, contraseña, facultad, escuela, plan) VALUES (?, ?, ?, ?, ?, ?);";
        PreparedStatement pstm_insert = conn.prepareStatement(sql);
        
        //Asignando parámetros de la sentencia
        pstm_insert.setString(1, objEstudiante.getNombreApellido());
        pstm_insert.setString(2, objEstudiante.getEmail());
        pstm_insert.setString(3, objEstudiante.getContraseña());
        pstm_insert.setString(4, objEstudiante.getFacultad());
        pstm_insert.setString(5, objEstudiante.getEscuela());
        pstm_insert.setString(6, objEstudiante.getPlan());
        
        //Manipulando, finalmente, la base de datos
        pstm_insert.executeUpdate();
    }
    
    public void verificarLogin(String usuario,String contraseña) throws SQLException, ClassNotFoundException{
        Connection objConexion = ConexionBD.conectar();
        //DefaultTableModel modelo =new DefaultTableModel();
        String sql = "SELECT * FROM Cuenta WHERE cuentaId = ?";
        String [] datos =new String[2];
        PreparedStatement st = objConexion.prepareStatement(sql);
        //st.setInt(1, cuentaId);
        try{
        //st = objConexion.conectar().createStatement();
        //ResultSet rs = st.executeQuery(sql);
        }catch (Exception e){
        }
    }
}
