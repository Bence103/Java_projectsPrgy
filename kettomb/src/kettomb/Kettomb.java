package kettomb;

public class Kettomb {

    
    public static void main(String[] args) {
    System.out.println("\n\tTömbök\n");
        
        int tomb1[] = new int[10];
        int osszeg =0;
        for (int i = 0; i < tomb1.length; i++) 
        {
            tomb1[i]=(int)(Math.random() * 99)+1;
            osszeg = osszeg + tomb1[i];
            if (i!=tomb1.length-1) {
                System.out.print(tomb1[i]+", ");
            }else
            System.out.println(tomb1[i]);
        }
        int tomb2[]=new int[10];
        int osszeg2 =0;
        for (int i = 0; i < tomb2.length; i++) 
        {
            tomb2[i]=(int)(Math.random() * 99)+1;
            osszeg = osszeg + tomb2[i];
            if (i!=tomb2.length-1) {
                System.out.print(tomb2[i]+", ");
            }else
            System.out.println(tomb2[i]);
        }
        int atlag1=osszeg/tomb1.length;
        int atlag2=osszeg2/tomb2.length;
        System.out.println("\n A számok összege első tömb: "+osszeg);
        System.out.println("\n A számok összege második tömb: "+osszeg2);
        System.out.println("Az első tömb átlaga: "+atlag1);
        System.out.println("Az második tömb átlaga: "+atlag2);
    }
    
}
