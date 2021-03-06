/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation.research;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Ebad
 */
public class North extends javax.swing.JFrame {

    /**
     * Creates new form North
     */
    public North() {
        initComponents();
         this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        jTextField_rows = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_column = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NorthWest Corner Method");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("No. of Rows");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("No. of Columns");

        jTextField_column.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_columnActionPerformed(evt);
            }
        });
        jTextField_column.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_columnKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setText("Next");
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
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_rows, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_column, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rows, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jTextField_column))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_columnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_columnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_columnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String a, b;
        int x, y;

        a = jTextField_rows.getText();
        b = jTextField_column.getText();

        if (a.length() == 0 || b.length() == 0) {
            JOptionPane.showMessageDialog(this, "Please Enter both values.");
        } else {
            x = Integer.parseInt(a);
            y = Integer.parseInt(b);

            Data.row = x;
            Data.column = y;

            if (x == 3 && y == 4) {
                dispose();
                NorthGUI gu = new NorthGUI();
                gu.setVisible(true);
            } else if (x == 4 && y == 4) {

                dispose();
                NorthGUI2 gu = new NorthGUI2();
                gu.setVisible(true);
            } else if (x == 4 && y == 3) {
                dispose();
                NorthGUI3 gu = new NorthGUI3();
                gu.setVisible(true);
            } else if (x == 3 && y == 3) {
                dispose();
                NorthGUI4 gu = new NorthGUI4();
                gu.setVisible(true);
            } else {
             JOptionPane.showMessageDialog(this, "Either Enter row = 3 and column = 4 OR row = 4 and column = 4 OR row = 4 and column = 3 OR row = 3 and column = 4");
                
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_columnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_columnKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String a, b;
            int x, y;

            a = jTextField_rows.getText();
            b = jTextField_column.getText();

            if (a.length() == 0 || b.length() == 0) {
                JOptionPane.showMessageDialog(this, "Please Enter both values.");
            } else {
                x = Integer.parseInt(a);
                y = Integer.parseInt(b);

                Data.row = x;
                Data.column = y;

                if (x == 3 && y == 4) {
                    dispose();
                    NorthGUI gu = new NorthGUI();
                    gu.setVisible(true);
                } else if (x == 4 && y == 4) {

                    dispose();
                    NorthGUI2 gu = new NorthGUI2();
                    gu.setVisible(true);
                } else if (x == 4 && y == 3) {
                    dispose();
                    NorthGUI3 gu = new NorthGUI3();
                    gu.setVisible(true);
                } else if (x == 3 && y == 3) {
                    dispose();
                    NorthGUI4 gu = new NorthGUI4();
                    gu.setVisible(true);
                } else {
                 JOptionPane.showMessageDialog(this, "Either Enter row = 3 and column = 4 OR row = 4 and column = 4 OR row = 4 and column = 3 OR row = 3 and column = 4");
                
                }

            }
        }


    }//GEN-LAST:event_jTextField_columnKeyPressed

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
            java.util.logging.Logger.getLogger(North.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(North.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(North.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(North.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                North ns = new North();
                ns.setResizable(false);
                ns.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_column;
    private javax.swing.JTextField jTextField_rows;
    // End of variables declaration//GEN-END:variables
}
