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

        //Ornek 2: int data type ını minimum degeri ile byte data type ının maximum degerleri ile toplamini bulunuz

        int minInt = Integer.MIN_VALUE;
        int maxInt = Byte.MAX_VALUE;

        System.out.println("Toplam  :" + minInt+maxInt);//-2147483521


        //Ornek 3: Primitive int i Wrapper Integer a çeviriniz (AutoBoxing)
        int num = 19;
        Integer wrapperNum = num;


        //Ornek 4: Wrapper Byte i pirimitive byte a ceviriniz(Unboxing)
        Byte k = 19;
        int primitiveK = k;

        //Ornek 5: Primitive char i Wrapper Character e ceviriniz.
        char a = 77;
        Character Karakter = a;

        //Ornek 6: Wrapper boolean ı primitive boolean a cevirin
        Boolean isMan = true;
        boolean isManw = isMan;

        Boolean isOldWrapper = true;
        boolean isOld = isOldWrapper;













    }
}
