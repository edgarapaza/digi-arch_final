
package sistemahistorico;

import java.awt.event.KeyEvent;
import java.sql.SQLException;


public class JDialogProyecto extends javax.swing.JDialog {

    CapaConexion.conexion conn = new CapaConexion.conexion();
    
    public JDialogProyecto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //CapaConexion.conexion conn = new CapaConexion.conexion();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chkTodos = new javax.swing.JCheckBox();
        chkEnero = new javax.swing.JCheckBox();
        chkFebrero = new javax.swing.JCheckBox();
        chkMarzo = new javax.swing.JCheckBox();
        chkAbril = new javax.swing.JCheckBox();
        chkMayo = new javax.swing.JCheckBox();
        chkJunio = new javax.swing.JCheckBox();
        chkJulio = new javax.swing.JCheckBox();
        chkAgosto = new javax.swing.JCheckBox();
        chkSetiembre = new javax.swing.JCheckBox();
        chkOctubre = new javax.swing.JCheckBox();
        chkNoviembre = new javax.swing.JCheckBox();
        chkDiciembre = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtNumEstanteria = new javax.swing.JTextField();
        txtCuerpo = new javax.swing.JTextField();
        txtBalda = new javax.swing.JTextField();
        txtCodigoLibro = new javax.swing.JTextField();
        txtAñoInicial = new javax.swing.JTextField();
        txtAñoFinal = new javax.swing.JTextField();
        txtDenominacion = new javax.swing.JTextField();
        txtCantidadFolios = new javax.swing.JTextField();
        txtCantPiezasDocum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Numero Estanteria:");

        jLabel2.setText("Cuerpo:");

        jLabel4.setText("Balda:");

        jLabel5.setText("Codigo Libro:");

        jLabel6.setText("Año inicial:");

        jLabel7.setText("Año Final:");

        jLabel8.setText("Meses:");

        chkTodos.setText("Todos");

        chkEnero.setText("Enero");

        chkFebrero.setText("Febrero");

        chkMarzo.setText("Marzo");

        chkAbril.setText("Abril");

        chkMayo.setText("Mayo");

        chkJunio.setText("Junio");

        chkJulio.setText("Julio");

        chkAgosto.setText("Agosto");

        chkSetiembre.setText("Setiembre");

        chkOctubre.setText("Octubre");

        chkNoviembre.setText("Nombiembre");

        chkDiciembre.setText("Diciembre");

        jLabel9.setText("Denominacion:");

        jLabel10.setText("Cantidad de Folios:");

        jLabel11.setText("Cant. Piezas Docum:");

