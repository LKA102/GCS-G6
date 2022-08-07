package controladores;

import entidades.Estudiante;
import entidades.Tarea;
import jdbc.ConexionBD;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.calendario.NuevaActividad;

public class CtrlEstudiante {
    
    Connection conn;
    
    public CtrlEstudiante() throws IOException{
        conn = ConexionBD.conectar();
    }
    
    public void registrar(Estudiante objEstudiante) throws SQLException{
        //Estableciendo la sentencia de inserción SQL
        String sql = "INSERT INTO estudiante (nombre_apellido, email, contraseña, facultad, escuela, plan,ciclo) VALUES (?, ?, ?, ?, ?, ?,?);";
        try(PreparedStatement pstm_insert = conn.prepareStatement(sql)){
            //Asignando parámetros de la sentencia
            pstm_insert.setString(1, objEstudiante.getNombreApellido());
            pstm_insert.setString(2, objEstudiante.getEmail());
            pstm_insert.setString(3, objEstudiante.getContraseña());
            pstm_insert.setString(4, objEstudiante.getFacultad());
            pstm_insert.setString(5, objEstudiante.getEscuela());
            pstm_insert.setString(6, objEstudiante.getPlan());
            pstm_insert.setString(7, objEstudiante.getCiclo());
            //Manipulando, finalmente, la base de datos
            pstm_insert.executeUpdate();
        }
    }
    
