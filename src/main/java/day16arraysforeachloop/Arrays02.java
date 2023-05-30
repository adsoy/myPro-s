package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: String array olusturun icine 5 tane eleman ekleyin, ilk eleman ile
        // son elemanin icerdigi karakter sayilari toplamini ekrana yazdirin

        String arr [] = new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";

        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length-1].length());

        //Ornek 2: String bir array olusturun icine 5 tane eleman ekleyin
        // tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin

        String brr [] = new String[5];
        brr[0]="Miami";
        brr[1]="İstanbul";
        brr[2]="Ankara";
        brr[3]="Oslo";
        brr[4]="Erzurum";

        //1. yol for loop

        int totalChar = 0;
        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar+brr[i].length();

            System.out.println(totalChar);
        }
        //2. yol for each loop (enhanced loop)
        //baslangic degeri, loopun calisma sarti ve increment/decreent kismini kendisi halleder
        //for each loop "Array"lerde ve coolectionlarda kullanilir

        //for(Datatype w:brr/collection    ){
        //  calisacak kodlar
        int sum =0 ;
        for (String w : brr) {
            sum = sum+ w.length();


        }

        System.out.println(sum);


        //Ornek 3: notlar adinda integer bir array olusturun
        // ve altı tane not yerlestirin ve not ortalamasini yazdirin

        int notes [] = new int[6];
        notes[0]=50;
        notes[1]=60;
        notes[2]=70;
        notes[3]=80;
        notes[4]=40;
        notes[5]=90;

        System.out.println(Arrays.toString(notes));//[50, 60, 70, 80, 40, 90]
        int total = 0;
        for(int w : notes){
            total = total+ w;
        }
        System.out.println(total/notes.length);

    }
}
