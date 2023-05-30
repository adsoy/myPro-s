package day10ifstatements;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        ///////////ODEV1////////////////
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifreyi giriniz");
        String password = input.nextLine();
        if (password == "pwd123!") {
            System.out.println("Şifre geçerli.");
        }
        else{
            System.out.println("Şifre geçersiz.");
        }

        ////////////ODEV2////////////////

        System.out.println("Lütfen gün ismi giriniz:");
        String gun = input.nextLine();
        if (gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("1");
        } else if (gun.equalsIgnoreCase("salı")) {
            System.out.println("2");
        } else if (gun.equalsIgnoreCase("çarşamba")) {
            System.out.println("3");
        } else if (gun.equalsIgnoreCase("perşembe")) {
            System.out.println("4");
        } else if (gun.equalsIgnoreCase("cuma")) {
            System.out.println("5");
        } else if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("6");
        } else if (gun.equalsIgnoreCase("pazar")) {
            System.out.println(7);
        } else{
            System.out.println("Geçersiz gün");
        }
        /////////////ODEV3///////////////
        System.out.println("lütfen kacıncı ay olduğunu yazınız:");
        byte ay = input.nextByte();
        if (ay == 1) {
            System.out.println("Ocak");
        } else if (ay == 2) {
            System.out.println("Şubat");
        } else if (ay == 3) {
            System.out.println("Mart");
        } else if (ay == 4) {
            System.out.println("Nisan");
        } else if (ay == 5) {
            System.out.println("Mayıs");
        } else if (ay == 6) {
            System.out.println("Haziran");
        } else if (ay == 7) {
            System.out.println("Temmuz");
        } else if (ay == 8) {
            System.out.println("Ağustos");
        } else if (ay == 9) {
            System.out.println("Eylül");
        } else if (ay == 10) {
            System.out.println("Ekim");
        } else if (ay == 11) {
            System.out.println("Kasım");
        } else if (ay == 12) {
            System.out.println("Aralık");
        } else {
            System.out.println("Geçersiz ay.");
        }



    }


}