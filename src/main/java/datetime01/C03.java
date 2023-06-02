package datetime01;

import java.time.LocalDateTime;

public class C03 {
    public static void main(String[] args) {
        LocalDateTime bugun=LocalDateTime.now();
        System.out.println(bugun);

        System.out.println("bugun.plusMonths(3).plusHours(100) = " + bugun.plusMonths(3).plusHours(100));

        System.out.println(bugun.toLocalDate());
        System.out.println(bugun.toLocalTime());
    }
}
