package Vista;

import Modelo.Usuario;
import Datos.DatosUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class VentanaPreguntasSeguridad extends javax.swing.JFrame {

    public VentanaPreguntasSeguridad() {
        initComponents();
        this.ImagenComoFondo();
        this.LabelNoVisible();
        setExtendedState(MAXIMIZED_BOTH);
        LlenarCBPreguntas();
        txtRespuesta1.setEnabled(false);
        txtRespuesta2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JFormattedTextField();
        lblNombreDeUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbPreguntas1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRespuesta1 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRespuesta2 = new javax.swing.JFormattedTextField();
        lblRespuesta1 = new javax.swing.JLabel();
        lblRespuesta2 = new javax.swing.JLabel();
        cbPreguntas2 = new javax.swing.JComboBox<>();
        btnBuscarUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAnterior.png"))); // NOI18N
        btnAnterior.setBorderPainted(false);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Preguntas de seguridad ");

        btnContinuar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite su nombre de usuario:");

        lblNombreDeUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblNombreDeUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblNombreDeUsuario.setText("Mensaje de error");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pregunta de seguridad #1");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Respuesta:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pregunta de seguridad #2");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Respuesta:");

        lblRespuesta1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblRespuesta1.setForeground(new java.awt.Color(255, 0, 0));
        lblRespuesta1.setText("Mensaje de error");

        lblRespuesta2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblRespuesta2.setForeground(new java.awt.Color(255, 0, 0));
        lblRespuesta2.setText("Mensaje de error");

        btnBuscarUser.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBuscarUser.setText("Buscar");
        btnBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRespuesta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBuscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRespuesta2)
                                    .addComponent(cbPreguntas2, 0, 335, Short.MAX_VALUE)
                                    .addComponent(txtLogin)
                                    .addComponent(cbPreguntas1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRespuesta1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(jLabel1)))
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreDeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbPreguntas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRespuesta1)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbPreguntas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRespuesta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAnterior)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        Usuario userFind = new Usuario();
        Usuario userNew = new Usuario();
        userFind.setNombreLogin(txtLogin.getText().toLowerCase().trim());
        try {
            userNew = datosUsuario.leerID(userFind);
            int preg1 = cbPreguntas1.getSelectedIndex(); // Indica la pregunta escogida por el usuario
            int preg2 = cbPreguntas2.getSelectedIndex(); // Indica la pregunta escogida por el usuario
            String preg_1 = "" + preg1;
            String preg_2 = "" + preg2;
            boolean seguir = false; // Esta variable permite el cambio de la pantalla, false = No cambia
            
            if (userNew == null) { //Verfica si existe el usuario
                lblNombreDeUsuario.setText("Usuario inexistente");
                lblNombreDeUsuario.setVisible(true);
            }
            if(preg1 != 0 && preg2 != 0){ // Las dos preguntas se respondieron
                userNew.setPreg1(preg_1 + txtRespuesta1.getText().toUpperCase());
                userNew.setPreg2(preg_2 + txtRespuesta2.getText().toUpperCase());
                lblRespuesta1.setVisible(false);
                lblRespuesta2.setVisible(false);
                seguir = true;
            }
            if(preg2 == 0 && preg1 != 0){ //Solo la primera pregunta se respondio
                userNew.setPreg1(preg_1 + txtRespuesta1.getText().toUpperCase());
                seguir = true;
            }
            if(preg2 != 0 && preg1 == 0){ //Solo la segunda respuesta se respondio
                userNew.setPreg2(preg_2 + txtRespuesta2.getText().toUpperCase());
                seguir = true;
            }
            if(preg1 == 0 && preg2 == 0){ //No se respondio ninguna pregunta, minimo tiene que ser 1
                lblRespuesta1.setText("Escoja una pregunta para responder");
                lblRespuesta2.setText("Escoja una pregunta para responder");
                lblRespuesta1.setVisible(true);
                lblRespuesta2.setVisible(true);
                seguir = false; 
            }
            datosUsuario.modificar(userNew, userNew.getIdUsuario(), userNew.getNombreLogin());
            if (seguir){
                ValidacionBotonContinuar();
            }
        } catch (Exception ex) {
            Logger.getLogger(VentanaEditarUsuarioAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUserActionPerformed
        Usuario userFind = new Usuario();
        Usuario userNew = new Usuario();
        userFind.setNombreLogin(txtLogin.getText().toLowerCase().trim());
        try {
            userNew = datosUsuario.leerID(userFind);
            if (userNew == null) {
                lblNombreDeUsuario.setText("Usuario inexistente");
                lblNombreDeUsuario.setVisible(true);
            }
            if (userNew != null) {
                lblNombreDeUsuario.setVisible(false);
                txtRespuesta1.setEnabled(true);
                txtRespuesta2.setEnabled(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(VentanaEditarUsuarioAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarUserActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPreguntasSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntasSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntasSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntasSeguridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPreguntasSeguridad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscarUser;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JComboBox<String> cbPreguntas1;
    private javax.swing.JComboBox<String> cbPreguntas2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblNombreDeUsuario;
    private javax.swing.JLabel lblRespuesta1;
    private javax.swing.JLabel lblRespuesta2;
    private javax.swing.JFormattedTextField txtLogin;
    private javax.swing.JFormattedTextField txtRespuesta1;
    private javax.swing.JFormattedTextField txtRespuesta2;
    // End of variables declaration//GEN-END:variables

    public void ImagenComoFondo() {
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/ImagenFondo.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }

    public void LabelNoVisible() {
        lblNombreDeUsuario.setVisible(false);
        lblRespuesta1.setVisible(false);
        lblRespuesta2.setVisible(false);
    }

    public void ValidacionBotonContinuar() {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        this.dispose();
        
    }

    DatosUsuario datosUsuario = new DatosUsuario();

    private void LlenarCBPreguntas() {
        cbPreguntas1.addItem("Seleccione una pregunta: ");
        cbPreguntas1.addItem("¿Cuál es su color favorito?");
        cbPreguntas1.addItem("¿Cómo se llama tu profesor favorito?");
        cbPreguntas1.addItem("¿Cuál era tu materia favorita en el colegio?");
        cbPreguntas1.addItem("¿Cómo se llama tu mascota?");
        cbPreguntas1.addItem("¿Cuál es tu género de musica preferido?");

        cbPreguntas2.addItem("Seleccione una pregunta: ");
        cbPreguntas2.addItem("¿Cuál es su color favorito?");
        cbPreguntas2.addItem("¿Cómo se llama tu profesor favorito?");
        cbPreguntas2.addItem("¿Cuál era tu materia favorita en el colegio?");
        cbPreguntas2.addItem("¿Cómo se llama tu mascota?");
        cbPreguntas2.addItem("¿Cuál es tu género de musica preferido?");
    }
}
