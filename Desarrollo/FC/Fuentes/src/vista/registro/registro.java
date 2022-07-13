package vista.registro;

import Controladores.CtrlEstudiante;
import Entidades.Estudiante;
import ExcepcionesPropias.DatoNoValido;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class registro extends javax.swing.JFrame {

    CtrlEstudiante ctrlEstudiante = new CtrlEstudiante();
    
    public registro() {
        initComponents();
    }

    private void limpiar(){
        userTxt.setText("");
        correoTxt.setText("");
        passTxt.setText("");
    }
    @SuppressWarnings("unchecked")
    /*private void limpiar(){
        userTxt.setText("");
        correoTxt.setText("");
        passTxt.setText("");
    }*/
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        correoTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        guardar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        facultadCombo = new javax.swing.JComboBox<>();
        escuelaCombo = new javax.swing.JComboBox<>();
        planCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });

        exitTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitTxt.setText("     X");
        exitTxt.setToolTipText("");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt))
        );

        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre del usuario");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        userTxt.setForeground(new java.awt.Color(153, 153, 153));
        userTxt.setText("Ingrese un nombre de usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        jPanel3.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 254, 21));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 254, 10));

        jLabel3.setText("Correo electrónico");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setText("Contraseña");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        correoTxt.setForeground(new java.awt.Color(153, 153, 153));
        correoTxt.setText("Ingrese correo electrónico");
        correoTxt.setBorder(null);
        correoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correoTxtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correoTxtMousePressed(evt);
            }
        });
        correoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoTxtActionPerformed(evt);
            }
        });
        jPanel3.add(correoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, 21));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 251, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 251, 10));

        jPanel2.setBackground(new java.awt.Color(40, 158, 242));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        guardar.setText("Registrarse");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guardar)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Unete a Follow Class");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        passTxt.setForeground(new java.awt.Color(153, 153, 153));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        jPanel3.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, -1));

        jPanel5.setBackground(new java.awt.Color(40, 158, 242));

        jLabel9.setText("Regresar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        jLabel4.setText("Facultad");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 254, 10));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 251, 10));

        jLabel10.setText("Plan de estudio");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 251, 10));

        jLabel11.setText("Escuela");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        facultadCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ciencias Biológicas", "Ciencias Físicas", "Ciencias Matemáticas", "Química e Ingeniería Química", "Farmacia y Bioquímica", "Medicina Humana", "Medicina Veterinaria", "Odontología", "Psicología", "Ciencias Administrativas", "Ciencias Contables", "Ciencias Económicas", "Educación", "Ciencias Sociales", "Derecho y Ciencia Política", "Letras y Ciencias Humanas", "Ciencias Físicas", "Ingeniería de Sistemas e Informática", "Ingeniería Electrónica y Eléctrica", "Ingeniería Geológica, Minera, Metalúrgica y Geográfica", "Ingeniería Industrial", "Química e Ingeniería Química" }));
        facultadCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultadComboActionPerformed(evt);
            }
        });
        jPanel3.add(facultadCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 250, -1));

        escuelaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Arte.", "Bibliotecología y Ciencias de la Información.", "Conservación y Restauración.", "Filosofía.", "Lingüística.", "Literatura.", "Ingeniería Industrial", "Ingeniería Civil", "Ingeniería Sistemas", "Ingeniería Software", "Ingeniería Ambiental", "Ingeniería Geográfica", "Ingeniería Eléctrica", "Ingeniería Biomédica", "Ingeniería Telecomunicaciones", " " }));
        escuelaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escuelaComboActionPerformed(evt);
            }
        });
        jPanel3.add(escuelaCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 250, -1));

        planCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2015", "2018" }));
        jPanel3.add(planCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 250, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 630, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoTxtActionPerformed

    private void escuelaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escuelaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escuelaComboActionPerformed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel2MouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        // TODO add your handling code here:
        
        try {
            if(userTxt.getText().equals("") || correoTxt.getText().equals("") || passTxt.getText().equals("")){
                throw new DatoNoValido("Debe completar todos los campos.");
            }
            
            Estudiante objestudiante = new Estudiante();

            objestudiante.setNombreApellido(userTxt.getText().trim());
            objestudiante.setEmail(correoTxt.getText().trim());
            objestudiante.setContraseña(String.valueOf(passTxt.getPassword()));
            objestudiante.setEscuela(escuelaCombo.getSelectedItem().toString());
            objestudiante.setFacultad(facultadCombo.getSelectedItem().toString());
            objestudiante.setPlan(planCombo.getSelectedItem().toString());

            ctrlEstudiante.registrar(objestudiante);
            
            JOptionPane.showMessageDialog(this, String.format("Estudiante %s registrado exitosamente",objestudiante.getNombreApellido()));
            limpiar();
            
        } catch (SQLException | DatoNoValido e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_guardarMouseClicked

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        exitBtn.setBackground(Color.red);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        // TODO add your handling code here:
        exitBtn.setBackground(Color.white);
    }//GEN-LAST:event_exitBtnMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        // TODO add your handling code here:
        if (userTxt.getText().equals("Ingrese un nombre de usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("********");
            userTxt.setForeground(Color.gray);  
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void correoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoTxtMousePressed
        // TODO add your handling code here:
        /*if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()){
            userTxt.setText("********");
            userTxt.setForeground(Color.gray);
            
        }*/
    }//GEN-LAST:event_correoTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        // TODO add your handling code here:
        if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()){
            userTxt.setText("********");
            userTxt.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void facultadComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultadComboActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_facultadComboActionPerformed

    private void correoTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_correoTxtMouseClicked

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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField correoTxt;
    private javax.swing.JComboBox<String> escuelaCombo;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JComboBox<String> facultadCombo;
    private javax.swing.JLabel guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JComboBox<String> planCombo;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables

}
