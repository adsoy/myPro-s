package doWhileLoop02;

import java.util.Scanner;

public class kosulYapilari {

    public static void main(String[] args) {
        //KOSUL YAPILARI
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu girizi");
        int not = scan.nextInt();


       if (not>=50){
           System.out.println("Gectiniz");

       }else{
           System.out.println("Kaldiniz");

       }
    }
}
