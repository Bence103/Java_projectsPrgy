package kivalogatas;


public class Kivalogatas {

    
    public static void main(String[] args) {
        System.out.println("\n\tKiválogatás tétele\n");
        
        int erdemJegyek[] = new int[5];
        int kettesek[]=new int[5];
        for (int i = 0; i < erdemJegyek.length; i++) {
            erdemJegyek[i] = (int)(Math.random()*5);
        }
        
        System.out.println("Érdemjegyek:");
        
        for (int i = 0; i < erdemJegyek.length; i++) {
            System.out.print(i + 1 + ". jegy:" + " ");
            System.out.println(erdemJegyek[i]);
        }
        int kettesekDb=0;
        for (int i = 0; i < kettesek.length; i++) {
            if (erdemJegyek[i]==2) {
                kettesek[kettesekDb++]=erdemJegyek[i];
            }
           
        }
         System.out.println("Kettesek tömb elemei:");
         for (int i = 0; i < kettesekDb; i++) {
             System.out.print(kettesek[i]+" ");
        }
         System.out.println("\n Kettesek száma: "+kettesekDb);
    }
    
}