        btnImprimir.setText("Imprimir Lomo");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtNumEstanteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumEstanteriaActionPerformed(evt);
            }
        });

        txtCuerpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuerpoActionPerformed(evt);
            }
        });

        txtBalda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaldaActionPerformed(evt);
            }
        });

        txtCodigoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLibroActionPerformed(evt);
            }
        });

        txtAñoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoInicialActionPerformed(evt);
            }
        });

        txtAñoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoFinalActionPerformed(evt);
            }
        });
        txtAñoFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAñoFinalKeyPressed(evt);
            }
        });

        txtDenominacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDenominacionActionPerformed(evt);
            }
        });

        txtCantidadFolios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadFoliosActionPerformed(evt);
            }
        });

        txtCantPiezasDocum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantPiezasDocumActionPerformed(evt);
            }
        });
        txtCantPiezasDocum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantPiezasDocumKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chkJulio)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkAgosto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkSetiembre))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chkEnero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkFebrero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkMarzo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkAbril)
                                    .addComponent(chkOctubre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkMayo)
                                    .addComponent(chkNoviembre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkDiciembre)
                                    .addComponent(chkJunio)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtAñoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAñoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumEstanteria, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(txtCuerpo)
                            .addComponent(txtBalda)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCantPiezasDocum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addComponent(txtCantidadFolios, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumEstanteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBalda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtAñoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAñoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(chkTodos)
                    .addComponent(chkEnero)
                    .addComponent(chkFebrero)
                    .addComponent(chkMarzo)
                    .addComponent(chkAbril)
                    .addComponent(chkMayo)
                    .addComponent(chkJunio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkJulio)
                    .addComponent(chkAgosto)
                    .addComponent(chkSetiembre)
                    .addComponent(chkOctubre)
                    .addComponent(chkNoviembre)
                    .addComponent(chkDiciembre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCantidadFolios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCantPiezasDocum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir)
                    .addComponent(btnGuardar))
                .addGap(28, 28, 28))
        );

        jLabel3.setText("CREACION DE UN NUEVO PROYECTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try{
            conn.conectar();
            //conn.insertar("INSERT INTO Periodicos.Proyecto(Id_proyecto,Num_stand,Cuerpo_colum,Balda,Codigo,Año_inicial,Año_final,Meses,Denominacion,Cant_folios,Cant_piezas,Imagen,Fecha_creacion,Fecha_cierre,Proyectocol,Cod_trabajador,Estado) VALUES (Id_proyecto,Num_stand,Cuerpo_colum,Balda,Codigo,Año_inicial,Año_final,Meses,Denominacion,Cant_folios,Cant_piezas,Imagen,Fecha_creacion,Fecha_cierre,Proyectocol,Cod_trabajador,Estado);");
            conn.insertar("INSERT INTO Periodicos.Proyecto(Id_proyecto,Num_stand,Cuerpo_colum) VALUES (1,'"+this.txtNumEstanteria.getText()+"',"+this.txtCuerpo.getText()+");");
            conn.cierraConexion();
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCantidadFoliosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadFoliosActionPerformed
        // TODO add your handling code here:
        txtCantidadFolios.nextFocus();
    }//GEN-LAST:event_txtCantidadFoliosActionPerformed

    private void txtNumEstanteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumEstanteriaActionPerformed
        // TODO add your handling code here:
        txtNumEstanteria.nextFocus();
    }//GEN-LAST:event_txtNumEstanteriaActionPerformed

    private void txtCuerpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuerpoActionPerformed
        // TODO add your handling code here:
        txtCuerpo.nextFocus();
    }//GEN-LAST:event_txtCuerpoActionPerformed

    private void txtBaldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaldaActionPerformed
        // TODO add your handling code here:
        txtBalda.nextFocus();
    }//GEN-LAST:event_txtBaldaActionPerformed

    private void txtCodigoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLibroActionPerformed
        // TODO add your handling code here:
        txtCodigoLibro.nextFocus();
    }//GEN-LAST:event_txtCodigoLibroActionPerformed

    private void txtAñoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoInicialActionPerformed
        // TODO add your handling code here:
        txtAñoInicial.nextFocus();
    }//GEN-LAST:event_txtAñoInicialActionPerformed

    private void txtAñoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoFinalActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_txtAñoFinalActionPerformed

    private void txtDenominacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDenominacionActionPerformed
        // TODO add your handling code here:
        txtDenominacion.nextFocus();
    }//GEN-LAST:event_txtDenominacionActionPerformed

    private void txtCantPiezasDocumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantPiezasDocumActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCantPiezasDocumActionPerformed

    private void txtAñoFinalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoFinalKeyPressed
        // TODO add your handling code here:
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            this.txtDenominacion.requestFocus();
        }
    }//GEN-LAST:event_txtAñoFinalKeyPressed

    private void txtCantPiezasDocumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantPiezasDocumKeyPressed
        // TODO add your handling code here:
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            this.btnGuardar.requestFocus();
        }
    }//GEN-LAST:event_txtCantPiezasDocumKeyPressed

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
            java.util.logging.Logger.getLogger(JDialogProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogProyecto dialog = new JDialogProyecto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JCheckBox chkAbril;
    private javax.swing.JCheckBox chkAgosto;
    private javax.swing.JCheckBox chkDiciembre;
    private javax.swing.JCheckBox chkEnero;
    private javax.swing.JCheckBox chkFebrero;
    private javax.swing.JCheckBox chkJulio;
    private javax.swing.JCheckBox chkJunio;
    private javax.swing.JCheckBox chkMarzo;
    private javax.swing.JCheckBox chkMayo;
    private javax.swing.JCheckBox chkNoviembre;
    private javax.swing.JCheckBox chkOctubre;
    private javax.swing.JCheckBox chkSetiembre;
    private javax.swing.JCheckBox chkTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAñoFinal;
    private javax.swing.JTextField txtAñoInicial;
    private javax.swing.JTextField txtBalda;
    private javax.swing.JTextField txtCantPiezasDocum;
    private javax.swing.JTextField txtCantidadFolios;
    private javax.swing.JTextField txtCodigoLibro;
    private javax.swing.JTextField txtCuerpo;
    private javax.swing.JTextField txtDenominacion;
    private javax.swing.JTextField txtNumEstanteria;
    // End of variables declaration//GEN-END:variables
}
