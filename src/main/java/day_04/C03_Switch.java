package day_04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_Switch {
    public static void main(String[] args) {

        // Kullanıcıdan uc basamaklı bir sayı sisteme girmesini isteyiniz
        // Bu sayıyı okunuşuna çeviren bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz...");
        int sayi = scan.nextInt();

        //125
        //yuz
        //yirmi
        //bes

        if (sayi < 100 || sayi > 999) {//bu kisim sayinin 3 basamakli olmama durumu
            System.out.println("3 basamakli sayi girmelisiniz");
        } else {//bu sayinin 3 basamakli olma durumunda yapiilacak islemler
            //%--> a'ya bolumden kalani verir.
            int birler = sayi % 10;//birler basamagini verir
            int onlar = (sayi / 10) % 10;//onlar basamagini verir
            int yuzler = sayi / 100;//yuzler basamagini verir

            switch (yuzler) {
                case 1:
                    System.out.println("Yuz");
                    break;
                case 2:
                    System.out.println("Iki yuz");
                    break;
                case 3:
                    System.out.println("Uc yuz");
                    break;
                case 4:
                    System.out.println("Dort yuz");
                    break;
                case 5:
                    System.out.println("Bes yuz");
                    break;
                case 6:
                    System.out.println("Alti yuz");
                    break;
                case 7:
                    System.out.println("Yedi yuz");
                    break;
                case 8:
                    System.out.println("Sekiz yuz");
                    break;
                case 9:
                    System.out.println("Dokuz yuz");
                    break;

            }
            switch (onlar) {
                case 1:
                    System.out.println("On");
                    break;
                case 2:
                    System.out.println("Yirmi");
                    break;
                case 3:
                    System.out.println("Otuz");
                    break;
                case 4:
                    System.out.println("Kirk");
                    break;
                case 5:
                    System.out.println("Elli");
                    break;
                case 6:
                    System.out.println("Altmis");
                    break;
                case 7:
                    System.out.println("Yetmis");
                    break;
                case 8:
                    System.out.println("Seksen");
                    break;
                case 9:
                    System.out.println("Doksan");
                    break;

            }
            switch (birler) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("Uc");
                    break;
                case 4:
                    System.out.println("Dort");
                    break;
                case 5:
                    System.out.println("Bes");
                    break;
                case 6:
                    System.out.println("Alti");
                    break;
                case 7:
                    System.out.println("Yedi");
                    break;
                case 8:
                    System.out.println("Sekiz");
                    break;
                case 9:
                    System.out.println("Dokuz");
                    break;
            }

        }
    }
}
