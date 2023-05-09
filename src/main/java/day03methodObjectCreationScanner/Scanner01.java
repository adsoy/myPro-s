package day03methodObjectCreationScanner;

//java nın util kütüphanesinden scanner class import edildi.

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1. adim scanner class tan obje olustur.

        Scanner input = new Scanner(System.in);

        //2. adım kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz");


        //3. adim: Uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestir
        byte age = input.nextByte();
        System.out.println("age = " + age);
    }

}
