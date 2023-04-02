
import javax.swing.JFrame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.print.*;

public class PREMIUM_SEATS extends javax.swing.JFrame {
    ResultSet rs;

    
    public PREMIUM_SEATS() {
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

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 73, -1));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 83, 162, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("ENTER NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 115, 104, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("ENTER SEAT NO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 211, 105, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 165, 146, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 245, 150, -1));

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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(969, 65, -1, -1));

        jButton3.setText("SHOW BOOKINGS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(969, 19, 148, -1));

        jButton4.setText("BOOK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 73, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("PHONE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 291, 58, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 325, 150, -1));

        jButton2.setText("GENERATE BILL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 220, 416, 290));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("SELECT MATCH:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 39, 106, 26));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setText("RECIEPT:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 186, 79, 20));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("PREMIUM SEATS:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 19, 174, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\sohan manoj\\kyaw-tun-o4Tc9wRMVVM-unsplash.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        STADIUM_SEAT_PLAN a=new STADIUM_SEAT_PLAN();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try {
              int seatNumber = Integer.parseInt(jTextField2.getText());
             int maxSeats = 51; 
             if (seatNumber >= maxSeats || seatNumber==0) {
          JOptionPane.showMessageDialog(null, "seat no exceeded, please enter seats from 1 to 50");
           } else {
                String seat=jTextField2.getText();
            String name=jTextField1.getText();
            int selected=jTable1.getSelectedRow();
            String status="booked";
            String match=jComboBox1.getSelectedItem().toString();
                pst = con.prepareStatement("insert into premiumseats (c_name,matchname,seats,status)values(?,?,?,?)");
                pst.setString(1,name);
            pst.setString(2,match);
            pst.setInt(3,Integer.parseInt(seat));
            pst.setString(4, status);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Booking Successful");
                String name1=String.format(jTextField1.getText());
                String phone=String.format(jTextField3.getText());
         String seat1=String.format(jTextField2.getText());
         jTextArea1.append("\t Reciept of Seat Booked\n"+"\n Name:"+name+"\n \n  Phone Number:"+phone+"\n \n Seat No.:"+seat+"\n \n  Amount is 1000rs"+"\n \n Thank you");
            }
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1452) {
                JOptionPane.showMessageDialog(null, "Seat is already booked");
            } else {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
                 String match=jComboBox1.getSelectedItem().toString();
                 pst=con.prepareStatement("SELECT * FROM premiumseats JOIN users ON premiumseats.c_name = users.user_name");
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String printdata=jTextArea1.getText();
     PrinterJob job=PrinterJob.getPrinterJob();
     boolean doprint=job.printDialog();
     if(doprint){
         try{
             job.print();;
         }
         catch(PrinterException e){
             //
         }
     }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PREMIUM_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PREMIUM_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PREMIUM_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PREMIUM_SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PREMIUM_SEATS().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
