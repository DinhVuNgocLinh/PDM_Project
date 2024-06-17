
package Admin;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmAdminProperties extends javax.swing.JFrame {

    /**
     * Creates new form frmAdminProperties
     */
    public frmAdminProperties() {
        initComponents();
        setTitle("Ecommerce Platforms");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sellerManaBttn = new javax.swing.JButton();
        cusManaBttn = new javax.swing.JButton();
        backBttn = new javax.swing.JButton();
        orderManaBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setText("Moderation");

        sellerManaBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sellerManaBttn.setText("Seller Management");
        sellerManaBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerManaBttnActionPerformed(evt);
            }
        });

        cusManaBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cusManaBttn.setText("Customer Management");
        cusManaBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusManaBttnActionPerformed(evt);
            }
        });

        backBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backBttn.setText("Back to login");
        backBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBttnActionPerformed(evt);
            }
        });

        orderManaBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        orderManaBttn.setText("Order Management");
        orderManaBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderManaBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sellerManaBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderManaBttn))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cusManaBttn))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sellerManaBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cusManaBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(orderManaBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sellerManaBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerManaBttnActionPerformed
        this.setVisible(false);
        frmSellerModeration frame = new frmSellerModeration();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_sellerManaBttnActionPerformed

    private void cusManaBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusManaBttnActionPerformed
        this.setVisible(false);
        frmCustomerMana frame;
        try {
            frame = new frmCustomerMana();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(frmAdminProperties.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cusManaBttnActionPerformed

    private void backBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBttnActionPerformed
        this.setVisible(false);
        frmLogin frame = new frmLogin();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBttnActionPerformed

    private void orderManaBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderManaBttnActionPerformed
        this.setVisible(false);
        frmOrder frame = new frmOrder();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_orderManaBttnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBttn;
    private javax.swing.JButton cusManaBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orderManaBttn;
    private javax.swing.JButton sellerManaBttn;
    // End of variables declaration//GEN-END:variables
}