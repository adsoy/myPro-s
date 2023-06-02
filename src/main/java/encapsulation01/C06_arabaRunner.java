package encapsulation01;

public class C06_arabaRunner {
    public static void main(String[] args) {
        C05_Araba araba=new C05_Araba();
        araba.setModel("S90");
        araba.setUretimYili(2019);
        araba.setYakitTuru("Dizel");
        System.out.println(araba.toString());


    }
}