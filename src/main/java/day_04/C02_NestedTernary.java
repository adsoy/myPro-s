package day_04;

import java.util.Scanner;

public class C02_NestedTernary {
    public static void main(String[] args) {
          /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char ch=scan.next().charAt(0);

        //ascii tablosunu kullanarak a-z arasını ve A-Z arasını alarak bir kontrol saglarim
        //ch nin a-z araliginda olmasi demek ch>='a' && ch<='z'
        //ch nin A-Z araliginda olmasi demek ch>='A' && ch<='Z'

        System.out.println((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ? (ch>='a' && ch<='z' ? "Kucuk harf" : "Buyuk Harf") : ("Harf degil"));
    }
}
