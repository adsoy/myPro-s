package forLoop03;

public class C04_forLoop {
    public static void main(String[] args) {
        /*
        Soru 4) 100'den baslayarak 50'ye (dahil) kadar olan sayilari
        aralarinda virgul olarak ayni satirda yazdirin
        */
        int bas = 100;
        int son = 50;

        for (int i = bas; i >= son; i--) {
            System.out.print(i + ",");

        }
    }
}