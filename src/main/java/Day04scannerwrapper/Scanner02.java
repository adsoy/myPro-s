package Day04scannerwrapper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Ornek kullanicidan adresini aliniz ve ekrana yazdiriniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen adresinizi giriniz...");

        //nextLine() methodu çok kelimelik String almak icin kullanilir.

        String address = input.nextLine();
        System.out.println(address);

    }

}
