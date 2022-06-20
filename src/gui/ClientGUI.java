
package gui;

import entities.Client;
import entities.Worker;
import javax.swing.JOptionPane;
import resources.Resources;
import javax.swing.table.DefaultTableModel;
import implement.ImplPerson;

public class ClientGUI extends javax.swing.JPanel {

    ImplPerson ip = new ImplPerson();
    Client cl = new Client();
    Resources resources = new Resources();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public ClientGUI() {
        initComponents();
        reporteCP();
        
        jTextField_id.setVisible(false);
        jButton_Actualizar.setVisible(false);
        jButton_Eliminar.setVisible(false);
           
    }
    
    
    public void reporteCP (){
        modelo.addColumn("Nombre");
        modelo.addColumn("Paterno");
        modelo.addColumn("Materno");
        modelo.addColumn("Ruc / Dni");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Id");
        
        for(Client perCli: ip.reporteCliPerDB()){
            Object fila[] = new Object[7];
            
            
            fila[0]= perCli.getPerson_nombres();
            fila[1]= perCli.getPerson_paterno();
            fila[2]= perCli.getPerson_materno();
            fila[3]= perCli.getPerson_nro_di();
            fila[4]= perCli.getPerson_usuario();
            fila[5]= "********";//perCli.getPerson_password();
            fila[6]= perCli.getPerson_id();
            
            modelo.addRow(fila);
        }
    
        jTableClientsPerson.setModel(modelo);


}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tipo = new javax.swing.ButtonGroup();
        jPanelFormulario = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_paterno = new javax.swing.JLabel();
        jLabel_materno = new javax.swing.JLabel();
        jLabel_nro = new javax.swing.JLabel();
        jLabel_nro1 = new javax.swing.JLabel();
        jLabel_nro2 = new javax.swing.JLabel();
        jTextField_nombres = new javax.swing.JTextField();
        jTextField_materno = new javax.swing.JTextField();
        jTextField_paterno = new javax.swing.JTextField();
        jTextField_usuario = new javax.swing.JTextField();
        jTextField_numero = new javax.swing.JTextField();
        jPasswordField_paswd = new javax.swing.JPasswordField();
        jButton_grabar = new javax.swing.JButton();
        jTextField1_codigo_cliente = new javax.swing.JTextField();
        jLabel_codigoCli = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_tipoCli = new javax.swing.JLabel();
        jRadioButton1_Natural = new javax.swing.JRadioButton();
        jRadioButton2_Juridica = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientsPerson = new javax.swing.JTable();
        jTextField_id = new javax.swing.JTextField();
        jButton1_Limpiar = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_titulo.setText("Formulario Cliente");
        jLabel_titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nombre.setText("Nombres:");

        jLabel_paterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_paterno.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_paterno.setText("Ap. Paterno:");

        jLabel_materno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_materno.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_materno.setText("Ap. Materno:");

        jLabel_nro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro.setText("Nro Ruc / Dni:");

        jLabel_nro1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro1.setText("Usuario:");

        jLabel_nro2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro2.setText("Contraseña:");

