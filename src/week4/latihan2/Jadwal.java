/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.latihan2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Jadwal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String hari;
        
        System.out.println("Masukan Hari : ");
        hari = scan.nextLine();
        
        switch(hari){
            case "Senin":
                System.out.println("Jadwal Kuliah : ");
                System.out.println("1. Matematika");
                System.out.println("2. Bahasa Inggris");
                break;
            case "Selasa":
                System.out.println("Jadwal Kuliah: ");
                System.out.println("1. Object OriSented Programing");
                System.out.println("2. Pemograman Basis Data: ");
                break;
            case "Rabu":
                System.out.println("Jadwal Kuliah: ");
                System.out.println("1. Rekayasa Perangkat Lunak");
                System.out.println("2. Pengolahan Citra Digital");
                break;
            case "Kamis":
                System.out.println("Jadwal Kuliah: ");
                System.out.println("1. Bahasa Inggris");
                break;
            case "Jumat":
                System.out.println("Jadwal Kuliah: ");
                System.out.println("1. Bahasa Indonesia");
                System.out.println("2. Praktikum OOP");
                break;
            case "Sabtu":
                System.out.println("Jadwal Kuliah: ");
                System.out.println("1. Praktikum PCD");
                System.out.println("2. Praktikum PBD");
                break;
            default:
                System.out.println("Input Salah");
        }
    }
    
}
