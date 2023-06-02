package tasks;

import java.util.Scanner;

public class yolcubiletuygulama {
    /*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/
    public static void main(String[] args) {
        String[] sehir = {"BKENT", "CKENT", "DKENT"};
        Scanner input = new Scanner(System.in);
        double tarifeKm = 0.10;
        double sonuc = 0;
        double mesafe = 0;
        int bKent = 500;
        int cKent = 700;
        int dKent = 900;
        System.out.println("Lütfen aşağıdaki şehirlerden birini seçin:");
        System.out.println("1. BKENT");
        System.out.println("2. CKENT");
        System.out.println("3. DKENT");


        int secim = input.nextInt();
        switch (secim) {
            case 1:
                sonuc = bKent - (bKent * 0.10);
                System.out.println("BKENT İndirimsiz Ücretiniz = " + sonuc);
                break;
            case 2:
                sonuc = cKent - (cKent * 0.10);
                System.out.println("CKENT için İndirimsiz Ücretiniz = " + sonuc);
                break;
            case 3:
                sonuc = dKent - (dKent * 0.10);
                System.out.println("DKENT için İndirimsiz Ücretiniz = " + sonuc);
                break;
            default:
                System.out.println("Geçersiz seçim!");
                break;
        }
        input.nextLine();
        System.out.println("Gidiş-Dönüş ise evet tek-yön ise hayır olarak cevap veriniz : ");
        String gidisDonus = input.nextLine();
        boolean evetGidisDonus = gidisDonus.equalsIgnoreCase("evet");
        if (evetGidisDonus) {
            System.out.println("Gidiş-Dönüş %20 indirim kazandınız...");
            sonuc -= sonuc * 0.20;
            System.out.println("Gidiş dönüş indirimi" + sonuc);
        } else {
            System.out.println("Tek yön için indirim bulunmamaktadır...");
        }
        System.out.println("Lütfen Yaşınızı Giriniz");
        int yas = input.nextInt();
        if (yas < 13) {
            System.out.println("%50 indirim kazandınız");
            sonuc -= sonuc * 0.50;
        }
        else if (yas < 25) {
            System.out.println("%10 indirim kazandınız");
            sonuc -= sonuc * 0.10;
        }
        else if (yas > 64) {
            System.out.println("%30 indirim kazandınız");
            sonuc -= sonuc * 0.30;
        }
        else if (yas > 24 && yas < 65) {
            System.out.println("Yas indiriminiz bulunmamaktadır");
            sonuc = sonuc * 1;
        }
        System.out.println("Hesaplamaya geçildi...");
        System.out.println("kazanılan indirimler uygulandı.. :)  ");
        System.out.println("Ödemeniz gereken tutar: " + sonuc + "$ iyi yolculuklar dileriz");
    }
}