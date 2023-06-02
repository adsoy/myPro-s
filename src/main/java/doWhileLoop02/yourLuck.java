package doWhileLoop02;

import java.util.Scanner;

public class yourLuck {
    public static void main(String[] args) {

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("İsminiz nedir");
        String isim = okuyucu.next();
        System.out.println("Yasinizi giriniz");
        int yas = okuyucu.nextInt();

        System.out.println(" Merhaba " + isim);
        System.out.println("yasiniz  " + yas);


        int harfSayisi = isim.length();
        int sansliSayi = harfSayisi*yas;


        if (yas < 15) {
            sansliSayi = (harfSayisi * yas) % 10;

        } else if (yas < 20) {
            sansliSayi = (yas * yas - harfSayisi) % 10;

        } else if (yas < 40) {
            sansliSayi = (2 * yas - harfSayisi) % 10;
        } else if (yas < 60) {
            sansliSayi = (harfSayisi * yas) % 10;
        } else {
            sansliSayi = (harfSayisi * 5) % 10;
            if (sansliSayi < 0) {
                sansliSayi = sansliSayi * -1;

            }

        }
        System.out.println("Sansli sayiniz   :"+sansliSayi);
    }
}