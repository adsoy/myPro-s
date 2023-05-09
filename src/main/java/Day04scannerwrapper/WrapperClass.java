package Day04scannerwrapper;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive    : char,        boolean,    byte,   short,    int,      long,    float,      double
        //Wrapper Class: Character    Boolean     Byte    Short     Integer   Long     Float       Double

        //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplar.
        //o yuzden sart degilse wrapper class kullanmayi tercih etmeyiz.
        //n yazip nokta koydugunuzda hic method goremezsiniz. cunku primitive ler hic method icermez.
        int n = 12;

        //m yazip nokta koydugunuzda nir cok method gorursunuz. cunku wrapper class lar method icerir
        Integer m=12;


        byte p = 23;

        Byte r = 23;

        //Ornek 1: short data type ını minimum ve maximum degerlerini kod yazarak bulunuz.

        short maxShort = Short.MAX_VALUE ;
        short minShort = Short.MIN_VALUE;
        System.out.println("maxShort = " + maxShort);
        System.out.println("minShort = " + minShort);



    }
}
