package day_02;

import java.util.Scanner;

public class C01_MethodCreation {

    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8
    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

    public static void main(String[] args) {

        //kullanıcıdan fahrenheit bir deger alalım
        //scanner objesı olusturalım

        Scanner scan = new Scanner(System.in);

        //kullaniciya bir mesaj verelim
        System.out.println("Lutfen fahrenheit cinsinden sıcaklık giriniz...");

        double fahrenheit = scan.nextDouble();//kullanicinin girmis oldugu degeri fahrenheit container ına kaydum

        double celsius = fahrToCels(fahrenheit);
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celsius = " + celsius);
    }

    public static double fahrToCels(double fahrenheit) {
        //c = (f-32)/1.8

        double celsius =  (fahrenheit-32)/1.8;
        return celsius;
    }


}