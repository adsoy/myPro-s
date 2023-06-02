package Arrays_MyLesson;

import java.util.Arrays;

public class Array_01 {
    public static void main(String[] args) {

    /* ARRAYS
    1. Aynı data type sahip birden fazla değer depolayan object’tir
        NOTE : Arrays’de farklı data type depolanmaz. declare ettigimiz data neyse onun uzerinde calisiriz
​
    Avantajları
         ***datalari verimli bir şekilde alabilir veya sıralayabiliriz.
         ****Dizide bulunan istedigimiz bir veriyi alabiliriz.
         ****Array lar, primitive ler le de calisir bu nedenle hizlidir
    Dezavantajları
        ******Array’in uzunluğu değiştirilemez. Bunun için object i yeniden tanımlariz
        ******Array’in data type’ı tektir. Birbirinden farklı data type atanamaz.
​
     */

        // 2. Array Create? nasil olustururuz
        // once declare ederiz ==>
        // String cigKofteMalz[]; // --> Best Practice
        //  String [] cigKofteMalz;

        //       ardindan create ederiz
        //  String cigKofteMalz[] = new String[6];


        //NOTE   Array create edilirken length’i tanımlanmazsa CTE alınır
        //       Array’e eleman atanmazsa (data type gore) default degerler atanır

        //DEGER ATAMA/ELEMAN EKLEME ==> 2 SEKİLDE OLUR

        // 1. way
        String cigKofteMalz[] = new String[6];
        cigKofteMalz [0]= "bulgur";
        cigKofteMalz [1]= "zeytinyagi";
        cigKofteMalz [2]= "isot";
        cigKofteMalz [3]= "pulbiber";
        cigKofteMalz [4]= "karabiber";
        cigKofteMalz [5]=" tuz";
        // 2. way
        // String cigKofteMalz[] = {"bulgur", "zeytinyagi", "isot", "pulbiber", "karabiber"};
        //nasil yazdirilir?
        System.out.println(Arrays.toString(cigKofteMalz));//[bulgur, zeytinyagi, isot, pulbiber, karabiber]

        //spesifik bir eleman yazdirma
        System.out.println(cigKofteMalz[2]);//isot

        //Array de uzunluk yazdir
        System.out.println(cigKofteMalz.length);

        String name="Cimbom";
        System.out.println(name.length());

        //ORNEK 1: 5 elemanli String bir array deki ilk eleman ile son elemanin icerdigi karakter sayilari toplamini yazdirin
        int r= cigKofteMalz[0].length() + cigKofteMalz[cigKofteMalz.length - 1].length();
        System.out.println(r);


        // ORNEK 2: İcersinde QA_04 team uyelerinin yaslari olan bir Integer bir array olustur
        // A) Bu yaslarin ort bul

        int yaslar []=new int[6];
        yaslar [0]=36;
        yaslar [1]=42;
        yaslar [2]=29;
        yaslar [3]=50;
        yaslar [4]=19;
        yaslar [5]=23;

        int toplam=0;

        for ( int w : yaslar) {
            toplam+=w;
        }
        int r1=toplam/yaslar.length;
        System.out.println(r);//33


        // B) En buyuk yas ile en kucuk yasin toplamini bul
        //1.way

        // Arrays.sort(yaslar);
        System.out.println(Arrays.toString(yaslar));//[19, 23, 29, 36, 42, 50]
        int r2=yaslar[0] + yaslar[yaslar.length - 1];
        System.out.println(r2);


        //2.way

        int enK=yaslar[0];
        int enB=yaslar[0];

        for (int w: yaslar) {

            enK=Math.min(enK,w);
            enB=Math.max(enB,w);
        }

        System.out.println(enK + enB);//69


    }//main
}//class