/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dannycolumna
 */
public class VentanaVerCarrosPorTiendaAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form VentanaVerCarrosPorTiendaAdministrador
     */
    public VentanaVerCarrosPorTiendaAdministrador() {
        initComponents();
        this.ImagenComoFondo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnterior = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        menuCerrarSesion = new javax.swing.JMenu();
        menuCambiarIdioma = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuCarro = new javax.swing.JMenu();
        menuUsuario = new javax.swing.JMenu();
        menuTienda = new javax.swing.JMenu();
        menuConfiguracion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAnterior.png"))); // NOI18N
        btnAnterior.setBorderPainted(false);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

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
        jMenuBar3.add(menuCerrarSesion);

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

        jMenuBar3.add(menuCambiarIdioma);

        menuCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoCarro2.png"))); // NOI18N
        menuCarro.setText("Carro");
        menuCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCarroMouseClicked(evt);
            }
        });
        jMenuBar3.add(menuCarro);

        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonUsuario2.png"))); // NOI18N
        menuUsuario.setText("Usuario");
        menuUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUsuarioMouseClicked(evt);
            }
        });
        jMenuBar3.add(menuUsuario);

        menuTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoTienda2.png"))); // NOI18N
        menuTienda.setText("Tienda");
        menuTienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTiendaMouseClicked(evt);
            }
        });
        jMenuBar3.add(menuTienda);

        menuConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoConfiguracion2.png"))); // NOI18N
        menuConfiguracion.setText("Configuración");
        menuConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuConfiguracionMouseClicked(evt);
            }
        });
        jMenuBar3.add(menuConfiguracion);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAnterior)
                .addGap(0, 1242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 715, Short.MAX_VALUE)
                .addComponent(btnAnterior))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        VentanaCarroAdministrador ventanaCarroAdministrador = new VentanaCarroAdministrador();
        ventanaCarroAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void menuCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarSesionMouseClicked
        // TODO add your handling code here:
        this.ValidacionSalirDelSistema();
    }//GEN-LAST:event_menuCerrarSesionMouseClicked

    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCerrarSesionActionPerformed

    private void menuCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCarroMouseClicked
        // TODO add your handling code here:
        VentanaCarroAdministrador ventanaCarroAdministrador = new VentanaCarroAdministrador();
        ventanaCarroAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuCarroMouseClicked

    private void menuUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuarioMouseClicked
        // TODO add your handling code here:
        VentanaUsuarioAdministrador ventanaUsuarioAdministrador = new VentanaUsuarioAdministrador();
        ventanaUsuarioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuUsuarioMouseClicked

    private void menuTiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTiendaMouseClicked
        // TODO add your handling code here:
        VentanaTiendaAdministrador ventanaTiendaAdministrador = new VentanaTiendaAdministrador();
        ventanaTiendaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuTiendaMouseClicked

    private void menuConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConfiguracionMouseClicked
        // TODO add your handling code here:
        VentanaConfiguracionAdministrador ventanaConfiguracionAdministrador = new VentanaConfiguracionAdministrador();
        ventanaConfiguracionAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuConfiguracionMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaVerCarrosPorTiendaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCarrosPorTiendaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCarrosPorTiendaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCarrosPorTiendaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVerCarrosPorTiendaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu menuCambiarIdioma;
    private javax.swing.JMenu menuCarro;
    private javax.swing.JMenu menuCerrarSesion;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenu menuTienda;
    private javax.swing.JMenu menuUsuario;
    // End of variables declaration//GEN-END:variables

    public void ImagenComoFondo() { // 6 Líneas de Código 
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/ImagenFondo.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
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
}
