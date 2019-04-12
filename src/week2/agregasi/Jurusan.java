/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.agregasi;

/**
 *
 * @author ACER
 */
public class Jurusan {
 
    private String idJurusan;
    private String namaJurusan;
    private Mahasiswa mhs;

    public Jurusan() {
    }

    public Jurusan(String idJurusan, String namaJurusan, Mahasiswa mhs) {
        this.idJurusan = idJurusan;
        this.namaJurusan = namaJurusan;
        this.mhs = mhs;
    }
    
    public String getIdJurusan() {
        return idJurusan;
    }

    public void setIdJurusan(String idJurusan) {
        this.idJurusan = idJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }

    @Override
    public String toString() {
        return "Jurusan{" + "idJurusan=" + idJurusan + ", namaJurusan=" + namaJurusan + ", mhs=" + mhs + '}';
    }
    
}
