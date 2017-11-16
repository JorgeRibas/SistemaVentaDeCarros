package Vista;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaEditarTiendaAdministrador extends javax.swing.JFrame {

    public VentanaEditarTiendaAdministrador() {
        initComponents();
        this.ImagenComoFondo();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        menuCerrarSesion = new javax.swing.JMenu();
        menuCambiarIdioma = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuCarro = new javax.swing.JMenu();
        munuItemAgregarCarro = new javax.swing.JMenuItem();
        menuItemEditarCarro = new javax.swing.JMenuItem();
        menuItemEliminarCarro = new javax.swing.JMenuItem();
        menuItemMoverCarro = new javax.swing.JMenuItem();
        menuItemVerCarrosPorTienda = new javax.swing.JMenuItem();
        menuItemVerCarros = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuItemAgregarUsuario = new javax.swing.JMenuItem();
        menuItemEliminarUsuario = new javax.swing.JMenuItem();
        menuItemModificarUsuario = new javax.swing.JMenuItem();
        menuItemVerUsuarios = new javax.swing.JMenuItem();
        menuTienda = new javax.swing.JMenu();
        menuItemAgregarTienda = new javax.swing.JMenuItem();
        menuItemEditarTienda = new javax.swing.JMenuItem();
        menuItemEliminarTienda = new javax.swing.JMenuItem();
        menuItemVerTiendas = new javax.swing.JMenuItem();
        menuItemVerEspaciosLibres = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        menuItemAgregarIdioma = new javax.swing.JMenuItem();
        menuItemEliminarIdioma = new javax.swing.JMenuItem();
        menuItemCambiarDeIdioma = new javax.swing.JMenuItem();
        menuItemConfiguracionDeLaCuenta = new javax.swing.JMenuItem();

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
        jLabel1.setText("Editar tienda");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione la tienda:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre de la tienda", "Localizacion por provincia", "Localizacion por canton", "Codigo postal de la ubicacion", "Espacios disponibles para carros"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de la tienda:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Localización por provincia:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Localización por cantón:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Código postal de la ubicación:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Espacios disponibles para carros:");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setText("Editar tienda");

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

        munuItemAgregarCarro.setText("Agregar carro");
        munuItemAgregarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                munuItemAgregarCarroActionPerformed(evt);
            }
        });
        menuCarro.add(munuItemAgregarCarro);

        menuItemEditarCarro.setText("Editar carro");
        menuItemEditarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEditarCarroActionPerformed(evt);
            }
        });
        menuCarro.add(menuItemEditarCarro);

        menuItemEliminarCarro.setText("Eliminar carro");
        menuItemEliminarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCarroActionPerformed(evt);
            }
        });
        menuCarro.add(menuItemEliminarCarro);

        menuItemMoverCarro.setText("Mover carro");
        menuItemMoverCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMoverCarroActionPerformed(evt);
            }
        });
        menuCarro.add(menuItemMoverCarro);

        menuItemVerCarrosPorTienda.setText("Ver carros por tienda");
        menuItemVerCarrosPorTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerCarrosPorTiendaActionPerformed(evt);
            }
        });
        menuCarro.add(menuItemVerCarrosPorTienda);

        menuItemVerCarros.setText("Ver carros");
        menuItemVerCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerCarrosActionPerformed(evt);
            }
        });
        menuCarro.add(menuItemVerCarros);

        jMenuBar3.add(menuCarro);

        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonUsuario2.png"))); // NOI18N
        menuUsuario.setText("Usuario");
        menuUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUsuarioMouseClicked(evt);
            }
        });

        menuItemAgregarUsuario.setText("Agregar usuario");
        menuItemAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(menuItemAgregarUsuario);

        menuItemEliminarUsuario.setText("Eliminar usuario");
        menuItemEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(menuItemEliminarUsuario);

        menuItemModificarUsuario.setText("Modificar usuario");
        menuItemModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemModificarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(menuItemModificarUsuario);

        menuItemVerUsuarios.setText("Ver usuarios");
        menuItemVerUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerUsuariosActionPerformed(evt);
            }
        });
        menuUsuario.add(menuItemVerUsuarios);

        jMenuBar3.add(menuUsuario);

        menuTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoTienda2.png"))); // NOI18N
        menuTienda.setText("Tienda");
        menuTienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTiendaMouseClicked(evt);
            }
        });

        menuItemAgregarTienda.setText("Agregar tienda");
        menuItemAgregarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarTiendaActionPerformed(evt);
            }
        });
        menuTienda.add(menuItemAgregarTienda);

        menuItemEditarTienda.setText("Editar tienda");
        menuItemEditarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEditarTiendaActionPerformed(evt);
            }
        });
        menuTienda.add(menuItemEditarTienda);

        menuItemEliminarTienda.setText("Eliminar tienda");
        menuItemEliminarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarTiendaActionPerformed(evt);
            }
        });
        menuTienda.add(menuItemEliminarTienda);

        menuItemVerTiendas.setText("Ver tiendas");
        menuItemVerTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerTiendasActionPerformed(evt);
            }
        });
        menuTienda.add(menuItemVerTiendas);

        menuItemVerEspaciosLibres.setText("Ver espacios libres");
        menuItemVerEspaciosLibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerEspaciosLibresActionPerformed(evt);
            }
        });
        menuTienda.add(menuItemVerEspaciosLibres);

        jMenuBar3.add(menuTienda);

        menuConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoConfiguracion2.png"))); // NOI18N
        menuConfiguracion.setText("Configuración");
        menuConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuConfiguracionMouseClicked(evt);
            }
        });

        menuItemAgregarIdioma.setText("Agregar idioma");
        menuItemAgregarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgregarIdiomaActionPerformed(evt);
            }
        });
        menuConfiguracion.add(menuItemAgregarIdioma);

        menuItemEliminarIdioma.setText("Eliminar idioma");
        menuItemEliminarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarIdiomaActionPerformed(evt);
            }
        });
        menuConfiguracion.add(menuItemEliminarIdioma);

        menuItemCambiarDeIdioma.setText("Cambiar de idioma");
        menuItemCambiarDeIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCambiarDeIdiomaActionPerformed(evt);
            }
        });
        menuConfiguracion.add(menuItemCambiarDeIdioma);

        menuItemConfiguracionDeLaCuenta.setText("Configuración de la cuenta");
        menuItemConfiguracionDeLaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConfiguracionDeLaCuentaActionPerformed(evt);
            }
        });
        menuConfiguracion.add(menuItemConfiguracionDeLaCuenta);

        jMenuBar3.add(menuConfiguracion);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextField3)
                                        .addComponent(jFormattedTextField2))
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFormattedTextField5)
                                        .addComponent(jFormattedTextField4)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        VentanaTiendaAdministrador ventanaTienaAdministrador = new VentanaTiendaAdministrador();
        ventanaTienaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void menuCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarSesionMouseClicked
        // TODO add your handling code here:
        this.ValidacionSalirDelSistema();
    }//GEN-LAST:event_menuCerrarSesionMouseClicked

    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCerrarSesionActionPerformed

    private void munuItemAgregarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_munuItemAgregarCarroActionPerformed
        // TODO add your handling code here:
        VentanaAgregarCarroAdministrador ventanaAgregarCarroAdministrador = new VentanaAgregarCarroAdministrador();
        ventanaAgregarCarroAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_munuItemAgregarCarroActionPerformed

    private void menuItemEditarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditarCarroActionPerformed
        // TODO add your handling code here:
        VentanaEditarCarroAdministrador ventanaEditarCarroAdministrador = new VentanaEditarCarroAdministrador();
        ventanaEditarCarroAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEditarCarroActionPerformed

    private void menuItemEliminarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCarroActionPerformed
        // TODO add your handling code here:
        VentanaEliminarCarroAdministrador ventanaEliminarCarroAdministrador = new VentanaEliminarCarroAdministrador();
        ventanaEliminarCarroAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEliminarCarroActionPerformed

    private void menuItemMoverCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMoverCarroActionPerformed
        // TODO add your handling code here:
        VentanaMoverCarroAdministrador ventanaMoverCarroAdministrador = new VentanaMoverCarroAdministrador();
        ventanaMoverCarroAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemMoverCarroActionPerformed

    private void menuItemVerCarrosPorTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerCarrosPorTiendaActionPerformed
        // TODO add your handling code here:
        VentanaVerCarrosPorTiendaAdministrador ventanaVerCarrosPorTienda = new VentanaVerCarrosPorTiendaAdministrador();
        ventanaVerCarrosPorTienda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVerCarrosPorTiendaActionPerformed

    private void menuItemVerCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerCarrosActionPerformed
        // TODO add your handling code here:
        VentanaVerCarrosAdministrador ventanaVerCarrosAdministrador = new VentanaVerCarrosAdministrador();
        ventanaVerCarrosAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVerCarrosActionPerformed

    private void menuCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCarroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCarroMouseClicked

    private void menuItemAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarUsuarioActionPerformed
        // TODO add your handling code here:
        VentanaAgregarUsuarioAdministrador ventanaAgregarUsuarioAdministrador = new VentanaAgregarUsuarioAdministrador();
        ventanaAgregarUsuarioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemAgregarUsuarioActionPerformed

    private void menuItemEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarUsuarioActionPerformed
        // TODO add your handling code here:
        VentanaEliminarUsuarioAdministrador ventanaEliminarUsuarioAdministrador = new VentanaEliminarUsuarioAdministrador();
        ventanaEliminarUsuarioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEliminarUsuarioActionPerformed

    private void menuItemModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemModificarUsuarioActionPerformed
        // TODO add your handling code here:
        VentanaEditarUsuarioAdministrador ventanaModificarUsuarioAdministrador = new VentanaEditarUsuarioAdministrador();
        ventanaModificarUsuarioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemModificarUsuarioActionPerformed

    private void menuItemVerUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerUsuariosActionPerformed
        // TODO add your handling code here:
        VentanaVerUsuariosAdministrador ventanaVerUsuarioAdministrador = new VentanaVerUsuariosAdministrador();
        ventanaVerUsuarioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVerUsuariosActionPerformed

    private void menuUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuUsuarioMouseClicked

    private void menuItemAgregarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarTiendaActionPerformed
        // TODO add your handling code here:
        VentanaAgregarTiendaAdministrador ventanaAgregarTiendaAdministrador = new VentanaAgregarTiendaAdministrador();
        ventanaAgregarTiendaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemAgregarTiendaActionPerformed

    private void menuItemEditarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditarTiendaActionPerformed
        // TODO add your handling code here:
        VentanaEditarTiendaAdministrador ventanaEditarTiendaAdministrador = new VentanaEditarTiendaAdministrador();
        ventanaEditarTiendaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEditarTiendaActionPerformed

    private void menuItemEliminarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarTiendaActionPerformed
        // TODO add your handling code here:
        VentanaEliminarTiendaAdministrador ventanaEliminarTiendaAdministrador = new VentanaEliminarTiendaAdministrador();
        ventanaEliminarTiendaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEliminarTiendaActionPerformed

    private void menuItemVerTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerTiendasActionPerformed
        // TODO add your handling code here:
        VentanaVerTiendasAdministrador ventanaVerTiendasAdministrador = new VentanaVerTiendasAdministrador();
        ventanaVerTiendasAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVerTiendasActionPerformed

    private void menuItemVerEspaciosLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerEspaciosLibresActionPerformed
        // TODO add your handling code here:
        VentanaVerEspaciosLibresAdministrador ventanaVerEspaciosLibresAdministrador = new VentanaVerEspaciosLibresAdministrador();
        ventanaVerEspaciosLibresAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVerEspaciosLibresActionPerformed

    private void menuTiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTiendaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTiendaMouseClicked

    private void menuItemAgregarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarIdiomaActionPerformed
        // TODO add your handling code here:
        VentanaAgregarIdiomaAdministrador ventanaAgregarIdiomaAdministrador = new VentanaAgregarIdiomaAdministrador();
        ventanaAgregarIdiomaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemAgregarIdiomaActionPerformed

    private void menuItemEliminarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarIdiomaActionPerformed
        // TODO add your handling code here:
        VentanaEliminarIdiomaAdministrador ventanaEliminarIdiomaAdministrador = new VentanaEliminarIdiomaAdministrador();
        ventanaEliminarIdiomaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEliminarIdiomaActionPerformed

    private void menuItemCambiarDeIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCambiarDeIdiomaActionPerformed
        // TODO add your handling code here:
        VentanaCambiarDeIdiomaAdministrador ventanaCambiarDeIdiomaAdministrador = new VentanaCambiarDeIdiomaAdministrador();
        ventanaCambiarDeIdiomaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemCambiarDeIdiomaActionPerformed

    private void menuItemConfiguracionDeLaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConfiguracionDeLaCuentaActionPerformed
        // TODO add your handling code here:
        VentanaConfiguracionDeLaCuentaAdministrador ventanaConfiguracionDeLaCuentaAdministrador = new VentanaConfiguracionDeLaCuentaAdministrador();
        ventanaConfiguracionDeLaCuentaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemConfiguracionDeLaCuentaActionPerformed

    private void menuConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConfiguracionMouseClicked
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(VentanaEditarTiendaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarTiendaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarTiendaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarTiendaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEditarTiendaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menuCambiarIdioma;
    private javax.swing.JMenu menuCarro;
    private javax.swing.JMenu menuCerrarSesion;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenuItem menuItemAgregarIdioma;
    private javax.swing.JMenuItem menuItemAgregarTienda;
    private javax.swing.JMenuItem menuItemAgregarUsuario;
    private javax.swing.JMenuItem menuItemCambiarDeIdioma;
    private javax.swing.JMenuItem menuItemConfiguracionDeLaCuenta;
    private javax.swing.JMenuItem menuItemEditarCarro;
    private javax.swing.JMenuItem menuItemEditarTienda;
    private javax.swing.JMenuItem menuItemEliminarCarro;
    private javax.swing.JMenuItem menuItemEliminarIdioma;
    private javax.swing.JMenuItem menuItemEliminarTienda;
    private javax.swing.JMenuItem menuItemEliminarUsuario;
    private javax.swing.JMenuItem menuItemModificarUsuario;
    private javax.swing.JMenuItem menuItemMoverCarro;
    private javax.swing.JMenuItem menuItemVerCarros;
    private javax.swing.JMenuItem menuItemVerCarrosPorTienda;
    private javax.swing.JMenuItem menuItemVerEspaciosLibres;
    private javax.swing.JMenuItem menuItemVerTiendas;
    private javax.swing.JMenuItem menuItemVerUsuarios;
    private javax.swing.JMenu menuTienda;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenuItem munuItemAgregarCarro;
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
