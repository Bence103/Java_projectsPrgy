
package nagyobb;
import java.util.Scanner;

public class NAGYOBB {

    public static void nagyobb (int szam1, int szam2) {
       
        
        if (szam1>szam2) {
            System.out.println("Az első szám nagyobb ami:"+szam1);
        }
        else if  (szam1< szam2){
            System.out.println("A második szám nagyobb ami:"+szam2);
       }
        else 
            System.out.println("Mind kettő szám ugyan annyi"+szam1+"="+szam2);
    }
    public static void main(String[] args) {
        Scanner bemenet=new Scanner(System.in);
        int valasz;
        
        do { 
            System.out.print("Adj meg 2 számot:");
            nagyobb(bemenet.nextInt(), bemenet.nextInt());
            
            System.out.print("\nSzeretné újra futtatni?(1/0)");
            valasz=bemenet.nextInt();
        } while (valasz == 1);
    }
    
}
