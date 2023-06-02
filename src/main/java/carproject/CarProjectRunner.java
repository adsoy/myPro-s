package carproject;

public class CarProjectRunner {
    public static void main(String[] args) {

        CarProject car1=new CarProject("TOYOTA Yaris","blau",1000,2020);
        CarProject car2=new CarProject("FORD Fiesta","schwarz",1800,2022);
        CarProject car3=new CarProject();

        car3.setModel("KIA Ceed");
        car3.setMotor(1500);
        car3.setYil(2019);
        car3.setRenk("green");

        System.out.println("1st Car = " + car1);
        System.out.println("2nd Car = " + car2);
        System.out.println("3rd Car = " + car3);



    }
}

