package vista.principal;

import javax.print.DocFlavor;
import javax.swing.JOptionPane;
import vista.registro.registro;
import JDBC.ConexionBD;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class login extends javax.swing.JFrame {
    private panel_control panel_control;
    private Object pc;
    public login() throws ClassNotFoundException {
        initComponents();
        ConexionBD objConexion = new ConexionBD();
        objConexion.conectar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ingresar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
        });

        exitTxt.setText("   X");
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(exitTxt)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel3.setText("USUARIO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 315, 69, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel4.setText("CONTRASEÑA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 395, -1, -1));

        userTxt.setForeground(new java.awt.Color(102, 102, 102));
        userTxt.setText("Ingrese su nombre de usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTxtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        jPanel2.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 344, 235, 22));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 367, 235, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 435, 235, 10));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel6.setText("Iniciar sesión");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 233, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 474, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciofollow.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 6, -1, -1));

        jPanel4.setBackground(new java.awt.Color(40, 158, 242));

        ingresar.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        ingresar.setText("  ENTRAR");
        ingresar.setToolTipText("");
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 480, -1, -1));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Registrarse");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 527, -1, -1));

        passTxt.setForeground(new java.awt.Color(153, 153, 153));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        jPanel2.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 418, 235, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        JOptionPane.showMessageDialog(this,"Intento de login con los datos:\nUsuario: "+ userTxt.getText()+ "\ncontraseña: "+ String.valueOf(passTxt.getPassword()),"Login", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ingresarMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        registro v=new registro();
        v.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked

    }//GEN-LAST:event_exitBtnMouseClicked

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        // TODO add your handling code here:
        exitBtn.setBackground(Color.red);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        // TODO add your handling code here:
        exitBtn.setBackground(Color.white);
    }//GEN-LAST:event_exitTxtMouseExited

    private void userTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_userTxtMouseClicked

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        // TODO add your handling code here:
        if (userTxt.getText().equals("Ingrese su nombre de usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("********");
            userTxt.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        // TODO add your handling code here:
        if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()){
            passTxt.setText("********");
            userTxt.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_passTxtMousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new login().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel ingresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
