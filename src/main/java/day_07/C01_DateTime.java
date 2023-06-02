package day_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C01_DateTime {
    public static void main(String[] args) {
        /*
        1-Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        2-Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        3-Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        4-Ali'nin dogum tarihini 23/6/15 formatına benzer bir formatta yazdırın
        5-Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */

        //1
        LocalDate dogAli=LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);


        //2
        LocalDate dogVeli=LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);

        //3
        System.out.println("Ali'nin Doğum Tarihi  :"+dogAli);
        System.out.println("Veli'nin Doğum Tarihi  :"+dogVeli);

        //4
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/M/dd");
        System.out.println(dtf.format(dogAli));

        //5
        if (dogAli.equals(dogVeli)){
            System.out.println("Ali ve Veli aynı tarihlerde doğmuşlardır");
        } else  {
            System.out.println("Ali ve Veli aynı tarihlerde doğmamışlardır");
        }


    }

}
