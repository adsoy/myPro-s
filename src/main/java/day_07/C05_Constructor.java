package day_07;

public class C05_Constructor {
    //isim ve yas 2 tane instance variable olusturalım ve deger atamasi yapalim.


    String isim = "Adnan";
    int yas= 45;

    //parametreli ve parametresiz constructor olusturalım

    public C05_Constructor() {//parametresiz
    }

    public C05_Constructor(String isim, int yas) {//parametreli
        this.isim = isim;
        this.yas = yas;
    }

    public static void main(String[] args) {
        C05_Constructor obj1 =new C05_Constructor();
        System.out.println(obj1.isim);
        System.out.println(obj1.yas);

        obj1.isim="Ali";
        System.out.println(obj1.isim);

        obj1.yas=34;
        System.out.println(obj1.yas);

        C05_Constructor obj2=new C05_Constructor("Sami",56);
        System.out.println(obj2.isim);
        System.out.println(obj2.yas);

    }
}
