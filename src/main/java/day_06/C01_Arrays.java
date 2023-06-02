package day_06;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        //yeni bir array oluşturmadan var  olan array in isaretleri degissin
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6

       // int arr[] = new int[6]; bu sekilde elemanlari default degerlerden olusan bir array olustururuz

        int arr[]={1,2,-3,4,-5,-6};//ayni satirda hem deklarasyon hem deger atamasi yapariz
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr[i]*-1;

            //arr[index] bu sekilde array in elemanlarına ulasabiliriz

        }
        System.out.println(Arrays.toString(arr));

        int index=0;
        for (int each: arr) {
            arr[index]= arr[index]*-1;
            index++;

        }
        System.out.println(Arrays.toString(arr));

    }

}
