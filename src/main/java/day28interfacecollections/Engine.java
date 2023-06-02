package day28interfacecollections;

public interface Engine {

    void run();

    int price=5000;

    default void eco(){
        System.out.println("Uses gas less");
        }
    static void stop(){
        System.out.println("Stops securely");
    }


}
