package tasks;

public class Exercise_01 {
    public static void main(String[] args) {
        /*
        Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
            A A A A A
            A A A A A
            A A A A A
         */
        int rows = 3;
        int columns = 5;
        for (int i = 1; i <= rows; i++) {
            String s = "";
            for (Integer k = 1; k <= columns; k++) {
                s = s + "A ";
            }
            System.out.println(s);
        }
    }

}