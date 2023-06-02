package day_05;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Array {

    public static void main(String[] args) {

        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lutfen bir sayi giriniz...");
            int sayi= scan.nextInt();
            arr[i]=sayi;


        }
        //loop un bir döngüsü bittigi anda array e assign ettigimiz variable lar sabit kalir.
        //ancak loop icinde olusturdugumuz variable lar yok olur loop her calistiginda tekrar olusur.
        // ve bu rakamları bir array'e assign ediniz. Olusturdugunuz array'i yazdırınız
        System.out.println(Arrays.toString(arr));

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
        //ilk önce for each ile array in elemanlarini toplayalim
        //daha sonra eleman sayısına bolelim.

        double toplam =0;

        for (int each:arr) {
            toplam+=each;

        }
        System.out.println("toplam = "+toplam);
        System.out.println("Ortalama = "+toplam/arr.length);


        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        for (int each: arr) {
            if (each>(toplam/arr.length))
                System.out.println(each+" ");
        }



    }
}
