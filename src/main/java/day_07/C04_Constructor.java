package day_07;

public class C04_Constructor {
    public static void main(String[] args) {
        //instance bir variable stat,c bir method da kullanmak icin mutlaka obje olusturmaliyiz.

        C02_Constructor obj1=new C02_Constructor();//buradaki defaul constructor
        //class ismi ayni zamanda objemizin data turudur.
        obj1.marka="Mercedes";
        obj1.model="C180";
        obj1.yil=2023;
        obj1.yakit="hybrid";

        System.out.println(obj1.marka);
        System.out.println(obj1.model);
        System.out.println(obj1.yil);
        System.out.println(obj1.yakit);

        C02_Constructor obj2=new C02_Constructor();
        obj2.marka="BMW";
        obj2.model="M3";
        obj2.yil=2021;
        obj2.yakit="diesel";

        System.out.println(obj2.marka);
        System.out.println(obj2.model);
        System.out.println(obj2.yil);
        System.out.println(obj2.yakit);


        //C03 e ait obje olsturma

        C03_Constructor obj3=new C03_Constructor("Bimoca","C44", 2023,"unleaded");

        System.out.println(obj3.marka);
        System.out.println(obj3.model);
        System.out.println(obj3.yil);
        System.out.println(obj3.yakit);


    }

}
