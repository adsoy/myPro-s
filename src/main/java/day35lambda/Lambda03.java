package day35lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {

        //12) Size verilen iki tamsayi arasindaki tum cift sayilarin
        // toplamini veren kodu yaziniz.

        System.out.println(getSumOfEvensBetweenTwoInt(14, 6));


    }
    public static int getSumOfEvensBetweenTwoInt (int a, int b) {
        if (a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return IntStream.
                range(a+1,b).
                filter(Utils::isNumberEven).
                sum();

    }
}
