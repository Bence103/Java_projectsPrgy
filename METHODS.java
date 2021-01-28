
package methods;
import java.util.Scanner;

public class METHODS {
    
    public static void tagolas() {
      System.out.println("\n------------------------------------------------------------\n");
  }
    
    public static void korMinosites (int eletKor) {
        if(eletKor<18)
            System.out.println("Kiskorú");
        else if (eletKor<65)
            System.out.println("Felnőtt");
        else 
            System.out.println("Nyugdíjas");
    }
    public static void main(String[] args) {
    Scanner bemenet = new Scanner(System.in);
    tagolas();
    System.out.println("Metódusok");
    tagolas();
    int valasz;
        do {            
            System.out.println("Adj meg egy életkort:");
            korMinosites(bemenet.nextInt());
            System.out.println("Szeretnél más adatot megadni?(0/1)");
            valasz = bemenet.nextInt();
        } while (valasz==1);
    
    
    korMinosites(bemenet.nextInt());
    korMinosites(bemenet.nextInt());
    korMinosites(bemenet.nextInt());
    }
    
}
