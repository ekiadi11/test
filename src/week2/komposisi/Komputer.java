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
public class Komputer {
   private String Nama;
   private Mouse Mouse;
   private Keyboard Keyboard;
   private Cpu cpu;

    public Komputer(String Nama, Mouse Mouse, Keyboard Keyboard, Cpu cpu) {
        this.Nama = Nama;
        this.Mouse = Mouse;
        this.Keyboard = Keyboard;
        this.cpu = cpu;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Mouse getMouse() {
        return Mouse;
    }

    public void setMouse(Mouse Mouse) {
        this.Mouse = Mouse;
    }

    public Keyboard getKeyboard() {
        return Keyboard;
    }

    public void setKeyboard(Keyboard Keyboard) {
        this.Keyboard = Keyboard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Komputer{" + "Nama=" + Nama + ", Mouse=" + Mouse + ", Keyboard=" + Keyboard + ", cpu=" + cpu + '}';
    }
   
   
}
