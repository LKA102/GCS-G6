package vista.calendario;


import vista.principal.*;
import Entidades.Estudiante;
import Controladores.CtrlEstudiante;
import Entidades.Tarea;
import JDBC.ConexionBD;
import com.mindfusion.common.DateTime;
import com.mindfusion.common.Orientation;
import com.mindfusion.drawing.Colors;
import com.mindfusion.drawing.SolidBrush;
import com.mindfusion.scheduling.Calendar;
import com.mindfusion.scheduling.CalendarView;
import com.mindfusion.scheduling.ResourceDateEvent;
import com.mindfusion.scheduling.ThemeType;
import com.mindfusion.scheduling.WeekRangeHeaderStyle;
import com.mindfusion.scheduling.model.Appointment;
import com.mindfusion.scheduling.model.Resource;
import com.mindfusion.scheduling.model.Style;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.MouseEvent;
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
    private String usuario = login.userTxt.getText(), password = login.passTxt.getText();
    private JPanel panelPerfil,panelPrincipal, PButton,PInfoUser, PBusqueda;
    private JLabel title, nombre, facultad, escuela, bienvenido;
    private JButton btnAgregar,btnCambiarCont, btnCerrarSesion;
    public static Calendar calendario;
    private JComboBox cbVista;
    private JTextField txtBuscar;
    private JLabel lupa;
    public static Estudiante user;
    
    private Tarea tareas;
    
    public Calendario() throws ParseException{
        
        this.setLayout(null);
        this.setSize(950,950);
        
        //CALENDARIO
        calendario = new Calendar();
        calendario.setTheme(ThemeType.Standard);//tema del calendario
        //calendario.setCurrentView(CalendarView.SingleMonth);//manejo de las vistas en el calendario
        calendario.getItemSettings().setHeaderSize(20);
        //calendario.beginInit();
        calendario.setCurrentView(CalendarView.SingleMonth);
        calendario.getWeekRangeSettings().setHeaderStyle(EnumSet.of(WeekRangeHeaderStyle.Title));
        calendario.setButtonSize(20);
        // añadiendo popup menu o menu emergente
        //popupMenu();
        
        
        
        try {
            // edito los elemento que van a ir en el panel de perfil
            elementosPanelUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }
        obtenerTareas();
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
            PInfoUser.add(Box.createRigidArea(new Dimension(300,100)));//definimos el ancho del panel
            PInfoUser.setBackground(Color.white);

            //Panel de opciones
            PButton = new JPanel();
            PButton.setLayout(new GridLayout(4,1,10,10)); // 4 filas 1 columna

            //padding de 10px a todos los lados
            PButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.white), BorderFactory.createEmptyBorder(10,10,10,10)));
            PButton.add(Box.createRigidArea(new Dimension(100,40)));// con el 40 defino el alto del boton
            PButton.add(btnAgregar);
            PButton.add(btnCambiarCont);
            PButton.add(btnCerrarSesion);
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
        //this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));
        this.setBackground(Color.white);
        //BorderLayout bl = new BorderLayout(10,10);
        BorderLayout bl = new BorderLayout();
        this.getContentPane().setLayout(bl);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.getContentPane().add(panelPerfil);
        //this.getContentPane().add(panelPrincipal);
        this.add(panelPerfil,BorderLayout.WEST);
        this.add(panelPrincipal,BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
    }
    public void EscogerCurso_Actividad(){
        EscogerCurso_Actividad nt = new EscogerCurso_Actividad();
        nt.setVisible(true);
        nt.setLocationRelativeTo(null); // para centrar ventana
        
    }
    
    public void NuevoCurso(){
        NuevoCurso nt = new NuevoCurso();
        nt.setVisible(true);
        nt.setLocationRelativeTo(null); // para centrar ventana

    }
    public void NuevaActividad(){
        NuevaActividad nt = new NuevaActividad();
        nt.setVisible(true);
        nt.setLocationRelativeTo(null); // para centrar ventana

    }
   
    private void elementosPanelUsuario() throws SQLException{
        
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
        
        btnAgregar = new JButton("Agregar");
        //btnAgregar.setSize(200,40);
        btnAgregar.setForeground(Color.white);// color del texto
        btnAgregar.setFont(letra);//definimos el tipo de letra
        btnAgregar.setBackground(new Color(41, 149, 125));//color de fondo
        
        btnAgregar.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //EscogerCurso_Actividad();
                //NuevoTarea();
                NuevaActividad();
            }
        });
        
        btnCambiarCont = new JButton("Cambiar contraseña");
        btnCambiarCont.setForeground(Color.white);// color del texto
        btnCambiarCont.setFont(letra);//definimos el tipo de letra
        btnCambiarCont.setBackground(new Color(32, 92, 120));//color de fondo
        
        btnCerrarSesion = new JButton("Cerrar Sesión");
        btnCerrarSesion.setForeground(Color.white);// color del texto
        btnCerrarSesion.setFont(letra);//definimos el tipo de letra
        btnCerrarSesion.setBackground(new Color(186, 19, 42));//color de fondo
       //btnCambiarCont.setAlignmentX(Component.CENTER_ALIGNMENT);
        
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
                   //Font letra3 = new Font("Arial", Font.PLAIN, 16);
                   //calendario.getListViewSettings().setHeaderFont(letra3);
                   //calendario.getListViewSettings().setHeaderSize(50);
                   //calendario.
                   //calendario.setTheme(ThemeType.Standard);
                   	
                   calendario.getListViewSettings().setMainHeaderSize(25);
                   //calendario.setButtonOffset(10);
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
        //txtBuscar.setMaximumSize(new Dimension(600,25));
        //txtBuscar.setMinimumSize(new Dimension(200,25));
        lupa = new JLabel();
        lupa.setIcon(new ImageIcon(getClass().getResource("/imagenes/lupa.png")));
        
        
    }
    
    private void imagenPerfil(){
        //ImageIcon imageIcon = new ImageIcon("/imagenes/usuario.png");
        
        //JLabel imagen = new JLabel(imageIcon);
        JLabel imagen = new JLabel();
        imagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/usuario.png")));
        imagen.setSize(10, 156);
        JPanel img = new JPanel();
        img.setBackground(Color.WHITE);
        img.add(imagen);
        PInfoUser.add(img);
    }
    private void obtenerTareas() throws ParseException{
        Connection objConexion = ConexionBD.conectar();
        String sql = "SELECT * FROM tareas WHERE id_estudiante ='" + user.getId() + "'";
        ResultSet rs =  null;
        PreparedStatement ps = null;
        
        Date fecha;
        Date fechaFin;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        int r,g,b;
        String fechatxt = "";
        int cont = 0;
        try{

            ps = objConexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Appointment item = new Appointment();
                Style estilo = item.getStyle();
                estilo.setLineColor(Colors.Black);
                //estilo.setHeaderFont(fuente);
                estilo.setHeaderTextColor(Colors.Black);
                
                item.setHeaderText(rs.getString("titulo"));
                
                item.setDescriptionText(rs.getString("descripcion"));
                
                fechatxt = rs.getString("fecha").substring(8, 10) + "/" + rs.getString("fecha").substring(5, 7) + "/" + rs.getString("fecha").substring(0, 4);
                fecha = formato.parse(fechatxt + " " + rs.getString("hora_inicio"));
                DateTime primerDia = new DateTime(fecha);
                
                //fechatxtfin = rs.getString("fecha").substring(8, 9) + rs.getString("fecha").substring(5, 6) + "/" + rs.getString("fecha").substring(0, 3);
                fechaFin = formato.parse(fechatxt + " " + rs.getString("hora_fin"));
                //System.out.println(fechaFin);
                DateTime finDia = new DateTime(fechaFin);
                
                item.setStartTime(primerDia); // dia de hoy a las 12
                item.setEndTime(finDia);
                //System.out.println(fechaFin);
                r = Integer.parseInt(rs.getString("color_r"));
                g = Integer.parseInt(rs.getString("color_g"));
                b = Integer.parseInt(rs.getString("color_b"));
                estilo.setBrush(new SolidBrush(new Color(r,g,b))); //color de fondo
                
                estilo.setLineColor(Colors.Black);
                //estilo.setFillColor(new Color(75, 144, 233));

                //estilo.setHeaderFont(fuente);
                estilo.setHeaderTextColor(Colors.Black);
                
                calendario.getSchedule().getItems().add(item);
                cont++;
            }
        }catch (SQLException e){
            System.out.println("uno un problema...");
        }
    }
/*
    private void clickDerechoItem(){
        ItemMouseEvent e;
    }*/
}