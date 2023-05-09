package day02datatypesmethodcreation;

public class Variables01 {
    public static void main(String[] args) {
        //Ornek 1: Sehir ismi icin bir variable olusturun ve once 'Ankara' sonra da 'Izmir' atayip ekrana yazdirin

        String cityName = "Ankara";
        System.out.println(cityName);
        cityName = "Izmir";

        System.out.println(cityName);

        //Ornek 2: Sehir plaka kodu icin bir variable olusturun oce 06 sonra da 35 degeri atayip ekrana yazdirin
        byte plakaKodu = 06;
        System.out.println(plakaKodu);
        plakaKodu = 35;
        System.out.println(plakaKodu);

        //Ornek 3: Basarili mi sorusu icin bir variable olusturun ve once false sonra da true degeri atayın akrana yazdirin

        boolean basarilimi = false;
                basarilimi= true;
        System.out.println(basarilimi);

        boolean isSuccessful = false;
        isSuccessful = true;
        System.out.println(isSuccessful);


    }
}
