
package menu;
import java.util.Scanner;

public class Menu {

    
    public static void main(String[] args) {
        Scanner bemenet=new Scanner(System.in);
        int szamok[]= new int[20];
        int tombszum=0;
        int legNagyobb= 0;
        int legKisebb= 0;
        boolean van = false;
        int ottelOszthato=0;
        
        System.out.println("Tömb elemei:");
        for (int i = 0; i < szamok.length; i++) {
            szamok[i]=(int)(Math.random()*100)-50;
            System.out.print(szamok[i]+" ");
        }
        
        System.out.println("\n\tMENÜ:\n\t"+"\n1 - összeget számoltatni: tömbök összegét kiíratni\n" +
            "2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni\n" +
            "3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?\n" +
            "4 - 5-tel osztható páros számok db-száma: mennyi?\n" +
            "5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.");
        System.out.print("\nVálasszon a menüpontok közül(1-5)!");
        int valasz=bemenet.nextInt();
        while (valasz<1 || valasz>5) {            
            System.out.print("Kérem CSAK ezek a menüpontokból válaszon!\n1 - összeget számoltatni: tömbök összegét kiíratni\n" +
            "2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni\n" +
            "3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?\n" +
            "4 - 5-tel osztható páros számok db-száma: mennyi?\n" +
            "5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.:");
            valasz=bemenet.nextInt();
        }
        
       switch(valasz){
            case 1:
                for (int i = 0; i < 1; i++) {
                 tombszum+=szamok[i];
        }
             System.out.println("Tömbök összege="+tombszum);
        
               break;
            case 2:
                for (int i = 0; i < szamok.length; i++) {
                 if(szamok[i] > szamok[legNagyobb]){
                     legNagyobb=i;
                 }
                 if (szamok[i]<szamok[legKisebb]) {
                        legKisebb=i;
                    }
                }
                System.out.println("A legkisebb érték"+legKisebb+"\n A legnagyobb érték:"+legNagyobb);
               break;
            case 3:
                for (int i = 0; i < szamok.length; i++) {
                if(szamok[i] < 50 && szamok[i] > 40) {
                van = true;
                break;
               
                    }
                }
                if(van) System.out.println("\nA tömb tartalmaz számot 40-50 között.");
                else System.out.println("\nA tömb NEM tartalmaz számot 40-50között.");
               break;
            case 4:
                for (int i = 0; i < szamok.length; i++) {
                    if (szamok[i]%5==0) {
                        ottelOszthato++;
                    }
                }
                System.out.println(" 5-tel osztható páros számok db-száma:"+ottelOszthato);
               break;
            case 5:
                System.out.print("Adj meg egy számot a tömből ami létre lett hozva:");
                 valasz=bemenet.nextInt();
                for (int i = 0; i < 20; i++) {
                     while (szamok[i]!=valasz) {
                         System.out.print("A Tömb nem tartalmazza a számot(Adj meg egy számot a tömből ami létre lett hozva:)");
                         valasz=bemenet.nextInt();
                     }
                     
                     }
                System.out.println("A tömb tartalmazza a számot");

               break;   
    }
         
  }
}
