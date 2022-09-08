
package wheel;
import static wheel.Wheel.countno;
import static wheel.Wheel.recs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class insert extends javax.swing.JFrame {

    
    public insert() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        custxt = new javax.swing.JTextField();
        vehtxt = new javax.swing.JTextField();
        destxt = new javax.swing.JTextField();
        rentxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("DOB(yyyymmdd)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("PERSONA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 90, 20));

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("TODAYS FORTUNE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("LUCKY STONE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("LUCKY NO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 90, 30));
        getContentPane().add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 130, 30));
        getContentPane().add(custxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 130, 40));
        getContentPane().add(vehtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 130, 30));
        getContentPane().add(destxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 372, 130, 30));
        getContentPane().add(rentxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 422, 130, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 150, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jButton2.setText("GO BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 130, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 130, 30));

        jTextField1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("INSERT RECORD DETAILS");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 280, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 320));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\fsmini\\insert.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, -70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dob,persona,today,lky_stn,lky_no;
String[] nodes=new String[100];
btree b = new btree();
int key=1,no=0,rkey;
        try {
            no=countno();
        
System.out.println("No. of records: "+no+"\n");
for(int i=0;i<=no;i++)
recs[i]=new records();
BufferedReader f3 = new BufferedReader(new FileReader("D:\\fsmini\\det.txt"));
for(int i=0;i<=no;i++)
{
String lineRead=f3.readLine();
String [] st = lineRead.split("\\|");
recs[i].dob=st[0];
recs[i].persona=st[1];
recs[i].today=st[2];
recs[i].lky_stn=st[3];
recs[i].lky_no=st[4];
rkey=Integer.valueOf(recs[i].dob);
b.insert(rkey);
}
f3.close();
} catch (IOException ex) {
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileWriter fwr=new FileWriter("D:\\fsmini\\det.txt",true);
    key=Integer.valueOf(idtxt.getText());
    b.insert(key);
        persona = custxt.getText();
        today = vehtxt.getText();
        lky_stn = destxt.getText();
        lky_no = rentxt.getText();
            fwr.write(""+key);
            fwr.write("|");
            fwr.write(persona);
            fwr.write("|");
            fwr.write(today);
            fwr.write("|");
            fwr.write(lky_stn);
            fwr.write("|");
            fwr.write(lky_no);
            BufferedWriter bw = new BufferedWriter(fwr);
            bw.newLine();
            bw.close();
            fwr.close();
            JOptionPane.showMessageDialog(rootPane, "Success");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
             } 
        no++;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //new home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         custxt.setText("");
         vehtxt.setText("");
         destxt.setText("");
         rentxt.setText("");
         idtxt.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField custxt;
    private javax.swing.JTextField destxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField rentxt;
    private javax.swing.JTextField vehtxt;
    // End of variables declaration//GEN-END:variables
}
