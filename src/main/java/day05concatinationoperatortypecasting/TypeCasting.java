package day05concatinationoperatortypecasting;

public class TypeCasting {

    /*
    Numeric primitive data type larinin birbirine donusturulmesine "Type casting" denir.
    Numeric (sayisal) data type lar byte  - short  - int   -  long  -  float   - double
    */
    //Note 1: Kucuk data type lerini buyuk data type larina cevirmeyi otomatik olarak yapar
    //bu isleme "AutoWidening" denir.
    //Note 2: Buyuk data type larını küçük data type larina cevirmek riskli istir,
    // java bu riskli isi otomatik olarak yapmaz
    //bu islemi kod yazanalrdan bekler
    //bu isleme "ExplicitNarrowing" (Açıktan Daraltma) denir.

    public static void main(String[] args) {
        //byte data type ını int data type ına ceviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //int data type ını short data type ina ceviriniz
        int weight = 312;
        short weightShort = (short)weight;//ExplicitNarrowing


        //int data type ını float data type ına donusturun
        int population =27;
        System.out.println(population);

        float populationfloat = population;
        System.out.println(populationfloat);

        //double data type ını short data type ına çevirin

        double water = 35;

        short water2 = (short)water;











        //example
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte)num;
        System.out.println(numByte);//4

        //note: donusum yaptigimiz sayi (260) donuseceginiz data type ının sınırları dısında ise
        // java kullandıgınız sayı ile mod islemi yapar.
        // mod isleminin sonucu yazilir












    }
}
