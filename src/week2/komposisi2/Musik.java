/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.komposisi2;

/**
 *
 * @author ACER
 */
public class Musik {
    private String Jenis;
    private Jazz Jazz;
    private Rock Rock;
    private Pop pop;

    public Musik(String Jenis, Jazz Jazz, Rock Rock, Pop pop) {
        this.Jenis = Jenis;
        this.Jazz = Jazz;
        this.Rock = Rock;
        this.pop = pop;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public Jazz getJazz() {
        return Jazz;
    }

    public void setJazz(Jazz Jazz) {
        this.Jazz = Jazz;
    }

    public Rock getRock() {
        return Rock;
    }

    public void setRock(Rock Rock) {
        this.Rock = Rock;
    }

    public Pop getPop() {
        return pop;
    }

    public void setPop(Pop pop) {
        this.pop = pop;
    }

   
    
}
