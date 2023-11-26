package PASOS123;

import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CARRITOVENTA extends javax.swing.JFrame {

   String dni;
   double sumPago = 0.0;
   String TotalPago;
    
    public CARRITOVENTA() {
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR VENTANA PRINCIPAL
        this.setTitle("Menu Principal");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jCarritoVenta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreLibro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblLibrosencontrados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblPedido = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        tbneliminar = new javax.swing.JButton();
        btnPedir = new javax.swing.JButton();
        jDetalle = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtCantidadProd = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtMontoTotal = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        tbnAtras = new javax.swing.JButton();
        tbnSiguiente = new javax.swing.JButton();
        txtApellido2 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMetodopago = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNumTarjeta = new javax.swing.JTextField();
        txtVencimiento = new javax.swing.JTextField();
        txtClaveUnica = new javax.swing.JTextField();
        btnAtrasPago = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre del Libro:");

        txtNombreLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreLibroActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jtblLibrosencontrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "ISBN", "TITULO", "AUTOR", "GENERO", "STOCK", "PRECIO VENTA"
            }
        ));
        jScrollPane1.setViewportView(jtblLibrosencontrados);

        jLabel2.setText("CANTIDAD");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnAñadir.setText("AÑADIR PEDIDO");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        jtblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "TITULO", "PRECIO VENTA", "CANTIDAD", "SUB TOTAL"
            }
        ));
        jScrollPane2.setViewportView(jtblPedido);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("PEDIDO");

        jLabel12.setText("TOTAL PAGAR S/.");

        tbneliminar.setText("ELIMINAR");
        tbneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbneliminarActionPerformed(evt);
            }
        });

        btnPedir.setText("PEDIR");
        btnPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCarritoVentaLayout = new javax.swing.GroupLayout(jCarritoVenta);
        jCarritoVenta.setLayout(jCarritoVentaLayout);
        jCarritoVentaLayout.setHorizontalGroup(
            jCarritoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCarritoVentaLayout.createSequentialGroup()
                .addGroup(jCarritoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jCarritoVentaLayout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jCarritoVentaLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jCarritoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPedir))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(jCarritoVentaLayout.createSequentialGroup()
                .addGroup(jCarritoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCarritoVentaLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jCarritoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jCarritoVentaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(btnBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jCarritoVentaLayout.createSequentialGroup()
                                .addGroup(jCarritoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(jCarritoVentaLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(59, 59, 59)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAñadir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jCarritoVentaLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel12)
                                .addGap(56, 56, 56)
                                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jCarritoVentaLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(tbneliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jCarritoVentaLayout.setVerticalGroup(
            jCarritoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCarritoVentaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jCarritoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jCarritoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jCarritoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jCarritoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbneliminar)
                    .addComponent(btnPedir))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CARRO DE COMPRAS", jCarritoVenta);

        jLabel4.setText("CLIENTE");

        jLabel5.setText("CANTIDAD DE PRODUCTOS");

        jLabel6.setText("FECHA");

        jLabel7.setText("MONTO TOTAL");

        jLabel8.setText("EMAIL");

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        tbnAtras.setText("ATRAS");

        tbnSiguiente.setText("SIGUIENTE");
        tbnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnSiguienteActionPerformed(evt);
            }
        });

        txtApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido2ActionPerformed(evt);
            }
        });

        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });

        jLabel13.setText("NOMBRE");

        jLabel14.setText("APELLIDO PATERNO");

        jLabel15.setText("APELLIDO MATERNO");

        javax.swing.GroupLayout jDetalleLayout = new javax.swing.GroupLayout(jDetalle);
        jDetalle.setLayout(jDetalleLayout);
        jDetalleLayout.setHorizontalGroup(
            jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDetalleLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(tbnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbnSiguiente)
                .addGap(154, 154, 154))
            .addGroup(jDetalleLayout.createSequentialGroup()
                .addGroup(jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDetalleLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(101, 101, 101)
                        .addGroup(jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDetalleLayout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel4)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jDetalleLayout.setVerticalGroup(
            jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDetalleLayout.createSequentialGroup()
                .addGroup(jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDetalleLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDetalleLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnAtras)
                    .addComponent(tbnSiguiente))
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("DETALLE DE COMPRA", jDetalle);

        jLabel9.setText("Número de Tarjeta");

        jLabel10.setText("Vencimiento");

        jLabel11.setText("Clave Única");

        txtNumTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumTarjetaActionPerformed(evt);
            }
        });

        btnAtrasPago.setText("ATRAS");
        btnAtrasPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasPagoActionPerformed(evt);
            }
        });

        btnPagar.setText("PAGAR");

        javax.swing.GroupLayout jMetodopagoLayout = new javax.swing.GroupLayout(jMetodopago);
        jMetodopago.setLayout(jMetodopagoLayout);
        jMetodopagoLayout.setHorizontalGroup(
            jMetodopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMetodopagoLayout.createSequentialGroup()
                .addGroup(jMetodopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMetodopagoLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jMetodopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jMetodopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)))
                        .addGap(102, 102, 102)
                        .addGroup(jMetodopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClaveUnica, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jMetodopagoLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnAtrasPago)
                        .addGap(322, 322, 322)
                        .addComponent(btnPagar)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jMetodopagoLayout.setVerticalGroup(
            jMetodopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMetodopagoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jMetodopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jMetodopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jMetodopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtClaveUnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jMetodopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMetodopagoLayout.createSequentialGroup()
                        .addComponent(btnAtrasPago)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMetodopagoLayout.createSequentialGroup()
                        .addComponent(btnPagar)
                        .addGap(69, 69, 69))))
        );

        jTabbedPane1.addTab("METODO PAGO", jMetodopago);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreLibroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombprod= txtNombreLibro.getText();
        DefaultTableModel dt = new DefaultTableModel();

        String query ="SELECT * from Producto where NombreProd LIKE '"+nombprod+"%'";

        jtblLibrosencontrados.setModel(dt);

        dt.addColumn("Codigo");
        dt.addColumn("ISBN");
        dt.addColumn("TITULO");
        dt.addColumn("AUTOR");
        dt.addColumn("GENERO");
        dt.addColumn("STOCK");
        dt.addColumn("PRECIO VENTA");
        
        cConnection con = new cConnection();

        try
        {
            Statement st = con.ObtenerConexion().createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next())
            {
                dt.addRow(new Object[] {rs.getString("CGR_Libro_ID"),rs.getString("CGR_libISBN"),rs.getString("CGR_libTitulo"),rs.getString("CGR_libAutor"),rs.getString("CGR_libGenero"),rs.getString("CGR_libStock"),rs.getString("CGR_libPrecioVenta")});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"El producto no existe","Mensaje",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirActionPerformed
        if (jDetalle != null && !jDetalle.isVisible()) {
        // Hacer que jDetale sea visible
        jDetalle.setVisible(true);
    }
    }//GEN-LAST:event_btnPedirActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtNumTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumTarjetaActionPerformed

    private void btnAtrasPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasPagoActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        cConnection con = new cConnection();

        String NuevoStock;

        int filaSeleccionada = jtblLibrosencontrados.getSelectedRow();

        try {
            if (filaSeleccionada == -1) //para validar que se seleccione fila
            {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Producto");
            } else if (txtCantidad.getText() == "") {
                JOptionPane.showMessageDialog(null, "Debe Ingresar Cantidad");
            } else {   //Obtener Datos del Jtable de Producto Encontrado
                DefaultTableModel dt = (DefaultTableModel) jtblLibrosencontrados.getModel(); // Crea un Modelo de Tabla y asigna a un jTable

                String cod = jtblLibrosencontrados.getValueAt(filaSeleccionada, 0).toString();
                String nombProd = jtblLibrosencontrados.getValueAt(filaSeleccionada, 1).toString();
                double prec = Double.parseDouble(jtblLibrosencontrados.getValueAt(filaSeleccionada, 2).toString());
                int CantStock = Integer.parseInt(jtblLibrosencontrados.getValueAt(filaSeleccionada, 3).toString());
                int cantPedido = Integer.parseInt(txtCantidad.getText());

                //Calcular Importe de fila Sub Total
                Double subTotal = prec * cantPedido;
                String ImporteFila = String.valueOf(subTotal);

                //Pasarlo al jtable de Pedido para Efecturar Venta
                DefaultTableModel dtPedidoVenta = (DefaultTableModel) jtblPedido.getModel(); // Crea un Modelo de Tabla y asigna a un jTable
                
                dtPedidoVenta.addRow(new Object[]{cod, nombProd, prec, cantPedido, ImporteFila});

                sumPago = sumPago + subTotal;

                TotalPago = String.valueOf(sumPago);

                txtTotalPagar.setText(TotalPago);
                txtCantidad.setText("");
                
                //Descontar Saldo del tbProductoEncontrado
                int NuevoSaldo = CantStock - cantPedido;
                jtblPedido.setValueAt(NuevoSaldo, 0, 3);

                //Actualizar Stock de la Tabla Producto (Base de Datos)
                NuevoStock = String.valueOf(NuevoSaldo);

                String queryAcutaliza = "UPDATE Producto SET CGR_libStock=" + NuevoStock + " WHERE CGR_Libro_ID=" + cod + "";

                Statement st;
                st = con.ObtenerConexion().createStatement();
                st.executeUpdate(queryAcutaliza);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tbneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbneliminarActionPerformed
        cConnection con = new cConnection();

        int SaldoActual = 0;
        int NuevoSaldo;
        String NuevoStock;

        int filaSeleccionada = jtblPedido.getSelectedRow();

        try {
            if (filaSeleccionada == -1) //para validar que se seleccione fila
            {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Producto");
            } else {   //Obtener Datos del Jtable Venta
                String cod = jtblPedido.getValueAt(filaSeleccionada, 0).toString();
                String nomb = jtblPedido.getValueAt(filaSeleccionada, 1).toString();
                double precio = Double.parseDouble(jtblPedido.getValueAt(filaSeleccionada, 2).toString());
                int canti = Integer.parseInt(jtblPedido.getValueAt(filaSeleccionada, 3).toString());
                String subT = jtblPedido.getValueAt(filaSeleccionada, 4).toString();

                //Remover fila del tblVenta
                DefaultTableModel modelo = (DefaultTableModel) jtblPedido.getModel();
                modelo.removeRow(filaSeleccionada);

                //Descontar del pago total
                sumPago = sumPago - Float.parseFloat(subT);

                TotalPago = String.valueOf(sumPago);
                txtTotalPagar.setText(TotalPago);

                //Buscar Saldo de la TABLA Producto, para Regresar cantidad al Saldo
                String queryBusca = "SELECT Saldo FROM Producto WHERE CGR_Libro_ID = " + cod + "";

                PreparedStatement pstm = con.ObtenerConexion().prepareStatement(queryBusca);
                ResultSet rs = pstm.executeQuery();

                while (rs.next()) {
                    SaldoActual = Integer.parseInt(rs.getString("Saldo"));

                }
                rs.close();

                // Actualizar Stock de la Tabla Producto (Base de Datos)
                NuevoSaldo = SaldoActual + canti;
                NuevoStock = String.valueOf(NuevoSaldo);

                String queryAcutaliza = "UPDATE Producto SET CGR_libStock=" + NuevoStock + " WHERE CGR_Libro_ID =" + cod + "";

                Statement st;
                st = con.ObtenerConexion().createStatement();
                st.executeUpdate(queryAcutaliza);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_tbneliminarActionPerformed

    private void tbnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnSiguienteActionPerformed
        cConnection con = new cConnection();

        String Nomb;
        String Apelldo1;
        String Apelldo2;
        String Email;
        

        try {

            Nomb = txtNombreCliente.getText();
            Apelldo1 = txtApellido1.getText();
            Apelldo2 = txtApellido2.getText();
            Email = txtEmail.getText();


            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO CGR_tblCLIENTE(CGR_cliNombre,CGR_cliApellido1 ,CGR_cliApellido2 )" + "values('" + Nomb + "' , '" + Apelldo1 + "' , '" + Apelldo2 + "', '" + Email + "')");


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se Pudo Agregar"+e, "Mensaje", JOptionPane.CANCEL_OPTION);
            e.toString();
            txtNombreCliente.setText("");
            txtApellido1.setText("");
            txtApellido2.setText("");
            txtEmail.setText("");
        }
        if (jMetodopago != null && !jMetodopago.isVisible()) {
        // Hacer que jDetale sea visible
        jMetodopago.setVisible(true);
    }
        
    }//GEN-LAST:event_tbnSiguienteActionPerformed

    private void txtApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido2ActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

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
            java.util.logging.Logger.getLogger(CARRITOVENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CARRITOVENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CARRITOVENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CARRITOVENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CARRITOVENTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasPago;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnPedir;
    private javax.swing.JPanel jCarritoVenta;
    private javax.swing.JPanel jDetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jMetodopago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtblLibrosencontrados;
    private javax.swing.JTable jtblPedido;
    private javax.swing.JButton tbnAtras;
    private javax.swing.JButton tbnSiguiente;
    private javax.swing.JButton tbneliminar;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadProd;
    private javax.swing.JTextField txtClaveUnica;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreLibro;
    private javax.swing.JTextField txtNumTarjeta;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
