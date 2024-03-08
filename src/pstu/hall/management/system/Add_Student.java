/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package pstu.hall.management.system;
import project.*;
//import java.sql.Connection;
//import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.HeadlessException;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author epsilone_not
 */
public class Add_Student extends javax.swing.JFrame {

    
    public Add_Student() {
        initComponents();
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
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCTextField9 = new app.bolivia.swing.JCTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();

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
        jLabel6.setText("Gender");
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
        jPanel4.add(jCTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 363, 278, 24));

        jCTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel4.add(jCTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 640, 281, 24));

        jCTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel4.add(jCTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 680, 281, 24));

        jDateChooser2.setDateFormatString("dd/MM/yyyy");
        jDateChooser2.setMinimumSize(new java.awt.Dimension(50, 29));
        jPanel4.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 199, 278, 26));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, 26));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty of Computer Science and Engineering (CSE)", "Faculty of Nutrition and Food Science (NFS)", "Faculty of Environmental Science and Disaster Management (ESDM)", "Faculty of Agriculture", "Faculty of Business Administration", "Faculty of Fisheries", "Faculty of Law and Land Administration" }));
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 281, 278, 26));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level-I, Semister-1", "Level-I, Semister-2", "Level-II, Semister-1", "Level-II, Semister-2", "Level-III, Semister-1", "Level-III, Semister-2", "Level-IV, Semister-1", "Level-IV, Semister-2" }));
        jPanel4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 321, -1, 26));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Aloted Hall:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 246, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M Keramot Ali Hall", "Bangabandhu Sheikh Mujibur Rahman Hall", "Sher-e-Bangla Hall-1", "Sher-e-Bangla Hall-2", "Kobi Begum Sufia Kamal Hall", "Bangamata Sheikh Fazilatun Nesa Hall ", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 248, 278, -1));

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

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Buddhism", "Hinduism", "Christianity", " " }));
        jPanel4.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 80, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 515, 376, -1));

        rSMaterialButtonRectangle1.setText("Update");
        rSMaterialButtonRectangle1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        jPanel4.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 100, 40));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(255, 0, 51));
        rSMaterialButtonRectangle2.setText("CANCEL");
        rSMaterialButtonRectangle2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel4.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 720, 120, 40));

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

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField3ActionPerformed

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        
        String StudentId=jCTextField1.getText();
        String RegiNo=jCTextField2.getText();
        String Name=jCTextField3.getText();
        String FatherName=jCTextField4.getText();
        String MotherName=jCTextField5.getText();
        Date birthdate = jDateChooser2.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        String Birthdate = sdf.format(birthdate);
        String Hall=(String)jComboBox4.getSelectedItem();
        String Faculty=(String)jComboBox2.getSelectedItem();
        String Semister=(String)jComboBox3.getSelectedItem();
        String Seasson=jCTextField6.getText();
        String Gender=(String)jComboBox1.getSelectedItem();
        String Nationality=jCTextField9.getText();
        String Religious=(String)jComboBox5.getSelectedItem();
        String PAdderess=jTextArea1.getText();
        String Email=jCTextField7.getText();
        String PNumber=jCTextField8.getText();
        try{
            Connection con=CProvider.getcon();
            Statement st=con.createStatement();
            st.executeUpdate("insert into AddNewStudent values('"+StudentId+"','"+RegiNo+"','"+Name+"',"
                    + "'"+FatherName+"','"+MotherName+"','"+Birthdate+"','"+Hall+"','"+Faculty+"',"
                            + "'"+Semister+"','"+Seasson+"','"+Gender+"','"+Nationality+"','"+Religious+"',"
                                    + "'"+PAdderess+"','"+Email+"','"+PNumber+"')");
            JOptionPane.showMessageDialog(null, "Successfully Update");
            setVisible(false); 
            new Add_Student().setVisible(true);
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void jCTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField9ActionPerformed
        
    }//GEN-LAST:event_jCTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Add_Student().setVisible(true);
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
    private app.bolivia.swing.JCTextField jCTextField2;
    private app.bolivia.swing.JCTextField jCTextField3;
    private app.bolivia.swing.JCTextField jCTextField4;
    private app.bolivia.swing.JCTextField jCTextField5;
    private app.bolivia.swing.JCTextField jCTextField6;
    private app.bolivia.swing.JCTextField jCTextField7;
    private app.bolivia.swing.JCTextField jCTextField8;
    private app.bolivia.swing.JCTextField jCTextField9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangleBeanInfo rSMaterialButtonRectangleBeanInfo1;
    // End of variables declaration//GEN-END:variables
}
