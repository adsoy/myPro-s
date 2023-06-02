package day_09.Arabalar;

public class Opel extends Araba{

    String hiz="Opel arabalar max 220km hiz yapar.";

    String marka="Opel";

    String sirketMerkezi="Almanya";

    //parent class taki motor methodunu override yaptik.
    //yani opel class i icin motor methodunu guncelledik.
    @Override
    protected void motor() {
        super.motor();
        System.out.println("Opel arabalar Opel marka motor kullanir");
    }

    protected void garanti(){
        System.out.println("Opel arabaların 2 yil garanti suresi vardir");
    }

}