    public boolean verificarLogin(String usuario,String contrasenia) throws SQLException, ClassNotFoundException, IOException{
        Connection objConexion = ConexionBD.conectar();
        String sql = "SELECT nombre_apellido, contraseña FROM estudiante WHERE nombre_apellido =? and contraseña = ?";

        try(PreparedStatement ps = objConexion.prepareStatement(sql)){
            
            ps.setString(1, ""+usuario);
            ps.setString(2, ""+contrasenia);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        }catch (SQLException e){
            Logger.getLogger(CtrlEstudiante.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public Estudiante obtenerDatos(String usuario,String contrasenia) throws SQLException, IOException{
        Connection objConexion = ConexionBD.conectar();
        Estudiante user = new Estudiante();
        String sql = "SELECT * FROM estudiante WHERE nombre_apellido =? and contraseña = ?";

        try(PreparedStatement ps = objConexion.prepareStatement(sql)){
            
            ps.setString(1, ""+usuario);
            ps.setString(2, ""+contrasenia);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                user.setId(Integer.parseInt(rs.getString(1)));
                user.setNombreApellido(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setFacultad(rs.getString(5));
                user.setEscuela(rs.getString(6));
                user.setPlan(rs.getString(7));
                user.setCiclo(rs.getString(8));
                return user;
            }else{
                return user;
            }
        }catch (SQLException e){
            Logger.getLogger(CtrlEstudiante.class.getName()).log(Level.SEVERE, null, e);
        }
        return user;
    }
    
    public void insertarTarea(Tarea ObjTarea) throws SQLException{
        String fecha = String.valueOf(ObjTarea.getAnio())+"-"+String.valueOf(ObjTarea.getMes())+"-"+String.valueOf(ObjTarea.getDia());
        String horaInicio = String.valueOf(ObjTarea.getHoraInicio()) + ":" + String.valueOf(ObjTarea.getMinutoInicio()+ ":00");
        String horaFin = String.valueOf(ObjTarea.getHoraFin()) + ":" + String.valueOf(ObjTarea.getMinutoFin()+ ":00");
        String sql = "INSERT INTO tareas (titulo, fecha, hora_inicio, hora_fin, color_r,color_g,color_b,descripcion,id_estudiante,repeticiones) VALUES ( ?, ?, ?, ?, ?, ?,?, ?, ?,?);";
        
        try(PreparedStatement pstm_insert = conn.prepareStatement(sql)){
            //Asignando parámetros de la sentencia
            pstm_insert.setString(1, ObjTarea.getTitulo());
            pstm_insert.setDate(2, Date.valueOf(fecha));
            pstm_insert.setTime(3, Time.valueOf(horaInicio));
            pstm_insert.setTime(4, Time.valueOf(horaFin));
            pstm_insert.setInt(5, ObjTarea.getR());
            pstm_insert.setInt(6, ObjTarea.getG());
            pstm_insert.setInt(7, ObjTarea.getB());
            pstm_insert.setString(8, ObjTarea.getDescripcion());
            pstm_insert.setInt(9, ObjTarea.getCodEstudiante());
            pstm_insert.setInt(10,ObjTarea.getRepeticiones());
            //Manipulando, finalmente, la base de datos
            pstm_insert.executeUpdate();
        }catch (SQLException e){
            Logger.getLogger(CtrlEstudiante.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void editarTarea(Tarea ObjTarea) throws SQLException{
        String fecha = String.valueOf(ObjTarea.getAnio())+"-"+String.valueOf(ObjTarea.getMes())+"-"+String.valueOf(ObjTarea.getDia());
        String horaInicio = String.valueOf(ObjTarea.getHoraInicio()) + ":" + String.valueOf(ObjTarea.getMinutoInicio()+ ":00");
        String horaFin = String.valueOf(ObjTarea.getHoraFin()) + ":" + String.valueOf(ObjTarea.getMinutoFin()+ ":00");
        String sql = "UPDATE tareas SET titulo = ?, fecha = ?, hora_inicio = ?, hora_fin = ?, color_r = ?, color_g = ?, color_b = ?, descripcion = ?, repeticiones = ? WHERE id_tarea = ?";
        
        try(PreparedStatement pstm_edit = conn.prepareStatement(sql)){
            //Asignando parámetros de la sentencia
            pstm_edit.setString(1, ObjTarea.getTitulo());
            pstm_edit.setDate(2, Date.valueOf(fecha));
            pstm_edit.setTime(3, Time.valueOf(horaInicio));
            pstm_edit.setTime(4, Time.valueOf(horaFin));
            pstm_edit.setInt(5, ObjTarea.getR());
            pstm_edit.setInt(6, ObjTarea.getG());
            pstm_edit.setInt(7, ObjTarea.getB());
            pstm_edit.setString(8, ObjTarea.getDescripcion());
            pstm_edit.setInt(9, ObjTarea.getRepeticiones());
            pstm_edit.setInt(10,ObjTarea.getid());
            pstm_edit.executeUpdate();
        }catch (SQLException e){
            Logger.getLogger(CtrlEstudiante.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void eliminarTarea(int id) throws SQLException{
        String sql = "DELETE FROM tareas WHERE id_tarea = ?";
        try(PreparedStatement pstm_eliminar = conn.prepareStatement(sql)){
            //Asignando parámetros de la sentencia
            pstm_eliminar.setInt(1, id);        
            pstm_eliminar.executeUpdate();
        }
    }
    
    public Tarea obtenerDatosTarea(int id) throws SQLException, IOException{
        Connection objConexion = ConexionBD.conectar();
        Tarea obj_tarea = new Tarea();
        String sql = "SELECT * FROM tareas WHERE id_tarea =?";

        try(PreparedStatement ps = objConexion.prepareStatement(sql)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                String timeinicio = rs.getString(4);
                String timeFin = rs.getString(5);
                String[] SeparadorTimeInicio = timeinicio.split(":");
                String[] SeparadorTimeFin = timeFin.split(":");
                
                String Fecha = rs.getString(3);
                String[] SeparadorFecha = Fecha.split("-");
                
                obj_tarea.setid(Integer.parseInt(rs.getString(1)));
                obj_tarea.setTitulo(rs.getString(2));
                obj_tarea.setHoraInicio(Integer.parseInt(SeparadorTimeInicio[0]));
                obj_tarea.setMinutoInicio(Integer.parseInt(SeparadorTimeInicio[1]));
                obj_tarea.setHoraFin(Integer.parseInt(SeparadorTimeFin[0]));
                obj_tarea.setMinutoFin(Integer.parseInt(SeparadorTimeFin[1]));
                obj_tarea.setDia(Integer.parseInt(SeparadorFecha[2]));
                obj_tarea.setMes(Integer.parseInt(SeparadorFecha[1]));
                obj_tarea.setAnio(Integer.parseInt(SeparadorFecha[0]));
                obj_tarea.setR(Integer.parseInt(rs.getString(6)));
                obj_tarea.setG(Integer.parseInt(rs.getString(7)));
                obj_tarea.setB(Integer.parseInt(rs.getString(8)));
                obj_tarea.setDescripcion(rs.getString(9));
                obj_tarea.setRepeticiones(Integer.parseInt(rs.getString(11)));
                return obj_tarea;
            }else{
                return obj_tarea;
            }
        }catch (SQLException e){
            Logger.getLogger(CtrlEstudiante.class.getName()).log(Level.SEVERE, null, e);
        }
        return obj_tarea;
    }
}