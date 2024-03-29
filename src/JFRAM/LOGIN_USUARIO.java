/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFRAM;


/**
 *
 * @author cesar
 */
public class LOGIN_USUARIO extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    imagen_posicion imagen = new imagen_posicion();

    /**
     * Creates new form LOGIN_USUARIO
     */
    public LOGIN_USUARIO() {
        initComponents();
        imagen.escaralarLabel(label_logo, "/imagenes/logo.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        label_password = new javax.swing.JPanel();
        hu_tao = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        label_iniciar_sesion = new javax.swing.JLabel();
        label_pass = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        label_usuario1 = new javax.swing.JLabel();
        txt_usuario1 = new javax.swing.JTextField();
        jpas_password = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        labelentrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label_salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        label_password.setBackground(new java.awt.Color(255, 255, 255));
        label_password.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_password.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                label_passwordMouseDragged(evt);
            }
        });
        label_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_passwordMousePressed(evt);
            }
        });
        label_password.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hu_tao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hutao.jpg"))); // NOI18N
        hu_tao.setText("jLabel2");
        label_password.add(hu_tao, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, -30, 470, 790));

        label_logo.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        label_logo.setForeground(new java.awt.Color(255, 255, 255));
        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_password.add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 130, 90));

        label_iniciar_sesion.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        label_iniciar_sesion.setForeground(new java.awt.Color(0, 0, 0));
        label_iniciar_sesion.setText("INICIAR SESION ");
        label_password.add(label_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 430, 60));

        label_pass.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        label_pass.setForeground(new java.awt.Color(0, 0, 0));
        label_pass.setText("Contraseña");
        label_password.add(label_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 180, -1));

        separador.setBackground(new java.awt.Color(0, 0, 0));
        separador.setForeground(new java.awt.Color(0, 0, 0));
        label_password.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 520, 30));

        label_usuario1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        label_usuario1.setForeground(new java.awt.Color(0, 0, 0));
        label_usuario1.setText("Usuario");
        label_password.add(label_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 100, -1));

        txt_usuario1.setBackground(new java.awt.Color(0, 0, 0));
        txt_usuario1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_usuario1.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario1.setToolTipText("");
        txt_usuario1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuario1ActionPerformed(evt);
            }
        });
        label_password.add(txt_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 520, 30));

        jpas_password.setBackground(new java.awt.Color(0, 0, 0));
        jpas_password.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jpas_password.setForeground(new java.awt.Color(255, 255, 255));
        jpas_password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        label_password.add(jpas_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 520, 30));

        jPanel1.setBackground(new java.awt.Color(218, 218, 218));

        labelentrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        labelentrar.setForeground(new java.awt.Color(0, 0, 0));
        labelentrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelentrar.setText("Entrar");
        labelentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelentrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelentrar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        label_password.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 210, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        label_salir.setBackground(new java.awt.Color(0, 0, 0));
        label_salir.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        label_salir.setForeground(new java.awt.Color(0, 0, 0));
        label_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_salir.setText("X");
        label_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(label_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        label_password.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuario1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txt_usuario1ActionPerformed

    private void label_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_passwordMousePressed
        // TODO add your handling code here:
        xMouse= evt.getX();
        
        yMouse= evt.getY();
        
    }//GEN-LAST:event_label_passwordMousePressed

    private void label_passwordMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_passwordMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y-yMouse);
        
        
    }//GEN-LAST:event_label_passwordMouseDragged

    private void labelentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelentrarMouseClicked
        // TODO add your handling code here:
        CategoriasFrame cate = new CategoriasFrame();
        cate.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_labelentrarMouseClicked

    private void label_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_salirMouseClicked
        // TODO add your handling code here:
        dispose();
        setVisible(false);
    }//GEN-LAST:event_label_salirMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LOGIN_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_USUARIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel hu_tao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jpas_password;
    private javax.swing.JLabel label_iniciar_sesion;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_pass;
    private javax.swing.JPanel label_password;
    private javax.swing.JLabel label_salir;
    private javax.swing.JLabel label_usuario1;
    private javax.swing.JLabel labelentrar;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField txt_usuario1;
    // End of variables declaration//GEN-END:variables
}
