package day_09.Arabalar;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C03_Set {

    // Verilen bir array'den tekrar eden elemanları silip
    // unique elemanlardan olusan bir array haline donusturen method olusturun
    // int arr[]={1,2,2,3,4,4,5};

    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5,4,2,0,7,1};
        System.out.println(Arrays.toString(arr));

        //method olusturalim
        benzersizYap(arr);
    }

    private static void benzersizYap(int[] arr) {
        //set tekrarsiz elemanlardan olusur.
        //bir set container i olusturup arr nin elemanlarini set e ekleyelim
        //set tekrarli eleman kabul etmeyecegi icin tekrarsiz bir kume elde etmis olacagiz.

        Set<Integer> tekrarsiz=new TreeSet<>();//TreeSet natural order a gore sıralama yapar.

        for (int each: arr) {
            tekrarsiz.add(each);//set tekrarsiz eleman kabul etmeyeceği icin if-else ile kontrol etmeme gerek yok.


        }
        System.out.println(tekrarsiz);
    }
}
