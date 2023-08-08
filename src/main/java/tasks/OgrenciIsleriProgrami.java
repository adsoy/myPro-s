package tasks;// Öğrenci İşleri Programı

import java.util.*;

public class OgrenciIsleriProgrami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan öğrenci bilgilerini al
        System.out.println("Lütfen öğrenci bilgilerini giriniz:");
        System.out.print("TC Kimlik Numarası: ");
        String tcKimlikNo = input.nextLine();
        System.out.print("Ad Soyad: ");
        String adSoyad = input.nextLine();
        System.out.print("Doğum Yeri: ");
        String dogumYeri = input.nextLine();
        System.out.print("Doğum Tarihi: ");
        String dogumTarihi = input.nextLine();

        // Random öğrenci numarası oluştur
        int ogrenciNo = (int)(Math.random() * 100000);

        // Öğrenci bilgilerini listele
        System.out.println("Öğrenci Bilgileri:");
        System.out.println("Öğrenci Numarası: " + ogrenciNo);
        System.out.println("TC Kimlik Numarası: " + tcKimlikNo);
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Doğum Yeri: " + dogumYeri);
        System.out.println("Doğum Tarihi: " + dogumTarihi);

        // Öğrenci bilgilerini arama yapılabilir hale getir
        Map<Integer, String> ogrenciBilgileri = new HashMap<>();
        ogrenciBilgileri.put(ogrenciNo, "TC Kimlik Numarası: " + tcKimlikNo + ", Ad Soyad: " + adSoyad + ", Doğum Yeri: " + dogumYeri + ", Doğum Tarihi: " + dogumTarihi);

        // Öğrenci bilgilerini aramak için numara gir
        System.out.print("Aramak için öğrenci numarasını giriniz: ");
        int ogrenciNoAra = input.nextInt();
        System.out.println("Öğrenci bilgileri: " + ogrenciBilgileri.get(ogrenciNoAra));
    }
}