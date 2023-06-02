package datetime01;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        Scanner scan =new Scanner(System.in);
        System.out.println("Doğum tarihinizi giriniz");

        int yil= scan.nextInt();
        int ay= scan.nextInt();
        int gun= scan.nextInt();


        LocalDate dogumTarihi=LocalDate.of(yil, ay, gun);
        System.out.println(Period.between(bugun,dogumTarihi));

    }
}
