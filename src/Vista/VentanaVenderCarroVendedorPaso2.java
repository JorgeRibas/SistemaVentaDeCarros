package Vista;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaVenderCarroVendedorPaso2 extends javax.swing.JFrame {

    public VentanaVenderCarroVendedorPaso2() {
        initComponents();
        this.ImagenComoFondo();
        this.LabelNoVisible();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroTelefonico = new javax.swing.JFormattedTextField();
        txtCorreoElectronico = new javax.swing.JFormattedTextField();
        txtNumeroDeCedula = new javax.swing.JFormattedTextField();
        btnVenderCarro = new javax.swing.JButton();
        lblCampoEsIncorrectoNombre = new javax.swing.JLabel();
        lblCampoEsIncorrectoApellidos = new javax.swing.JLabel();
        lblCampoEsIncorrectoDireccion = new javax.swing.JLabel();
        lblCampoEsIncorrectoNumeroTelefonico = new javax.swing.JLabel();
        lblCampoEsIncorrectoCorreoElectronico = new javax.swing.JLabel();
        lblCampoEsIncorrectoNumeroDeCedula = new javax.swing.JLabel();
        cboFormaDePago = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCerrarSesion = new javax.swing.JMenu();
        menuCambiarIdioma = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuVenderCarro = new javax.swing.JMenu();
        menuVerCarrosPorTienda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vender carro");

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAnterior.png"))); // NOI18N
        btnAnterior.setBorderPainted(false);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos del cliente:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Forma de Pago:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Número telefónico:");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo electrónico:");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Número de cédula:");

        btnVenderCarro.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnVenderCarro.setText("Vender carro");
        btnVenderCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderCarroActionPerformed(evt);
            }
        });

        lblCampoEsIncorrectoNombre.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCampoEsIncorrectoNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblCampoEsIncorrectoNombre.setText("Campo es incorrecto");

        lblCampoEsIncorrectoApellidos.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCampoEsIncorrectoApellidos.setForeground(new java.awt.Color(255, 0, 0));
        lblCampoEsIncorrectoApellidos.setText("Campo es incorrecto");

        lblCampoEsIncorrectoDireccion.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCampoEsIncorrectoDireccion.setForeground(new java.awt.Color(255, 0, 0));
        lblCampoEsIncorrectoDireccion.setText("Campo es incorrecto");

        lblCampoEsIncorrectoNumeroTelefonico.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCampoEsIncorrectoNumeroTelefonico.setForeground(new java.awt.Color(255, 0, 0));
        lblCampoEsIncorrectoNumeroTelefonico.setText("Campo es incorrecto");

        lblCampoEsIncorrectoCorreoElectronico.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCampoEsIncorrectoCorreoElectronico.setForeground(new java.awt.Color(255, 0, 0));
        lblCampoEsIncorrectoCorreoElectronico.setText("Campo es incorrecto");

        lblCampoEsIncorrectoNumeroDeCedula.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCampoEsIncorrectoNumeroDeCedula.setForeground(new java.awt.Color(255, 0, 0));
        lblCampoEsIncorrectoNumeroDeCedula.setText("Campo es incorrecto");

        cboFormaDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "Paypal" }));

        menuCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonSalir.png"))); // NOI18N
        menuCerrarSesion.setText("Cerrar sesión");
        menuCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCerrarSesionMouseClicked(evt);
            }
        });
        menuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarSesionActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuCerrarSesion);

        menuCambiarIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonIdioma.png"))); // NOI18N
        menuCambiarIdioma.setText("Cambiar idioma");

        jMenuItem1.setText("Español");
        menuCambiarIdioma.add(jMenuItem1);

        jMenuItem2.setText("Inglés");
        menuCambiarIdioma.add(jMenuItem2);

        jMenuItem3.setText("Francés");
        menuCambiarIdioma.add(jMenuItem3);

        jMenuItem4.setText("Portugués");
        menuCambiarIdioma.add(jMenuItem4);

        jMenuBar1.add(menuCambiarIdioma);

        menuVenderCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoCarro2.png"))); // NOI18N
        menuVenderCarro.setText("Vender carro");
        menuVenderCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVenderCarroMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuVenderCarro);

        menuVerCarrosPorTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoTienda2.png"))); // NOI18N
        menuVerCarrosPorTienda.setText("Ver carros por tienda");
        menuVerCarrosPorTienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVerCarrosPorTiendaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuVerCarrosPorTienda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAnterior)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVenderCarro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cboFormaDePago, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCampoEsIncorrectoDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCampoEsIncorrectoApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(lblCampoEsIncorrectoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(229, 229, 229)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNumeroTelefonico)
                                            .addComponent(txtCorreoElectronico)
                                            .addComponent(txtNumeroDeCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(lblCampoEsIncorrectoNumeroTelefonico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCampoEsIncorrectoCorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCampoEsIncorrectoNumeroDeCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumeroTelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCampoEsIncorrectoNombre)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCampoEsIncorrectoNumeroTelefonico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCampoEsIncorrectoApellidos)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtNumeroDeCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCampoEsIncorrectoCorreoElectronico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCampoEsIncorrectoDireccion)
                    .addComponent(lblCampoEsIncorrectoNumeroDeCedula))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboFormaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(btnVenderCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnAnterior))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        VentanaVenderCarroVendedorPaso1 ventanaVenderCarroVendedor = new VentanaVenderCarroVendedorPaso1();
        ventanaVenderCarroVendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnVenderCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderCarroActionPerformed
        // TODO add your handling code here:
        this.BotonContinuarCarroConCamposVacios();
    }//GEN-LAST:event_btnVenderCarroActionPerformed

    private void menuCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarSesionMouseClicked
        // TODO add your handling code here:
        this.ValidacionSalirDelSistema();
    }//GEN-LAST:event_menuCerrarSesionMouseClicked

    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCerrarSesionActionPerformed

    private void menuVenderCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVenderCarroMouseClicked
        // TODO add your handling code here:
        VentanaVenderCarroVendedorPaso1 ventanaVenderCarroVendedor = new VentanaVenderCarroVendedorPaso1();
        ventanaVenderCarroVendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVenderCarroMouseClicked

    private void menuVerCarrosPorTiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVerCarrosPorTiendaMouseClicked
        // TODO add your handling code here:
        VentanaVerCarrosPorTiendaVendedor ventanaVerCarrosPorTienda = new VentanaVerCarrosPorTiendaVendedor();
        ventanaVerCarrosPorTienda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVerCarrosPorTiendaMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaVenderCarroVendedorPaso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVenderCarroVendedorPaso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVenderCarroVendedorPaso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVenderCarroVendedorPaso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVenderCarroVendedorPaso2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnVenderCarro;
    private javax.swing.JComboBox<String> cboFormaDePago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lblCampoEsIncorrectoApellidos;
    private javax.swing.JLabel lblCampoEsIncorrectoCorreoElectronico;
    private javax.swing.JLabel lblCampoEsIncorrectoDireccion;
    private javax.swing.JLabel lblCampoEsIncorrectoNombre;
    private javax.swing.JLabel lblCampoEsIncorrectoNumeroDeCedula;
    private javax.swing.JLabel lblCampoEsIncorrectoNumeroTelefonico;
    private javax.swing.JMenu menuCambiarIdioma;
    private javax.swing.JMenu menuCerrarSesion;
    private javax.swing.JMenu menuVenderCarro;
    private javax.swing.JMenu menuVerCarrosPorTienda;
    private javax.swing.JFormattedTextField txtApellidos;
    private javax.swing.JFormattedTextField txtCorreoElectronico;
    private javax.swing.JFormattedTextField txtDireccion;
    private javax.swing.JFormattedTextField txtNombre;
    private javax.swing.JFormattedTextField txtNumeroDeCedula;
    private javax.swing.JFormattedTextField txtNumeroTelefonico;
    // End of variables declaration//GEN-END:variables

    public void ImagenComoFondo() { // 6 Líneas de Código 
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/ImagenFondo.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }

    public void ValidarEspaciosVaciosNombreApellidosDireccion() { // 15 Líneas de Código
        if(txtNombre.getText().isEmpty()){
            lblCampoEsIncorrectoNombre.setVisible(true);
            lblCampoEsIncorrectoNombre.setText("Campo es vacio");
        }else{
            lblCampoEsIncorrectoNombre.setVisible(false);
        }
        
        if(txtApellidos.getText().isEmpty()){
            lblCampoEsIncorrectoApellidos.setVisible(true);
            lblCampoEsIncorrectoApellidos.setText("Campo es vacio");
        }else{
            lblCampoEsIncorrectoApellidos.setVisible(false);
        }
        
        if(txtDireccion.getText().isEmpty()){
            lblCampoEsIncorrectoDireccion.setVisible(true);
            lblCampoEsIncorrectoDireccion.setText("Campo es vacio");
        }else{
            lblCampoEsIncorrectoDireccion.setVisible(false);
        }
    }
    
    public void ValidarEspaciosVaciosTelefonoCorreoCedula(){ // 15 Líneas de Código
        if(txtNumeroTelefonico.getText().isEmpty()){
            lblCampoEsIncorrectoNumeroTelefonico.setVisible(true);
            lblCampoEsIncorrectoNumeroTelefonico.setText("Campo es vacio");
        }else{
            lblCampoEsIncorrectoNumeroTelefonico.setVisible(false);
        }
        
        if(txtCorreoElectronico.getText().isEmpty()){
            lblCampoEsIncorrectoCorreoElectronico.setVisible(true);
            lblCampoEsIncorrectoCorreoElectronico.setText("Campo es vacio");
        }else{
            lblCampoEsIncorrectoCorreoElectronico.setVisible(false);
        }
     
        if(txtNumeroDeCedula.getText().isEmpty()){
            lblCampoEsIncorrectoNumeroDeCedula.setVisible(true);
            lblCampoEsIncorrectoNumeroDeCedula.setText("Campo es vacio");
        }else{
            lblCampoEsIncorrectoNumeroDeCedula.setVisible(false);
        }
    }

    public void BotonContinuarCarroConCamposVacios(){ // 4 Líneas de Código
        if(!txtNombre.getText().isEmpty() && !txtApellidos.getText().isEmpty() && !txtDireccion.getText().isEmpty() && !txtNumeroTelefonico.getText().isEmpty() && !txtCorreoElectronico.getText().isEmpty() && !txtNumeroDeCedula.getText().isEmpty()){
            VentanaVenderCarroVendedorPaso3 ventanaVenderCarroPaso3 = new VentanaVenderCarroVendedorPaso3();
            ventanaVenderCarroPaso3.setVisible(true);
            this.dispose();
        }else{
            this.ValidarEspaciosVaciosNombreApellidosDireccion();
            this.ValidarEspaciosVaciosTelefonoCorreoCedula();
        }
    }
    
    public void ValidacionSalirDelSistema() { // 6 líneas de Código
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            try {
                this.ObtenerHora();
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                ventanaPrincipal.setVisible(true);
                this.dispose();
            } catch (Exception ex) {
            }
        }
    }

    public void ObtenerHora() { // 6 Líneas de Código
        Calendar calendario = new GregorianCalendar();
        int hora, minutos, segundos;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        JOptionPane.showMessageDialog(null, "Hora de salida: " + hora + ":" + minutos + ":" + segundos);
    }
    
    public void LabelNoVisible(){ // 6 Líneas de Código
        lblCampoEsIncorrectoNombre.setVisible(false);
        lblCampoEsIncorrectoApellidos.setVisible(false);
        lblCampoEsIncorrectoDireccion.setVisible(false);
        lblCampoEsIncorrectoNumeroTelefonico.setVisible(false);
        lblCampoEsIncorrectoCorreoElectronico.setVisible(false);
        lblCampoEsIncorrectoNumeroDeCedula.setVisible(false);
    }
}
