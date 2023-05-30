package day06swapvaluesstringmanipulations;

public class SwapValues {

    //swap: yer degstirmek:
    //1. kap patates
    //2. kap domates -->
    // swap
    // 1. kap domates 2. kap patates


    public static void main(String[] args) {

        int a= 12;
        int b=5;//swap ten sonra a=5 olsun b=12
        int temp = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //1. adım:
        temp = a;

        //2. adım:
        a = b;

        //3. adım:
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2. yol
        int elma = 12;
        int armut = 5;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma = elma+armut;
        armut = elma - armut;
        elma = elma - armut;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);


    }



}
