/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author 96654
 */
public class Manager extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
    public Manager() {
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

        btnCNewAcc = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnSearchAll = new javax.swing.JButton();
        btnSearchStock = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();
        btnloOut = new javax.swing.JButton();
        panelManager = new javax.swing.JPanel();
        lblMdashboard = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCNewAcc.setBackground(new java.awt.Color(204, 204, 204));
        btnCNewAcc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCNewAcc.setText("Create New account");
        getContentPane().add(btnCNewAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 111, 191, 50));

        btnAddNew.setBackground(new java.awt.Color(204, 204, 204));
        btnAddNew.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAddNew.setText("Add New Products");
        getContentPane().add(btnAddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 189, 191, 50));

        btnSearchAll.setBackground(new java.awt.Color(204, 204, 204));
        btnSearchAll.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSearchAll.setText("Search All Products");
        getContentPane().add(btnSearchAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 270, 191, 50));

        btnSearchStock.setBackground(new java.awt.Color(204, 204, 204));
        btnSearchStock.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSearchStock.setText("Search Stock Details");
        getContentPane().add(btnSearchStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 361, -1, 50));

        btnViewAll.setBackground(new java.awt.Color(204, 204, 204));
        btnViewAll.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnViewAll.setText("View All Products");
        getContentPane().add(btnViewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 451, 191, 50));

        btnloOut.setBackground(new java.awt.Color(102, 203, 255));
        btnloOut.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnloOut.setForeground(new java.awt.Color(0, 0, 255));
        btnloOut.setText("Logout");
        btnloOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnloOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 535, -1, 30));

        panelManager.setBackground(new java.awt.Color(0, 153, 204));

        lblMdashboard.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblMdashboard.setText("Manager Dashboard");

        javax.swing.GroupLayout panelManagerLayout = new javax.swing.GroupLayout(panelManager);
        panelManager.setLayout(panelManagerLayout);
        panelManagerLayout.setHorizontalGroup(
            panelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManagerLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(lblMdashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        panelManagerLayout.setVerticalGroup(
            panelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManagerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMdashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undraw_Co-working_re_w93t.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 450, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloOutActionPerformed
       CashierManagerInterface Mfrm2=new CashierManagerInterface();
                 Mfrm2.setVisible(true);
    }//GEN-LAST:event_btnloOutActionPerformed

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnCNewAcc;
    private javax.swing.JButton btnSearchAll;
    private javax.swing.JButton btnSearchStock;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnloOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMdashboard;
    private javax.swing.JPanel panelManager;
    // End of variables declaration//GEN-END:variables
}
