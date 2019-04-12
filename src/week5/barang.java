/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author ACER
 */
public class barang {
    private String kodeBarang;

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    private String nama;

    public barang() {
    }

    public barang(String kodeBarang, String nama, int harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.harga = harga;
    }
    private int harga;
}
