package day29collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {
        Queue<String> line =new PriorityQueue<>();
        line.add("Egg");
        line.add("Milk");
        line.add("Cheese");
        line.add("Meat");
        System.out.println(line);//[Cheese, Meat, Egg, Milk]

       /*
        "Queue" bir interface dir bu yüzden constructo u yoktur. Dolayisiyla object olustururken
        new Keywordunden sonra "Queue" yazamayiz. Data Type i  "Queue" olan bir object olusturmak icin
        new Keywordunden sonra
        1)LinkedList  veya
        2)PriorityQueue classlari kullanilabilir
        "Queue" olustururken constructor olarak "PriorityQueue" kullanirsaniz elemanlari kendi belirleyeceginiz kurala göre siralama hakkiniz olur.
         */

        //Deque ---> double ended queue(iki uclu queue)
        //Deque daki add(), get(), peek(), poll()... methodlari first-last iki uclu sekilde seklinde sunulur.

        Deque<String> d=new LinkedList<>();
        d.add("Egg");
        d.add("Milk");
        d.add("Cheese");
        d.add("Meat");

        System.out.println(d);//[Egg, Milk, Cheese, Meat]


    }
}
