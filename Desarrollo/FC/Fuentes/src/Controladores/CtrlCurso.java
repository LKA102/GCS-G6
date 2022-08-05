package controladores;

import entidades.Curso;
import jdbc.ConexionBD;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CtrlCurso {
    
    Connection conn;
    
    public CtrlCurso() throws IOException{
        conn = ConexionBD.conectar();
    }
    
    public Curso obtenerDatosCurso(int id) throws SQLException, IOException{
        Connection objConexion = ConexionBD.conectar();
        Curso obj_curso = new Curso();
        String sql = "SELECT * FROM curso WHERE id_curso =?";
        try(PreparedStatement ps = objConexion.prepareStatement(sql)){
            
            ps.setString(1, ""+id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                String timeinicio = rs.getString(13);
                String timeFin = rs.getString(14);
                String[] SeparadorTimeInicio = timeinicio.split(":");
                String[] SeparadorTimeFin = timeFin.split(":");
                
                String Fecha = rs.getString(15);
                String[] SeparadorFecha = Fecha.split("-");
                
                obj_curso.setId(Integer.parseInt(rs.getString(1)));
                obj_curso.setNombre(rs.getString(2));
                obj_curso.setDocente(rs.getString(3));
                obj_curso.setCantidad_semanas(Integer.parseInt(rs.getString(8)));
                obj_curso.setTipo(rs.getString(10));
                obj_curso.setCreditos(Integer.parseInt(rs.getString(11)));
                
                obj_curso.setHoraInicio(Integer.parseInt(SeparadorTimeInicio[0]));
                obj_curso.setMinutoInicio(Integer.parseInt(SeparadorTimeInicio[1]));
                
                obj_curso.setHoraFin(Integer.parseInt(SeparadorTimeFin[0]));
                obj_curso.setMinutoFin(Integer.parseInt(SeparadorTimeFin[1]));
                
                obj_curso.setDia(Integer.parseInt(SeparadorFecha[2]));
                obj_curso.setMes(Integer.parseInt(SeparadorFecha[1]));
                obj_curso.setAnio(Integer.parseInt(SeparadorFecha[0]));

                return obj_curso;
            }else{
                return obj_curso;
            }
        }catch (SQLException e){
            //e.printstackTrace();
        }
        
        return obj_curso;
    }
}
