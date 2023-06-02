package encapsulation01;

public class C02_okulRunner {
    public static void main(String[] args) {
        C01_Okul okul=new C01_Okul();
        okul.setOkulIsmi("Özel Okul");
        okul.setMudur("Mustafa Topal");
        okul.setTamGunMu(true);
        //okul.setOgrenciSayisi(350);
        okul.setOgretmenSayisi(4);
        System.out.println(okul.isTamGunMu());
        System.out.println(okul.getOkulIsmi());
        System.out.println(okul.getMudur());
        // System.out.println(okul.getOgrenciSayisi());
        System.out.println(okul.getOgretmenSayisi());
        System.out.println(okul.getSinifSayi());
        System.out.println(okul.toString());

    }
}