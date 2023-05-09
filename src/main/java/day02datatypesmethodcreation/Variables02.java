package day02datatypesmethodcreation;

public class Variables02 {
    /*
    Javada temelde 2 type data vardır.
    1)primitive data type:
    char, boolean, byte, short, int, long, float, double
    2)non primitive data type:
    String,

     */
    /*
    note 1: primitive data type larını java oluşturmuştur. Biz oluşturamayiz.
    note 2: primitive data type larının isimlerinde sadece küçük harf kullanilir.
    note 3: primitive datalar data type larına göre memory de farkli farkli yer kaplarlar.
    note 4: primitive datalar iclerinde sadece sizin atadiginiz degeri barindirirlar.
     */

    /*
    non-primitive data types
    Ornek => String......
    note 1: uretilen her bir class ayni zamanda bir non-primitive data type dir.
    bu yüzden non-primitive data type lar sinirsiz sayidadir denebilir.
    *non-primitive data type lari isimleri buyuk harfla baslar.
    *non-primitive ler için java memory de buyuklugune gore degisen boyutlarda yer ayirir.

     */

    public static void main(String[] args) {
        //Ornek: ulke ismi icin bir variable olusturun ve ekrana yazdirin
        String ulkeIsmi = "Turkiye";
        System.out.println(ulkeIsmi);


        /*
        Interview sorusu: primitive ve non-primitive data type ları arasındaki fark nedir?
        1)  "primitive" ler sadece bizim atadigimiz degeri icerir.
            "non-primitive"ler bizim atadigimiz degeri ve methodlari icerir.
        2)  "primitive" ler kucuk harfle baslar, "non-primitive"ler buyuk harfle baslar.
        3)  "primitive"leri java üretmistir ve 8 tanedir.
            "non-primitive"leri java ve java developer lar uretebilir. sinirsiz sayidadir.
        4)  "primitive"ler data type larına gore sabit boyutta bellek kullanir.
            "non-primitiv"ler icin java memory de buyuklugune gore degısen boyutlarda bellek kullanabilirler.
         */


    }
}
