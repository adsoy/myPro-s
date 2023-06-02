package day_09.Arabalar.inheritance;

public class Parent {

    // Parent isminde bir class olusturunuz
    // Child class'ı, Parent2 class'a extends ediniz
    // Child class'da parametresiz, tek parametreli ve iki parametreli object olusturunuz.
    // super() constructor'u kullanarak Parent' den ekran cıktısı alınız

    protected Parent(){
        System.out.println("Parent class parametresiz constructor");
    }
    protected Parent (int a) {
        System.out.println("Parent class tek parametreli constructor");
    }

    protected Parent (int a, int b) {

        System.out.println("Parent class iki parametreli constructor");
    }
}
