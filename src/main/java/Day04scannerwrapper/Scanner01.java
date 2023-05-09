package Day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Ornek: Kullanıcıdan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdirin
        //1. adim: Scanner class tan bir obje olustur.

        Scanner input = new Scanner(System.in);


        //2. adım: Kullaniciya ne istediginize dair mesaj verin
        System.out.println("ilk ismini giriniz");

        //3. adim: Uygun methodu kullanarak kullanicin verdiği datayi memorye yerlestiriniz
        //next methodu kullanicidan tek kelimeli strting almak icin kullanilir
        String firstName = input.next();

        System.out.println("Soy ismini giriniz");

        String lastName = input.next();

        System.out.println(firstName +" "+ lastName);







    }
}
