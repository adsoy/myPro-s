package practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CumartesiPractice {
    /*
    elemanlarini rakam olacak sekilde kullanicidan alacagimiz bir string list olusturunuz
    ve belirlenen bir karakter ile eklemeyi sonlandiriniz
    kalan listteki elemanlarin carpimini bulunuz

     */

    public static void main(String[] args) {
        int x[] = {1, 2, 0, 3, 0, 4, 0};
        System.out.println(Arrays.toString(x));

        int y[] = new int[x.length];
        System.out.println(Arrays.toString(y));

        int idx = 0;

        for (int w : x) {
            if (w != 0) {
                y[idx] = w;
                idx++;

            }

        }
        System.out.println(Arrays.toString(y));
    }
}
