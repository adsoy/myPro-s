package forLoop03;

public class C03_forLoop {
    public static void main(String[] args) {
        /*
        soru 3) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
        */
        int sayi = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + "X" + i + " = " + sayi * i);
        }

        //belirlenen sayinin 0'dan 10 a kadar sadece cift sayilarla carpimini yazdirin
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(sayi + "X" + i + " = " + sayi * i);
            }

        }
    }
}