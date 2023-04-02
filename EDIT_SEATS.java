/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class EDIT_SEATS extends javax.swing.JFrame {

    public EDIT_SEATS() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("PLATINUM");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 167, 100, -1));

        jRadioButton4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("GENERAL");
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 239, 137, -1));

        jRadioButton5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("VIP");
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 298, 100, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEAT PLAN:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 75, 82, -1));

        jRadioButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("PREMIUM");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 103, 100, -1));

        jToggleButton1.setText("RESET");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 394, 111, -1));

        jToggleButton2.setText("FINISH EDITING");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 484, 160, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clicking RESET clears all the seats and sets to unbooked.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 365, 310, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EDIT SEATS:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, 145, 34));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\sohan manoj\\victor-rosario-FdtgSFaXIII-unsplash.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String tableName =null;
        if(jRadioButton1.isSelected()){
             tableName = "premiumseats";
        }
        else if(jRadioButton2.isSelected()){
             tableName="platinumseats";
        }
        else if(jRadioButton4.isSelected()){
             tableName="generalseats";
        }
        else if(jRadioButton5.isSelected()){
             tableName="vipseats";
        }
        if (tableName != null) {
    PreparedStatement pst;
    try {
            Class.forName("com.mysql.jdbc.Driver");
                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stadium?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Nahos");
                   String a="DELETE FROM " + tableName;
                   pst = con.prepareStatement(a); 
                 // pst.setString(1, tableName);
            pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "seats of "+tableName+" has been reseted");
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(REGISTER.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(REGISTER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        ADMINHOME d=new ADMINHOME();
        d.setVisible(true);
        d.pack();
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    
   
        
   
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EDIT_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EDIT_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EDIT_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EDIT_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EDIT_SEATS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
