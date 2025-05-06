public class Esercizio3 {

    public static double perimetroRettangolo(double base,double altezza){
        return 2*(base+altezza);
    }

    public static int pariDispari(int num){
        if (num%2==0) return 0;
        else return 1;
    }

    public static double areaTriangolo(double a,double b,double c){
        double semiPerimetro =(a+b+c)/2;
        return Math.sqrt(semiPerimetro*(semiPerimetro-a)*(semiPerimetro-b)*(semiPerimetro-c));
    }

    public static void main(String[] args) {

        double perimetro = perimetroRettangolo(5.4,3.2);

        System.out.println("Il perimetro è "+perimetro);

        System.out.println(pariDispari(5));

        System.out.println(areaTriangolo(4.4,3.2,5.6));
    }


}
