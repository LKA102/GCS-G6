package vista.calendario;

import controladores.CtrlEstudiante;
import entidades.Tarea;
import com.mindfusion.common.DateTime;
import com.mindfusion.drawing.Colors;
import com.mindfusion.drawing.SolidBrush;
import com.mindfusion.scheduling.model.Appointment;
import com.mindfusion.scheduling.model.Style;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;

public class NuevaActividad extends javax.swing.JDialog {
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
        btnDescartar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnColor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        txtMinutoInicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        cmbMes = new javax.swing.JComboBox<>();
        cmbAnio = new javax.swing.JComboBox<>();
        txtTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoraFin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtRepeticion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtMinutoFin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        TxtDescripcion.setColumns(20);
        TxtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtDescripcion.setRows(5);
        jScrollPane1.setViewportView(TxtDescripcion);

        btnDescartar.setBackground(new java.awt.Color(238, 88, 115));
        btnDescartar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDescartar.setText("Descartar");
        btnDescartar.setBorderPainted(false);
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(60, 154, 156));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Descripción");

        btnColor.setBackground(new java.awt.Color(255, 255, 255));
        btnColor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnColorMouseMoved(evt);
            }
        });
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Color");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Hora de inicio");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Fecha (DD/MM/AA)");

        txtHoraInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMinutoInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMinutoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinutoInicioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Titulo");

        txtDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        cmbMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cmbAnio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cmbAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnioActionPerformed(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitulo.setName(""); // NOI18N
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(130, 239, 234));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR UNA ACTIVIDAD");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Hora de fin");

        txtHoraFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoraFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraFinActionPerformed(evt);
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
                                    .addComponent(txtTitulo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtHoraInicio)
                                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel9))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtRepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(btnDescartar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMes)
                    .addComponent(cmbAnio)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtMinutoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(TxtRepeticion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnColor, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescartar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        JColorChooser colorChooser = new JColorChooser();

        Color color = JColorChooser.showDialog(null, "Seleccione el color de la actividad", Color.black);

        btnColor.setBackground(color);
    }//GEN-LAST:event_btnColorActionPerformed

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        //Insertamos en la base de datos
        Tarea ta = new Tarea();
        
        ta.setTitulo(txtTitulo.getText());
        ta.setDescripcion(TxtDescripcion.getText());
        
        ta.setAnio(Integer.parseInt(cmbAnio.getSelectedItem().toString()));
        ta.setMes(mes());
        ta.setDia(Integer.parseInt(txtDia.getText()));
        
        ta.setHoraInicio(Integer.parseInt(txtHoraInicio.getText()));
        ta.setMinutoInicio(Integer.parseInt(txtMinutoInicio.getText()));
        
        ta.setHoraFin(Integer.parseInt(txtHoraFin.getText()));
        ta.setMinutoFin(Integer.parseInt(TxtMinutoFin.getText()));
        
        ta.setR(btnColor.getBackground().getRed());
        ta.setG(btnColor.getBackground().getGreen());
        ta.setB(btnColor.getBackground().getBlue());
       
        ta.setCodEstudiante(Calendario.user.getId());

        ta.setRepeticiones(Integer.parseInt(TxtRepeticion.getText()));
        
        CtrlEstudiante dato = null;
        try {
            dato = new CtrlEstudiante();
        } catch (IOException ex) {
            Logger.getLogger(NuevaActividad.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {//primera 
            dato.insertarTarea(ta);
        } catch (SQLException ex) {
            Logger.getLogger(NuevaActividad.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        // INSERTAMOS EN EL CALENDARIO
        
        this.app = new Appointment();
        String titulo = txtTitulo.getText();
        app.setHeaderText(titulo); // titulo
        
        String Descripcion = TxtDescripcion.getText();
        app.setDescriptionText(Descripcion);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date fecha;
        Date fechaFin;
        int horas = Integer.parseInt(txtHoraInicio.getText());
        int contRep = 1;//repeticiones semanales
        
        try {
            fecha = formato.parse(txtDia.getText() + "/" + mes() + "/" + cmbAnio.getSelectedItem().toString() + " " + txtHoraInicio.getText() + ":" + txtMinutoInicio.getText());
            DateTime primerDia = new DateTime(fecha); 
             
            fechaFin = formato.parse(txtDia.getText() + "/" + mes() + "/" + cmbAnio.getSelectedItem().toString() + " " + txtHoraFin.getText() + ":" + TxtMinutoFin.getText());
            DateTime finDia = new DateTime(fechaFin);
            
            app.setLocked(false);//no se modifica el item

            app.setStartTime(primerDia);
            app.setEndTime(finDia);
        } catch (ParseException ex) {
            Logger.getLogger(NuevaActividad.class.getName()).log(Level.SEVERE, null, ex);
        }
        Font fuente=new Font("TimesRoman", Font.BOLD, 12);
        Style estilo = app.getStyle();
        
        estilo.setLineColor(Colors.Black);

        estilo.setHeaderFont(fuente);
        estilo.setHeaderTextColor(Colors.Black);
        estilo.setBrush(new SolidBrush(btnColor.getBackground())); //color de fondo
        
        Calendario.calendario.getSchedule().getItems().add(app);//Agrega al calendario.
        this.setVisible(false);
                
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed

    }//GEN-LAST:event_txtTituloActionPerformed

    private void cmbAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnioActionPerformed

    }//GEN-LAST:event_cmbAnioActionPerformed

    private void btnColorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColorMouseMoved

    }//GEN-LAST:event_btnColorMouseMoved

    private void TxtRepeticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRepeticionActionPerformed

    }//GEN-LAST:event_TxtRepeticionActionPerformed

    private void txtHoraFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraFinActionPerformed

    }//GEN-LAST:event_txtHoraFinActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed

    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtMinutoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinutoInicioActionPerformed

    }//GEN-LAST:event_txtMinutoInicioActionPerformed
    
    private int mes(){ // retorna el numero del mes
        String mes = cmbMes.getSelectedItem().toString();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TxtDescripcion;
    private javax.swing.JTextField TxtMinutoFin;
    private javax.swing.JTextField TxtRepeticion;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbAnio;
    private javax.swing.JComboBox<String> cmbMes;
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
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtMinutoInicio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
