package forLoop03;

public class C01_forLoop {
    public static void main(String[] args) {
        /*
        Soru 1) Ekrana 10 kez "Java guzeldir" yazdirin
        */
        String str = "Java guzeldir";
        int i = 100;

        for (i = 1; i <= 10; i = i + 1) {
            //baslangic  //kosul    //artis sekli
            System.out.println(str);
            System.out.println(i);

        }

    }
}