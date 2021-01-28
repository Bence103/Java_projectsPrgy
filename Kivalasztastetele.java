/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalasztastetele;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Kivalasztastetele {

public static void main(String[] args) {
        System.out.println("\n\tKIVÁLASZTÁS TÉTEL\n");
        
        int elemSzam =(int)(Math.random()*5)+5;
        int szamtomb1[] = new int[elemSzam];
        int szamtomb2[] = new int[elemSzam];
        int szamtomb3[] = new int[elemSzam];

        for(int i=0; i<elemSzam; i++){
            szamtomb1[i] = (int) (Math.random()*200)-100;
            szamtomb2[i] = (int) (Math.random()*200)-100;
            szamtomb3[i] = (int) (Math.random()*200)-100;
            }
        
        System.out.println("\nTömbök elemei: ");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(String.format("%,5d",szamtomb1[i]) + " ");
        }
//        System.out.println("");
//        for (int i = 0; i < elemSzam; i++) {
//        System.out.print(String.format("%,5d",szamtomb2[i]) + " ");
//        }
//        System.out.println("");
//        for (int i = 0; i < elemSzam; i++) {
//        System.out.print(String.format("%,5d",szamtomb3[i]) + " "); 
//        for (int i =1 ; i < elemSzam; i+=2 ) {
//            System.out.print(String.format("%,5d",szamtomb3[i]) + " ");
//    }
//        }
        Scanner bemenet= new Scanner(System.in);
        System.out.print("\nAdj meg egy számot a kiírt elemek közül: ");
        int keresettElem=bemenet.nextInt();
      
           while (keresettElem!=szamtomb1[i]) {               
               System.out.println("A keresett elem nem található meg a tömbe!Kérem adj meg egy új elemet: ");
               bemenet.hasNextInt();
           }
        
        
    
    
 
        //KIVÁLASZTÁS TÉTELE
        int i = 0;
        while (szamtomb1[i]!=keresettElem) {        
               i++;
    }
        System.out.println("A keresett elem indexe: " + (i + 1));
        bemenet.close();
   }
}
    
    

