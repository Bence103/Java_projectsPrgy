
package pkgswitch;
import java.util.Scanner;

public class SWITCH {

   
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        System.out.print("Adj meg egy számot(1-7-ig): ");
        int valasz = bemenet.nextInt();
        while (valasz > 7 || valasz < 1) {            
            System.out.print("Nem jó a megadott érték!(Adj meg egy számot(1-7-ig)):");
            valasz = bemenet.nextInt();
        }
    
        switch (valasz) {
      case 1:
        System.out.println("Hétfő");
        break;
      case 2:
        System.out.println("Kedd");
        break;
      case 3:
        System.out.println("Szerda");
        break;
      case 4:
        System.out.println("Csütörtök");
        break;
      case 5:
        System.out.println("Péntek");
        break;
      case 6:
        System.out.println("Szombat");
        break;
      case 7:
        System.out.println("Vasárnap");
        break;
    }
    }
    
}
