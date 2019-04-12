/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.branching;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MainSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input Warna Lampu : ");
        lampu = scan.nextLine();
        
        switch(lampu){
            case "Merah":
                System.out.println("Lampu merah, berhenti !!");
                break;
            case "Kuning":
                System.out.println("Lampu Kuning, Harap berhati-hati");
                break;
            default:
                System.out.println("Input Salah"); 
        }
        // TODO code application logic here
    }
    
}
