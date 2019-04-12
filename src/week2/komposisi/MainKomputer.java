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
public class MainKomputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cpu cpu = new Cpu("Intel");
        Keyboard key = new Keyboard("Keyboard1");
        Mouse mouse = new Mouse("Mouse1");
        Komputer cmp = new Komputer("Computer1", mouse, key, cpu);
        
        System.out.println(cmp.toString());
        
    }
    
}
