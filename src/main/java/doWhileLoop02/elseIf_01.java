package doWhileLoop02;

import java.util.Scanner;

public class elseIf_01 {

    public static void main(String[] args) {

        //ELSE IF YAPISI

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gitmek istediginiz yolu seçiniz...:");
        int secilenYol = scan.nextInt();

        if (secilenYol==1){
            System.out.println("Seçilen yol  "+secilenYol+" . yoldur");
        } else if (secilenYol==2) {
            System.out.println("Seçilen yol  "+secilenYol+" . yoldur");;

        } else if (secilenYol==3) {
            System.out.println("Seçilen yol  "+secilenYol+" . yoldur");;


        }else {
            System.out.println("Lutfen gecerli bir yol seciniz");;

        }

    }
}
