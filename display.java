
package wheel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class display extends javax.swing.JFrame {

    
    public display() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        display = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1440, 596));

        jButton1.setFont(new java.awt.Font("Palatino Linotype", 3, 10)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 620, -1, -1));

        display.setFont(new java.awt.Font("Palatino Linotype", 3, 10)); // NOI18N
        display.setText("Display Records");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
         String tabledisp = "D:\\fsmini\\det.txt";
        File file = new File(tabledisp);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String[] columnsName = {"DOB(yyyymmdd)","PERSONA","TODAYS FORTUNE","LUCKY STONE","LUCKY NO"};
            DefaultTableModel mod = (DefaultTableModel)jTable1.getModel();
            mod.setColumnIdentifiers(columnsName);
            
            String line = "";
            int i;
        while(line != null) {
        line = br.readLine();
        if(line != null) {
           String[] dataRow = line.split("\\|");
           mod.addRow(dataRow);
            }      
        }
        
}catch (Exception ex) {
            Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_displayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //home h = new home();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton display;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
