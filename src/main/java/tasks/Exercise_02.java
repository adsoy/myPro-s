package tasks;

public class Exercise_02 {
    public static void main(String[] args) {
/*
    Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A
A A
A A A
A A A A
     */
        int sutun = 4;
        for (Integer i = 1; i <= sutun; i++) {
            String s = "";
            for (Integer k = 1; k <= i; k++) {
                s = s + "A ";
            }
            System.out.println(s);
        }
    }
}


