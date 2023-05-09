package Day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Kullanicidan alacagimiz 5 basamakli bir sayi ilk iki ve
        // son iki basamagindaki rakamlarin toplamini yazdiran kodu yaziniz

        //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup ve kalani alin

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz");

        int number = input.nextInt();

        // bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani almaliyiz
        // % --> modulus operator solunda bulunan sagında bulunan sayıya bolumundan kalani verir
        // bir tamsayiyi baska bir tamsayiya bolerseniz java sonucu kesinlikle tam sayi yapar
        // java sonucu nasıl tam sayı yapar. ondalik kısmı iptal eder.
        // dolayisiyla bir tam sayiyi ona bolersek birler basamagini silmis oluruz


        //son rakami al
        int birlerBasamagi = number % 10;
        //sayiyi kucult
        number = number / 10;

        //sondan ikinci rakami al
        int sondanIkinci = number % 10;
        //sayiyikucult
        number = number / 10;

        //sondan ucuncuyu al
        int sondanUcuncu = number % 10;
        //sayiyi kucult
        number = number/10;

        //sondan dorduncu rakami al
        int sondanDorduncu = number % 10;
        //sayiyi kucult
        number = number / 10;

        //sondan besinci rakami al
        int sondanBesinci = number % 10;
        //son rakam oldugu icin kucultmeye gerek yok

        System.out.println(sondanBesinci+sondanDorduncu+birlerBasamagi+sondanIkinci);


    }

}
