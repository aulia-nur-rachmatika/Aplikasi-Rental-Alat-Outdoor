/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objek;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksii;

/**
 *
 * @author AULIA NUR RACHMATIKA
 */
public class Alatmasak extends Alat {
private String NamaBarang;
    private int jumlah;
    private int harga;
    private int totalbayar;
    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.NamaBarang = NamaBarang;
    }

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

    @Override
    public void tampilData() {
    }
    
    

}