        jButton_grabar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_grabar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_grabar.setText("Grabar");
        jButton_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_grabarActionPerformed(evt);
            }
        });

        jLabel_codigoCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_codigoCli.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_codigoCli.setText("Codigo:");

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel_tipoCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_tipoCli.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_tipoCli.setText("Tipo de persona:");

        Tipo.add(jRadioButton1_Natural);
        jRadioButton1_Natural.setText("Natural");
        jRadioButton1_Natural.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1_NaturalMouseClicked(evt);
            }
        });

        Tipo.add(jRadioButton2_Juridica);
        jRadioButton2_Juridica.setText("Juridica");
        jRadioButton2_Juridica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2_JuridicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_tipoCli)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2_Juridica)
                    .addComponent(jRadioButton1_Natural))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_tipoCli)
                    .addComponent(jRadioButton1_Natural))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2_Juridica)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_paterno)
                            .addComponent(jLabel_nombre)
                            .addComponent(jLabel_materno)
                            .addComponent(jLabel_nro)
                            .addComponent(jLabel_nro1)
                            .addComponent(jLabel_nro2)
                            .addComponent(jLabel_codigoCli))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_nombres)
                            .addComponent(jTextField_materno, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jTextField_paterno, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jTextField_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jTextField_numero, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jPasswordField_paswd)
                            .addComponent(jTextField1_codigo_cliente)))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_paterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_materno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nro1)
                    .addComponent(jTextField_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_paswd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nro2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_codigoCli))
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_grabar)
                .addContainerGap())
        );

        jTableClientsPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Paterno", "Materno", "Ruc / Dni", "Usuario", "Contraseña", "Id"
            }
        ));
        jTableClientsPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientsPersonPersonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientsPerson);

        jButton1_Limpiar.setText("Limpiar");
        jButton1_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_LimpiarActionPerformed(evt);
            }
        });

        jButton_Actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Actualizar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_Actualizar.setText("Actualizar");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });

        jButton_Eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Eliminar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Actualizar)
                .addGap(18, 18, 18)
                .addComponent(jButton_Eliminar)
                .addGap(18, 18, 18)
                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(549, 549, 549))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton1_Limpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

     
     
    private void jButton_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_grabarActionPerformed
        
        if(jTextField_nombres.getText().equals("")||
           jTextField_paterno.getText().equals("")||
           jTextField_materno.getText().equals("")||
           jTextField_numero.getText().equals("")||
           jTextField_usuario.getText().equals("")||
           jPasswordField_paswd.getText().equals("")||
           jTextField1_codigo_cliente.getText().equals("")||
           tipo.equals("")
           ){
        JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        
        }else{
        //Para la tabla persona  
        cl.setPerson_nombres(jTextField_nombres.getText());
        cl.setPerson_paterno(jTextField_paterno.getText());
        cl.setPerson_materno(jTextField_materno.getText());
        cl.setPerson_nro_di(jTextField_numero.getText());
        cl.setPerson_usuario(jTextField_usuario.getText());
        cl.setPerson_password(jPasswordField_paswd.getText());
        
        //Especifico del cliente
        cl.setClient_codigocliente(jTextField1_codigo_cliente.getText());
        cl.setClient_tipo(tipo);  
        
        ip.registrarPerson(cl);
        
        JOptionPane.showMessageDialog(null, "Se registro con exito");
        AddOneReporteData();
        //Aparecer ventana ReporteCliente
        limpiarJtextfields();
        
        }
  
    }//GEN-LAST:event_jButton_grabarActionPerformed

    public void limpiarJtextfields(){
    jTextField_nombres.setText("");
    jTextField_paterno.setText("");
    jTextField_materno.setText("");
    jTextField_numero.setText("");
    jTextField_usuario.setText("");
    jPasswordField_paswd.setText("");
    jTextField1_codigo_cliente.setText("");
    
    jButton_grabar.setVisible(true);
    jButton_Actualizar.setVisible(false);
    jButton_Eliminar.setVisible(false);
    jTextField_id.setVisible(false);
    }
    
    
    public void AddOneReporteData(){
    Object[] fila = new Object[7];
    fila[0]= jTextField_nombres.getText();
    fila[1]= jTextField_paterno.getText();
    fila[2]= jTextField_materno.getText();
    fila[3]= jTextField_numero.getText();
    fila[4]= jTextField_usuario.getText();
    fila[5]= "********";//jPasswordField_paswd.getText();
    fila[6]= resources.generaID();
    
    modelo.addRow(fila);
    
    jTableClientsPerson.setModel(modelo);
    }
    
    /*
    public void AddOneReporteDataCli(){
    Object[] fila = new Object[4];
        fila[0] = resources.generaID();
        fila[1] = jTextField1_codigo_cliente.getText();
        fila[2] = tipo;
        fila[3] = resources.generaID();
        
        modelo.addColumn(fila);
        
        jT
    }*/
    
    public void updateOneReporteData(int rowSelected){
        
                    jTableClientsPerson.setValueAt(jTextField_nombres.getText(), rowSelected, 0);
                    jTableClientsPerson.setValueAt(jTextField_paterno.getText(), rowSelected, 1);
                    jTableClientsPerson.setValueAt(jTextField_materno.getText(), rowSelected, 2);
                    jTableClientsPerson.setValueAt(jTextField_numero.getText(), rowSelected, 3);
                    jTableClientsPerson.setValueAt(jTextField_usuario.getText(), rowSelected, 4);
                    jTableClientsPerson.setValueAt("********", rowSelected, 5);
                    jTableClientsPerson.setValueAt(jTextField_id.getText(), rowSelected, 6);
                    
    }
    
    public void deleteOneReporteData(int rowSelected){
        
        jTableClientsPerson.setValueAt("", rowSelected, 0);
        jTableClientsPerson.setValueAt("", rowSelected, 1);
        jTableClientsPerson.setValueAt("", rowSelected, 2);
        jTableClientsPerson.setValueAt("", rowSelected, 3);
        jTableClientsPerson.setValueAt("", rowSelected, 4);
        jTableClientsPerson.setValueAt("", rowSelected, 5);
        jTableClientsPerson.setValueAt("", rowSelected, 6);

    }
    
    private void jTableClientsPersonPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientsPersonPersonMouseClicked
        
        int row = jTableClientsPerson.getSelectedRow();
        
        String nombres = jTableClientsPerson.getValueAt(row, 0).toString();
        String paterno = jTableClientsPerson.getValueAt(row, 1).toString();
        String materno = jTableClientsPerson.getValueAt(row, 2).toString();
        String numero = jTableClientsPerson.getValueAt(row, 3).toString();
        String usuario = jTableClientsPerson.getValueAt(row, 4).toString();
        String id = jTableClientsPerson.getValueAt(row, 6).toString();
        //Codigo 
        
        jTextField_nombres.setText(nombres);
        jTextField_paterno.setText(paterno);
        jTextField_materno.setText(materno);
        jTextField_numero.setText(numero);
        jTextField_usuario.setText(usuario);
        jTextField_id.setText(id);
        jButton_grabar.setVisible(false);
        jButton_Actualizar.setVisible(true);
        jButton_Eliminar.setVisible(true);
        jTextField_id.setVisible(true);

    }//GEN-LAST:event_jTableClientsPersonPersonMouseClicked
    
    
    private void jRadioButton1_NaturalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1_NaturalMouseClicked
        // codigo del radio natural
        getTipo(jRadioButton1_Natural.getLabel());
    }//GEN-LAST:event_jRadioButton1_NaturalMouseClicked

    private void jRadioButton2_JuridicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2_JuridicaMouseClicked
        // codigo del radio juridico
        getTipo(jRadioButton2_Juridica.getLabel());
    }//GEN-LAST:event_jRadioButton2_JuridicaMouseClicked

    private void jButton1_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_LimpiarActionPerformed
        limpiarJtextfields();
    }//GEN-LAST:event_jButton1_LimpiarActionPerformed

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
       
        if(jTextField_nombres.getText().equals("")||
           jTextField_paterno.getText().equals("")||
           jTextField_materno.getText().equals("")||
           jTextField_numero.getText().equals("")||
           jTextField_usuario.getText().equals("")||
           jPasswordField_paswd.getText().equals("")||
           jTextField_id.getText().equals("")
           ){
            JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        
        }else{
        
            Client cl = new Client();
            cl.setPerson_nombres(jTextField_nombres.getText());
            cl.setPerson_paterno(jTextField_paterno.getText());
            cl.setPerson_materno(jTextField_materno.getText());
            cl.setPerson_nro_di(jTextField_numero.getText());
            cl.setPerson_usuario(jTextField_usuario.getText());
            cl.setPerson_password(jPasswordField_paswd.getText());
            cl.setClient_codigocliente("codigo");
            cl.setClient_tipo("Tipo");
            cl.setPerson_id(jTextField_id.getText());
            
            
            ip.ActualizarClient(cl);
            
            int row=jTableClientsPerson.getSelectedRow();
            updateOneReporteData(row);
            JOptionPane.showMessageDialog(null, "Se actualizo de manera satisfactoria");            
            limpiarJtextfields();            
            
            
        }  
        
        
        
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    
    
    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        if(jTextField_id.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Ingrese el ID a eliminar");
        }else {
            ip.EliminarWorker(jTextField_id.getText());
            int row=jTableClientsPerson.getSelectedRow();
            deleteOneReporteData(row);
            JOptionPane.showMessageDialog(null, "Se elimino de manera satisfactoria");
            limpiarJtextfields();
        }
            
    }//GEN-LAST:event_jButton_EliminarActionPerformed
    
    String tipo="";
    
    public void getTipo(String radio){
        tipo=radio;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup Tipo;
    private javax.swing.JButton jButton1_Limpiar;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_grabar;
    private javax.swing.JLabel jLabel_codigoCli;
    private javax.swing.JLabel jLabel_materno;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nro;
    private javax.swing.JLabel jLabel_nro1;
    private javax.swing.JLabel jLabel_nro2;
    private javax.swing.JLabel jLabel_paterno;
    private javax.swing.JLabel jLabel_tipoCli;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPasswordField jPasswordField_paswd;
    private javax.swing.JRadioButton jRadioButton1_Natural;
    private javax.swing.JRadioButton jRadioButton2_Juridica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientsPerson;
    private javax.swing.JTextField jTextField1_codigo_cliente;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_materno;
    private javax.swing.JTextField jTextField_nombres;
    private javax.swing.JTextField jTextField_numero;
    private javax.swing.JTextField jTextField_paterno;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
