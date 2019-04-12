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
public class Ipk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Double ips, ip1, ip2, ip3, ip4, ip5, ip6, ip7, ip8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ip 1 = ");
        ip1 = sc.nextDouble();
        System.out.println("Ip 2 = ");
        ip2 = sc.nextDouble();
        System.out.println("Ip 3 = ");
        ip3 = sc.nextDouble();
        System.out.println("Ip 4 = ");
        ip4 = sc.nextDouble();
        System.out.println("Ip 5 = ");
        ip5 = sc.nextDouble();
        System.out.println("Ip 6 = ");
        ip6 = sc.nextDouble();
        System.out.println("Ip 7 = ");
        ip7 = sc.nextDouble();
        System.out.println("Ip 8 = ");
        ip8 = sc.nextDouble();
        
        ips = (ip1+ip2+ip3+ip4+ip5+ip6+ip7+ip8)/8;
        System.out.println("IPK = "+ips);
        if (ips>=3.80){
            System.out.println("Summa Cum Laude");
        }else {
        if ((ips>=3.60)&&(ips<=3.79)){
            System.out.println("Magna Cum Laude");
        }else{
             if ((ips>=3.40)&&(ips<=3.59)){
                    System.out.println("Cum Laude");
                }else{
                   if ((ips>=3.20)&&(ips<=3.39)){
                       System.out.println("High Merit");
                   }else{
                       if((ips>=3.00)&&(ips<=3.19)){
                           System.out.println("Merit");
                       }else{
                           System.out.println("Cukup");
                       }
                   }
                }
            }
        }
                
        
    }
    
    }

