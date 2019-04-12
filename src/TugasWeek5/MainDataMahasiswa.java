/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasWeek5;

import TugasWeek5.Mahasiswa;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class MainDataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mh = new Mahasiswa("152017136","Johannes Rainier T","081234560987","Bandung");
        mh.isiArray("001", "OOP", "10");
        mh.isiArray("002", "PBD", "6");
        
        System.out.println("NRP  : "+mh.getNrp());
        System.out.println("Nama : "+mh.getNama());
        System.out.println("No HP: "+mh.getNotlp());
        System.out.println("alamat : "+mh.getAlamat());
        mh.lihatArray();
       
        
    }
    
}
