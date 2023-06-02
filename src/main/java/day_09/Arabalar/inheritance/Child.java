package day_09.Arabalar.inheritance;

public class Child extends Parent {

    // Child class'da parametresiz, tek parametreli ve iki parametreli object olusturunuz.
    // super() constructor'u kullanarak Parent' den ekran cıktısı alınız

    //Bu class tan tek parametreli iki parametreli ve parametresiz obje olusturmak icin
    //tek parametreli iki parametreli ve parametresiz construcyor olmasi gerekiyor

    protected Child(){
        //parametresiz constructor
        //super();--> child olan her class ta bile bu gorunmese de bu ifade vardir.
        //bu ifade parent class taki constructor a parametresiz constructor a isaret eder.
        System.out.println("Child class parametresiz constructor");
    }

    protected Child(int a){
        super(7);
        System.out.println("Child class tek parametreli constructor");
    }

    protected Child(int a, int b){
        super(3,7);//super ifadess ilk kod satirinda olmalı
        System.out.println("Child class iki parametreli constructor");
    }
    //parent taki cons ile ilgili ifade gecmiyorsa default olarak super() yani parent class parametresiz cons. calisir.
    public static void main(String[] args) {
       Child obj1=new Child();
       Child obj2=new Child(1);
       Child obj3=new Child(2,5);

    }


}
