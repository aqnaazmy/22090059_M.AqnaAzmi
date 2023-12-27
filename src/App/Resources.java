/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author LENOVO
 */
public class Resources {
    
    
//    " ","Kode_Barang","nama_barang","stok_barang", "harga_barang"
    
    
    

    int kode_Barang;
    String nama_barang;
    String stok_barang;
    String harga_barang;
    
    
    public Resources() {
    }
    
    public Resources(int kode_Barang, String nama_barang, String stok_barang, String harga_barang) {
        this.kode_Barang = kode_Barang;
        this.nama_barang = nama_barang;
        this.stok_barang = stok_barang;
    }

   
    public int getKode_Barang() {
        return kode_Barang;
    }

    public void setKode_Barang(int kode_Barang) {
        this.kode_Barang = kode_Barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getStok_barang() {
        return stok_barang;
    }

    public void setStok_barang(String stok_barang) {
        this.stok_barang = stok_barang;
    }

    public String getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(String harga_barang) {
        this.harga_barang = harga_barang;
    }
    
}
