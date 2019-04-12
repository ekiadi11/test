/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class mainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
      System.out.println("Masukan Nama : ");
      String nama = input.next();
      System.out.println("Masukan Alamat : ");
      String alamat = input.next();
      System.out.println("Masukan Umur : ");
      int umur = input.nextInt();
      System.out.println("Masukan Nrp : ");
      int nrp = input.nextInt();
      Mahasiswa mhs = new Mahasiswa();
      mhs.setNama(nama);
      mhs.setAlamat(alamat);
      mhs.setUmur(umur);
      mhs.setNrp(nrp);
      System.out.println(mhs.toString());
     
              
    }
    
}
