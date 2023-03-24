/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objek;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksii;

public class Alat {

    private String NamaBarang;
    private int jumlah;
    private int harga;
    private int totalbayar;

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotalbayar() {
        return totalbayar;
    }

    public void setTotalbayar(int totalbayar) {
        this.totalbayar = totalbayar;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.NamaBarang = NamaBarang;
    }
    public void tampilData() {
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
           
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
}
}
