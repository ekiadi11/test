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
public class Mouse {
    private String Nama;

    public Mouse() {
    }

    public Mouse(String Nama) {
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
        return "Mouse{" + "Nama=" + Nama + '}';
    }
    
}
