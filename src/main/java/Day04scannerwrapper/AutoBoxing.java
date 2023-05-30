package Day04scannerwrapper;

public class AutoBoxing {
    public static void main(String[] args) {
        //Ornek 3: Primitive int i Wrapper Integer a çeviriniz (AutoBoxing)
        int num = 19;
        Integer wrapperNum = num;


        //Ornek 4: Wrapper Byte i pirimitive byte a ceviriniz(Unboxing)
        Byte k = 19;
        int primitiveK = k;

        //Ornek 5: Primitive char i Wrapper Character e ceviriniz.
        char a = 9;
        Character Karakter = a;

        //Ornek 6: Wrapper boolean ı primitive boolean a cevirin
        Boolean isMan = true;
        boolean isManw = isMan;

        Boolean isOldWrapper = true;
        boolean isOld = isOldWrapper;
    }
}
