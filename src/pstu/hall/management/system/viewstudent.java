/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package pstu.hall.management.system;
import project.*;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.HeadlessException;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author epsilone_not
 */
public class viewstudent extends javax.swing.JFrame {

    
    public viewstudent(String stid) {
        initComponents();
        
        String url = "jdbc:mysql://localhost:3306/Hall_Management_System";
        String username = "root";
        String password = "";
        String query = "SELECT * FROM addstudent WHERE StudentId = ?";
        
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, stid);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
               jCTextField1.setText(rs.getString(1));
               jCTextField2.setText(rs.getString(2));
               jCTextField3.setText(rs.getString(3));
               jCTextField4.setText(rs.getString(4));
               jCTextField5.setText(rs.getString(5));
               jCTextField10.setText(rs.getString(6));
               jCTextField11.setText(rs.getString(7));
               jCTextField12.setText(rs.getString(8));
               jCTextField13.setText(rs.getString(9));
               jCTextField6.setText(rs.getString(10));
               jCTextField14.setText(rs.getString(11));
               jCTextField9.setText(rs.getString(12));
               jCTextField15.setText(rs.getString(13));
               jTextArea1.setText(rs.getString(14));
               jCTextField7.setText(rs.getString(15));
               jCTextField8.setText(rs.getString(16));
            } else {
                JOptionPane.showMessageDialog(this, "Student not found.");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while retrieving student information.");
        } 
    
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSMaterialButtonRectangleBeanInfo1 = new rojerusan.RSMaterialButtonRectangleBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        jCTextField2 = new app.bolivia.swing.JCTextField();
        jCTextField3 = new app.bolivia.swing.JCTextField();
        jCTextField4 = new app.bolivia.swing.JCTextField();
        jCTextField5 = new app.bolivia.swing.JCTextField();
        jCTextField6 = new app.bolivia.swing.JCTextField();
        jCTextField7 = new app.bolivia.swing.JCTextField();
        jCTextField8 = new app.bolivia.swing.JCTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCTextField9 = new app.bolivia.swing.JCTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        jCTextField10 = new app.bolivia.swing.JCTextField();
        jCTextField11 = new app.bolivia.swing.JCTextField();
        jCTextField12 = new app.bolivia.swing.JCTextField();
        jCTextField13 = new app.bolivia.swing.JCTextField();
        jCTextField14 = new app.bolivia.swing.JCTextField();
        jCTextField15 = new app.bolivia.swing.JCTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(30, 35, 43));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(56, 140, 125));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Information");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 15, 380, 46));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 79, 420, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 150));

        jPanel4.setBackground(new java.awt.Color(56, 140, 125));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Father Name:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mother Name:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 159, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of Birth: ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 208, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 399, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 636, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact NO:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 676, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Student ID:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Reg NO:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Faculty:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 279, -1, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Semister:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 319, -1, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Seasion:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 359, -1, -1));

        jCTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jCTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 14, 161, 24));

        jCTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jCTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jCTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 48, 161, 24));

        jCTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jCTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField3ActionPerformed(evt);
            }
        });
        jPanel4.add(jCTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 82, 256, 24));

        jCTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel4.add(jCTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 124, 285, 24));

        jCTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel4.add(jCTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 163, 285, 24));

        jCTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel4.add(jCTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 278, 24));

        jCTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel4.add(jCTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 640, 281, 24));

        jCTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel4.add(jCTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 680, 281, 24));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Aloted Hall:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 246, -1, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nationality:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 439, -1, -1));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Religious:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 479, -1, -1));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Permanent Address:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 515, -1, -1));

        jCTextField9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jCTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField9ActionPerformed(evt);
            }
        });
        jPanel4.add(jCTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 270, 24));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 376, -1));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(255, 0, 51));
        rSMaterialButtonRectangle2.setText("CANCEL");
        rSMaterialButtonRectangle2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel4.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 720, 120, 40));

        jCTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jCTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField10ActionPerformed(evt);
            }
        });
        jPanel4.add(jCTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 285, 24));

        jCTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jCTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField11ActionPerformed(evt);
            }
        });
        jPanel4.add(jCTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 285, 24));

        jCTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel4.add(jCTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 285, 24));

        jCTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel4.add(jCTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 285, 24));

        jCTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel4.add(jCTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 285, 24));

        jCTextField15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel4.add(jCTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 285, 24));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 720, 770));

        setSize(new java.awt.Dimension(720, 920));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField1ActionPerformed

    private void jCTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField2ActionPerformed

    private void jCTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField3ActionPerformed

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SearchStudent().setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void jCTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField9ActionPerformed
        
    }//GEN-LAST:event_jCTextField9ActionPerformed

    private void jCTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField10ActionPerformed

    private void jCTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField11ActionPerformed

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
            java.util.logging.Logger.getLogger(viewstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new viewstudent("stid").setVisible(true);
            }
        });
    }
    private String ChangeDateFormate(Date abc){
        SimpleDateFormat dt=new SimpleDateFormat("dd/mm/yyyy");
        try{
            return dt.format(abc);
        }
        catch(Exception e){
            return " ";
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField jCTextField1;
    private app.bolivia.swing.JCTextField jCTextField10;
    private app.bolivia.swing.JCTextField jCTextField11;
    private app.bolivia.swing.JCTextField jCTextField12;
    private app.bolivia.swing.JCTextField jCTextField13;
    private app.bolivia.swing.JCTextField jCTextField14;
    private app.bolivia.swing.JCTextField jCTextField15;
    private app.bolivia.swing.JCTextField jCTextField2;
    private app.bolivia.swing.JCTextField jCTextField3;
    private app.bolivia.swing.JCTextField jCTextField4;
    private app.bolivia.swing.JCTextField jCTextField5;
    private app.bolivia.swing.JCTextField jCTextField6;
    private app.bolivia.swing.JCTextField jCTextField7;
    private app.bolivia.swing.JCTextField jCTextField8;
    private app.bolivia.swing.JCTextField jCTextField9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangleBeanInfo rSMaterialButtonRectangleBeanInfo1;
    // End of variables declaration//GEN-END:variables
}
