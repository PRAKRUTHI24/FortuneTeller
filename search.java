
package wheel;
import static wheel.Wheel.countno;
import static wheel.Wheel.recs;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class search extends javax.swing.JFrame {
    
    public search() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idsearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Fortune");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 270, 70));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Enter DOB(yyyymmdd)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 200, 40));

        idsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsearchActionPerformed(evt);
            }
        });
        getContentPane().add(idsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 140, 40));

        jButton1.setFont(new java.awt.Font("Palatino Linotype", 3, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 343, 90, 30));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton2.setFont(new java.awt.Font("Palatino Linotype", 3, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 80, 30));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 146, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 122, 23));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\fsmini\\search2.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String persona,today,lky_stn,lky_no,dob;
        String[] nodes=new String[100];
        btree b = new btree();
        int key=1,no,rkey;
        try{
        no=countno();
        System.out.println("No. of records: "+no+"\n");
        for(int i=0;i<=no;i++)
        recs[i]=new records();
         BufferedReader f3 = new BufferedReader(new FileReader("D:\\fsmini\\det.txt"));
            for(int i=0;i<=no;i++)
            {
            String lineRead=f3.readLine();
            String [] st = lineRead.split("\\|");
            records.dob=st[0];
            records.persona=st[1];
            records.today=st[2];
            records.lky_stn=st[3];
            records.lky_no=st[4];
           
            rkey=Integer.valueOf(records.dob);
            b.insert(rkey);
            }
        f3.close();

            key=Integer.valueOf(idsearch.getText());
            b.search(key);
            f3=new BufferedReader(new FileReader("D:\\fsmini\\det.txt"));
            for(int i=0;i<=no;i++)
            {
            String lineRead=f3.readLine();
            String [] t=lineRead.split("\\|");
            records.dob=t[0];
            records.persona=t[1];
            recs[i].today=t[2];
            recs[i].lky_stn=t[3];
            recs[i].lky_no=t[4];
            //recs[i].no_days=t[5];
            rkey=Integer.valueOf(recs[i].dob);

if(key==rkey)
{
new searchresult(key,recs[i].persona,recs[i].today,recs[i].lky_stn,recs[i].lky_no).setVisible(true);
this.setVisible(false);
}
else
    jLabel4.setText("Order not found!");
}
            
f3.close();
} catch (IOException ex) {
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
        }                         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
            this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsearchActionPerformed
       
    }//GEN-LAST:event_idsearchActionPerformed

    
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
