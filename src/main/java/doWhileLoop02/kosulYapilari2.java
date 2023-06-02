package doWhileLoop02;

import java.util.Scanner;

public class kosulYapilari2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Yasiniz...:");
        int yas = scan.nextInt();
        System.out.println("Butceniz...:");
        int butce = scan.nextInt();

        if (yas>=18 && butce>= 3000) {
            System.out.println("Ehliyet sinavina katilabilirsiniz");
        }else{
            System.out.println("Ehliyet sinavina giremezsiniz");
        }

    }



}
