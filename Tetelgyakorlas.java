package tetelgyakorlas;
import java.util.Scanner; // Az elemszám bekérése

public class Tetelgyakorlas {

   
    public static void main(String[] args) {
        Scanner bemenet=new Scanner(System.in);
       
        System.out.print("Hány elemet tartalmazzon a tömb? ");
        int elemSzam = bemenet.nextInt();
       
        while (!(10<=elemSzam && elemSzam<=20)) {            
            System.out.print("Hány elemet tartalmazzon a tömb?(Kérem,10 és 20 között adjon meg egy értéket! ");
            elemSzam = bemenet.nextInt();
        }
        // A 2 tömb létrehozása és ezek elemeinek az értékadása
        
        int tomb1[] = new int[elemSzam];
        int tomb2[] = new int[elemSzam];
       
        for (int i = 0; i <elemSzam ; i++) {
            tomb1[i] = (int)(Math.random()*200)-100;
            tomb2[i] =( int)(Math.random()*200)-100;
        }
        // A tömb elemeinek kiírása
        
        for (int i = 0; i <elemSzam ; i++) {
            System.out.print(String.format("%,3d",(i + 1)) + ".");
            System.out.print(String.format("%,3d",tomb1[i]) + ",");
            System.out.print(String.format("%,3d",tomb2[i]) + "\n");
            }
        
        int tomb1Darab = tomb1.length;
        
        // Az első tömb elemeinek a kiírasa
        
        System.out.println("\n\tElső tömb tartalma:\n");
        for (int i = 0; i <tomb1Darab ; i++) {
            
            System.out.print(tomb1[i]+" ");
        }
        
        // A második tömb összegének, átlagának megszámlálása és kiírása
        
        int tomb2Osszeg = 0;
        for (int i = 0; i < tomb2.length; i++) {
            tomb2Osszeg += tomb2[i];
        }
        System.out.println("\nA második tömb összege: "+tomb2Osszeg);
        System.out.println("A második tömb átlaga: "+(double)+tomb2Osszeg/tomb2.length);
    }
    
}
