package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //Note: Java "pass by value" sayesinde variable larin orjinal degerlerin korur
        int shirtPrice = 100;

        //java methoda gonderirken orjinal degeri degil, kopyasini gonderir ve degisen deger kopya deger olur
        System.out.println(discount("student", shirtPrice));//90
        System.out.println(discount("veteran", shirtPrice));//80
        System.out.println(discount("senior", shirtPrice));//95

        //normalde indirim yaptik discount methodu ile ama buradaki deger hala orjinal
        System.out.println(shirtPrice);//100

        shirtPrice = discount("veteran", shirtPrice);
        System.out.println("shirtprice kampanya "+shirtPrice);


    }

    //Discount Methodunu olusturalim
    public static int discount(String type, int price) {
        switch (type) {
            case "student":
                price = price - 10;
                break;
            case "veteran":
                price = price - 20;
                break;
            case "senior":
                price = price - 5;
                break;
            default:
                price = price;
        }
        return price;
    }
/*
    Pass By Value:
    1) Java  "pass by value" kullanir
    2) Yani; java methodlarin orjinal degeri degistirmesine musaade etmez
    3) Java method lara deger yollarken orjinal degerin kopyasini olusturur. ve o kopyayi method a yollar
        Method kopya deger üzerinde degisiklik yapar, boylece orjinal deger korunmus olur
    4) java esnek bir dildir, istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz
    Bakiniz line 16

    Pass by Reference:
    1)Pass by Reference ta metdoa a reference yollanir
    2)Reference adres demektir. Adres yollanınca method adresi kullanarak orjinal degeri degistirir
    bu yuzden "C#" gibi Pass by Reference kulllanan dilelrde method variable in orjinal degerini degistirir.




 */

}