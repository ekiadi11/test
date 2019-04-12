/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.asosiasi;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class mainMhsDosen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dsn = new Dosen();
        Mahasiswa mhs1 = new Mahasiswa("EkiAdiSaputra", "152017133");
        Mahasiswa mhs2 = new Mahasiswa("Aldyana", "152017105");
        
        String[] nrpMhs = new String[2];
        nrpMhs[0] = mhs1.getNRP();
        nrpMhs[1] = mhs2.getNRP();
        
        dsn.setIdDosen("dsn001");
        dsn.setNrpMhs(nrpMhs);
        dsn.setJmlMhs(2);
        
      //  System.out.println(dsn.toString());
        System.out.println("ID_Dosen :" +dsn.getIdDosen());
        System.out.println("Jumlah_Mahasiswa :" +dsn.getJmlMhs());
        System.out.println("Nrp_Mahasiswa" +Arrays.toString(dsn.getNrpMhs()));
        
    }
    
}
