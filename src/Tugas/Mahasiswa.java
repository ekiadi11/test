/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.ArrayList;
/**
 *
 * @author ACER
 */
public class Mahasiswa {
    private String nrp;
    private String nama;

    @Override
    public String toString() {
        return "Mahasiswa{" + "nrp=" + nrp + ", nama=" + nama + ", notlp=" + notlp + ", alamat=" + alamat + ", arrMk=" + arrMk + '}';
    }
    private String notlp;
    private String alamat;

    public Mahasiswa(String nrp, String nama, String notlp, String alamat) {
        this.nrp = nrp;
        this.nama = nama;
        this.notlp = notlp;
        this.alamat = alamat;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNotlp() {
        return notlp;
    }

    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public ArrayList<Matkul> getArrMk() {
        return arrMk;
    }

    public void setArrMk(ArrayList<Matkul> arrMk) {
        this.arrMk = arrMk;
    }

    public Mahasiswa() {
    }
    ArrayList<Matkul> arrMk = new ArrayList<>();
    
     public void ArrayMatkul(String kodeMatkul, String namaMatkul, String jam){
        arrMk.add(new Matkul(kodeMatkul,namaMatkul,jam));   
    }
    
    void lihatArrayMatkul(){
        for(Matkul mk:arrMk){
            System.out.println("Mata Kuliah : "+mk.getNamaMatkul());
        }
    }

   
}
