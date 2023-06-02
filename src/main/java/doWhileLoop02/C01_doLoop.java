package doWhileLoop02;

public class C01_doLoop {
    public static void main(String[] args) {
        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin
        //1.yol
        for (int i = 5; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        //2.yol
        int a = 5;
        while (a<=10){
            System.out.print(a+" ");
            a++;}
        System.out.println();
        //3.yol
        int b=5;
        do {
            System.out.print(b+" ");

            b++;}while (b<=10);

    }
}