package day05concatinationoperatortypecasting;

public class Concatination {

    public static void main(String[] args) {

        //Ornek 1: Bir string ve iki Integer variable olusturun. String degeri ile Integerlerin toplamini konsola yazdirin.

        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s+a+b);// elma1011   birleştirme(concatination)
        System.out.println(s+(a+b));//elma21
        System.out.println(s+a*b);//elma110
        System.out.println(a + b + s);//21elma
        System.out.println(a+s+b);//10elma11

        //Java da "+" sembolü iki sayi arasinda kullanilirsa toplama islemi olur.
        //Java da "+" sembllü iki string arasında veya bir string arasinda kullanilirsa "concatination" islemi olur
        //"concatination" birlestirme yapar.
        //Note: Concatination islemlerinde Java matematikteki islem onceligini kullanir.

        /*
        Matematikte islem onceligi
        1)once uslu sayilar
        2)Parantez ici islemler
        3)Carpma ve bolmeler yapilir
        4)Toplama ve cikarmalar yapilir
        5)Ayni oncelikli olanlarda soldan saga baslanir
        */

        //Ornek 2: Size String olarak verilen iki fiyatin toplamini ekrana yazdirin

        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes); //23005200

        // Integer.valueof () string degerleri integer a cevirir.
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);

        System.out.println(toplamFiyat);//7500

        //Ornek 3: Size String olarak verilen iki fiyatin toplamini ekrana yazdirin
        String tv = "1100";
        String radio = "300";

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);

        // Note: valueof() methodu tum karakterleri rakam olan string leri sayilara cevirir.
        //eger valueof() methodu kullanilirken String in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz
        //valueof() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir.

    }
}
