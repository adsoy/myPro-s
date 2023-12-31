package day03methodobjectcreationscanner;

public class MethodCreation01 {

    public static void main(String[] args) {
        double kup = getCube(5);
        System.out.println("kup = " + kup);

        print("Java is easy");

        //method olusturmak icin ikinci yol
        //Ornek 2 ikinci yol: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
        //main method icinde iken method ta kullanilacak olan variable lari olusturunuz
        String str ="TechproEdu";
        //method ismi ve parametreleri yazariz
        //kirmizi kismin uzerinde bekleyip create method a tiklariz intellij otomatik olarak bir method olusturur
        //daha sonra kendi istegimize gore dizayn ederiz.
        printConsole(str);

        //Ornek 3: Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz.
        int a=3;
        int b=5;
        carpmaYap(a,b);

        //Ornek 4: Verilen bir tamsayinin karesini hesaplayip console a yazdiran methodu olusturup kullaniniz.
        int sayi =5;
        karesiniAl(sayi);




    }

    private static void karesiniAl(int sayi) {
        System.out.println(sayi*sayi);
    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    public static void printConsole(String str) {
        System.out.println(str);
    }

    //Ornek 1: Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz.
    static double getCube(double a) {
        return a * a * a;
    }
    //Note: Access modifier i default yapmak isterseniz access modifier i YAZMAYINIZ..

    //Ornek 2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void print(String str){
        System.out.println(str);
    }
    //Eger bir method yeni bir data uretmiyor ise return type i void olur
    //methodun return type i void ise method body icinde return keywordu yazilmaz.

/*
1)Cemberin cevresini hesaplayan methodu olusturun ve kullaniniz
2)Dairenin alanini hesaplayan methodu olusturun ve kullaniniz
 */


    public static class Car {

        //Variable'lar olusturalim

        public String model = "Tesla";
        public int fiyat = 20000;

        //Method lari olusturalim
        //return type void oldugunda method içinde return keyword u kullanilmaz
        public void hareket(){
            System.out.println("Tesla cok hizli hareket eder..");
        }
        public void dur(){
            System.out.println("Cok guvenli bir sekilde durur..");

        }
                ;

    }
}