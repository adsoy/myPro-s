package day06swapvaluesstringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {








        //String bir mom-primitive data type dır ve aynı zamanda bir class tır.
        String s= "Java is easy";


        //Ornek 1: "s" stringindeki tüm characterleri buyuk harf yapiniz

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        //Ornek 2: "s" stringindeki tüm characterleri kucuk harf yapiniz

        String sLower = s.toLowerCase();
        System.out.println(sLower);//Java is easy








        //Ornek 3: "s" stringindeki ilk character i aliniz
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J


        //Ornek 4: "s" stringindeki baştan ikinci ve sondan ikinci caharacteri aliniz ve ekrana yazdiriniz

        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);

        System.out.println(""+secondChar+secondLastChar);//as

        //Ornek 5: "s" stringinde kullanilan character sayisini bulunuz
        int sLength = s.length();
        System.out.println(sLength);//12


        //Ornek 6: "s" string indeki ilk 4 characteri aliniz.
        //s.substring(0,4); --> bu kullanimda ilk index dahildir ikinci indeks harictir.
        String sub1 = s.substring(0,4);
        System.out.println(sub1);//Java


        //Ornek 7: s stringindeki "is" karakterini gösteriniz
        String sub2 = s.substring(5,7);
        System.out.println(sub2);//is


        //Ornek 7: s stringindeki "easy" karakterini gösteriniz
        String sub3 = s.substring(8,12);
        System.out.println(sub3);//easy

        //Ikinci yol
        String sub4 = s.substring(8);//ilk başlangıcı belirler gerisini sona kadar tamamen alır
        System.out.println(sub4);//easy

        //Ornek 9: s string inde "money" kelimesinin var olup olmadıgını kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);//false

        boolean isExist4 = s.contains("easy");
        System.out.println(isExist4);//true

        boolean isExist1 = s.contains("İS");
        System.out.println(isExist1);//false

        boolean isExist2 = s.contains("java");
        System.out.println(isExist2);//false

        boolean isExist3 = s.contains("Java");
        System.out.println(isExist3);//true

        boolean isExist5 = s.contains("");
        System.out.println(isExist5);//true

        //Ornek 10: s stringinde belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        //Ornek 11: "s" stringinin 5. index dahil olmak üzere bu indexten itibaren i ile baslayip baslamadiğini
        boolean isTrue10 = s.startsWith("i",5);
        System.out.println(isTrue10);//true

        boolean isBegin = s.startsWith("v", 2);
        System.out.println(isBegin);//true





































































    }
}
