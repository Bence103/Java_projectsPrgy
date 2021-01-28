package eldontestetele;
import java.util.Scanner;
public class Eldontestetele {

   
    public static void main(String[] args) {
        Scanner bemenet=new Scanner(System.in);
        System.out.println("\n\tEldöntés tétele\n");
        System.out.print("Hány elemet tartalmazzon a tömb? ");
        int elemSzam = bemenet.nextInt();
        
        int tomb[] = new int[elemSzam];
        for (int i = 0; i <elemSzam ; i++) {
            tomb[i] = (int)(Math.random()*40)-20;
           }
         
        System.out.println("\nA tömb tartalma:");
        for (int i = 0; i < elemSzam; i++) {
             System.out.print(tomb[i]+" ");
        }
        boolean szerepelE = false;
        for (int i = 0; i < elemSzam; i++) {
            if (tomb[i]== 0) {
                szerepelE = true;
                break;
            }
        }
        
        if (szerepelE) {
          System.out.println("\nA tömb tartalmaz nullát!");
            }
        bemenet.close();

        
    }
    
}
