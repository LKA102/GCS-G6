package vista.calendario;


import vista.principal.*;
import entidades.Estudiante;
import controladores.CtrlEstudiante;
import entidades.Tarea;
import jdbc.ConexionBD;
import com.mindfusion.common.DateTime;
import com.mindfusion.common.Orientation;
import com.mindfusion.drawing.Colors;
import com.mindfusion.drawing.SolidBrush;
import com.mindfusion.scheduling.Calendar;
import com.mindfusion.scheduling.CalendarAdapter;
import com.mindfusion.scheduling.CalendarView;
import com.mindfusion.scheduling.ItemMouseEvent;
import com.mindfusion.scheduling.ThemeType;
import com.mindfusion.scheduling.WeekRangeHeaderStyle;
import com.mindfusion.scheduling.model.Appointment;
import com.mindfusion.scheduling.model.Recurrence;
import com.mindfusion.scheduling.model.RecurrenceEnd;
import com.mindfusion.scheduling.model.Style;
import com.mindfusion.scheduling.model.Task;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calendario extends JFrame {
    private String usuario = Login.userTxt.getText(), password = Login.passTxt.getText();
    private JPanel panelPerfil,panelPrincipal, PButton,PInfoUser, PBusqueda;
    private JLabel title, nombre, facultad, escuela, bienvenido,ciclo;
    private JButton btnAgregar,btnCambiarCont, btnCerrarSesion;
    public static Calendar calendario; //Se llama desde otro JForm.
    private JComboBox cbVista;
    private JTextField txtBuscar;
    private JLabel lupa;
    
    //Se llama desde otro JForm.
    public static Estudiante user;
    private Tarea tareas;
    
    public Calendario() throws ParseException, IOException{
        
        this.setLayout(null);
        this.setSize(950,950);
        
        //CALENDARIO
        calendario = new Calendar();
        calendario.setTheme(ThemeType.Standard);//tema del calendario
        calendario.getItemSettings().setHeaderSize(20);
        calendario.setCurrentView(CalendarView.SingleMonth);
        calendario.getWeekRangeSettings().setHeaderStyle(EnumSet.of(WeekRangeHeaderStyle.Title));
        calendario.setButtonSize(20);
        // añadiendo popup menu o menu emergente
        
        try {
            // edito los elemento que van a ir en el panel de perfil
            elementosPanelUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }
        obtenerTareas();
        obtenerCursos();
        
        // PANELES
        
        //PANEL DEL PERFIL
        panelPerfil = new JPanel();
        
        BorderLayout blperfil = new BorderLayout(10,10); // espacio horizontal y vertical
        panelPerfil.setLayout(blperfil);
        
            //Panel de información del usuario
            PInfoUser = new JPanel();
            PInfoUser.setLayout(new BoxLayout(PInfoUser, BoxLayout.Y_AXIS));
            PInfoUser.add(title);
            imagenPerfil();
            PInfoUser.add(bienvenido);
            PInfoUser.add(nombre);
            PInfoUser.add(facultad);
            PInfoUser.add(escuela);
            PInfoUser.add(ciclo);
            PInfoUser.add(Box.createRigidArea(new Dimension(300,100)));//definimos el ancho del panel
            PInfoUser.setBackground(Color.white);

            //Panel de opciones
            PButton = new JPanel();
            PButton.setLayout(new GridLayout(5,1,10,10)); // 5 filas 1 columna

            //padding de 10px a todos los lados
            PButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.white), BorderFactory.createEmptyBorder(10,10,10,10)));
            PButton.add(Box.createRigidArea(new Dimension(100,40)));// con el 40 defino el alto del boton
            PButton.add(btnAgregar); // 2da fila
            PButton.add(btnCambiarCont);// 3ra fila
            PButton.add(btnCerrarSesion);// 4ta fila

            //Prueba
            PButton.setBackground(Color.white);
        
        // añadiendo componentes al Panel de perfil de usuarios
        panelPerfil.add(PInfoUser,BorderLayout.NORTH);
        panelPerfil.add(PButton,BorderLayout.SOUTH);
        panelPerfil.setBackground(Color.white);
        
        
        //PANEL PRINCIPAL
        panelPrincipal = new JPanel();
        // BorderLayout para el panel principal
        BorderLayout blPrincipal = new BorderLayout(10,10);
        panelPrincipal.setLayout(blPrincipal);
        panelPrincipal.setBackground(Color.white);
        
            // panel de busqueda
            PBusqueda = new JPanel();
            PBusqueda.setLayout(new BoxLayout(PBusqueda, BoxLayout.X_AXIS));
            PBusqueda.setBackground(Color.white);
            //editamos los elementos del panel buscar
            elementoPanelBuscar();
            PBusqueda.add(Box.createRigidArea(new Dimension(150,30)));
            PBusqueda.add(txtBuscar);
            PBusqueda.add(lupa);
            PBusqueda.add(Box.createRigidArea(new Dimension(50,30)));
            PBusqueda.add(cbVista);
            PBusqueda.add(Box.createRigidArea(new Dimension(65,30)));
        
        panelPrincipal.add(Box.createRigidArea(new Dimension(50,30)),BorderLayout.WEST);
        panelPrincipal.add(PBusqueda,BorderLayout.NORTH);
        panelPrincipal.add(calendario,BorderLayout.CENTER);
        panelPrincipal.add(Box.createRigidArea(new Dimension(100,50)),BorderLayout.SOUTH);
        panelPrincipal.add(Box.createRigidArea(new Dimension(50,50)),BorderLayout.EAST);

        //FRAME
        this.setBackground(Color.white);
        BorderLayout bl = new BorderLayout();
        this.getContentPane().setLayout(bl);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panelPerfil,BorderLayout.WEST);
        this.add(panelPrincipal,BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        
        // CLICK EN LOS EVENTOS
        calendario.addCalendarListener(new CalendarAdapter(){
            @Override
            public void itemClick(ItemMouseEvent e){
                
                if (e.getClicks() != 1){//un click
                    return;
                }

                try {
                    int id = Integer.parseInt(e.getItem().getId());
                    if(e.getItem().getTask() != null){ // es una tarea
                        VerEditarEliminarActividad(id);
                    }else{ // es un curso
                        detalleCurso(id);
                    }
                    
                } catch (SQLException | IOException ex) {
                    Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                // ACTUALIZAR CALENDARIO
                calendario.getSchedule().getItems().removeAll(calendario.getSchedule().getItems());// elimina todos los items

                try {
                    obtenerTareas();// mostramos nuevamente
                    obtenerCursos();
                } catch (ParseException | IOException ex) {
                    Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void NuevaActividad() throws IOException{
        NuevaActividad nt = new NuevaActividad();
        calendario.resetDrag();
        nt.setLocationRelativeTo(null); // para centrar ventana
        nt.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        nt.setVisible(true);
        
        
        // ACTUALIZAR CALENDARIO
        calendario.getSchedule().getItems().removeAll(calendario.getSchedule().getItems());// elimina todos los items
        try {
            obtenerTareas();// mostramos nuevamente
            obtenerCursos();
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    // colocar int id entre los parentesis
    public void VerEditarEliminarActividad(int id) throws SQLException, IOException{
        VerEditarEliminarActividad vet = new VerEditarEliminarActividad(id);
        calendario.resetDrag();// para inhabilitar el calendario
        vet.setLocationRelativeTo(null);
        vet.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);// se habre como modal
        vet.setVisible(true);
    }
    
    public void detalleCurso(int id) throws SQLException, IOException{
        DetalleCurso det = new DetalleCurso(id);
        calendario.resetDrag();// para inhabilitar el calendario
        det.setLocationRelativeTo(null);
        det.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);// se habre como modal
        det.setVisible(true);
        
    }
    
    private void cerrarSesion() throws ClassNotFoundException, IOException{
        this.setVisible(false);
        Login lg = new Login();
        lg.setVisible(true);
    }
    
    private void elementosPanelUsuario() throws SQLException, IOException{
        
        //consultamos la base de datos
        CtrlEstudiante datos = new CtrlEstudiante();
        user =  new Estudiante();
        user = datos.obtenerDatos(usuario, password);
        
        //ELEMENTOS
        Font fuenteTitulo = new Font("Arial", Font.BOLD, 32);
        title = new JLabel("FOLLOW CLASS");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(fuenteTitulo);
        title.setForeground(new Color(130, 239, 234));
        
        Font letra = new Font("Arial", Font.BOLD, 16);// para botones e informacion del usuario
        
        bienvenido = new JLabel("BIENVENIDO");
        bienvenido.setFont(letra);
        bienvenido.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        nombre = new JLabel(user.getNombreApellido());
        nombre.setFont(letra);
        nombre.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        facultad = new JLabel(user.getFacultad());
        facultad.setFont(letra);
        facultad.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        escuela = new JLabel(user.getEscuela());
        escuela.setFont(letra);
        escuela.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        ciclo = new JLabel(user.getCiclo());
        ciclo.setFont(letra);
        ciclo.setAlignmentX(Component.CENTER_ALIGNMENT);
         
        
        
        btnAgregar = new JButton("Agregar Tarea");
        ImageIcon iconoAgregar = new ImageIcon("src/Imagenes/boton-agregar.png");
        btnAgregar.setIcon(iconoAgregar);
        btnAgregar.setForeground(Color.white);// color del texto
        btnAgregar.setFont(letra);//definimos el tipo de letra
        btnAgregar.setBackground(new Color(41, 149, 125));//color de fondo
        
        btnAgregar.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    NuevaActividad();
                } catch (IOException ex) {
                    Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        //BOTON PRUEBA EDICION
        
        btnCambiarCont = new JButton("Cambiar contraseña");
        ImageIcon iconoEditar = new ImageIcon("src/Imagenes/editar.png");
        btnCambiarCont.setIcon(iconoEditar);
        btnCambiarCont.setForeground(Color.white);// color del texto
        btnCambiarCont.setFont(letra);//definimos el tipo de letra
        btnCambiarCont.setBackground(new Color(32, 92, 120));//color de fondo
        
        btnCerrarSesion = new JButton("Cerrar Sesión");
        ImageIcon iconoSalir = new ImageIcon("src/Imagenes/cerrar-sesion.png");
        btnCerrarSesion.setIcon(iconoSalir);
        btnCerrarSesion.setForeground(Color.white);// color del texto
        btnCerrarSesion.setFont(letra);//definimos el tipo de letra
        btnCerrarSesion.setBackground(new Color(186, 19, 42));//color de fondo
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    cerrarSesion();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // panel de busqueda y seleccion de vistas
    private void elementoPanelBuscar(){
        cbVista = new JComboBox();
        cbVista.addItem("Vista Mensual");
        cbVista.addItem("Vista Semanal");
        cbVista.addItem("Vista Diaria");
        cbVista.setSize(300, 30);
        Font letra2 = new Font("Arial", Font.PLAIN, 16);
        cbVista.setForeground(Color.white);// color del texto
        cbVista.setFont(letra2);//definimos el tipo de letra
        cbVista.setBackground(new Color(116, 184, 238));
        
        cbVista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // Aquí hacemos lo que queramos hacer.
               if("Vista Mensual".equals(cbVista.getSelectedItem().toString())){
                   calendario.setTheme(ThemeType.Standard);
                   calendario.setCurrentView(CalendarView.SingleMonth);
               }
               if("Vista Semanal".equals(cbVista.getSelectedItem().toString())){
                   calendario.setTheme(ThemeType.Light);
                   calendario.getListViewSettings().setOrientation(Orientation.Horizontal);
                   	
                   calendario.getListViewSettings().setMainHeaderSize(25);
                   calendario.getListViewSettings().setRotateHeaderTexts(false);
                   calendario.setCurrentView(CalendarView.List);
                   calendario.getListViewSettings().setNumberOfCells(7);
                   calendario.getListViewSettings().setShowNavigationButtons(true);
               }
               if("Vista Diaria".equals(cbVista.getSelectedItem().toString())){
                   calendario.setTheme(ThemeType.Standard);
                   calendario.setCurrentView(CalendarView.Timetable);
                   calendario.getTimetableSettings().setCellSize(40);
                   calendario.getTimetableSettings().setShowNavigationButtons(true);
               }
            }
        });
        
        txtBuscar = new JTextField();
        lupa = new JLabel();
        lupa.setIcon(new ImageIcon(getClass().getResource("/imagenes/lupa.png")));
        
        
    }
    
    private void imagenPerfil(){
        JLabel imagen = new JLabel();
        imagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/usuario.png")));
        imagen.setSize(10, 156);
        JPanel img = new JPanel();
        img.setBackground(Color.WHITE);
        img.add(imagen);
        PInfoUser.add(img);
    }
    
    private void obtenerTareas() throws ParseException, IOException{
        Connection objConexion = ConexionBD.conectar();
        
        Date fecha;
        Date fechaFin;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String sql = "SELECT * FROM tareas WHERE id_estudiante =?";
        int r,g,b;
        String fechatxt = "";
        int cont = 0;
        try(PreparedStatement ps = objConexion.prepareStatement(sql)){
            
            ps.setString(1, ""+user.getId());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Appointment item = new Appointment();
                Style estilo = item.getStyle();
                estilo.setLineColor(Colors.Black);
                estilo.setHeaderTextColor(Colors.Black);
                item.setId(rs.getString("id_tarea"));// pasamos el id al item
                item.setHeaderText(rs.getString("titulo"));
                
                item.setDescriptionText(rs.getString("descripcion"));
                
                fechatxt = rs.getString("fecha").substring(8, 10) + "/" + rs.getString("fecha").substring(5, 7) + "/" + rs.getString("fecha").substring(0, 4);
                fecha = formato.parse(fechatxt + " " + rs.getString("hora_inicio"));
                DateTime primerDia = new DateTime(fecha);
                
                fechaFin = formato.parse(fechatxt + " " + rs.getString("hora_fin"));
                
                DateTime finDia = new DateTime(fechaFin);
                
                item.setStartTime(primerDia); // dia de hoy a las 12
                item.setEndTime(finDia);
                
                r = Integer.parseInt(rs.getString("color_r"));
                g = Integer.parseInt(rs.getString("color_g"));
                b = Integer.parseInt(rs.getString("color_b"));
                estilo.setBrush(new SolidBrush(new Color(r,g,b))); //color de fondo      
                
                Task tarea = new Task(); // como distintivo de las tareas le agrego un task
                tarea.setName("tarea");
                item.setTask(tarea);
                
                //AGREGAMOS RECURRENCIA
                Recurrence re = new Recurrence();
                re.setWeeks(1);// 1 vez por semana 
                re.setStartDate(primerDia);//desde este dia es que realiza la recurrencia

                re.setDaysOfWeek(EnumSet.of(primerDia.getDayOfWeek()));// pasamos el dia de la semana que tiene la fecha primerDia, en este caso es martes, por lo que se repite cada martes
                
                re.setNumOccurrences(Integer.parseInt(rs.getString("repeticiones"))); // numero de ocurrencias
                re.setRecurrenceEnd(RecurrenceEnd.NumOccurrences); // asignamos el numero de ocurrencias
                
                item.setRecurrence(re);
                
                // AGREGAMOS EL ITEM AL CALENDARIO
                calendario.getSchedule().getItems().add(item);
                cont++;
            }
        }catch (SQLException e){
            System.out.println("uno un problema...");
        }
    }
    
    private void obtenerCursos() throws ParseException, IOException{
        Connection objConexion = ConexionBD.conectar();
        String sql = "SELECT * FROM curso WHERE ciclo =?";
        
        Date fecha;
        Date fechaFin;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        int r,g,b;
        String fechatxt = "";
        int cont = 0;
        try(PreparedStatement ps = objConexion.prepareStatement(sql)){
            
            ps.setString(1, ""+user.getCiclo());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Appointment item = new Appointment();
                Style estilo = item.getStyle();
                estilo.setLineColor(Colors.Black);
                //estilo.setHeaderFont(fuente);
                estilo.setHeaderTextColor(Colors.Black);
                item.setId(rs.getString("id_curso"));// pasamos el id al item
                item.setHeaderText(rs.getString("nombre"));
                
                item.setDescriptionText("Docente: " + rs.getString("docente") + "\nPlan: " + rs.getString("plan") + "\nPeriodo academico: " + rs.getString("periodo_academico"));
                
                fechatxt = rs.getString("fecha_inicio").substring(8, 10) + "/" + rs.getString("fecha_inicio").substring(5, 7) + "/" + rs.getString("fecha_inicio").substring(0, 4);
                fecha = formato.parse(fechatxt + " " + rs.getString("hora_inicio"));
                DateTime primerDia = new DateTime(fecha);
                
                fechaFin = formato.parse(fechatxt + " " + rs.getString("hora_fin"));
                DateTime finDia = new DateTime(fechaFin);
                
                item.setStartTime(primerDia); // dia de hoy a las 12
                item.setEndTime(finDia);
                
                // bloquemos el item
                item.setAllowMove(false);
                item.setLocked(true);
                
                // insertamos el item
                calendario.getSchedule().getItems().add(item);
                
                Recurrence re = new Recurrence();
                re.setWeeks(1);// 1 vez por semana 
                re.setStartDate(primerDia);//desde este dia es que realiza la recurrencia

                re.setDaysOfWeek(EnumSet.of(primerDia.getDayOfWeek()));// pasamos el dia de la semana que tiene la fecha primerDia, en este caso es martes, por lo que se repite cada martes
                
                re.setNumOccurrences(Integer.parseInt(rs.getString("cantidad_semanas"))); // numero de ocurrencias
                re.setRecurrenceEnd(RecurrenceEnd.NumOccurrences); // asignamos el numero de ocurrencias
                
                item.setRecurrence(re);
                
                
                cont++;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}