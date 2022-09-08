
package wheel;
import static wheel.Wheel.countno;
import static wheel.Wheel.recs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class delete extends javax.swing.JFrame {
   
    public delete() {
        initComponents();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iddelete = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Delete RECORD");

        jLabel2.setText("Enter DOB(yyyymmdd):");

        iddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsearchActionPerformed(evt);
            }
        });

        jButton1.setText("delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel9)
                    .addContainerGap(125, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGap(46, 46, 46)
                    .addComponent(jButton1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iddelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(iddelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        String cust_name,vehicle_name,dest,amount,no_days,id;
        String[] nodes=new String[100];
        int flag=-1,n;
        btree b = new btree();
        int key=1,no,rkey;
        try{
        no=countno();
        n=no;
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
            //recs[i].no_days=st[5];
            rkey=Integer.valueOf(recs[i].dob);
            b.insert(rkey);
            }
        f3.close();

            key=Integer.valueOf(iddelete.getText());
            b.search(key);
            f3=new BufferedReader(new FileReader("D:\\fsmini\\det.txt"));
            for(int i=0;i<=no;i++)
            {
            String lineRead=f3.readLine();
            String [] t=lineRead.split("\\|");
            recs[i].dob=t[0];
            recs[i].persona=t[1];
            recs[i].today=t[2];
            recs[i].lky_stn=t[3];
            recs[i].lky_no=t[4];
            //recs[i].no_days=t[5];
            rkey=Integer.valueOf(recs[i].dob);

if(key==rkey)
{
   
    jLabel4.setText("RECORD DELETED!");
    flag=i;
    break;
    
}
else
    jLabel4.setText("DETAILS NOT FOUND!");
}
            
f3.close();
} catch (IOException ex) {
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(flag>=0)
        {
            BufferedReader f3 = new BufferedReader(new FileReader("D:\\fsmini\\det.txt"));
            String r[]=new String[100];
            n=countno();
            for(int i=0;i<=n;i++)
            {
                r[i]=f3.readLine();
            }
            f3.close();
            BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\fsmini\\det.txt"));
            for(int i=0;i<=n;i++)
            {
                if(flag!=i)
                {
                    bw.write(r[i]);
                    bw.flush();
                    bw.newLine();
                }
            }
            bw.close();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //new home().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iddeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iddeleteActionPerformed

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
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        records recs[] = new records[100];
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new delete().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField iddelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
