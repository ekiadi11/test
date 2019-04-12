/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ACER
 */
public class Matkul {
    private String kodeMatkul;
    private String namaMatkul;
    private String jam;

    public Matkul(String kodeMatkul, String namaMatkul, String jam) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "Matkul{" + "kodeMatkul=" + kodeMatkul + ", namaMatkul=" + namaMatkul + ", jam=" + jam + '}';
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public Matkul() {
    }

}
