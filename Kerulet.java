
package kerulet;

import java.util.Scanner;


public class Kerulet {

    private static double teglalapKerulet(int a, int b){
    return 2*(a+b);
    }
    private static double korKerulet(int r){
    return 2*r*Math.PI;
    }
    private static double haromszogKerulet(int a, int b, int c){
    return a+b+c;
    }
    private static double otszogKerulet (int a){
    return 5*a;
    }
    private static double hatszogKerulet(int a){
    return 6*a;
    }
    public static void main(String[] args) {
        Scanner bemenet= new Scanner(System.in);
        int valasz;
        
        do {            
            System.out.print("\n1-téglalap"+ "\n2-kör"+ "\n3-háromszög"+ "\n4-szabályos ötszög"+"\n5-szabályos hatszög"+"\nMelyik alakzat kerületét szeretné kiszámolni?");
        valasz= bemenet.nextInt();
            while (valasz<1 || valasz>5) {                
                System.out.print("\nKérem 1 és 5 közötti számot adjon meg!");
                valasz= bemenet.nextInt();
            }
        switch (valasz){
            case 1:
                System.out.println("Az eredmény:"+teglalapKerulet(20, 30)); 
               break;
            case 2:
                System.out.println("Az eredmény:"+korKerulet(25)); 
               break;
            case 3:
                System.out.println("Az eredmény:"+haromszogKerulet(10, 7, 8)); 
               break;
            case 4:
                System.out.println("Az eredmény:"+otszogKerulet(30)); 
               break;
               case 5:
                System.out.println("Az eredmény:"+hatszogKerulet(25)); 
               break;
               }
        System.out.print("Szeretne újabb alakzattal számolni(0/1)?");
        valasz= bemenet.nextInt();
        while (valasz!=0 && valasz!=1) {            
            System.out.print("\n0 és 1 közötti értéket adjon meg!");
            valasz= bemenet.nextInt();
        }
        } while (valasz==1);
    }
    
}
