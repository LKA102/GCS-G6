package Controladores;

import Entidades.Estudiante;
import Entidades.Tarea;
import JDBC.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public boolean verificarLogin(String usuario,String contraseña) throws SQLException, ClassNotFoundException{
        Connection objConexion = ConexionBD.conectar();
        //DefaultTableModel modelo =new DefaultTableModel();
        String sql = "SELECT nombre_apellido, contraseña FROM estudiante WHERE nombre_apellido ='" + usuario +"' and contraseña = '" + contraseña +"'";
        ResultSet rs =  null;
        PreparedStatement ps = null;
        try{
            //Statement st = (Statement) objConexion.createStatement();
            ps = objConexion.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        }catch (SQLException e){
            
            //e.printstackTrace();
        }
        return false;
    }
    public Estudiante obtenerDatos(String usuario,String contraseña) throws SQLException{
        Connection objConexion = ConexionBD.conectar();
        Estudiante user = new Estudiante();
        //DefaultTableModel modelo =new DefaultTableModel();
        String sql = "SELECT * FROM estudiante WHERE nombre_apellido ='" + usuario +"' and contraseña = '" + contraseña +"'";
        ResultSet rs =  null;
        PreparedStatement ps = null;
        try{
            //Statement st = (Statement) objConexion.createStatement();
            ps = objConexion.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                user.setId(Integer.parseInt(rs.getString(1)));
                user.setNombreApellido(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setFacultad(rs.getString(5));
                user.setEscuela(rs.getString(6));
                user.setPlan(rs.getString(7));
                return user;
            }else{
                return user;
            }
        }catch (SQLException e){
            
            //e.printstackTrace();
        }
        return user;
    }
    public void insertarTarea(Tarea ObjTarea) throws SQLException{
        String fecha = String.valueOf(ObjTarea.getAnio())+"/"+String.valueOf(ObjTarea.getMes())+"/"+String.valueOf(ObjTarea.getDia());
        String horaInicio = String.valueOf(ObjTarea.getHoraInicio()) + ":" + String.valueOf(ObjTarea.getMinutoInicio()+ ":00");
        String horaFin = String.valueOf(ObjTarea.getHoraFin()) + ":" + String.valueOf(ObjTarea.getMinutoFin()+ ":00");
        String sql = "INSERT INTO tareas (titulo, fecha, hora_inicio, hora_fin, color_r,color_g,color_b,descripcion,id_estudiante) VALUES ( ?, ?, ?, ?, ?, ?,?, ?, ?);";
        
        PreparedStatement pstm_insert = conn.prepareStatement(sql);
        
        //Asignando parámetros de la sentencia
        pstm_insert.setString(1, ObjTarea.getTitulo());
        pstm_insert.setString(2, fecha);
        pstm_insert.setString(3, horaInicio);
        pstm_insert.setString(4, horaFin);
        pstm_insert.setString(5, String.valueOf(ObjTarea.getR()));
        pstm_insert.setString(6, String.valueOf(ObjTarea.getG()));
        pstm_insert.setString(7, String.valueOf(ObjTarea.getB()));
        pstm_insert.setString(8, ObjTarea.getDescripcion());
        pstm_insert.setString(9, String.valueOf(ObjTarea.getCodEstudiante()));
        //pstm_insert.setString(1, ObjTarea.getDescripcion());
        //Manipulando, finalmente, la base de datos
        pstm_insert.executeUpdate();
        
    }
    
    
    
}
