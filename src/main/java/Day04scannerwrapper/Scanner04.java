package Day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Kullanicidan bir dikdortgeni iki kenar uzunlugunu aliniz
        //a)alanini hesaplayiniz --> kisa kenar*uzun kenar
        //b)cevresini hesaplayiniz --> 2*(kısa kenar+uzunkenar)

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz");

        Double shortSide = input.nextDouble();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz");
        Double longSide = input.nextDouble();

        System.out.println("Alan  :" + shortSide*longSide);
        System.out.println("Çevre  :" + (2*shortSide+2*longSide));

    }
}
