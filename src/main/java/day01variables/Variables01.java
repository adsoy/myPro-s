package day01variables;

public class Variables01 {

    public static void main(String[] args) {
        //bu satırı okumaz
        /*
        java bu satirlari da okumaz
         */

        //Variable nasil olusturulur?
        //Data type + variable name + Assignment Operator (atama operatoru) + Variable degeri + noktali virgul
        int             age                       =                                13                ;


        //java cumlesi statement olarak adlandirilir.
        //dildilgisindeki nokta ne ise javadaki noktali virgul ayni seydir yani statement in bittigini gosterir.
        //Eger variable declaration yapar, Assignment yapmazsaniz java kendi default degerlerini koyar
        //default deger sayilar icin 0 dir
        //Java da "=" assigment operator dur. ve java bu operatoru gordugu zaman once sag tarafi calistirir.
        //ve sagdaki degeri alir soldaki kutuya koyar
        //Java da esittir demek "==" Matematikte  "=",
        //Data type+Variable name ==> Variable declaration
        //Assigment Operator (=) + Variable degeri ==> Assignment


        /*
        Javada temelde iki tip data vardır.

        1) primitive data type:
            char, boolean, bute, short, int, long, float, double,
        2)non-primitive data type:
            String
         */

        //Ornek 1: Ogrenci ismi icin variable olusturup Ali Can atayiniz.
        String ogrenciAdi  =    "Ali Can" ;

        //Stringlere verilen degerler daima cift tirnak icinde yazilmalidir.
        //Stringler icin default value(varsayılan deger) null dir.
        /*String bir variable olusturdugumuzda cogu zaman ona bir deger atariz.
        Atama yapmazsak java o variable deger olarak null koyar.
        null demek 0 demek degildir. 0 da coding de bir degerdir.
        null hiclik demektir. ici varible ya da method bulunmaya bos bir obje demektir.
         */

        //char data type
        //TEK karakterler icin kullanılır. sayi, sembol, harf farketmez
        //ornegin ==> A, x, ?, 5,
        //ornek2: char data tipinde bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.

        char isminIlkharfi = 'A';

        //char data type inda degerler daima tek tirnak icinde yazilir.

        //boolean data type:
        //boolean lar sadece iki farkli deger alabilir;
        //true (dogru) veya false (yanlis)
        //o yuzden isimlendirme yapilirken ingilizce olarak mi? soru eki anlaminda basina is konulur.
        //Ornek 3: boolean data type ında emeklimisin sorusu icin bir variable olusturup false degerini atayım.

        boolean isRetired = false;

        //byte data type:
        //tam sayilar icin kullaniyoruz. hafizada 1 byte yer kaplar.
        //byte: -128 den +127 e (dahil) tam sayı degerleri icin kullanilir.
        // byte data type inde ogrenci yasi icin bir variable olusturunuz ve deger atayiniz

        byte ogrenciYasi= 17;

        //short data type :
        // tam sayilar icin kullaniyoruz. hafizada 2 byte yer kaplar.
        //-32768 den +32767 e (dahil) tam sayı degerleri icin kullanilir.
        //Ornek4: site nufusu icin bir variable olusturup deger ata.

        short siteNufusu = 1330;

        //int data type:
        //tam sayilar icin kullaniyoruz. hafizada 4 byte yer kaplar.
        // -2.147.483.648 ile  +2.147.483.467 e (dahil) tam sayı degerleri icin kullanilir.
        //ulke nufuslari icin bir variable olustur ve deger ata

        int ulkeNufusu = 15000000;

        //long data type :
        //tam sayilar icin kullaniyoruz. hafizada 8 byte yer kaplar.
        // –9,223,372,036,854,775,808 ila 9,223,372,036,854,775,807 e (dahil) tam sayı degerleri icin kullanilir.
        //Ornek 5: insan vucudundaki huzre sayisi icin variable olusturup deger ataması yap
        //bir deger long ise sonuna buyuk L veya kucuk l konulur.

        long cellNumberInHumanBody = 12345678901111111L;

        //eger long a atadiginiz deger int lerin araliginda ise sonuna L koymaya gerek yok.
        //long dememize ragmen sonuna L koymazsak java onu int kabul eder.

        long weightOfSun = 123456;

        //float data type:
        //float virgüllü sayılar(decimal numbers=ondalık sayılar) icin kullanilir.
        //fiyatlandırmalar (12,99),
        //ornek6: gomlek ve ayakkabı fiyatları icin 2 daet veairble olustur
        //java ondalikli sayilari otomatik olarak double kabul eder.
        //siz data type ini float olmasinda ısrar ediyorsaniz sonuna F yada f koymalısınız. 4 byte yer kaplar.

        float  shirtPrice = 12.99F;
        float  shoesPrice = 12.99f;

        //double data type:
        //8 byte yer kaplar
        //ondalikli kismi icin daha fazla rakam alabilir.
        //hucre agirligi gibi bilimsel calismalar icin kullanabilir.
        //Ornek7: Hucre agirligi ve amipin agirligi için iki tane variable olustur.

        double cellWeight = 2.858585858;
        double amipWeight = 2.888888880;

        //Ornek 9,
        // ogrenci notlari icin 2 adet variable olusturun ve toplamlarini ekrana yazdirin.

        byte note1 = 50;
        byte note2 = 70;


        System.out.println(note1);//ekrana yazdirir.
        System.out.println(note2);//ekrana yazdirir.

        System.out.println(note1+note2);


        //System.out.println(); ekrana yazdırır pointer ı bir sonraki satıra koyar.
        //System.out.print(); ekrana yazdırır ve pointer ı aynı satırda tutar





    }
    }
