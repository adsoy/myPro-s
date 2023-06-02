package day25inheritance;

public class Honda extends Car {
    public Honda (){
        System.out.println("Honda 1");
        System.out.println(this.km);
        System.out.println(this.model);
        System.out.println(super.km);
        System.out.println(super.model);
    }
    public Honda(String model, int year) {
        super("Accord");//super i parametresiz kullanacaksaniz yazmaya da bilirsiniz
        System.out.println("Honda 2");
    }

    public String model= "Civic";
    public int km= 10000;

}