package day32exceptions;

public class E03 {

    public static void main(String[] args) {

        //throw keyword bir methodun body si icinde istedigimiz yerde istedigimiz kosullar icin
        // istedigimiz kosullar icin istedigimiz kadar exception atamamizi saglar
        //Exception class constructor icine istediginiz mesajı yazabilirsiniz.


        try {
            printAge(-63);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

    }

    public static  void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else {
            System.out.println(age);
        }




    }

}