package day31mapsexceptions;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        //HashMap arkasında çalışan mekanizma nasıl
        HashMap<String, String> capitals =new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.get("USA");

        capitals.put("Italy", "Roma");
        capitals.put("Turkiye", "Ankara");
        capitals.get("Turkiye");

        capitals.put("Italy", "Firenze");
        System.out.println(capitals.hashCode());


    }

}
