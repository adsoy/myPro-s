package datetime01;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02 {
    public static void main(String[] args) {
        LocalTime saat =LocalTime.now();
        System.out.println(saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getSecond() = " + saat.getSecond());

        System.out.println("saat.plusSeconds(10000) = " + saat.plusSeconds(10000));

        System.out.println("saat.withHour(15) = " + saat.withHour(15));

    }
}
