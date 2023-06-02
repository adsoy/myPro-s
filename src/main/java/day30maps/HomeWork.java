package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class HomeWork {
    //HomeWork
    //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
    //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
    public static void main(String[] args) {

        String cumle ="Hello Henry!";

        String cumle2 =cumle.replaceAll(" ","");
        String cumle3 =cumle2.replaceAll("\\p{Punct}","");
        String cumle4[]=cumle3.split("");
        System.out.println(Arrays.toString(cumle4));

        HashMap<String,Integer> harfsayisi =new HashMap<>();
        //System.out.println(harfsayisi);

        for (String w:cumle4 ) {
            Integer a =harfsayisi.get(w);
            if(a ==null){
                harfsayisi.put(w,1);

            }else {
                harfsayisi.replace(w,a+1);
            }

        }
        System.out.println(harfsayisi);
    }
}