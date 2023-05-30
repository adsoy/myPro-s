package day07stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {
        String t = "Ali 13 yasindadir!...";

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" (Regex) kullanir.
        //Note:Bir grup datayi degistirmek icin replaceAll() kullanilir.
        //Ornek 7:"t" String indeki tum rakamlari (0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz

        /*
                     Meshur Regex ler
           1) Tum rakamlar               ==> [0-9]
           2) Tum kucuk harfler          ==> [a-z]
           3) Tum buyuk harfler          ==> [A-Z]
           4) Tum Kucuk ve buyuk harfler ==> [a-zA-Z]
           5) Tum harfler ve rakamlar    ==> [a-zA-Z0-9]
           6) Tum noktalama isaretleri   ==> \\p{Punct}
           7) Tum sesli Harfler          ==> [aeiouAEIOU]
           8) Tum x,q,w harfleri         ==> [xqw]
           9) Kucuk harflerden farkli tum characterler => [^a-z]
           10 Tum harflerden farkli tum characterler   =>[^a-zA-Z]
           11) sadece space karakteri --> \\s
                space karakteri hariç -->\\S
                sadece rakamlar ---> \\d
                rakamlar hariç ---> \\D
         */

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

        //Ornek 2: "t" stringindeki tüm rakamlari ve harfleri unlem isaretine cevirin
        String t2 = t.replaceAll("[0-9a-zA-Z]", "!");
        System.out.println(t2);//!!! !! !!!!!!!!!!!...

        //Ornek 3: "t" stringindeki tüm sesli harfleri "?" isaretine cevirin
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r!...

        //Ornek 4: "t" stringindeki küçük harfler dışındaki tüm karakterleri  "<>" isaretine cevirin
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

        //Ornek 5: "t" stringindeki tüm  harfler dışındaki herşeyi "+" isaretine cevirin
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);//Ali++++yasindadir++++

        //Ornek 6: "t" stringindeki spaceler dışında tüm karakterleri "?" isaretine cevirin
        String t6 = t.replaceAll("[^ ]", "?");
        System.out.println(t6);//??? ?? ??????????????

        //Ornek 7: "t" stringindeki sesli harfler dışındaki tüm karakterleri "&" e çevirin
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);//A&i&&&&&a&i&&a&i&&&&&

    }
}
