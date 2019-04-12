/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MainKendaraan extends Kendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String Jenis;
        String Merk;
        int s = 0;
        int j = 0;
        int k = 0;
        
        System.out.println("Masukan Jenis Kendaraan Beroda [2/4] : ");
        Jenis = scan.nextLine();
        
        switch(Jenis){
          case "2":
                System.out.println("Merk Kendaraan Roda 2 : "+MerkR2);
                System.out.println("Harga Sewa Per Hari : "+HargaR2);
                break;
            case "4":
                System.out.println("Merk Kendaraan Roda 4 : "+MerkR4);
                System.out.println("Harga Sewa Per hari : "+HargaR4);
                break;
            default:
                System.out.println("Input Salah"); 
         
    }
        System.out.println("Masukan Kendaraan yang akan di sewa : ");
        Merk = scan.nextLine();
        System.out.println("Berapa Hari Sewa ? ");
        s = scan.nextInt();
        switch(Merk){
            case "Honda Vario":
                System.out.println("Total : "+(s*HargaR2));
                System.out.println("Masukan jumlah uang : ");
                j = scan.nextInt();
                System.out.println("Kembalian : "+((s*HargaR2)-j));
            
            case "Honda Beat":
                System.out.println("Total : "+(s*HargaR2));
                System.out.println("Masukan jumlah uang : ");
                j = scan.nextInt();
                System.out.println("Kembalian : "+((s*HargaR2)-j));
            
            case "Aerox":
                System.out.println("Total : "+(s*HargaR2));
                System.out.println("Masukan jumlah uang : ");
                j = scan.nextInt();
                System.out.println("Kembalian : "+((s*HargaR2)-j));
        }
        


    }
}