package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {

        Civic myCivic=new Civic();
        myCivic.cool();//Civic cools perfectly
        myCivic.run();//AC runs super
        myCivic.eco();//Uses gas less
        Engine.stop();

        Accord myAccord =new Accord();
        myAccord.cool();//Accord cools super
        myAccord.run();//Engine runs super

        System.out.println("AC Price  : " +Ac.price);
        System.out.println("Engine Price : "+Engine.price);
        System.out.println("Security Price  : "+Security.price);

    }
}
