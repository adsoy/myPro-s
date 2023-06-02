package day33exceptionsenumsiterator;

import java.util.concurrent.Callable;

public class EnumRunner {
    public static void main(String[] args) {

        //Enum daki bir sabite nasıl ulasabiliriz?
        Cities hatay=Cities.HATAY;
        System.out.println(hatay);//HATAY

        //Adana sabitinin ismine ulasalim
        String adanaCityName = Cities.ADANA.getCityName();
        System.out.println(adanaCityName);//Adana

        //İstanbul plaka koduna ulasalim
        int istPlateCode = Cities.İSTANBUL.getPlateCode();
        System.out.println(istPlateCode);//34

        //Ankara nın posta konudu yazdirin
        String ankPostalCode = Cities.ANKARA.getPostalCode();
        System.out.println(ankPostalCode);
    }



}
