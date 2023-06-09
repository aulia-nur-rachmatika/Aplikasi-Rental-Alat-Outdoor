package GUI;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksii;
import objek.Alatmasak;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AULIA NUR RACHMATIKA
 */
public class masak extends javax.swing.JFrame  {
    
    Alatmasak am = new Alatmasak();
    
    
    
    int jumlah, harga,totalbayar;
    String NamaBarang;

private void tampilData() {
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("NO");
        model.addColumn("Nama Alat");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Total Bayar");

        try {
            int no = 1;
            String sql = "SELECT *FROM barang";
            java.sql.Connection cn = (Connection) koneksii.configDB();
            java.sql.Statement stm = cn.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                model.addRow(new Object[]{no++, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
            tbl.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
}
 private void clear(){

        txt_barang.setSelectedItem(null);
        txt_harga.setText(null);
        txt_jumlah.setText(null);
        txt_total.setText(null);
        
    }
    /**
     * Creates new form masak
     */
    public masak() {
        initComponents();
        tampilData();
        clear();
        sum();
     
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btn_cekout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_barang = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btn_hapus = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ALAT MASAK YANG TERSEDIA ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, 160, -1));

        btn_cekout.setText("CHECKOUT");
        btn_cekout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cekoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cekout, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        jLabel2.setText("Jumlah");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 163, -1, -1));

        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 291, -1, -1));

        jLabel3.setText("Total bayar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 224, -1, -1));

        txt_barang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "NESTING BULAT 2 SUSUN", "NESTING BULAT 3 SUSUN", "NESTING KOTAK 4 SUSUN", "KOMPOR PORTABLE", "KOMPOR PARAFIN", "PISAU DAN SENDOK LIPAT", " ", " " }));
        txt_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_barangActionPerformed(evt);
            }
        });
        getContentPane().add(txt_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 62, -1, -1));

        jLabel4.setText("NAMA BARANG");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 62, 86, 20));

        jLabel5.setText("HARGA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 112, 128, -1));

        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 109, 122, -1));

        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 221, 122, -1));

        txt_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahActionPerformed(evt);
            }
        });
        txt_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jumlahKeyReleased(evt);
            }
        });
        getContentPane().add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 160, 109, -1));

        jButton1.setText("TAMBAH ALAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 291, -1, -1));

        btn_simpan.setText("SAVE");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Alat", "Harga", "Jumlah", "Total Bayar"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, 124));

        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 291, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 110, 30));

        jTextField2.setText("TOTAL BAYAR");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 90, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bg2.jpeg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cekoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cekoutActionPerformed
        // TODO add your handling code here:
 Input sw = new Input ();
 sw.setVisible(true);
    }//GEN-LAST:event_btn_cekoutActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        AlatRental ar = new AlatRental();
        ar.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_barangActionPerformed
        // TODO add your handling code here:
        //membuat add your handling 
      
   
       
    
         NamaBarang = (String) txt_barang.getSelectedItem();
          
        if(NamaBarang=="NESTING BULAT 3 SUSUN"){
            harga=10000;
        }else if(NamaBarang=="KOMPOR PORTABLE"){
            harga=10000;
        }else if(NamaBarang=="PISAU DAN SENDOK LIPAT"){
            harga=10000;
         }else if(NamaBarang=="NESTING BULAT 2 SUSUN"){
            harga=7000;
          }else if(NamaBarang=="NESTING KOTAK 3 SUSUN"){
            harga=8000;
             }else if(NamaBarang=="NESTING KOTAK 4 SUSUN"){
            harga=9000;
         }else if(NamaBarang=="KOMPOR PARAFIN"){
            harga=5000;
         }
          txt_harga.setText(String.valueOf(harga));
          
        
   
        
    }//GEN-LAST:event_txt_barangActionPerformed
    
    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    
        
    }//GEN-LAST:event_formWindowActivated

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:

       
        
    }//GEN-LAST:event_txt_totalActionPerformed

    private void txt_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahActionPerformed

    private void txt_jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahKeyReleased
        // TODO add your handling code here:
        int a,b,c;
        a=Integer.valueOf(txt_harga.getText());
        b=Integer.valueOf(txt_jumlah.getText());
        c=a*b;
        txt_total.setText(String.valueOf(c));
    }//GEN-LAST:event_txt_jumlahKeyReleased
     public void sum() {
        int total = 0;
        for (int i = 0; i < tbl.getRowCount(); i++) {
            int amount = Integer.parseInt((String) tbl.getValueAt(i, 4));
            total += amount;

        }
        jTextField1.setText("" + total);

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
        AlatRental ar = new AlatRental();
      
        ar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
   DefaultTableModel model = new DefaultTableModel();
    
        model.addColumn("NO");
        model.addColumn("NAMA ALAT");
        model.addColumn("HARGA");
        model.addColumn("JUMLAH");
        model.addColumn("TOTAL");
    
//          
        
        try{
            int no=1;
            String sql="SELECT *FROM barang";
            java.sql.Connection cn = (Connection)koneksii.configDB();
            java.sql.Statement stm = cn.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()){
                model.addRow(new Object []{no++ ,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
        }
            tbl.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error"+e.getMessage());
        }
        
    
        try{
            String sql= "INSERT INTO barang VALUES('"+txt_barang.getSelectedItem()+"','"+txt_harga.getText()+"','"+txt_jumlah.getText()+"','"+txt_total.getText()+"')";
            java.sql.Connection cn=(Connection)koneksii.configDB();
            java.sql.PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Simpan data sukses");
        
        }catch (HeadlessException | SQLException e ){
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        
        
tampilData();
        clear();
        sum();
      
       
       
       
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        int baris = tbl.rowAtPoint(evt.getPoint());
        String nama = tbl.getValueAt( baris,1).toString();
        txt_barang.setSelectedItem(nama);
        String harga = tbl.getValueAt(baris, 2).toString();
        txt_harga.setText(harga);
        String jumlah = tbl.getValueAt(baris, 3).toString();
        txt_jumlah.setText(jumlah);
        String total = tbl.getValueAt(baris, 4).toString();
        txt_total.setText(total);
    }//GEN-LAST:event_tblMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql= "DELETE FROM barang WHERE Nama_Alat='"+txt_barang.getSelectedItem()+"'";
            java.sql.Connection cn=(Connection)koneksii.configDB();
            java.sql.PreparedStatement ps=cn.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Hapus data sukses");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
      
        tampilData();
        clear();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(masak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(masak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(masak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(masak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new masak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cekout;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl;
    private javax.swing.JComboBox<String> txt_barang;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jumlah;
    public javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
