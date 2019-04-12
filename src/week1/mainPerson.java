/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author ACER
 */
public class mainPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Person pr = new Person("Eki", "Cilame", "0000", 18);
     
     System.out.println(pr.toString());
     
     Person pr2 = new Person();
     
     pr2.setName("Aldi");
     pr2.setAge(19);
     pr2.setAddress("Awi ligar");
     pr2.setNhp("0000");
     System.out.println(pr2.toString());
     
    }
    
}
