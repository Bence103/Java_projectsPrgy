package kivalogatasbov;
import java.util.Scanner; // Az elem szám bekérése

public class Kivalogatasbov {

    
    public static void main(String[] args) {
        Scanner bemenet=new Scanner(System.in);
        
        System.out.print("Hány elemet tartalmazzon a tömb? ");
        int darab = bemenet.nextInt(); //Bekérjük a tömb elem számát a felhasználótól
                
        int erdemJegyek[] = new int[darab];//A tömbök létrehozása és ezek elemeinek az értékadása
        
        int egyes[] = new int[darab];
        int kettes[] = new int[darab];
        int harmas[] = new int[darab];
        int negyes[] = new int[darab];
        int otos[] = new int[darab];
        
        int egyesDb = 0;
        int kettesDb = 0;
        int harmasDb = 0;
        int negyesDb = 0;
        int otosDb = 0;
        
        // A tömbök elemeinek kiírása
        System.out.println("Érdemjegyek:");
        for (int i = 0; i < darab; i++) {
            erdemJegyek[i] = (int)(Math.random()*5)+1;
            System.out.print(erdemJegyek[i] + " ");
        }
        
        for (int i = 0; i <egyes.length ; i++) {
            if (erdemJegyek[i] == 1) {
                egyes[egyesDb++] = erdemJegyek[i];
                }
            }
        System.out.println("\n");
        
        System.out.print("\nEgyes tömb elemei: ");
        for (int i = 0; i < egyesDb ; i++) {
            System.out.print(egyes[i] + " ");
        }
        
        
        
        for (int i = 0; i <kettes.length ; i++) {
            if (erdemJegyek[i] == 2) {
                kettes[kettesDb++] = erdemJegyek[i];
                }
            }
        System.out.print("\nKettes tömb elemei: ");
        for (int i = 0; i <kettesDb ; i++) {
            System.out.print(kettes[i] + " ");
        }
        
        
        
        for (int i = 0; i <harmas.length ; i++) {
            if (erdemJegyek[i] == 3) {
                harmas[harmasDb++] = erdemJegyek[i];
                }
            }
        System.out.print("\nHarmas tömb elemei: ");
        for (int i = 0; i < harmasDb ; i++) {
            System.out.print(harmas[i] + " ");
        }
        
        
        
        for (int i = 0; i <negyes.length ; i++) {
            if (erdemJegyek[i] == 4) {
                negyes[negyesDb++] = erdemJegyek[i];
                }
            }
        System.out.print("\nNégyes tömb elemei: ");
        for (int i = 0; i < negyesDb ; i++) {
            System.out.print(negyes[i] + " ");
        }
        
        
        
        for (int i = 0; i <otos.length ; i++) {
            if (erdemJegyek[i] == 5) {
                otos[otosDb++] = erdemJegyek[i];
                }
            }
        System.out.print("\nÖtös tömb elemei: ");
        for (int i = 0; i < otosDb ; i++) {
            System.out.print(otos[i] + " ");
        }
        System.out.println("\n");
        //A számok darab számának kiíratása
        System.out.println("\nEgyesek száma: " + egyesDb);
        System.out.println("Kettesek száma: " + kettesDb);
        System.out.println("Hármasok száma: " + harmasDb);
        System.out.println("Négyesek száma: " + negyesDb);
        System.out.println("Ötösök száma: " + otosDb);
    }
    
}
//A neveket tekintve a kódban értelmes változók és nevek találhatóak,és kiderül a szándék is hogy mi okból hozták létre nincs benne félrevezető név sem.
//Kiejthető és éretlmezhető neveket tartalmaz a magyar programozók számára, nem találhatók benne zajszavak sem.
//Formázást tekintve viszonylag jól olvasható függölegesen és vizszintesen is formázva van az egyenrangú kódok egy szinten vannak illetve a Camelcasere is oda van figyelve.
//Inforamtív és tisztázó megjegyzéseket tartalmazz és bárki számára így érhetővé válik a kód.