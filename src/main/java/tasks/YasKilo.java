package tasks;

import java.util.Scanner;

public class YasKilo {
    public static void main(String[] args) {
        /*
        TASK :
        Kullanicidan  yasini ve kilosunu aliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...:");
        int yas = scan.nextInt();

        System.out.println("Lutfen kilonuzu giriniz...:");
        int kilo = scan.nextInt();

        if (yas < 18) {
            System.out.println("kan bagisi yapamaz");
        } else if (yas>18 && kilo<50) {
            System.out.println("kan bagisi yapamaz");

        } else if (yas>18 && kilo>50) {
            System.out.println("kan bagisi yapabilir");
        }

    }

}
