/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objek;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import koneksi.koneksii;
import javax.swing.table.DefaultTableModel;

public class Penyewa {
      
    private String  KodePenyewa;
    private String email;
    private String alamat;
    private String NoTelp;
    

   
    
    public String getKodePenyewa() {
        return KodePenyewa;
    }

    public void setKodePenyewa(String KodePenyewa) {
        this.KodePenyewa = KodePenyewa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return NoTelp;
    }

    public void setNoTelp(String NoTelp) {
        this.NoTelp = NoTelp;
    }
    public void sewa(){
         try {
            String sql = "INSERT INTO sewa VALUES('" + getKodePenyewa() + "','" + getEmail() + "','" + getAlamat() + "','" + getNoTelp() + "')";
            java.sql.Connection cn = (Connection) koneksii.configDB();
            java.sql.PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Simpan data sukses");
         
        } catch (HeadlessException | SQLException e) {
 

        }
    
        }
  
    }

