
package sistemahistorico;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class JDialogProyecto extends javax.swing.JDialog {

    CapaConexion.conexion conn = new CapaConexion.conexion();
    
    public JDialogProyecto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Limpiar();
        
        //CapaConexion.conexion conn = new CapaConexion.conexion();
        
    }

    public void Limpiar(){
        this.txtNumEstanteria.setText("");
        this.txtCuerpo.setText("");
        this.txtBalda.setText("");
        this.txtCodigoLibro.setText("");
        this.txtAñoInicial.setText("");
        this.txtAñoFinal.setText("");
        this.txtMeses.setText("");
        this.txtDenominacion.setText("");
        this.txtCantidadFolios.setText("");
        this.txtCantPiezasDocum.setText("");
        chkTodos.setSelected(false);
        chkEnero.setSelected(false);
        chkFebrero.setSelected(false);
        chkMarzo.setSelected(false);
        chkAbril.setSelected(false);
        chkMayo.setSelected(false);
        chkJunio.setSelected(false);
        chkJulio.setSelected(false);
        chkAgosto.setSelected(false);
        chkSetiembre.setSelected(false);
        chkOctubre.setSelected(false);
        chkNoviembre.setSelected(false);
        chkDiciembre.setSelected(false);
    }
    
    
    public void GenerarMeses(){
        if(chkEnero.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Enero");
            }else{
                this.txtMeses.setText(cadena+", Enero");
            }  
        }
        
        if(chkFebrero.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Febrero");
            }else{
                this.txtMeses.setText(cadena+", Febrero");
            }
        }
        
        if(chkMarzo.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Marzo");
            }else{
                this.txtMeses.setText(cadena+", Marzo");
            }
        }
        
        if(chkAbril.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Abril");
            }else{
                this.txtMeses.setText(cadena+", Abril");
            }
        }
        
         if(chkMayo.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Mayo");
            }else{
                this.txtMeses.setText(cadena+", Mayo");
            }
        }
         
          if(chkJunio.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Junio");
            }else{
                this.txtMeses.setText(cadena+", Junio");
            }
        }
          
           if(chkJulio.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Julio");
            }else{
                this.txtMeses.setText(cadena+", Julio");
            }
        }
           
           if(chkAgosto.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Agosto");
            }else{
                this.txtMeses.setText(cadena+", Agosto");
            }
        }
           
           if(chkSetiembre.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Setiembre");
            }else{
                this.txtMeses.setText(cadena+", Setiembre");
            }
        }
           
           if(chkOctubre.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Octubre");
            }else{
                this.txtMeses.setText(cadena+", Octubre");
            }
        }
           
            if(chkNoviembre.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Noviembre");
            }else{
                this.txtMeses.setText(cadena+", Noviembre");
            }
        }
            
            if(chkDiciembre.isSelected()==true){
            chkTodos.setEnabled(true);
            String cadena = this.txtMeses.getText();
            if("".equals(cadena)){
                this.txtMeses.setText("Diciembre");
            }else{
                this.txtMeses.setText(cadena+", Diciembre");
            }
        }
    }
    
    public void Vacios(){
        if("".equals(this.txtNumEstanteria.getText())){
            this.txtNumEstanteria.setBackground(Color.yellow);
            this.txtNumEstanteria.requestFocus();
        }
        if("".equals(this.txtCuerpo.getText())){
            this.txtCuerpo.setBackground(Color.yellow);
            this.txtCuerpo.requestFocus();
        }
        if("".equals(this.txtBalda.getText())){
            this.txtBalda.setBackground(Color.yellow);
            this.txtBalda.requestFocus();
        }
        if("".equals(this.txtCodigoLibro.getText())){
            this.txtCodigoLibro.setBackground(Color.yellow);
            this.txtCodigoLibro.requestFocus();
        }
        if("".equals(this.txtAñoInicial.getText())){
            this.txtAñoInicial.setBackground(Color.yellow);
            this.txtAñoInicial.requestFocus();
        }
        if("".equals(this.txtAñoFinal.getText())){
            this.txtAñoFinal.setBackground(Color.yellow);
            this.txtAñoFinal.requestFocus();
        }
        if("".equals(this.txtDenominacion.getText())){
            this.txtDenominacion.setBackground(Color.yellow);
            this.txtDenominacion.requestFocus();
        }
        if("".equals(this.txtCantidadFolios.getText())){
            this.txtCantidadFolios.setBackground(Color.yellow);
            this.txtCantidadFolios.requestFocus();
        }
        if("".equals(this.txtCantPiezasDocum.getText())){
            this.txtCantPiezasDocum.setBackground(Color.yellow);
            this.txtCantPiezasDocum.requestFocus();
        }
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
        txtMeses = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(44, 44, 44));

        jPanel1.setBackground(new java.awt.Color(93, 155, 172));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero Estanteria:*");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cuerpo:*");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Balda:*");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo Libro:*");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Año inicial:*");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Año Final:*");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Meses:*");

        chkTodos.setForeground(new java.awt.Color(255, 255, 255));
        chkTodos.setText("Todos");
        chkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTodosActionPerformed(evt);
            }
        });

        chkEnero.setForeground(new java.awt.Color(255, 255, 255));
        chkEnero.setText("Enero");
        chkEnero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEneroActionPerformed(evt);
            }
        });

        chkFebrero.setForeground(new java.awt.Color(255, 255, 255));
        chkFebrero.setText("Febrero");
        chkFebrero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFebreroActionPerformed(evt);
            }
        });

        chkMarzo.setForeground(new java.awt.Color(255, 255, 255));
        chkMarzo.setText("Marzo");
        chkMarzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMarzoActionPerformed(evt);
            }
        });

        chkAbril.setForeground(new java.awt.Color(255, 255, 255));
        chkAbril.setText("Abril");
        chkAbril.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAbrilActionPerformed(evt);
            }
        });

        chkMayo.setForeground(new java.awt.Color(255, 255, 255));
        chkMayo.setText("Mayo");
        chkMayo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMayoActionPerformed(evt);
            }
        });

        chkJunio.setForeground(new java.awt.Color(255, 255, 255));
        chkJunio.setText("Junio");
        chkJunio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkJunioActionPerformed(evt);
            }
        });

        chkJulio.setForeground(new java.awt.Color(255, 255, 255));
        chkJulio.setText("Julio");
        chkJulio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkJulioActionPerformed(evt);
            }
        });

        chkAgosto.setForeground(new java.awt.Color(255, 255, 255));
        chkAgosto.setText("Agosto");
        chkAgosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAgostoActionPerformed(evt);
            }
        });

        chkSetiembre.setForeground(new java.awt.Color(255, 255, 255));
        chkSetiembre.setText("Setiembre");
        chkSetiembre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSetiembreActionPerformed(evt);
            }
        });

        chkOctubre.setForeground(new java.awt.Color(255, 255, 255));
        chkOctubre.setText("Octubre");
        chkOctubre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOctubreActionPerformed(evt);
            }
        });

        chkNoviembre.setForeground(new java.awt.Color(255, 255, 255));
        chkNoviembre.setText("Nombiembre");
        chkNoviembre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoviembreActionPerformed(evt);
            }
        });

        chkDiciembre.setForeground(new java.awt.Color(255, 255, 255));
        chkDiciembre.setText("Diciembre");
        chkDiciembre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDiciembreActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Denominacion:*");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cantidad de Folios:*");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cant. Piezas Docum:*");

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

        txtMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesesActionPerformed(evt);
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
                                .addGap(12, 12, 12)
                                .addComponent(txtDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(chkMarzo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtAñoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAñoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                            .addComponent(chkJunio))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtMeses)))))
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
                .addContainerGap())
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
                    .addComponent(txtAñoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAñoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
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

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setText("CREACION DE UN NUEVO PROYECTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Vacios();
        GenerarMeses();
        
        int CodTrabajador = Integer.parseInt("1");
        int Estado = Integer.parseInt("1");
        GenerarMeses();
        String stand = this.txtNumEstanteria.getText();
        int cuerpo = Integer.parseInt(this.txtCuerpo.getText());
        String balda = this.txtBalda.getText();
        String codigo = this.txtCodigoLibro.getText();
        String yearinicial = this.txtAñoInicial.getText();
        String yearfinal = this.txtAñoFinal.getText();
        String meses = this.txtMeses.getText();
        String denominacion = this.txtDenominacion.getText();
        int cantfolios = Integer.parseInt(this.txtCantidadFolios.getText());
        int cantpiezas = Integer.parseInt(this.txtCantPiezasDocum.getText());
        String Imagen = null;
        
        try{
            conn.conectar();
            String sql = "INSERT INTO Proyecto(Num_stand,Cuerpo_colum,Balda,Codigo,Año_inicial,Año_final,Meses,Denominacion,Cant_folios,Cant_piezas,Imagen,Cod_trabajador,Estado) VALUES ('"+stand+"',"+cuerpo+",'"+balda+"','"+codigo+"' ,'"+yearinicial+"' ,'"+yearfinal+"' ,'"+meses+"','"+denominacion+" ',"+cantfolios+","+cantpiezas+" ,'"+Imagen+"' ,"+CodTrabajador+" ,"+Estado+");";
            conn.insertar(sql);
            conn.cierraConexion();
            JOptionPane.showMessageDialog(null, "Los datos fueron Guardados satisfactoriamente");
            Limpiar();
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

    private void txtMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesesActionPerformed

    private void chkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTodosActionPerformed
        if(chkTodos.isSelected()==true){
            chkEnero.setSelected(true);
            chkFebrero.setSelected(true);
            chkMarzo.setSelected(true);
            chkAbril.setSelected(true);
            chkMayo.setSelected(true);
            chkJunio.setSelected(true);
            chkJulio.setSelected(true);
            chkAgosto.setSelected(true);
            chkSetiembre.setSelected(true);
            chkOctubre.setSelected(true);
            chkNoviembre.setSelected(true);
            chkDiciembre.setSelected(true);
            //this.txtMeses.setText("Enero a Diciembre");
        }else{
            chkEnero.setSelected(false);
            chkFebrero.setSelected(false);
            chkMarzo.setSelected(false);
            chkAbril.setSelected(false);
            chkMayo.setSelected(false);
            chkJunio.setSelected(false);
            chkJulio.setSelected(false);
            chkAgosto.setSelected(false);
            chkSetiembre.setSelected(false);
            chkOctubre.setSelected(false);
            chkNoviembre.setSelected(false);
            chkDiciembre.setSelected(false);
            this.txtMeses.setText(" ");
        }
    }//GEN-LAST:event_chkTodosActionPerformed

    private void chkEneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEneroActionPerformed
        
    }//GEN-LAST:event_chkEneroActionPerformed

    private void chkFebreroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFebreroActionPerformed
        
    }//GEN-LAST:event_chkFebreroActionPerformed

    private void chkMarzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMarzoActionPerformed
        
    }//GEN-LAST:event_chkMarzoActionPerformed

    private void chkAbrilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAbrilActionPerformed
        
    }//GEN-LAST:event_chkAbrilActionPerformed

    private void chkMayoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMayoActionPerformed
       
    }//GEN-LAST:event_chkMayoActionPerformed

    private void chkJunioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkJunioActionPerformed
       
    }//GEN-LAST:event_chkJunioActionPerformed

    private void chkJulioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkJulioActionPerformed
       
    }//GEN-LAST:event_chkJulioActionPerformed

    private void chkAgostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAgostoActionPerformed
        
    }//GEN-LAST:event_chkAgostoActionPerformed

    private void chkSetiembreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSetiembreActionPerformed
        
    }//GEN-LAST:event_chkSetiembreActionPerformed

    private void chkOctubreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOctubreActionPerformed
        
    }//GEN-LAST:event_chkOctubreActionPerformed

    private void chkNoviembreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoviembreActionPerformed
       
    }//GEN-LAST:event_chkNoviembreActionPerformed

    private void chkDiciembreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDiciembreActionPerformed
        
    }//GEN-LAST:event_chkDiciembreActionPerformed

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
    private javax.swing.JTextField txtMeses;
    private javax.swing.JTextField txtNumEstanteria;
    // End of variables declaration//GEN-END:variables
}
