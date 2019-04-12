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
public class MainMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jazz jaz = new Jazz("Tompi");
        Rock rck = new Rock("Slank");
        Pop pop = new Pop("Noah");
        Musik msk = new Musik("" , jaz, rck, pop);
        
        System.out.println(msk);
    }
    
}
