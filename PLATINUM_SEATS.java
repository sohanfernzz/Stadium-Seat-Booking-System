
import javax.swing.JFrame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.print.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sohan Fernandes
 */
public class PLATINUM_SEATS extends javax.swing.JFrame {
      ResultSet rs;
      
    /**
     * Creates new form PLATINUM_SEATS
     */
    public PLATINUM_SEATS() {
        initComponents();
         String sql="select * from sportevent";
         try{
              Class.forName("com.mysql.jdbc.Driver");
                         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stadium?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Nahos");
             pst=con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                 jComboBox1.addItem(rs.getString(1));
             }
         }
         catch(Exception e){
             
         }
    }
    
    Connection con;
        PreparedStatement pst;
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
                         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stadium?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Nahos");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(REGISTER.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(REGISTER.class.getName()).log(Level.SEVERE, null, ex);
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 450, 73, -1));

        jButton2.setText("GENERATE BILL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 450, 126, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("ENTER SEAT NUMBER:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 144, 161, 31));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 193, 128, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 97, 167, -1));

        jButton3.setText("BOOK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 404, 128, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 58, -1, 420));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("ENTER NAME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 63, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 97, 123, -1));

        jButton4.setText("SHOW BOOKINGS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 140, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 336, 281));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("PHONE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 261, 84, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 303, 128, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("SELECT MATCH:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setText("RECIEPT:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 70, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\sohan manoj\\khamkeo-vilaysing-Ef7C4bPDL4A-unsplash.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -560, 1380, 1040));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         STADIUM_SEAT_PLAN a=new STADIUM_SEAT_PLAN();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String printdata=jTextArea1.getText();
     PrinterJob job=PrinterJob.getPrinterJob();
     boolean doprint=job.printDialog();
     if(doprint){
         try{
             job.print();
         }
         catch(PrinterException e){
            JOptionPane.showMessageDialog(null, e);
         }
         
     }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      try {
              int seatNumber = Integer.parseInt(jTextField1.getText());
             int maxSeats = 51; 
             if (seatNumber >= maxSeats || seatNumber==0) {
          JOptionPane.showMessageDialog(null, "Seat exceeded, please select seats from 1 to 50");
           } else {
                String seat=jTextField1.getText();
            String name=jTextField2.getText();
            int selected=jTable1.getSelectedRow();
            String status="booked";
            String match=jComboBox1.getSelectedItem().toString();
                pst = con.prepareStatement("insert into platinumseats (c_name,matchname,seats,status)values(?,?,?,?)");
                pst.setString(1,name);
            pst.setString(2,match);
            pst.setInt(3,Integer.parseInt(seat));
            pst.setString(4, status);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Booking Successful");
                String name1=String.format(jTextField2.getText());
         String phone=String.format(jTextField1.getText());
         String seat1=String.format(jTextField3.getText());
         jTextArea1.append("\t\t Reciept of Seat Booked\n"+"\n \t Name:"+name+"\n \n \t Phone Number:"+phone+"Seat No.:"+seat+"\n \n \t Amount is 2000rs"+"\n \n \t Thank you");
            }
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1452) {
                JOptionPane.showMessageDialog(null, "Seat is already booked");
            } else {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            try{
                 String match=jComboBox1.getSelectedItem().toString();
                 pst=con.prepareStatement("SELECT * FROM platinumseats");
                 rs=pst.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            int n=rsmd.getColumnCount();
            DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while(rs.next()){
                Object o[]={rs.getString("c_name"),rs.getString("matchname"),rs.getInt("seats"),rs.getString("status")};
     dtm.addRow(o);
            }
            }catch (SQLException ex) {
              Logger.getLogger(PLATINUM_SEATS.class.getName()).log(Level.SEVERE, null, ex);
          }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
     
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
            java.util.logging.Logger.getLogger(PLATINUM_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PLATINUM_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PLATINUM_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PLATINUM_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PLATINUM_SEATS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
