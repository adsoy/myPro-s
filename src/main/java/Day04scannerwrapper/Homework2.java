package Day04scannerwrapper;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        // ornegin => 312 icin 3+1+2=6

        Scanner input = new Scanner(System.in);

        System.out.println("3 basamakli bir sayı giriniz..:");

        int number = input.nextInt();

        //son rakami al
        int birlerBasamagi = number % 10;
        //sayiyi kucult
        number = number / 10;

        //sondan ikinci rakami al
        int onlarBasamagi = number % 10;
        //sayiyikucult
        number = number / 10;

        //sondan ucuncuyu al
        int yuzlerBasamagi = number%10;

        System.out.println("3 basamakli sayinin rakamlari toplami...:" + (birlerBasamagi+onlarBasamagi+yuzlerBasamagi));
    }
}
