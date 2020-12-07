package tombmuveletek;
import java.util.Scanner;

public class Tombmuveletek {

    public static void main(String[] args) {
       
        System.out.println("\n\tTombmuveletek\n");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hány elemet tartalmazanak a tömbök:");
        int tombdarab = input.nextInt();
        
        int[] tomb1 = new int [tombdarab];
        int[] tomb2 = new int [tombdarab];
        int tomb1szum=0;
        int tomb2szum=0;

        
        
        for(int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = (int) (Math.random() * 999) + 1;
            tomb1szum += tomb1[i];
            tomb2[i] = (int) (Math.random() * 999) + 1;
             tomb2szum += tomb2[i];
        }
        
        System.out.println("A tömbök elemei:\n");
        for (int i = 0; i < tombdarab; i++) {
            int sorOsszeg=0;
            sorOsszeg=tomb1[i]+tomb2[i];
            System.out.print(i+1+".: ");
            System.out.print(String.format("%,3d",tomb1[i])+"+");
            System.out.print(String.format("%,3d",tomb2[i])+"=");
            System.out.print(String.format("%,5d",sorOsszeg));
            System.out.println("");
        }
        
    } 
}
    
    

