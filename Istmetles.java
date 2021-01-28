
package istmetles;
import java.util.Scanner;

public class Istmetles {

    public static void main(String[] args) {
        Scanner bemenet=new Scanner(System.in);
        System.out.print("Adj meg egy pozitív egész számot: ");
        int valasz=bemenet.nextInt();
        while (valasz<=0) {            
            System.out.print("Adjon meg egy új értéket!(Adj meg egy pozitív egész számot)");
            valasz=bemenet.nextInt();
        }
        for (int i = 0; i <= valasz; i++) {
            System.out.print(i+1+" ");
        }
        bemenet.close();
        
    }
    
}
