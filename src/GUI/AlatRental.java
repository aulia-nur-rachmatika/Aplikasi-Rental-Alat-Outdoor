package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AULIA NUR RACHMATIKA
 */
public class AlatRental extends javax.swing.JFrame {
    static AlatRental ar;

    /**
     * Creates new form RENTAL
     */
    public AlatRental() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        deks = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btn_masak = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_nav = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_prib = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tenda = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        deks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Screenshot (162).png"))); // NOI18N
        deks.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 201, -1));

        btn_masak.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btn_masak.setText("ALAT MASAK");
        btn_masak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_masakMouseClicked(evt);
            }
        });
        deks.add(btn_masak, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 130, 52));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Screenshot (164).png"))); // NOI18N
        deks.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, 200));

        btn_nav.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btn_nav.setText("ALAT NAVIGASI");
        btn_nav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_navMouseClicked(evt);
            }
        });
        deks.add(btn_nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 150, 37));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("RC RENTAL CAMP");
        deks.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 366, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Screenshot (163).png"))); // NOI18N
        deks.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, 160));

        btn_prib.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btn_prib.setText("ALAT PRIBADI");
        btn_prib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pribMouseClicked(evt);
            }
        });
        deks.add(btn_prib, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, 38));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/tenda.jpg"))); // NOI18N
        deks.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, 170));

        jLabel6.setText("jLabel6");
        deks.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tenda.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 36)); // NOI18N
        tenda.setText("TENDA");
        tenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tendaMouseClicked(evt);
            }
        });
        deks.add(tenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        deks.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/tas.jpg"))); // NOI18N
        deks.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 230, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("CARRIER");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        deks.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, 110, 60));

        getContentPane().add(deks, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 1140, 640));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 770, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_masakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masakMouseClicked
        // TODO add your handling code here:
        masak mk = new masak();
        mk.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_btn_masakMouseClicked

    private void btn_navMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_navMouseClicked
        // TODO add your handling code here:
        navigasi ng = new navigasi();
        ng.setVisible(rootPaneCheckingEnabled); 
      
        

    }//GEN-LAST:event_btn_navMouseClicked

    private void btn_pribMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pribMouseClicked
        // TODO add your handling code here:
        alat_prib ap = new alat_prib();
        ap.setVisible(true);
    }//GEN-LAST:event_btn_pribMouseClicked

    private void tendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tendaMouseClicked
        // TODO add your handling code here:
        tenda td= new tenda();
        td.setVisible(true);
        
    }//GEN-LAST:event_tendaMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        HOME hm = new HOME();
        hm.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Tascariel tc = new Tascariel();
        tc.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(AlatRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlatRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlatRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlatRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlatRental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel btn_masak;
    private javax.swing.JLabel btn_nav;
    private javax.swing.JLabel btn_prib;
    public static javax.swing.JDesktopPane deks;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel tenda;
    // End of variables declaration//GEN-END:variables
}
