package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlık zamanı nasıl alırız?

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//21:02:27.628852200

        //Anlık zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        int nano = myCurrentTime.getNano();
        System.out.println(nano);

        //Gelecek ve gecmise nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        /*
        Datetime class ta kullanilan tarih saat formatlari
        HH: mm ---> 24 lu saat sistemi
        hh: mm ---> 12 li saat sistemi
        hh: mm a ---> 12 li saat sistemi AM/PM gosterilir
        HH: mm: ss ---> 24 lu saat sistemi
        HH: MM ---> Yanlis format ---> MM months icin kullanilir.
        "mm" mimutes demektir
        "MM" months demektir.

        dd-MM-yyyy ---> gün, ay ve yil
        MMM ---> Aug, Mar, Feb
        MMMM ---> August
         */
        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("HH : mm");

        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date formati nasil degistirilir?
        LocalDate myDate = LocalDate.of(2023,8,13);
        System.out.println(myDate);//2023-08-13

        //Tarihi AY/Gun/YIl sekline cevirin
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedMyDate = dtf2.format(myDate);
        System.out.println(formattedMyDate);

        //Tarihi Gun/AY isminin ilk 3 harfi /YIl sekline cevirin 25/Aug/22
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-MMM-yy");
        String formattedMyDate1 = dtf3.format(myDate);
        System.out.println(formattedMyDate1);//13-Ağu-23


        //Tarihi Gun/AY isminin tamamı /YIl sekline cevirin
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String formattedMyDate2 = dtf4.format(myDate);
        System.out.println(formattedMyDate2);//13-Ağustos-2023


        //Baska bir zaman dilimindeki tarih ve zamanı nasıl alabiliriz?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdam'da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        //Amsterdam'da  saat kac?
        LocalTime timeInAms = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAms);

        //Berlin de   saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);

    }
}
