/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.tugas_interface;

/**
 *
 * @author ACER
 */
public class MainInterfaceBinatang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck duck = new Duck();
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.println(duck);
        duck.suara();
        System.out.println(cat);
        cat.suara();
        System.out.println(dog);
        dog.suara();
    }
    
}
