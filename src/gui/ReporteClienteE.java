/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import entities.Client;
import implement.ImplPerson;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI
 */
public class ReporteClienteE extends javax.swing.JInternalFrame {

   DefaultTableModel modelo = new DefaultTableModel();
    ImplPerson ip = new ImplPerson();
    
    public ReporteClienteE() {
        initComponents();
        
        reportCliSpecified();
    }

    
    public void reportCliSpecified(){
        
        modelo.addColumn("Cliente id");
        modelo.addColumn("Codigo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Cliente persona id");
        
        for(Client clie: ip.reporteCliEsDB()){
            Object fila[] = new Object[4];
            
            fila[0] = clie.getClient_id();
            fila[1] = clie.getClient_codigocliente();
            fila[2] = clie.getClient_tipo();
            fila[3] = clie.getClient_person_id();
            
            modelo.addRow(fila);
        }
        
        jTable_ClientsSpecifically.setModel(modelo);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_ClientsSpecifically = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTable_ClientsSpecifically.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable_ClientsSpecifically);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_ClientsSpecifically;
    // End of variables declaration//GEN-END:variables
}
