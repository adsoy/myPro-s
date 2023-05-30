package day05concatinationoperatortypecasting;

public class Operators {

    public static void main(String[] args) {
        /*
    1) +,-,*,/ islemleri java da metematikte kullanildigi gibi kullanilir.
    NOTE = int/int =int olur.
    NOTE = double =int = double olur.
    Cunku Javada matematiksel islemlerde farkli data typelari kullanirsa
     sonuc her zaman buyuk data type inda olur.
     2) Java da "logical operator" lar vardir AND ve OR islemleri "logical operator"laridir.
            i)  AND (&&) isleminde true alabilmek icin her sey true olmalidir.
            AND islemi "perfectionist" tir.
            AND isleminde bir tane bile false sonucu false yapar.

            ii)OR(||) isleminde bir tane bile true sonucu true yapmaya yeter.
            OR isleminde sonucun false olmasi icin hersey false olmalidir
            OR islemi "pollyanna" gibidir.

            iii) NOT operator (!) true olani false yapar, false olani true yapar.
            !true --> false
            !false --> true
            !!true --> true

        3) Comparison (Karsilastirma) Operators
        >,<, <=, >=, ==, !=

        NOTE: ne zamanki karsilasma operatorlarini kullandiginizda kesinlikle boolean (true) veya (false) alırsınız

        NOTE: Biz AND islemi icin && kullaniriz ama & kullanıda gecerlidir
              Farkları nedir?
              &&kullanimda ilk ifade false oldugunda digerlerini kontrol etme ihtiyaci duymaz. dolayisiyla hizli calisir.
              cunku and isleminde ilk ifade false ise digerlerinin ne oldugunun bir onemi yoktur sonuc false olur.
              &tek kullanimda ilk ifade ne olursa olsun digerlerini kontrol eder ve dolayısıyla yavas calismis olur
              bu yuzden biz hep && kullaniriz

     */
        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5>=19;

        System.out.println(first+ "  -   " + second  +" -  "+third);//true-false-false
        System.out.println(first && second);
        System.out.println(first || second || third);







































            }
}
