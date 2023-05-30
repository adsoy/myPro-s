package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Ornek 1: Integer bir array olusturunuz. 6 tane eleman yerlestiriniz.
        // Bu elemanların en kucugu ile en buyugunın toplamini ekrana yazdiriniz

        int ages [] = new int[6];
        ages[0]=20;
        ages[1]=45;
        ages[2]=72;
        ages[3]=56;
        ages[4]=44;
        ages[5]=32;

        System.out.println(Arrays.toString(ages));//[20, 45, 72, 56, 44, 32]

        //1.yol
        //sort() metodu array deki elemanlari kucukten buyuge dogru dizer

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));//[20, 32, 44, 45, 56, 72]
        System.out.println(ages[0]+ ages[ages.length-1]);//92

        //2. yol

        int minimum = ages[0];
        int maximum = ages[0];

        //[20, 45, 72, 56, 44, 32]

        for (int w : ages) {
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);

        }
        System.out.println(minimum+maximum);//20

        //Ornek 2: String bir array olusturunuz 6 eleman ekleyiniz
        // ve yellow dan onceki elemanlari yazdiriniz

        String colors [] = new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        System.out.println(Arrays.toString(colors));

        for (String w:colors) {
            if(w.equals("Yellow")) {
                break;

            }
            System.out.println(w);
        }

    }
}
