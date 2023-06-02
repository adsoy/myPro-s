package day_09.Arabalar;

public class Araba {
    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.
    //Tum arabalar icin ortak olan ozellikleri variable olarak tanimlayalim.


    protected String hareket="Arabalar teker ile hareket eder";

    protected String hiz="Arabalar motor gucune gore hareket eder";

    protected String yakit="Arabalar farkli yakitla kullanilabilir";

    protected String marka="Arabalar uretildikleri markaya sahiptir";

    //tum aranalar icin ortak olan ozellikleri method olarak tanimlayalim
    protected void motor(){
        System.out.println("Arabalar farkli markalardan motor kullanir");
    }

    protected void yakitTuketimi () {
        System.out.println("Arabalar motor gucu ve yakit turune gore yakıt tuketirler.");
    }



}
