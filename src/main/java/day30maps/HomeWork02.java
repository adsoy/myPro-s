package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class HomeWork02 {
    public static void main(String[] args) {
        //HomeWork
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String cumle = "Hello Henry!";

        String cumle2 = cumle.replaceAll("\\p{Punct}", "");
        String cumle3 = cumle2.replaceAll(" ", "");
        String cumle4[] = cumle3.split("");

        HashMap<String, Integer> harf = new HashMap<>();

        for (String w : cumle4) {
            Integer a = harf.get(w);
            if (a == null) {
                harf.put(w, 1);
            } else {
                harf.replace(w, a + 1);
            }

        }
        System.out.println(harf);
    }
}
