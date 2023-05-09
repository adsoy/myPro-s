package Day04scannerwrapper;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        //homework
        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        //ornegin => 3,5,7 icin ortalama (3+5+7)/3=5



        //Ornek 1:
        Scanner input = new Scanner(System.in);

        System.out.println("Üç farkli sayi giriniz");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        System.out.println("ortalama   :" + (number1+number2+number3)/3);



    }
}
