package tasks;

import java.util.*;

public class kutuphane {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        - Bir kütüphane yönetimi uygulaması geliştiriyorsunuz.
        - Kullanıcılar, kütüphaneye yeni kitap ekleyebilmeli, kitapları sıralayabilmeli ve
        - kitapları kütüphaneden silebilmelidir.
        - Ayrıca, kullanıcılara kütüphaneyi tamamen sıfırlama seçeneği de sunmanız isteniyor.
        */

        List<String> kitapListesi = new ArrayList<>();

        kitapListesi.add("Suç ve Ceza");
        kitapListesi.add("Su çılgın türkler");
        kitapListesi.add("şeker portakalı");
        kitapListesi.add("Vadideki Zambak");

        System.out.println("Merhaba! Kütüphaneye Hoşgeldinizz.");

        System.out.println("Mevcut kitaplar");
        System.out.println(kitapListesi);

        String abc="";


        kitapEkle(kitapListesi);

        kitapEkle(kitapListesi);

        kitapSirala(kitapListesi);

        kitapsilme(kitapListesi);

        kitapsifirla(kitapListesi);

        System.out.println(kitapListesi);



    }

    public static void kitapsifirla(List<String> listesifirla) {
        System.out.println("Sifirlamak istiyor musunuz? ---> 1 evet  ---->2 ");
        String tus=scan.nextLine();
        if(tus.equals("1")){
            listesifirla.clear();
            System.out.println("Listeniz tamamen silindi");
        } else  {
            System.out.println("İptal edildi...");

                    }

    }

    public static void kitapsilme(List<String> kitapSilme) {
        System.out.println("Silmek İstediginiz Kitap?....:");
        System.out.println(kitapSilme);
        String silinenKitap=scan.nextLine();
        kitapSilme.remove(silinenKitap);


    }

    public static void kitapSirala(List<String> kitapSiralama) {

        System.out.println("Kitaplari nasil siralamak istersiniz ? 1 Sistem Sıralaması 2 Son Eklenene göre sıralama");

        String tus = scan.nextLine();

        if (tus.equals("1")){
            Collections.sort(kitapSiralama);
            System.out.println("Sistem Siralamasi");
            System.out.println(kitapSiralama);
        }   else if (tus.equals("2")){
            System.out.println("Son eklenene göre siralama");
            System.out.println(kitapSiralama);
        } else {
            System.out.println("Hatalı Tuşlama");
        }


    }

    public static void kitapEkle(List<String> kitapEkle) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Eklemek istediğiniz kitabın ismi ?");

        String kitap = scan.nextLine();

        kitapEkle.add(kitap);

        System.out.println("Kitap başarıyla eklendi.");

        System.out.println(kitapEkle);

    }

}