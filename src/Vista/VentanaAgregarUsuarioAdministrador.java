package Vista;

import Datos.DatosCarroPorTienda;
import Datos.DatosTienda;
import Datos.DatosUsuario;
import Modelo.Tienda;
import Modelo.Usuario;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class VentanaAgregarUsuarioAdministrador extends javax.swing.JFrame {

    public VentanaAgregarUsuarioAdministrador() {
        initComponents();
        this.ImagenComoFondo();
        this.LabelNoVisble();
        this.setExtendedState(MAXIMIZED_BOTH);
        LlenarCBRol();
        LlenarCBTienda();
    }

    DatosCarroPorTienda DatosCxT = new DatosCarroPorTienda();
    DatosTienda datosTienda = new DatosTienda();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btnAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JFormattedTextField();
        txtApellidos = new javax.swing.JFormattedTextField();
        txtNombreLogin = new javax.swing.JFormattedTextField();
        txtCedula = new javax.swing.JFormattedTextField();
        btnAgregarUsuario = new javax.swing.JButton();
        lblMensajeNombreCompleto = new javax.swing.JLabel();
        lblMensajeApellidos = new javax.swing.JLabel();
        lblMensajeNombreDeUsuario = new javax.swing.JLabel();
        lblMensajeContrasenaTemporal = new javax.swing.JLabel();
        lblMensajeCedula = new javax.swing.JLabel();
        lblMensajeRol = new javax.swing.JLabel();
        lblMensajeTienda = new javax.swing.JLabel();
        cbTienda = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbRol = new javax.swing.JComboBox<>();
        txtContrasena = new javax.swing.JPasswordField();
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
        jLabel1.setText("Agregar usuario");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre completo:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre login:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cédula:");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tienda:");

        btnAgregarUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAgregarUsuario.setText("Agregar usuario");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        lblMensajeNombreCompleto.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajeNombreCompleto.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajeNombreCompleto.setText("Mensaje de error");

        lblMensajeApellidos.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajeApellidos.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajeApellidos.setText("Mensaje de error");

        lblMensajeNombreDeUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajeNombreDeUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajeNombreDeUsuario.setText("Mensaje de error");

        lblMensajeContrasenaTemporal.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajeContrasenaTemporal.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajeContrasenaTemporal.setText("Mensaje de error");

        lblMensajeCedula.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajeCedula.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajeCedula.setText("Mensaje de error");

        lblMensajeRol.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajeRol.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajeRol.setText("Mensaje de error");

        lblMensajeTienda.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMensajeTienda.setForeground(new java.awt.Color(255, 0, 0));
        lblMensajeTienda.setText("Mensaje de error");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rol:");

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
                .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(499, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(498, 498, 498))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(lblMensajeContrasenaTemporal, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMensajeNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMensajeApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMensajeNombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNombreCompleto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombreLogin, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMensajeRol, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMensajeCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMensajeTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(186, 186, 186))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(174, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensajeNombreCompleto)
                    .addComponent(lblMensajeCedula))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensajeApellidos)
                    .addComponent(lblMensajeRol))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensajeNombreDeUsuario)
                    .addComponent(lblMensajeTienda))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeContrasenaTemporal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        VentanaUsuarioAdministrador ventanaUsuarioAdministrador = new VentanaUsuarioAdministrador();
        ventanaUsuarioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void menuCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarSesionMouseClicked
        this.ValidacionSalirDelSistema();
    }//GEN-LAST:event_menuCerrarSesionMouseClicked

    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
    }//GEN-LAST:event_menuCerrarSesionActionPerformed

    private void munuItemAgregarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_munuItemAgregarCarroActionPerformed
        VentanaAgregarCarroAdministrador ventanaAgregarCarroAdministrador = new VentanaAgregarCarroAdministrador();
        ventanaAgregarCarroAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_munuItemAgregarCarroActionPerformed

    private void menuItemEditarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditarCarroActionPerformed
        VentanaEditarCarroAdministrador ventanaEditarCarroAdministrador = new VentanaEditarCarroAdministrador();
        ventanaEditarCarroAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEditarCarroActionPerformed

    private void menuItemEliminarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCarroActionPerformed
        VentanaEliminarCarroAdministrador ventanaEliminarCarroAdministrador = new VentanaEliminarCarroAdministrador();
        ventanaEliminarCarroAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEliminarCarroActionPerformed

    private void menuItemMoverCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMoverCarroActionPerformed
        VentanaMoverCarroAdministrador ventanaMoverCarroAdministrador = new VentanaMoverCarroAdministrador();
        ventanaMoverCarroAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemMoverCarroActionPerformed

    private void menuItemVerCarrosPorTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerCarrosPorTiendaActionPerformed
        VentanaVerCarrosPorTiendaAdministrador ventanaVerCarrosPorTienda = new VentanaVerCarrosPorTiendaAdministrador();
        ventanaVerCarrosPorTienda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVerCarrosPorTiendaActionPerformed

    private void menuItemVerCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerCarrosActionPerformed
        VentanaVerCarrosAdministrador ventanaVerCarrosAdministrador = new VentanaVerCarrosAdministrador();
        ventanaVerCarrosAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVerCarrosActionPerformed

    private void menuCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCarroMouseClicked
    }//GEN-LAST:event_menuCarroMouseClicked

    private void menuItemAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarUsuarioActionPerformed
        VentanaAgregarUsuarioAdministrador ventanaAgregarUsuarioAdministrador = new VentanaAgregarUsuarioAdministrador();
        ventanaAgregarUsuarioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemAgregarUsuarioActionPerformed

    private void menuItemEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarUsuarioActionPerformed
        VentanaEliminarUsuarioAdministrador ventanaEliminarUsuarioAdministrador = new VentanaEliminarUsuarioAdministrador();
        ventanaEliminarUsuarioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEliminarUsuarioActionPerformed

    private void menuItemModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemModificarUsuarioActionPerformed
        VentanaModificarUsuarioAdministrador ventanaModificarUsuarioAdministrador = new VentanaModificarUsuarioAdministrador();
        ventanaModificarUsuarioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemModificarUsuarioActionPerformed

    private void menuItemVerUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerUsuariosActionPerformed
        VentanaVerUsuariosAdministrador ventanaVerUsuarioAdministrador = new VentanaVerUsuariosAdministrador();
        ventanaVerUsuarioAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVerUsuariosActionPerformed

    private void menuUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuarioMouseClicked
    }//GEN-LAST:event_menuUsuarioMouseClicked

    private void menuItemAgregarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarTiendaActionPerformed
        VentanaAgregarTiendaAdministrador ventanaAgregarTiendaAdministrador = new VentanaAgregarTiendaAdministrador();
        ventanaAgregarTiendaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemAgregarTiendaActionPerformed

    private void menuItemEditarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditarTiendaActionPerformed
        VentanaEditarTiendaAdministrador ventanaEditarTiendaAdministrador = new VentanaEditarTiendaAdministrador();
        ventanaEditarTiendaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEditarTiendaActionPerformed

    private void menuItemEliminarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarTiendaActionPerformed
        VentanaEliminarTiendaAdministrador ventanaEliminarTiendaAdministrador = new VentanaEliminarTiendaAdministrador();
        ventanaEliminarTiendaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEliminarTiendaActionPerformed

    private void menuItemVerTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerTiendasActionPerformed
        VentanaVerTiendasAdministrador ventanaVerTiendasAdministrador = new VentanaVerTiendasAdministrador();
        ventanaVerTiendasAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVerTiendasActionPerformed

    private void menuItemVerEspaciosLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerEspaciosLibresActionPerformed
        VentanaVerEspaciosLibresAdministrador ventanaVerEspaciosLibresAdministrador = new VentanaVerEspaciosLibresAdministrador();
        ventanaVerEspaciosLibresAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemVerEspaciosLibresActionPerformed

    private void menuTiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTiendaMouseClicked
    }//GEN-LAST:event_menuTiendaMouseClicked

    private void menuItemAgregarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgregarIdiomaActionPerformed
        VentanaAgregarIdiomaAdministrador ventanaAgregarIdiomaAdministrador = new VentanaAgregarIdiomaAdministrador();
        ventanaAgregarIdiomaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemAgregarIdiomaActionPerformed

    private void menuItemEliminarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarIdiomaActionPerformed
        VentanaEliminarIdiomaAdministrador ventanaEliminarIdiomaAdministrador = new VentanaEliminarIdiomaAdministrador();
        ventanaEliminarIdiomaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemEliminarIdiomaActionPerformed

    private void menuItemCambiarDeIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCambiarDeIdiomaActionPerformed
        VentanaCambiarDeIdiomaAdministrador ventanaCambiarDeIdiomaAdministrador = new VentanaCambiarDeIdiomaAdministrador();
        ventanaCambiarDeIdiomaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemCambiarDeIdiomaActionPerformed

    private void menuItemConfiguracionDeLaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConfiguracionDeLaCuentaActionPerformed
        VentanaConfiguracionDeLaCuentaAdministrador ventanaConfiguracionDeLaCuentaAdministrador = new VentanaConfiguracionDeLaCuentaAdministrador();
        ventanaConfiguracionDeLaCuentaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemConfiguracionDeLaCuentaActionPerformed

    private void menuConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConfiguracionMouseClicked
    }//GEN-LAST:event_menuConfiguracionMouseClicked

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        
        DatosUsuario datosUser = new DatosUsuario();
        
        try {
            int idUsuario = 0;
            int idTienda = Integer.parseInt(cbTienda.getSelectedItem().toString());
            String rol = cbRol.getSelectedItem().toString().substring(0,1);
            String login = txtNombreLogin.getText().toLowerCase().trim();
            String passwd = txtContrasena.getText();
            String name = txtNombreCompleto.getText();
            String lastname = txtApellidos.getText();
            String cedula = txtCedula.getText();
            String preg1 = "0placeholder";
            String preg2 = "0placeholder";
            
            Usuario user = new Usuario();
            user.setIdUsuario(idUsuario);
            user.setIdTienda(idTienda);
            user.setRol(rol);
            user.setNombreLogin(login);
            user.setContrasena(passwd);
            user.setNombre(name);
            user.setApellido(lastname);
            user.setCedula(cedula);
            user.setPreg1(preg1);
            user.setPreg2(preg2);

            datosUser.registrar(user);
        } catch (Exception ex) {
            Logger.getLogger(VentanaAgregarUsuarioAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }

//        this.AgregarUsuario(); // Ventana siguiente
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAgregarUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarUsuarioAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnAnterior;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbRol;
    private javax.swing.JComboBox<String> cbTienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lblMensajeApellidos;
    private javax.swing.JLabel lblMensajeCedula;
    private javax.swing.JLabel lblMensajeContrasenaTemporal;
    private javax.swing.JLabel lblMensajeNombreCompleto;
    private javax.swing.JLabel lblMensajeNombreDeUsuario;
    private javax.swing.JLabel lblMensajeRol;
    private javax.swing.JLabel lblMensajeTienda;
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
    private javax.swing.JFormattedTextField txtApellidos;
    private javax.swing.JFormattedTextField txtCedula;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JFormattedTextField txtNombreCompleto;
    private javax.swing.JFormattedTextField txtNombreLogin;
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

    public void ObtenerHora() {
        Calendar calendario = new GregorianCalendar();
        int hora, minutos, segundos;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        JOptionPane.showMessageDialog(null, "Hora de salida: " + hora + ":" + minutos + ":" + segundos);
    }

    public void LabelNoVisble() {
        lblMensajeApellidos.setVisible(false);
        lblMensajeCedula.setVisible(false);
        lblMensajeContrasenaTemporal.setVisible(false);
        lblMensajeNombreCompleto.setVisible(false);
        lblMensajeNombreDeUsuario.setVisible(false);
        lblMensajeRol.setVisible(false);
        lblMensajeTienda.setVisible(false);
    }

    public void CamposVacios() {
        if (txtApellidos.getText().isEmpty()) {
            lblMensajeApellidos.setVisible(true);
            lblMensajeApellidos.setText("Campo es vacio");
        } else {
            lblMensajeApellidos.setVisible(false);
        }
        if (txtCedula.getText().isEmpty()) {
            lblMensajeCedula.setVisible(true);
            lblMensajeCedula.setText("Campo es vacio");
        } else {
            lblMensajeCedula.setVisible(false);
        }
        if (txtContrasena.getText().isEmpty()) {
            lblMensajeContrasenaTemporal.setVisible(true);
            lblMensajeContrasenaTemporal.setText("Campo es vacio");
        } else {
            lblMensajeContrasenaTemporal.setVisible(false);
        }
        if (txtNombreCompleto.getText().isEmpty()) {
            lblMensajeNombreCompleto.setVisible(true);
            lblMensajeNombreCompleto.setText("Campo es vacio");
        } else {
            lblMensajeNombreCompleto.setVisible(false);
        }
        if (txtNombreLogin.getText().isEmpty()) {
            lblMensajeNombreDeUsuario.setVisible(true);
            lblMensajeNombreDeUsuario.setText("Campo es vacio");
        } else {
            lblMensajeNombreDeUsuario.setVisible(false);
        }
    }

    public void AgregarUsuario() { // 6 Lineas de Codigo
        if (!txtApellidos.getText().isEmpty() && !txtCedula.getText().isEmpty() && 
                !txtContrasena.getText().isEmpty() && !txtNombreCompleto.getText().isEmpty() && 
                txtNombreLogin.getText().isEmpty()
//                && cbRol. && !cbTienda.getSelectedIndex()
                ) {
            VentanaIngresarAdministrador ventanaIngresarAdministrador = new VentanaIngresarAdministrador();
            ventanaIngresarAdministrador.setVisible(true);
            this.dispose();
        } else {
            this.CamposVacios();
        }
    }
    
    private void LlenarCBTienda() {
        try {
            cbTienda.addItem("Seleccione una tienda: ");

            Vector<Tienda> listaTiendas;
            listaTiendas = datosTienda.listarVector();

            for (int i = 0; i < listaTiendas.size(); i++) {
                cbTienda.addItem((listaTiendas.get(i).getNombreTienda()));
            }
        } catch (Exception ex) {
            Logger.getLogger(VentanaVerCarrosPorTiendaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void LlenarCBRol() {
        cbRol.addItem("Seleccione el rol: ");
        cbRol.addItem("ADMINISTRADOR");
        cbRol.addItem("VENDEDOR");
    }
}
