/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author ACER
 */
public class Kendaraan implements Komponen {

    @Override
    public void main() {
        System.out.println("Kendaraan Roda 2 : "+MerkR2);
        System.out.println("Harga Roda 2 / Perhari :"+HargaR2);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int getHargaR2() {
        return HargaR2;
    }

    public static String getMerkR2() {
        return MerkR2;
    }

    public static int getHargaR4() {
        return HargaR4;
    }

    public static String getMerkR4() {
        return MerkR4;
    }

    @Override
    public void design() {
        System.out.println("Kendaraan Roda 4 : "+MerkR4);
        System.out.println("Harga Roda 4 / Perhari :"+HargaR4);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
}
