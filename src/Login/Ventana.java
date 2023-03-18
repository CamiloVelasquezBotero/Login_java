
package Login;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        etiquetaAvatar = new javax.swing.JLabel();
        botonEnter = new javax.swing.JButton();
        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaContraseña = new javax.swing.JLabel();
        cajaUser = new javax.swing.JTextField();
        cajaContraseña = new javax.swing.JPasswordField();
        etiquetaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalir.setBackground(new java.awt.Color(0, 0, 204));
        botonSalir.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panel.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 10, 70, 30));

        etiquetaAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar.png"))); // NOI18N
        panel.add(etiquetaAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, 110));

        botonEnter.setBackground(new java.awt.Color(153, 153, 153));
        botonEnter.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        botonEnter.setText("Enter");
        botonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnterActionPerformed(evt);
            }
        });
        panel.add(botonEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 80, 30));

        etiquetaUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuario.setText("Usuario:");
        panel.add(etiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, 30));

        etiquetaContraseña.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaContraseña.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaContraseña.setText("Contraseña:");
        panel.add(etiquetaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 140, 30));

        cajaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUserActionPerformed(evt);
            }
        });
        panel.add(cajaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 190, 30));

        cajaContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaContraseñaActionPerformed(evt);
            }
        });
        panel.add(cajaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 190, 30));

        etiquetaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        etiquetaFondo.setText("Usuario");
        panel.add(etiquetaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void cajaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaUserActionPerformed

    private void cajaContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaContraseñaActionPerformed

    private void botonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnterActionPerformed
        String usuarioCorrecto = "camilo";
        String contraseñaCorrecta = "programacion";
        
        if(usuarioCorrecto.equals(cajaUser.getText())){
            String contraseña="";
            
            for(int i=0; i<cajaContraseña.getPassword().length; i++){
                contraseña += cajaContraseña.getPassword()[i];
            }
            
            if(contraseñaCorrecta.equals(contraseña)){
                JOptionPane.showMessageDialog(null, "¡Ingresaste al sistema!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto.");
        }
    }//GEN-LAST:event_botonEnterActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnter;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPasswordField cajaContraseña;
    private javax.swing.JTextField cajaUser;
    private javax.swing.JLabel etiquetaAvatar;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaFondo;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
