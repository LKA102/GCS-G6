/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.calendario;

import Controladores.CtrlEstudiante;
import Entidades.Tarea;
import com.mindfusion.common.DateTime;
import com.mindfusion.drawing.Colors;
import com.mindfusion.drawing.SolidBrush;
import com.mindfusion.drawing.TextAlignment;
import static com.mindfusion.drawing.TextAlignment.TopCenter;
import static com.mindfusion.scheduling.Alignment.Center;
import com.mindfusion.scheduling.model.Appointment;
import com.mindfusion.scheduling.model.Style;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import java.time.LocalDate;

public class NuevaActividad extends javax.swing.JFrame {
    public static Appointment app;

    public NuevaActividad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDescripcion = new javax.swing.JTextArea();
        BtnDescartar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BtnColor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtHoraInicio = new javax.swing.JTextField();
        TxtMinutoInicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtDia = new javax.swing.JTextField();
        CmbMes = new javax.swing.JComboBox<>();
        CmbAnio = new javax.swing.JComboBox<>();
        TxtTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtHoraFin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtRepeticion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtMinutoFin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        TxtDescripcion.setColumns(20);
        TxtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtDescripcion.setRows(5);
        jScrollPane1.setViewportView(TxtDescripcion);

        BtnDescartar.setBackground(new java.awt.Color(238, 88, 115));
        BtnDescartar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnDescartar.setText("Descartar");
        BtnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDescartarActionPerformed(evt);
            }
        });

        BtnGuardar.setBackground(new java.awt.Color(60, 154, 156));
        BtnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Descripción");

        BtnColor.setBackground(new java.awt.Color(255, 255, 255));
        BtnColor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnColorMouseMoved(evt);
            }
        });
        BtnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnColorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Color");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Hora de inicio");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Fecha (DD/MM/AA)");

        TxtHoraInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtMinutoInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Titulo");

        TxtDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        CmbMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        CmbAnio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CmbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        CmbAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbAnioActionPerformed(evt);
            }
        });

        TxtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTituloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(130, 239, 234));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR UNA ACTIVIDAD");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Hora de fin");

        TxtHoraFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtHoraFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHoraFinActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Repetición semanal");

        TxtRepeticion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtRepeticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRepeticionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText(":");

        TxtMinutoFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("/");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtTitulo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(TxtHoraInicio)
                                            .addComponent(TxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel9))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CmbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtMinutoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtRepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(BtnDescartar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbMes)
                    .addComponent(CmbAnio)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(TxtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtMinutoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(TxtRepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnColor, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDescartar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnColorActionPerformed
        JColorChooser colorChooser = new JColorChooser();

        Color color = JColorChooser.showDialog(null, "Seleccione el color de la actividad", Color.black);

        //jButton2.setForeground(color); //color de texto
        BtnColor.setBackground(color);
    }//GEN-LAST:event_BtnColorActionPerformed

    private void BtnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDescartarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BtnDescartarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        //int mes = mes();
        //System.out.println(primerDia.toString());

        this.app = new Appointment();
        String titulo = TxtTitulo.getText();
        app.setHeaderText(titulo); // titulo

        //String prioridad = PrioridadCombo.getSelectedItem().toString() + "\n";
        //String curso = CursoCombo.getSelectedItem().toString() + "\n";
        String Descripcion = TxtDescripcion.getText();
        app.setDescriptionText(Descripcion);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date fecha;
        Date fechaFin;
        int horas = Integer.parseInt(TxtHoraInicio.getText());
        int contRep=1;//repeticiones semanales
        int repeticiones = Integer.parseInt(TxtRepeticion.getText());
        
        try {
            fecha = formato.parse(TxtDia.getText() + "/" + mes() + "/" + CmbAnio.getSelectedItem().toString() + " " + TxtHoraInicio.getText() + ":" + TxtMinutoInicio.getText());
            DateTime primerDia = new DateTime(fecha); 
             
            fechaFin = formato.parse(TxtDia.getText() + "/" + mes() + "/" + CmbAnio.getSelectedItem().toString() + " " + TxtHoraFin.getText() + ":" + TxtMinutoFin.getText());
            DateTime finDia = new DateTime(fechaFin);
            //app.setAllowChangeStart(false);//no se modifica la hora de inicio
            //app.setAllowChangeEnd(false); //no se modifica la hora de termino
            app.setLocked(false);//no se modifica el item

            app.setStartTime(primerDia); // dia de hoy a las 12
            app.setEndTime(finDia);// hasta las 4 horas (de 0 a 5)(no se si suma 5 horas o va a la hora 5)
        } catch (ParseException ex) {
            Logger.getLogger(NuevaActividad.class.getName()).log(Level.SEVERE, null, ex);
        }
        Font fuente=new Font("TimesRoman", Font.BOLD, 12);
        Style estilo = app.getStyle();
        //estilo.setTextColor(new Color(0xFF,0x80,0x80,0x80));
        
        estilo.setLineColor(Colors.Black);
        //estilo.setFillColor(new Color(75, 144, 233));

        estilo.setHeaderFont(fuente);
        estilo.setHeaderTextColor(Colors.Black);
        estilo.setBrush(new SolidBrush(BtnColor.getBackground())); //color de fondo
        
        //Calendario.calendario.getItemSettings().getSelectedItemStyle().setLineColor(BtnColor.getBackground());
        Calendario.calendario.getSchedule().getItems().add(app);
        this.setVisible(false);
        
        //Insertamos en la base de datos
        Tarea ta = new Tarea();
        ta.setTitulo(TxtTitulo.getText());
        ta.setDescripcion(TxtDescripcion.getText());
        
        ta.setAnio(Integer.parseInt(CmbAnio.getSelectedItem().toString()));
        ta.setMes(mes());
        ta.setDia(Integer.parseInt(TxtDia.getText()));
        
        ta.setHoraInicio(Integer.parseInt(TxtHoraInicio.getText()));
        ta.setMinutoInicio(Integer.parseInt(TxtMinutoInicio.getText()));
        
        ta.setHoraFin(Integer.parseInt(TxtHoraFin.getText()));
        ta.setMinutoFin(Integer.parseInt(TxtMinutoFin.getText()));
        
        ta.setR(BtnColor.getBackground().getRed());
        ta.setG(BtnColor.getBackground().getGreen());
        ta.setB(BtnColor.getBackground().getBlue());
        
        ta.setCodEstudiante(Calendario.user.getId());
        CtrlEstudiante dato = new CtrlEstudiante();
        
        
        try {//primera 
            dato.insertarTarea(ta);
        } catch (SQLException ex) {
            Logger.getLogger(NuevaActividad.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(contRep != repeticiones){
            //aumentar 7 dias y registrar
            String mesDosDigitos = mes()+"";    //correccion de formato
            if (mes()<10){
                mesDosDigitos= "0"+mesDosDigitos;
            }
            LocalDate sigFecha = LocalDate.parse(CmbAnio.getSelectedItem().toString() + "-" +mesDosDigitos+ "-" + TxtDia.getText());
            while(contRep<repeticiones)  {
                try {
                    sigFecha = sigFecha.plusDays(7);
                    int sigDia = sigFecha.getDayOfMonth();
                    int sigMes = sigFecha.getMonthValue();
                    int sigAnio = sigFecha.getYear();
                    ta.setAnio(sigAnio);
                    ta.setMes(sigMes);
                    ta.setDia(sigDia);
                    dato.insertarTarea(ta);
                    contRep++;
                } catch (SQLException ex) {
                    Logger.getLogger(NuevaActividad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }; 
        
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TxtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTituloActionPerformed

    private void CmbAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbAnioActionPerformed

    private void BtnColorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnColorMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnColorMouseMoved

    private void TxtRepeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRepeticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRepeticionActionPerformed

    private void TxtHoraFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHoraFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHoraFinActionPerformed
    
    private int mes(){ // retorna el numero del mes
        String mes = CmbMes.getSelectedItem().toString();
        String[] meses = {"Enero","Febrero","Marzo","Abril",
                          "Mayo","Junio","Julio","Agosto",
                          "Septiembre","Octubre","Noviembre","Diciembre"};
        for(int i=0; i < 12;i++){
            if(meses[i].equals(mes)){
                return i+1;
            }
        }
        return 1;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnColor;
    private javax.swing.JButton BtnDescartar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JComboBox<String> CmbAnio;
    private javax.swing.JComboBox<String> CmbMes;
    private javax.swing.JTextArea TxtDescripcion;
    private javax.swing.JTextField TxtDia;
    private javax.swing.JTextField TxtHoraFin;
    private javax.swing.JTextField TxtHoraInicio;
    private javax.swing.JTextField TxtMinutoFin;
    private javax.swing.JTextField TxtMinutoInicio;
    private javax.swing.JTextField TxtRepeticion;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
