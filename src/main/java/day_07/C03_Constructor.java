package day_07;

public class C03_Constructor {

    //Bu class da parametreli constructor olusturun.
    //Ve farkli class tan deger atamasi yapiniz

    String marka;

    String model;
    int yil;
    String yakit;

    public C03_Constructor() {
    }

    public C03_Constructor(String marka, String model, int yil, String yakit) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.yakit = yakit;

        //parametreli veya parametresiz herhangi bir constructor olsturuldugunda default constructor ölür

        //bir class a parametreli bir constructor eklendiginde default constructor a benzer parametresiz bir constructor eklenmeli


    }



}
