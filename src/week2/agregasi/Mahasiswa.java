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
public class Mahasiswa {

    private String Nama;

    public Mahasiswa() {
    }
  private String NRP;

    public Mahasiswa(String Nama, String NRP) {
        this.Nama = Nama;
        this.NRP = NRP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "Nama=" + Nama + ", NRP=" + NRP + '}';
    }
        
}


