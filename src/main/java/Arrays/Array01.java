package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {

        //1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz
        //Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
        int[ ] a = new int[ ]{12, 5, 8, 13};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        if (a.length%2!=0){
            int ortadakiSayi=a.length/2;
            System.out.println(Arrays.toString(a));
        }

   //2) String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        // Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};





        //4) String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
        //Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM

        String[] c = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        //5) String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
        String[] d = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        int sum = 0;
        for(String w : d){
            sum = sum + w.length();
        }
        System.out.println("Total number of characters is " + sum);



        //6) Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
        String s = "Apex is an object oriented programming language";

        String[] arr = s.split(" ");
        int counter = 0;
        for(String w : arr){
            if(w.startsWith("a") || w.startsWith("A")){
                counter++;
            }
        }
        System.out.println("The number of words which starts with a or A is : " + counter);

        //9) Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
        String[] arr1 = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};

        String s1 = "object";
        int counter1 = 0;
        for(String w : arr1){
            if(w.equalsIgnoreCase(s1)){
                counter1++;
            }
        }
        if(counter>0){
            System.out.println(s1 + " arrayde vardir");
        }else{
            System.out.println(s1 + " arrayde yoktur");
        }


        //10) Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.
        String[] brr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        Integer sum1 = 0;
        for(String w : arr){
            sum1 = sum1 + w.length();
        }
        System.out.println(sum1);



        // 11) Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        // Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        Integer[] arr5 = new Integer[]{5, 0, 2, 0, 3};
        Integer[] brr5 = new Integer[arr5.length];
        int firstIdx = 0;
        int lastIdx = arr5.length-1;
        for(int i=0; i<arr5.length; i++){
            if(arr5[i]!=0){
                brr5[firstIdx] = arr5[i];
                firstIdx++;
            }else{
                brr5[lastIdx]=0;
                lastIdx--;
            }
        }
        System.out.println(Arrays.toString(brr5));


        //12) Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük
        // ve en büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Array uzunlugunu giriniz : ");
        int len = scan1.nextInt();
        int[] arr6 = new int[len];
        System.out.println("Girilen array elemanlari : " + len);
        for(int i=0; i<len; i++) {
            arr6[i] = scan1.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr6);
        System.out.println(Arrays.toString(arr));
        int diffOfBigAndSmall = arr6[arr6.length-1] - arr6[0];
        System.out.println("En buyuk ve en kucuk oge arasındaki fark : " + diffOfBigAndSmall);


        //13) Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa konsola
        // "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        //Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.

        Scanner scan2 = new Scanner(System.in);
        System.out.println("iki String giriniz :");
        String kelime1 = scan2.nextLine();
        String kelime2 = scan2.nextLine();

        String[] word1 = kelime1.toLowerCase().split("");
        Arrays.sort(word1);
        String[] word2 = kelime2.toLowerCase().split("");
        Arrays.sort(word2);
        if (s1.length() != kelime2.length()) {
            System.out.println("Anagram Degil");
        } else if (kelime1.isEmpty()) {
            System.out.println("Anagram Degil");
        } else if (Arrays.equals(word1, word2)) {
            System.out.println("Anagramdir");
        } else {
            System.out.println("Anagram Degil");
        }

    }


}











