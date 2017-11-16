package Vista;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaAgregarCarroAdministrador extends javax.swing.JFrame {

    public VentanaAgregarCarroAdministrador() {
        initComponents();
        this.ImagenComoFondo();
        this.LableNoVisible();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioBase = new javax.swing.JFormattedTextField();
        txtTipoDeCarro = new javax.swing.JFormattedTextField();
        txtColor = new javax.swing.JFormattedTextField();
        txtPlaca = new javax.swing.JFormattedTextField();
        txtNumeroDeVIN = new javax.swing.JFormattedTextField();
        cboModelo = new javax.swing.JComboBox<>();
        cboAno = new javax.swing.JComboBox<>();
        cboMarca = new javax.swing.JComboBox<>();
        btnAgregarCarro = new javax.swing.JButton();
        lblMensajePrecioBase = new javax.swing.JLabel();
        lblMensajeTipoDeCarro = new javax.swing.JLabel();
        lblMensajeColor = new javax.swing.JLabel();
        lblMensajePlaca = new javax.swing.JLabel();
        lblMensajeNumeroDeVIN = new javax.swing.JLabel();
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
        jLabel1.setText("Agregar carro");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modelo:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Año:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio base:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de carro:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Color:");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Placa:");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Número de VIN:");

        cboAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAnoActionPerformed(evt);
            }
        });

        btnAgregarCarro.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAgregarCarro.setText("Agregar carro");
        btnAgregarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarroActionPerformed(evt);
            }
        });

        lblMensajePrecioBase.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajePrecioBase.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajePrecioBase.setText("Mensaje de error");

        lblMensajeTipoDeCarro.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajeTipoDeCarro.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajeTipoDeCarro.setText("Mensaje de error");

        lblMensajeColor.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajeColor.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajeColor.setText("Mensaje de error");

        lblMensajePlaca.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajePlaca.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajePlaca.setText("Mensaje de error");

        lblMensajeNumeroDeVIN.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajeNumeroDeVIN.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajeNumeroDeVIN.setText("Mensaje de error");

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
                .addGap(0, 1242, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(521, 521, 521)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecioBase)
                            .addComponent(cboModelo, 0, 250, Short.MAX_VALUE)
                            .addComponent(cboAno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipoDeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtColor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlaca))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroDeVIN)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMensajeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMensajeTipoDeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMensajePlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMensajePrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(254, 254, 254)
                                .addComponent(lblMensajeNumeroDeVIN, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(187, 187, 187))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtTipoDeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeTipoDeCarro)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeColor)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajePlaca)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtNumeroDeVIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensajePrecioBase)
                    .addComponent(lblMensajeNumeroDeVIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btnAgregarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
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

    private void btnAgregarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarroActionPerformed
        // TODO add your handling code here:
        this.BotonAgregarCarro();
    }//GEN-LAST:event_btnAgregarCarroActionPerformed

    private void cboAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAnoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cboAnoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAgregarCarroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarCarroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarCarroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarCarroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarCarroAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCarro;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JComboBox<String> cboAno;
    private javax.swing.JComboBox<String> cboMarca;
    private javax.swing.JComboBox<String> cboModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lblMensajeColor;
    private javax.swing.JLabel lblMensajeNumeroDeVIN;
    private javax.swing.JLabel lblMensajePlaca;
    private javax.swing.JLabel lblMensajePrecioBase;
    private javax.swing.JLabel lblMensajeTipoDeCarro;
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
    private javax.swing.JFormattedTextField txtColor;
    private javax.swing.JFormattedTextField txtNumeroDeVIN;
    private javax.swing.JFormattedTextField txtPlaca;
    private javax.swing.JFormattedTextField txtPrecioBase;
    private javax.swing.JFormattedTextField txtTipoDeCarro;
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
    
    public void LableNoVisible(){ // 5 Líneas de Código
        lblMensajeColor.setVisible(false);
        lblMensajeNumeroDeVIN.setVisible(false);
        lblMensajePlaca.setVisible(false);
        lblMensajePrecioBase.setVisible(false);
        lblMensajeTipoDeCarro.setVisible(false);
    }
    
    public void EspaciosVacios(){ // 25 Lineas de Codigo
        if(txtColor.getText().isEmpty()){
            lblMensajeColor.setVisible(true);
            lblMensajeColor.setText("Campo es vacio");
        }else{
            lblMensajeColor.setVisible(false);
        }
        if(txtNumeroDeVIN.getText().isEmpty()){
            lblMensajeNumeroDeVIN.setVisible(true);
            lblMensajeNumeroDeVIN.setText("Campo es vacio");
        }else{
            lblMensajeNumeroDeVIN.setVisible(false);
        }
        if(txtPlaca.getText().isEmpty()){
            lblMensajePlaca.setVisible(true);
            lblMensajePlaca.setText("Campo es vacio");
        }else{
            lblMensajePlaca.setVisible(false);
        }
        if(txtPrecioBase.getText().isEmpty()){
            lblMensajePrecioBase.setVisible(true);
            lblMensajePrecioBase.setText("Campo es vacio");
        }else{
            lblMensajePrecioBase.setVisible(false);
        }
        if(txtTipoDeCarro.getText().isEmpty()){
            lblMensajeTipoDeCarro.setVisible(true);
            lblMensajeTipoDeCarro.setText("Campo es vacio");
        }else{
            lblMensajeTipoDeCarro.setVisible(false);
        }
    }
    
    public void BotonAgregarCarro(){ // 6 Líneas de Código
        if(!txtColor.getText().isEmpty() && !txtNumeroDeVIN.getText().isEmpty() && !txtPlaca.getText().isEmpty() && !txtPrecioBase.getText().isEmpty() && !txtTipoDeCarro.getText().isEmpty()) {
            VentanaIngresarAdministrador ventanaIngresarAdministrador = new VentanaIngresarAdministrador();
            ventanaIngresarAdministrador.setVisible(true);
            this.dispose();
        }else{
            this.EspaciosVacios();
        }
    }
   
}
