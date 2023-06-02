package datetime01;

import java.time.LocalDate;

public class C01 {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        System.out.println(bugun);//2023-07-04

        System.out.println(bugun.getDayOfYear());//185

        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());//TUESDAY

        System.out.println("Yılın bitmesine kaç gün var = " + (365 - bugun.getDayOfYear()));

        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(6));
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(6).getDayOfMonth());//10

        LocalDate tarih=LocalDate.of(2025,6,25);
        System.out.println("tarih.isBefore(bugun) = " + tarih.isBefore(bugun));

        if (tarih.isBefore(bugun)){
            System.out.println(tarih);
        } else if (tarih.isAfter(bugun)) {
            System.out.println(bugun);

        }else System.out.println("İki tarih birbirine eşit  :"+tarih);
    }
}
