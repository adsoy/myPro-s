package Arrays_MyLesson;

import java.util.Arrays;

public class Array_02 {
    public static void main(String[] args) {
        //Array leri kisa yoldan olusturma...
        int yaslar[]={5,12,52,36,65};

        //ORNEK 3: Spesific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz
        String  letters[] ={"M","U","D","A","N","Y","A","T","R","I","Y","E"};

        String letter="X";

        //1.way
        int counter=0;

        for ( String w : letters ){
            if(w.equals(letter)){
                counter++;
                break;
            }
        }

        if(counter>0){
            System.out.println("Array de "+letter+" harfi vardir");
        }else {
            System.out.println("Array de"+letter+"harfi yoktur");
        }


        //2.way
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));//[A, A, D, E, I, M, N, R, T, U, Y, Y]

        int r=Arrays.binarySearch(letters,"Y");
        System.out.println(r);


        //ORNEK 4: ==> interview sorusu
        // [0,1,2,0,3,0,4,0] sifirlari en sona koyunuz  [1,2,3,4,0,0,0,0]

        int x []={0,9,2,0,12,0,20,0};

        int y[]= new int[x.length];
        System.out.println(Arrays.toString(y));//   [0, 0, 0, 0, 0, 0, 0, 0]

        int index=0;

        for (int w: x) {
            if (w!=0){
                y[index]=w;

                index++;
                System.out.println(Arrays.toString(y));
            }
        }
        System.out.println(Arrays.toString(y));


    }//main
}//class