/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import Tugas.Mahasiswa;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mh = new Mahasiswa("152017133","EkiAdiSaputra","089621925538","Padalarang");
        mh.ArrayMatkul("01", "PCD", "3");
        mh.ArrayMatkul("02", "PBD", "2");
        
        System.out.println("NRP  : "+mh.getNrp());
        System.out.println("Nama : "+mh.getNama());
        System.out.println("No HP: "+mh.getNotlp());
        System.out.println("alamat : "+mh.getAlamat());
        mh.lihatArrayMatkul();
    }
    
}
