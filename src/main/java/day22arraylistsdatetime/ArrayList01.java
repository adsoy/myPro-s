package day22arraylistsdatetime;

import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        //Ornek 1: Bir listteki tekrarsız elemanları console a yazdıran kodu yazınız.

        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for (double w : prices) {
            if (prices.indexOf(w) == prices.lastIndexOf(w)) {
                System.out.println(w);

            }
        }

        //Ornek 2: Bir listteki tekrarli eleman olup olmadigini bulan kodu yaziniz

        List<Integer> heights = List.of(3, 13, 3);
        int counter = 0;

        for (Integer q : heights) {
            if (heights.indexOf(q) != prices.lastIndexOf(q)) {
                System.out.println(q);
                counter++;
                break;

                            }
        }
        if(counter==0) {
            System.out.println("All elements are unique in the list");
        } else{
            System.out.println("At least one element is not unique");
        }
    }

}
