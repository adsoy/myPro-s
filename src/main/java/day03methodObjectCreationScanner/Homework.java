package day03methodObjectCreationScanner;

/*
    Homework
    1)Çemberin cevresini hesaplayan methodu olusturunuz ve kullanınız
    2)Dairenin alanini hesaplayan methodu olusturun ve kullanınız
     */

public class Homework {
    public static void main(String[] args) {

       double sonucCevre = cevreCember(8);
        System.out.println("sonucCevre = " + sonucCevre);

        double sonucAlan = alanDaire(7);
        System.out.println("sonucAlan = " + sonucAlan);


    }
    public static double cevreCember(double a){
        return a*2*3.14;
    }

    public static double alanDaire(double b){
        return (b*b)*3.14;
    }

}
