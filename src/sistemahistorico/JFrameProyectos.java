
package sistemahistorico;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;
/*import sistemahistorico.Imagen;
*/

public class JFrameProyectos extends javax.swing.JFrame {

    CapaConexion.conexion conn = new CapaConexion.conexion();
    DefaultTableModel m;
    public JFrameProyectos() {
        initComponents();
        
        /*dECLARAR VARIABLES PARA RECOGER LOS DATOS */
        Conectar(); 
        mostrartodo();
      /*  JDialogProyecto  ventana = new JDialogProyecto(this, true);
        ventana.setVisible(true);
        */
    }         
  public void mostrardatos(){
      DefaultTableModel modelo= new DefaultTableModel();
      modelo.addColumn("Id_Proyecto");
      modelo.addColumn("Denominacion");
      modelo.addColumn("Año inicial");
      modelo.addColumn("Año final");
      modelo.addColumn("Num_Stand");
      modelo.addColumn("Fecha_cierre");
      tbTabla.setModel(modelo);
      String []datos = new String[6];
      try{
      conn.conectar();
      
      ResultSet rs = conn.consulta(" SELECT Id_proyecto, Denominacion, Año_inicial, Año_final, Num_stand, Fecha_cierre FROM proyecto WHERE Estado = 0 ORDER BY Id_proyecto DESC;");
      while(rs.next()){
           datos[0]=rs.getString(1);
           datos[1]=rs.getString(2);
           datos[2]=rs.getString(3);
           datos[3]=rs.getString(4);
           datos[4]=rs.getString(5);
           datos[5]=rs.getString(6);
           modelo.addRow(datos);
      }
      tbTabla.setModel(modelo);
      } catch (SQLException ex) {
          Logger.getLogger(JFrameProyectos.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  public void mostrartodo(){
      DefaultTableModel modelo= new DefaultTableModel();
      modelo.addColumn("Id_Proyecto");
      modelo.addColumn("Num_Stand");
      modelo.addColumn("Año inicial");
      modelo.addColumn("Año final");
      modelo.addColumn("Denominacion");
      modelo.addColumn("Cant_Folios");
      modelo.addColumn("Estado");
      tbTabla.setModel(modelo);
      String []datos = new String[7];
      try{
      conn.conectar();
      
      ResultSet rs = conn.consulta("SELECT Id_proyecto, Num_stand, Año_inicial, Año_final, Denominacion, Cant_folios, Estado FROM proyecto;");
      while(rs.next()){
           datos[0]=rs.getString(1);
           datos[1]=rs.getString(2);
           datos[2]=rs.getString(3);
           datos[3]=rs.getString(4);
           datos[4]=rs.getString(5);
           datos[5]=rs.getString(6);
           datos[6]=rs.getString(7);
           modelo.addRow(datos);
      }
      tbTabla.setModel(modelo);
      } catch (SQLException ex) {
          Logger.getLogger(JFrameProyectos.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel7 = new javax.swing.JPanel();
        btnCrearProyecto = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExaminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDenominacion = new javax.swing.JTextField();
        txtYearInical = new javax.swing.JTextField();
        txtYearFinal = new javax.swing.JTextField();
        txtEstanteria = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        txtId_Proyecto = new javax.swing.JTextField();
        btnCerrarProyecto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 233, 169));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 25));

        jPanel7.setBackground(new java.awt.Color(0, 130, 200));
        jPanel7.setForeground(new java.awt.Color(254, 254, 254));

        btnCrearProyecto.setText("Crear Proyecto");
        btnCrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProyectoActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addComponent(btnCrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 260, 620));

        jPanel1.setBackground(new java.awt.Color(0, 130, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/no-name.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setForeground(new java.awt.Color(243, 243, 243));
        jLabel2.setText("Nombre:");

        btnExaminar.setText("Examinar ...");
        btnExaminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExaminarMouseClicked(evt);
            }
        });
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExaminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btnExaminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 230, 620));

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1356, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1360, 40));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Denominacion:");

        txtDenominacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDenominacionActionPerformed(evt);
            }
        });

        txtYearInical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearInicalActionPerformed(evt);
            }
        });

        btnContinuar.setText("Continuar con Proyecto");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        txtId_Proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId_ProyectoActionPerformed(evt);
            }
        });

        btnCerrarProyecto.setText("Cerrar Proyecto");
        btnCerrarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarProyectoActionPerformed(evt);
            }
        });

        tbTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTabla);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año Inicial");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Año Final");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estanteria");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LISTA DE PROYECTOS CREADOS");

        jButton2.setText("Proyectos Cerrados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstanteria, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtYearInical, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(24, 24, 24)
                                        .addComponent(txtYearFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(83, 83, 83)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId_Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45)
                        .addComponent(btnCerrarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYearInical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYearFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstanteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtId_Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(btnCerrarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 860, 620));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Conectar(){
        String id_proyecto = "";
        String denominacion = "";
        String yearInicial = "";
        String yearFinal = "";
        String estanteria = "";
        
        try{
            conn.conectar();
            ResultSet rs = conn.consulta("SELECT Id_proyecto, Denominacion, Año_inicial, Año_final, Num_stand FROM proyecto WHERE Estado = 1 ORDER BY Id_proyecto DESC LIMIT 1;");
            rs.next();
            id_proyecto = rs.getString(1);
            denominacion = rs.getString(2);
            yearInicial = rs.getString(3);
            yearFinal = rs.getString(4);
            estanteria = rs.getString(5);
            conn.cierraConexion();
            
            /* Llenado los datos a las casillas de text*/
            this.txtId_Proyecto.setText(id_proyecto);
            this.txtDenominacion.setText(denominacion);
            this.txtYearInical.setText(yearInicial);
            this.txtYearFinal.setText(yearFinal);
            this.txtEstanteria.setText(estanteria);
                    
        }catch(Exception e){
            System.out.println(e);
        }
    }
   

    private void btnCrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProyectoActionPerformed
        // TODO add your handling code here:
        JDialogProyecto obj = new JDialogProyecto(this, true);
        obj.setVisible(true);
    }//GEN-LAST:event_btnCrearProyectoActionPerformed

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        Imagen obj = new Imagen();
        obj.imgeexp();
        
    }//GEN-LAST:event_btnExaminarActionPerformed

    private void btnExaminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExaminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExaminarMouseClicked

    private void btnCerrarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarProyectoActionPerformed
        
        int rpta = JOptionPane.showConfirmDialog(null, "Estas seguro de Cerrar la sesion");
        System.out.println(rpta);
        
        if(rpta == 0 ){
            String id_proyecto = this.txtId_Proyecto.getText();
            Calendar fecha = Calendar.getInstance();
             int year = fecha.get(Calendar.YEAR);
              int mes = fecha.get(Calendar.MONTH);
              int dia = fecha.get(Calendar.DAY_OF_MONTH);
              int hora =fecha.get(Calendar.HOUR);
              int min =fecha.get(Calendar.MINUTE);
              int seg =fecha.get(Calendar.SECOND);
              String fecha_cierre = year +"-"+mes+"-"+dia+" "+hora+"-"+min+"-"+seg;
            try{
                conn.conectar();
                conn.actualizar("UPDATE proyecto SET Fecha_cierre = '"+fecha_cierre+"', Estado = 0 WHERE Id_proyecto = "+id_proyecto+" LIMIT 1;");
                conn.cierraConexion();
                JOptionPane.showMessageDialog(null, "Proyecto Cerrado");
                 } catch (SQLException ex) {
                Logger.getLogger(JFrameProyectos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnCerrarProyectoActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        FrmDocumentos  ventana = new FrmDocumentos();
        ventana.setVisible(true);
        FrmDocumentos.txtCodigo.setText(txtId_Proyecto.getText());
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtDenominacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDenominacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDenominacionActionPerformed

    private void txtYearInicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearInicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearInicalActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         Conectar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtId_ProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId_ProyectoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtId_ProyectoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTablaMouseClicked

    }//GEN-LAST:event_tbTablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           JProCerrar ver = new JProCerrar(this, true);
           ver.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrarProyecto;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnCrearProyecto;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tbTabla;
    private javax.swing.JTextField txtDenominacion;
    private javax.swing.JTextField txtEstanteria;
    private javax.swing.JTextField txtId_Proyecto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtYearFinal;
    private javax.swing.JTextField txtYearInical;
    // End of variables declaration//GEN-END:variables
}
