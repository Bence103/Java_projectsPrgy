package osszetettfeladat;
import java.util.Scanner;//Importálás

public class Osszetettfeladat {

    public static void main(String[] args) {
    //Scanner létrehozása
    Scanner bemenet=new Scanner(System.in);
    //Változók deklarálása és inicializálása
    int elemSzam =(int)(Math.random()*20)+10;
    int szamok1[]=new int[elemSzam];
    int szamok2[]= new int[elemSzam];
    int ujTomb[] ;
    int nullaDb = 0;
    int szamokDb=0;
    char valasz;
    
        do {            
        //A tömbök elemeinek létrehozása
        for (int i = 0; i < elemSzam; i++) {
         szamok1[i]=(int)(Math.random()*100)-50;
         szamok2[i]=(int)(Math.random()*100)-50;
        }
        //Tömbök elemeinek kiíratása
        System.out.println("Tömb1 elemei: ");
        
        for (int i = 0; i < elemSzam; i++) 
            System.out.print(String.format("%,3d",szamok1[i])+" ");
        
        System.out.println("\nTömb2 elemei: ");
        
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(String.format("%,3d",szamok2[i])+" ");
            //Megvizsgálja a számokat
            if (Math.abs(szamok1[i])%2 == 0 && Math.abs(szamok1[i])%5 == 0)                 
                 szamokDb++;
            if (Math.abs(szamok2[i])%2 == 0 && Math.abs(szamok2[i])%5 == 0)                
                 szamokDb++;
        }
        ujTomb = new int[szamokDb+1];
        szamokDb = 0;
        //Kiválogatás tétele
        for (int i = 0; i <elemSzam ; i++) {
            if (Math.abs(szamok1[i])% 10 == 0)                 
                 ujTomb[szamokDb++]=szamok1[i]; 
            if (Math.abs(szamok2[i])% 10 == 0)                
                 ujTomb[szamokDb++]=szamok2[i];
            
        }
        //A nullák megvizsgálása az ujTomb-be és a nullaDb változóhoz hozzáadunk.Megszámlálás tétele
        for (int i = 0; i < szamokDb; i++) {
             if (ujTomb[i] == 0) 
                 nullaDb++;
         }
        //Az ujTomb kiíratása
        System.out.print("\nAz ujTomb elemei: ");
            for (int i = 0; i <szamokDb ; i++)
                System.out.print(ujTomb[i]+" ");
        //A nullák kiíratása
        if (nullaDb == 0) 
             System.out.println("\nA tömbök nem tartalmaznak nullát");
        else
             System.out.println("\nA nullák száma: " + nullaDb);
            
        //Megkérdezi a felhasználótól hogy szeretné-e újrafuttatni a programot
        System.out.print("\nSzeretné-e újrafuttatni a felhasználó a programot? (i/n)");
        
       //Megadja a választ a felhasználót
        valasz=bemenet.next().toLowerCase().charAt(0);
        } 
    while (valasz=='i');
    
    }
}

