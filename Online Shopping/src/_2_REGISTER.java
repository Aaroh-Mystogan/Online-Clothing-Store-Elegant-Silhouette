/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 8.1
 */
import javax.swing.table.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class _2_REGISTER extends javax.swing.JFrame {

    /**
     * Creates new form _2_REGISTER
     */
    public _2_REGISTER() {
        initComponents();
    }
Statement stmt=null;
ResultSet rs=null;
String SQL;
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        RegisterTF = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        ph = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("First Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 110, 30));

        fn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 440, 60));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 340, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("UserName");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 110, 60));

        un.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 440, 57));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Password");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 100, 61));

        p.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 440, 61));

        RegisterTF.setBackground(new java.awt.Color(255, 0, 0));
        RegisterTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterTF.setText("REGISTER AND LOGIN");
        RegisterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterTFActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 200, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        ln.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 440, 60));

        ph.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ph.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phKeyTyped(evt);
            }
        });
        getContentPane().add(ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 440, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        em.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 440, 60));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 190, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/2.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed

    }//GEN-LAST:event_pActionPerformed

    private void RegisterTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterTFActionPerformed
        try   {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Mystogan", "root", "root");
            String query = "INSERT INTO register (`First_name`, `Last_name`, `Username`, `Email`, `Phone_no`, `Password`) VALUES (?,?,?,?,?,?)";
            String query2 = "INSERT INTO login (`Username`,`Password`) VALUES (?,?)";
            PreparedStatement pst = conn.prepareStatement(query);
            PreparedStatement pst2 = conn.prepareStatement(query2);
            pst.setString(1 ,fn.getText());
            pst.setString(2 ,ln.getText());
            pst.setString(3 ,un.getText());
            pst.setString(4 ,em.getText());
            pst.setString(5 ,ph.getText());
            pst.setString(6 ,p.getText());
            pst.executeUpdate();
            pst2.setString(1 ,un.getText());
            pst2.setString(2 ,p.getText());
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registered Successfully");
            _1_LOGIN m = new _1_LOGIN();
            m.setVisible(true);
            this.setVisible(false);
        }
        catch( Exception e)
        {
            JOptionPane.showMessageDialog(null,"" + e);
        }
    }//GEN-LAST:event_RegisterTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       fn.setText("");
       ln.setText("");
       un.setText("");
       em.setText("");
       ph.setText("");
       p.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void phKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phKeyTyped

    }//GEN-LAST:event_phKeyTyped

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
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(_2_REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_2_REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_2_REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_2_REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _2_REGISTER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterTF;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField p;
    private javax.swing.JTextField ph;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
