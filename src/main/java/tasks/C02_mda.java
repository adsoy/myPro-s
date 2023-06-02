package tasks;

import java.util.Arrays;

public class C02_mda {
    public static void main(String[] args) {
         /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */
        int sayilar[][]= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//eger indexlerle bir isim yoksa foreach eger indexlerle bir isim varsa fori kullanirim
        elementYazdir(sayilar);

    }
    public static void elementYazdir(int[][] sayilar){
        for (int a[]:sayilar
        ) {
            // System.out.println(Arrays.toString(a));
            for (int w:a
            ) {
                System.out.println(w);
            }
        }

    }
}