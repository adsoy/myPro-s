package doWhileLoop02;

import java.util.Scanner;

public class kosulYapilari3 {

    public static void main(String[] args) {
        //-----------------DERS ORTALAMASI BULMA-----------------------

        //vize1 %30
        //vize2 %30
        //final %40
        //gecme notu 50

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen vize 1 notunu giriniz...:");
        int vize1 = scan.nextInt();

        System.out.println("Lutfen vize 2 notu giriniz...:");
        int vize2 = scan.nextInt();

        System.out.println("Lutfen final notu giriniz...:");
        int finalNotu = scan.nextInt();

        double ort = (vize1*0.3)+(vize2*0.3)+(finalNotu*0.4);
        System.out.println("Not ortalamanız :"+ort);
                if(ort>=50){
                    System.out.println("Sınıfı geçtiniz");
                }else{
                    System.out.println("Sınıfta kaldiniz");
                }
    }
}
