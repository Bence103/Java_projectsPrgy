
package t_.k_metodus;


public class T_K_metodus {
private static double szamitKerulet(double a, double b, double c){
return a+b+c;
    }
private static double szamitTerulet(double a, double m){
    return (a*m)/2.0;
    }
private static double szamitTerulet2(double a, double b, double c){
    double s = (a+b+c)/2.0;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public static void main(String[] args) {
        System.out.println("Háromszög kerület, terület számító program");
        
        System.out.printf("kerulet:%.2f\n",szamitKerulet(30, 35, 40));
        System.out.printf("terulet:%.2f\n",szamitTerulet(30, 35));
        System.out.printf("terulet:%.2f\n",szamitTerulet2(30, 35, 40));
    }
    
}
