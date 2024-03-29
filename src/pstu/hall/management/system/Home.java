
package pstu.hall.management.system;
import java.sql.*;

public class Home extends javax.swing.JFrame {

   
    public Home() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonCircle1 = new necesario.RSMaterialButtonCircle();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCTextField3 = new app.bolivia.swing.JCTextField();
        jCTextField4 = new app.bolivia.swing.JCTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(28, 87, 57));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pstu/hall/management/system/Untitled design (2).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(28, 113, 71));
        rSMaterialButtonRectangle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pstu/hall/management/system/Untitled design (2).png"))); // NOI18N
        rSMaterialButtonRectangle1.setText("Add Student");
        rSMaterialButtonRectangle1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 280, -1));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(28, 113, 71));
        rSMaterialButtonCircle1.setText("LogOut");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 280, 60));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(28, 113, 71));
        rSMaterialButtonRectangle2.setText("SEARCH STUDENTS");
        rSMaterialButtonRectangle2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 280, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pstu/hall/management/system/Untitled design (6).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 90, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pstu/hall/management/system/Untitled design (5).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 60, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 770));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 30)); // NOI18N
        jLabel4.setText("Total Female:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 230, 50));

        jCTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        jCTextField1.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jCTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 90, 50));

        rSMaterialButtonRectangle3.setText("Refress");
        rSMaterialButtonRectangle3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        rSMaterialButtonRectangle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle3ActionPerformed(evt);
            }
        });
        jPanel3.add(rSMaterialButtonRectangle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 130, 50));

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 30)); // NOI18N
        jLabel7.setText("Total Student:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 50));

        jLabel9.setFont(new java.awt.Font("Open Sans", 1, 30)); // NOI18N
        jLabel9.setText("Total Male:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 230, 50));

        jCTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        jCTextField3.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jCTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 90, 50));

        jCTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        jCTextField4.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jCTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 90, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 940, 770));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -10, 950, 780));

        setSize(new java.awt.Dimension(1290, 790));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static Connection getConnection()
    {
        Connection con = null;
        
         try {

            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hall_Management_System","root","");
        } catch (Exception ex) {

             System.out.println(ex.getMessage());

        }
        return con;
    }
    public void execQuery1(String query){
        
       try{
           
           Connection con = getConnection();
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(query);
         
           
           if(rs.next()){
               jCTextField1.setText(Integer.toString(rs.getInt(1)));
           }else
               System.out.println("No Data Found");
           
           
       }catch(SQLException e){
           
       }
    }
    public void execQuery2(String query1){
        
       try{
           
           Connection con = getConnection();
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(query1);
         
           
           if(rs.next()){
               jCTextField3.setText(Integer.toString(rs.getInt(1)));
           }else
               System.out.println("No Data Found");
           
           
       }catch(SQLException e){
           
       }
    }
    public void execQuery3(String query2){
        
       try{
           
           Connection con = getConnection();
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(query2);
         
           
           if(rs.next()){
               jCTextField4.setText(Integer.toString(rs.getInt(1)));
           }else
               System.out.println("No Data Found");
           
           
       }catch(SQLException e){
           
       }
    }
                           
    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
      
        setVisible(false);
        new SearchStudent().setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
      
        setVisible(false);
        new Add_Student().setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
       
        setVisible(false);
        new Login_page().setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void rSMaterialButtonRectangle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle3ActionPerformed
        // TODO add your handling code here:
        String query = "SELECT COUNT(*) FROM `AddNewStudent` WHERE 1";
        execQuery1(query);
        String query1 = "SELECT COUNT(*) AS male_count FROM AddNewStudent WHERE gender = 'male';";
        execQuery2(query1);
        String query2 = "SELECT COUNT(*) AS female_count FROM AddNewStudent WHERE gender = 'female';";
        execQuery3(query2);
    }//GEN-LAST:event_rSMaterialButtonRectangle3ActionPerformed

    private void jCTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField3ActionPerformed
       
    }//GEN-LAST:event_jCTextField3ActionPerformed

    private void jCTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField4ActionPerformed
       
    }//GEN-LAST:event_jCTextField4ActionPerformed

    private void jCTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField1ActionPerformed
       
    }//GEN-LAST:event_jCTextField1ActionPerformed

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField jCTextField1;
    private app.bolivia.swing.JCTextField jCTextField3;
    private app.bolivia.swing.JCTextField jCTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private necesario.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    // End of variables declaration//GEN-END:variables
}
