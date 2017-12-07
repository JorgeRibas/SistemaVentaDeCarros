package Vista;

import Datos.DatosCarro;
import Datos.DatosCarroPorTienda;
import Datos.DatosTienda;
import Modelo.Carro;
import Modelo.CarroPorTienda;
import Modelo.Marca;
import Modelo.TipoCarro;
import Modelo.ModelosCarro;
import Modelo.Tienda;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class VentanaAgregarCarroAdministrador extends javax.swing.JFrame {

    public VentanaAgregarCarroAdministrador() {
        initComponents();
        this.ImagenComoFondo();
        this.LableNoVisible();
        this.setExtendedState(MAXIMIZED_BOTH);
        LlenarCBTienda();
        LlenarCBModelo();
        LlenarCBAnno();
        LlenarCBMarca();
        LlenarCBTipoCarro();
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
        txtPrecio = new javax.swing.JFormattedTextField();
        txtColor = new javax.swing.JFormattedTextField();
        txtVIN = new javax.swing.JFormattedTextField();
        cbModelo = new javax.swing.JComboBox<>();
        cbAno = new javax.swing.JComboBox<>();
        cbMarca = new javax.swing.JComboBox<>();
        btnAgregarCarro = new javax.swing.JButton();
        errorPrecio = new javax.swing.JLabel();
        errorAnno = new javax.swing.JLabel();
        errorModelo = new javax.swing.JLabel();
        errorTienda = new javax.swing.JLabel();
        errorVIN = new javax.swing.JLabel();
        cbTipoCarro = new javax.swing.JComboBox<>();
        errorMarca = new javax.swing.JLabel();
        errorColor = new javax.swing.JLabel();
        errorTipoCarro = new javax.swing.JLabel();
        cbTiendas = new javax.swing.JComboBox<>();
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
        jLabel8.setText("Tienda:");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Número de VIN:");

        cbAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnoActionPerformed(evt);
            }
        });

        cbMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMarcaMouseClicked(evt);
            }
        });

        btnAgregarCarro.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAgregarCarro.setText("Agregar carro");
        btnAgregarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarroActionPerformed(evt);
            }
        });

        errorPrecio.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        errorPrecio.setForeground(new java.awt.Color(255, 0, 0));
        errorPrecio.setText("Mensaje de error");

        errorAnno.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        errorAnno.setForeground(new java.awt.Color(255, 0, 0));
        errorAnno.setText("Mensaje de error");

        errorModelo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        errorModelo.setForeground(new java.awt.Color(255, 0, 0));
        errorModelo.setText("Mensaje de error");

        errorTienda.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        errorTienda.setForeground(new java.awt.Color(255, 0, 0));
        errorTienda.setText("Mensaje de error");

        errorVIN.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        errorVIN.setForeground(new java.awt.Color(255, 0, 0));
        errorVIN.setText("Mensaje de error");

        errorMarca.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        errorMarca.setForeground(new java.awt.Color(255, 0, 0));
        errorMarca.setText("Mensaje de error");

        errorColor.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        errorColor.setForeground(new java.awt.Color(255, 0, 0));
        errorColor.setText("Mensaje de error");

        errorTipoCarro.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        errorTipoCarro.setForeground(new java.awt.Color(255, 0, 0));
        errorTipoCarro.setText("Mensaje de error");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbTipoCarro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtColor)
                                    .addComponent(cbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVIN, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbAno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbTiendas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(errorColor, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(errorPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(errorMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                .addComponent(errorTipoCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 875, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errorModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errorAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errorTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errorVIN, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(187, 187, 187))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorAnno)
                    .addComponent(errorMarca))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbTipoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorModelo)
                    .addComponent(errorTipoCarro))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorTienda)
                    .addComponent(errorColor))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtVIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorPrecio)
                    .addComponent(errorVIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
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
        DatosCarro datosCarro = new DatosCarro();
        DatosTienda datosTienda = new DatosTienda();
        DatosCarroPorTienda datosCxT = new DatosCarroPorTienda();

        try {
            int idCarro = 0;
            int idInfoCarro = 3;
            String tipoCarro = cbTipoCarro.getSelectedItem().toString();
            String modelo = cbModelo.getSelectedItem().toString();
            int anno = 0;
            if (cbAno.getSelectedIndex() != 0) {
                anno = Integer.parseInt(cbAno.getSelectedItem().toString());
            } else {
                EspaciosVacios();
            }
            String marca = cbMarca.getSelectedItem().toString();
            String precioBase = txtPrecio.getText();
            String color = txtColor.getText();
            String VIN = txtVIN.getText();
            String estado = "";
            
            if (anno < 2017) {
                estado = "NUEVO";
            } else {
                estado = "USADO";
            }
            
            Carro carro = new Carro();
            carro.setIdCarro(idCarro);
            carro.setIdInfoCarro(idInfoCarro);
            carro.setTipoCarro(TipoCarro.valueOf(tipoCarro).toString());
            carro.setModelo(modelo);
            carro.setAnno(anno);
            carro.setMarca(Marca.valueOf(marca).toString());
            carro.setColor(color);
            carro.setVin(VIN);
            carro.setPrecioBase(Float.parseFloat(precioBase));
            carro.setEstado(estado);
            
            CarroPorTienda car = new CarroPorTienda();
            Carro carroFind = new Carro();
            Carro carroNew = new Carro();
            
            int espaciosDisp = 0;
            int espaciosOcup = 0;
            Tienda tiendaFind = new Tienda();
            Tienda tiendaNew = new Tienda();
            tiendaFind.setIdTienda(100 + (cbTiendas.getSelectedIndex()));
            tiendaNew = datosTienda.leerID(tiendaFind);
            espaciosDisp = tiendaNew.getEspaciosDisponibles();
            espaciosOcup = tiendaNew.getEspaciosOcupados();

            BotonAgregarCarro();
            EspaciosVacios();
            if (espaciosB) {
                datosCarro.registrar(carro);
                
                carroFind.setVin(VIN);
                carroNew = datosCarro.leerVIN(carroFind);
                car.setIdCarro(carroNew.getIdCarro());
                car.setIdTienda(100 + (cbTiendas.getSelectedIndex()));
                datosCxT.registrar(car);
                
                tiendaNew.setEspaciosDisponibles(espaciosDisp - 1);
                tiendaNew.setEspaciosOcupados(espaciosOcup - 1);
                datosTienda.modificar(tiendaNew, tiendaNew.getIdTienda());
                
            }

        } catch (Exception ex) {
            Logger.getLogger(VentanaAgregarCarroAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarCarroActionPerformed

    private void cbAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnoActionPerformed

    }//GEN-LAST:event_cbAnoActionPerformed

    private void cbMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMarcaMouseClicked
        // Buscar la lista de modelos que esa marca de carro seleccionada tiene
    }//GEN-LAST:event_cbMarcaMouseClicked

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
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JComboBox<String> cbTiendas;
    private javax.swing.JComboBox<String> cbTipoCarro;
    private javax.swing.JLabel errorAnno;
    private javax.swing.JLabel errorColor;
    private javax.swing.JLabel errorMarca;
    private javax.swing.JLabel errorModelo;
    private javax.swing.JLabel errorPrecio;
    private javax.swing.JLabel errorTienda;
    private javax.swing.JLabel errorTipoCarro;
    private javax.swing.JLabel errorVIN;
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
    private javax.swing.JFormattedTextField txtPrecio;
    private javax.swing.JFormattedTextField txtVIN;
    // End of variables declaration//GEN-END:variables

    boolean espaciosB = false;

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

    public void LableNoVisible() { // 5 Líneas de Código
        errorMarca.setVisible(false);
        errorTipoCarro.setVisible(false);
        errorColor.setVisible(false);
        errorModelo.setVisible(false);
        errorVIN.setVisible(false);
        errorTienda.setVisible(false);
        errorPrecio.setVisible(false);
        errorAnno.setVisible(false);
    }

    public void EspaciosVacios() { // 25 Lineas de Codigo
        int espacios = 0;
        
        if (cbAno.getSelectedIndex() == 0) {
            errorAnno.setVisible(true);
            errorAnno.setText("Por favor seleccione un año");
            espacios = espacios + 1;
        } else {
            errorAnno.setVisible(false);
        }
        if (txtColor.getText().isEmpty()) {
            errorColor.setVisible(true);
            errorColor.setText("Campo es vacio");
            espacios = espacios + 1;
        } else {
            errorColor.setVisible(false);
        }
        if (txtVIN.getText().isEmpty()) {
            errorVIN.setVisible(true);
            errorVIN.setText("Campo es vacio");
            espacios = espacios + 1;
        } else {
            errorVIN.setVisible(false);
        }
        if (cbTiendas.getSelectedIndex() == 0) {
            errorTienda.setVisible(true);
            errorTienda.setText("Campo es vacio");
            espacios = espacios + 1;
        } else {
            errorTienda.setVisible(false);
        }
        if (txtPrecio.getText().isEmpty()) {
            errorPrecio.setVisible(true);
            errorPrecio.setText("Campo es vacio");
            espacios = espacios + 1;
        } else {
            errorPrecio.setVisible(false);
        }
        if (!txtPrecio.getText().startsWith("0") && !txtPrecio.getText().startsWith("1") && !txtPrecio.getText().startsWith("2")
                && !txtPrecio.getText().startsWith("3") && !txtPrecio.getText().startsWith("4") && !txtPrecio.getText().startsWith("5")
                && !txtPrecio.getText().startsWith("6") && !txtPrecio.getText().startsWith("7") && !txtPrecio.getText().startsWith("8")
                && !txtPrecio.getText().startsWith("9")) {
            errorPrecio.setVisible(true);
            errorPrecio.setText("Campo es númerico");
        } else {
            errorPrecio.setVisible(false);
        }
        espaciosB = espacios <= 0; // if espacios <= 0, espaciosB = true;
    }

    public void BotonAgregarCarro() { // 6 Líneas de Código
        if (!txtColor.getText().isEmpty() && !txtVIN.getText().isEmpty() /* && !txtPlaca.getText().isEmpty() */ && !txtPrecio.getText().isEmpty()/* && !txtTipoCarro.getText().isEmpty()*/) {
//            cbAno.setSelectedIndex(0);
//            cbMarca.setSelectedIndex(0);
//            cbModelo.setSelectedIndex(0);
//            cbTipoCarro.setSelectedIndex(0);
//            txtColor.setText("");
//            txtPlaca.setText("");
//            txtPrecio.setText("");
//            txtVIN.setText("");
//            VentanaIngresarAdministrador ventanaIngresarAdministrador = new VentanaIngresarAdministrador();
//            ventanaIngresarAdministrador.setVisible(true);
//            this.dispose();
        } else {
            this.EspaciosVacios();
        }
    }

    private void LlenarCBMarca() {
        cbMarca.addItem("Seleccione el rol: ");
        cbMarca.setModel(new DefaultComboBoxModel(Marca.values()));
    }

    private void LlenarCBTipoCarro() {
        cbTipoCarro.addItem("Seleccione el rol: ");
        cbTipoCarro.setModel(new DefaultComboBoxModel(TipoCarro.values()));
    }

    private void LlenarCBAnno() {
        cbAno.addItem("Seleccione el año:");
        for (int i = 2018; i > 1949; i--) {
            cbAno.addItem(Integer.toString(i));
        }
    }

    private void LlenarCBModelo() {
        // Introducir el enum entero en una lista e ir buscando despues sus datos con respecto
        // a los ...

        /* 
            Sino pasar los enums a una tabla excel
         */
        List<ModelosCarro> lista;
        cbModelo.addItem("Seleccione el rol: ");
        cbModelo.setModel(new DefaultComboBoxModel(ModelosCarro.values()));
    }
    
    DatosTienda datosTienda = new DatosTienda();
    
    private void LlenarCBTienda() {
        try {
            cbTiendas.addItem("Seleccione una tienda: ");

            Vector<Tienda> listaTiendas;
            listaTiendas = datosTienda.listarVector();

            for (int i = 0; i < listaTiendas.size(); i++) {
                cbTiendas.addItem((listaTiendas.get(i).getNombreTienda()));
            }
        } catch (Exception ex) {
            Logger.getLogger(VentanaVerCarrosPorTiendaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
