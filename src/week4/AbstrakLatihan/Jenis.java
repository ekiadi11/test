/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.AbstrakLatihan;

/**
 *
 * @author ACER
 */
public class Jenis extends hewan {

    @Override
    void Duck() {
        String nama1 = "name : Angsa, ";
        String breed1 = "breed : Cirebon, ";
        String Umur1 = "Umur : 1}";
        String Suara1 = "wek.. wek... wek...";
        System.out.print("Duck {");
        System.out.print(""+nama1);
        System.out.print(""+breed1);
        System.out.println(""+Umur1);
        System.out.print(""+Suara1);
                   
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Cat() {
        String nama2 = "name : Si manis, ";
        String breed2 = "breed : Anggora, ";
        String Umur2 = "Umur : 5}";
        String Suara2 = "meong.. meong... meong...";
        System.out.println("");
        System.out.print("Cat {");
        System.out.print(""+nama2);
        System.out.print(""+breed2);
        System.out.println(""+Umur2);
        System.out.print(""+Suara2);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Dog() {
        String nama3 = "name : Si hitam, ";
        String breed3 = "breed : Ciwawa, ";
        String Umur3 = "Umur : 30}";
        String Suara3 = "gok.. gok... gok...";
        System.out.println("");
        System.out.print("Dog {");
        System.out.print(""+nama3);
        System.out.print(""+breed3);
        System.out.println(""+Umur3);
        System.out.println(""+Suara3);
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
