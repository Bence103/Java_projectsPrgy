package megszamlalas;
import java.util.Scanner;
public class Megszamlalas {

    public static void main(String[] args) {
        System.out.println("\n\r Megszamlálás tétele\n");
        
        Scanner bemenet=new Scanner(System.in);
        
        System.out.print("Hány elemet tartalmazzon a tömb? ");
         int tombDarab=bemenet.nextInt();
         
        int tomb1[]=new int[tombDarab];
        int szamokDb=0;
         
        for (int i = 0; i <tombDarab; i++) {
         tomb1[i]=(int)(Math.random()*999)+1;
         szamokDb++;
         }
         
         System.out.println("Tömb elemei:");
         
        for (int i = 0; i < tombDarab; i++) {
           System.out.print(i+1+".");
           System.out.print(String.format("%,3d",tomb1[i])+"\n");
        }
        
        
        int parosSzamDb=0;
        for (int i = 0; i < tombDarab; i++) {
            if (tomb1[i]%2==0) 
               {parosSzamDb++;}
              
//            if (tomb1[i]%2==0) {
//                System.out.println(i+1+"."+"páros"); 
//            } else {
//                System.out.println(i+1+"."+"páratlan");
//            }
        }
        System.out.println(tombDarab+"="+tomb1.length+"="+szamokDb);
        System.out.println("Páros számok Db-száma:"+parosSzamDb);
    }
    
}
