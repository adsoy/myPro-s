package day_09.Arabalar;

public class Corsa extends Opel{

    //Corsa modeline ait spesifik özellikler bu classta tanımlayalım
    //daha sonra bu classta main method içinde objeler olusturalım

    String hiz="Corsa max 200km hiz yapar";

    String yakit="Corsa benzinli veya elektriklidir";

    String model="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanır");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakit tuketir");
    }
    protected void vitesSayisi(){
        System.out.println("Corsa 5 viteslidir");
    }

    //corsa classında obje olusturalım

    public static void main(String[] args) {
        //bir tane corsa objesi olusturalım
        //static bir methoddan instance datalara ulasmak için obje olusturum

        Corsa arb1=new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket);//Araba classından
        System.out.println("arb1.hiz = " + arb1.hiz);//Corsa
        System.out.println("arb1.yakit = " + arb1.yakit);//corsa
        System.out.println("arb1.marka = " + arb1.marka);//opel
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);//opel
        System.out.println("arb1.model = " + arb1.model);//corsa
        arb1.motor();//corsa

        System.out.println("________________________________________________________");
        //bir tane opel araba olusturalim
        //bir opel objesi olusturaLlim
        Opel arb2=new Corsa();
        //data turunu parent, constructor child olacak sekilde olusturulabilr.
        System.out.println("arb2.hareket = " + arb2.hareket);//araba
        System.out.println("arb2.hiz = " + arb2.hiz);//opel
        System.out.println("arb2.marka = " + arb2.marka);
        System.out.println("arb2.yakit = " + arb2.yakit);
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);

        //arb2.model ---> CTE verir.
        System.out.println("_______________________________________");


        arb2.motor();
        /*
        Inheritance da variable;
        Aramaya data turu neyse oradan baslar. Yoksa parent a bakar ve ilk buldugu yerden alir.
         */

        /*
        Inheritance methodlar;
        Aramaya data turunden baslar.
        Yoksa parent a bakar.
        Ilk buldugu yerden almaz.
        constructor ın oldugu class a kadar override edilmis mi diye bakar
         */

        //arama ıslemi her zaman asagidan yukari dogru olur
        //override edilmis mi diye yukaridan asagi dogru bakilir.

        arb2.garanti();//opel
        arb2.yakitTuketimi();//corsa

        System.out.println("____________________________________________________");
        //arb2.vitesSayisi ---> CTE

        Araba arb3=new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket);
        System.out.println("arb3.hiz = " + arb3.hiz);
        System.out.println("arb3.yakit = " + arb3.yakit);
        System.out.println("arb3.marka = " + arb3.marka);

        arb3.yakitTuketimi();//corsa
        arb3.motor();//corsa


        //arb3.garanti ---> CTE
        //arb3.vitesSayisi ---> CTE

        System.out.println("__________________________________________________");
        Araba arb4=new Opel();
        arb4.motor();//opel
        //overridnig edilirken sonstructorın oldugu class a kadar bakilir

        Araba obj1=new Araba();// method icin:override edilmis mi diye control etmeme gerek yok
        Araba obj2=new Opel();//methodu once araba da bulmam lazim sonra opel e kadar override edilmis mi diye bakmaliyim.
        Araba obj3=new Corsa();//methodu once araba da bulmam lazim sonra corsa ya kadar override edilmis mi diye bakmaliyim.

        Opel obj4=new Opel();
        Opel obj5=new Corsa();

        Corsa obj6=new Corsa();

    }
}