package day_07;

public class C07_Varargs {

    // parametre olarak bir int
    // ve istediginiz kadar String alan bir method olusturun,
    // en uzun String'in harf sayisi ile int parametre degerini carpıp
    // sonucu yazdırınız.

    public static void main(String[] args) {

        int sayi=5;
        String str1="Zulal";
        String str2="Zeyneb";
        String str3="Can";

        carpim(sayi,str1,str3,str2);
    }
    public static void carpim(int a, String... str) {//eger tekli data ve varargs bir arada kullanacaksak
                                                        //varargs ifadesini en sona yazmaliyiz
        String enUzunKelime="";
        for (String each: str) {
            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;

            }

        }
        System.out.println(enUzunKelime.length() * a);

    }
}
