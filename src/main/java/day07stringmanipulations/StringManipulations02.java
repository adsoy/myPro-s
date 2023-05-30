package day07stringmanipulations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManipulations02 {

    public static void main(String[] args) {

        /*
        Ornek :
        Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
            1) en az 8 karakter olsun
            2) space character i password de olmasin
            3) en az 1 buyuk harf olsun
            4) en az 1 kucuk harf olsun
            5) en az 1 rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //1) en az 8 karakter olsun
        boolean first = pwd.length()>7;
        System.out.println("En az 8 karakter var mi?"+first);

        //2) Space character i password de olmasin
        boolean second = !pwd.contains(" ");
        System.out.println("second = " + second);

        //3) en az 1 buyuk harf olsun
        //Note: Amacımız buyuk harf olmayanları sil
        //sildikten sonra kalan vharacter sayısına bak
        //eger character sayısı 0 ise buyuk harf yok demektir
        //eger sifirdan buyuk ise buyuk harf var demektir
        boolean third = pwd.replaceAll("[^A-Z]", ""). length() >0;//methodları aynı satırda yanyana kullanmayalım
        System.out.println("third = " + third);

        //4) en az 1 kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", ""). length() >0;
        System.out.println("fourth = " + fourth);

        //5) en az 1 rakam olsun
        boolean fifth = pwd.replaceAll("[^0-9]", ""). length() >0;
        System.out.println("fifth = " + fifth);

        System.out.println("Password geçerli mi?    "+(first && second && third && fourth && fifth));



    }
}
