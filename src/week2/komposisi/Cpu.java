/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.komposisi;

/**
 *
 * @author ACER
 */
public class Cpu {
    private String Nama;

    public Cpu() {
    }

    public Cpu(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    @Override
    public String toString() {
        return "Cpu{" + "Nama=" + Nama + '}';
    }
    
}
