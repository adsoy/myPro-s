package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {
        //bir array in elemanlari array ise bu arrayler multidimensional array dir
        //multidimensional array nasil olusturulur?

        int a[][] = new int[3][2];

        //Multidimensional array lere alaman nasıl eklenir?
        a [0][0]=5;
        a [1][1]=45;
        a [0][1]=12;
        a [1][0]=81;
        a [2][1]=0;
        a [2][0]=123;

        //Multidimensional array nasil yazdirilir

        System.out.println(Arrays.toString((a)));//[[I@6acbcfc0, [I@5f184fc6, [I@3feba861]
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //Multidimensional arrayleri console a yazdirmak icin tostring() methodu degil deeptoString() methodunu kullaniriz
        System.out.println(a[1][1]);//45
        System.out.println(a[2][1]);//0

        //Multidimensional array icindeki bir array nasil yazdirilir
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[1]));//[81, 45]

        //Kisa yoldan Multidimensional array nasil olusturulur?

        String students [][] = {{"Ali"},{"Kemal"},{"Cemal"},{"Ayhan", "Beyhan", "Seyhan", "Ceyhan", "Kayahan"}};

        //Ornek 1: Yukaridaki students arrayinde toplam kac isim oldugunu bulunuz
        int sum = 0;
        for (String[] w : students) {
            sum=sum+w.length;
        }
        System.out.println(sum);//8

    }
}
