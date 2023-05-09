package day03methodObjectCreationScanner;

public class Calculator {
    public static void main(String[] args) {

        //degerler

        int deger1 =60;
        int deger2 =20;

        int toplamaSonuc =toplama(deger1, deger2);
        System.out.println(toplamaSonuc);

        int cikarmaSonuc = cikarma(deger1, deger2);
        System.out.println(cikarmaSonuc);

        int carpmaSonuc = carpma(deger1, deger2);
        System.out.println(carpmaSonuc);


        double bolmeSonuc = bolme(deger1, deger2);
        System.out.println(bolmeSonuc);





    }//main

    public static int toplama(int a,int b){
        return a+b;

    }//toplama

    public static int cikarma(int a,int b){
        return a-b;

    }//cikarma

    public static int carpma(int a,int b){
        return a*b;

    }//carpma

    public static double bolme(double a,double b){
        return a/b;

    }//bolme
}
