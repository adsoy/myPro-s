package tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class xtra {
    public static void main(String[] args) {
         /*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gitmek istediginiz kenti seciniz...\n-B \n-C \n-D");
        String sehirSecim = scan.next();

        System.out.println("Yasinizi giriniz");
        int yasSecim = scan.nextInt();

        System.out.println("Gidiş/Dönüş Bileti istiyor musunuz?(EVET/HAYIR)");
        String gidisDonus = scan.next();

        double biletFiyat = 0;

        if (sehirSecim.equalsIgnoreCase("B")) {
            biletFiyat=500*0.10;

        } else  if (sehirSecim.equalsIgnoreCase("C")) {
                biletFiyat=700*0.10;

        }else if (sehirSecim.equalsIgnoreCase("D")){
            biletFiyat=900*0.10;

        } else {
            System.out.println("Sehir secimini yanlis girdiniz");
        }
        double yasIndirim = 0;
        if (yasSecim<12) {
                yasIndirim =biletFiyat-(biletFiyat*0.5);
            System.out.println(yasIndirim);

        } else if (yasSecim>12 && yasSecim<24) {
            yasIndirim = biletFiyat-(biletFiyat*0.10);

        } else if (yasSecim>65) {
            yasIndirim = biletFiyat-(biletFiyat*0.3);

        } else if (yasSecim<24 && yasSecim<65) {
            yasIndirim=biletFiyat;

        }

        double ciftYon = 0;
        if (gidisDonus.equalsIgnoreCase("EVET")) {
            ciftYon= biletFiyat*2-(biletFiyat*0.2)*2;
            System.out.println("Çift yonlu indirimli bilet fiyatiniz  = "+ ciftYon);



        }



    }
}
