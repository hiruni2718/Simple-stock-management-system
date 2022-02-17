/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stock;

import auth.LoginFrame;

/**
 *
 * @author ishan
 */
public class StockFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewStockFrame
     */
    public StockFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnAddFurniture = new javax.swing.JButton();
        btnAddElectronic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stock");
        setResizable(false);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnAddFurniture.setText("Add Furniture");
        btnAddFurniture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFurnitureActionPerformed(evt);
            }
        });

        btnAddElectronic.setText("Add Electronic");
        btnAddElectronic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddElectronicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 671, Short.MAX_VALUE)
                .addComponent(btnLogout))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnAddFurniture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddElectronic)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddFurniture)
                    .addComponent(btnAddElectronic))
                .addGap(90, 90, 90))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       if (evt.getSource() == btnLogout) {
            dispose();
            new LoginFrame().setVisible(true);
          
      }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddFurnitureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFurnitureActionPerformed
        if(evt.getSource()==btnAddFurniture){
            dispose();
            new AddFurniture().setVisible(true);
        }
    }//GEN-LAST:event_btnAddFurnitureActionPerformed

    private void btnAddElectronicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddElectronicActionPerformed
        if(evt.getSource()==btnAddElectronic){
            dispose();
            new AddElectronic().setVisible(true);
        }
    }//GEN-LAST:event_btnAddElectronicActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddElectronic;
    private javax.swing.JButton btnAddFurniture;
    private javax.swing.JButton btnLogout;
    // End of variables declaration//GEN-END:variables
}
