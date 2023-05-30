package day07stringmanipulations;

public class StringManipulations03 {

    public static void main(String[] args) {
        //Ornek 1: Bir string in bas ve sonunda space characteri varsa siliniz
        //"   Ali Can   " --->    "Ali Can" a donusecek

        String s = "   Ali Can   ";
        System.out.println(s);//     Ali Can


        //trim() methodu bir string in bas ve sonundaki space characterlerini siler.
        //aradaki space lere dokunmaz

        String sTrimmed = s.trim();
        System.out.println(sTrimmed);//Ali Can


        //Ornek 2: asagidaki fiyatlari verilen toplam fiyatini bulunuz
        //String tv = "$456.99"; String laptop "$875.99" ---> 456.99+875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        String tv2 = tv.replaceAll("[$]", "");
        System.out.println(tv2);

        String laptop2 = laptop.replaceAll("[$]", "");
        System.out.println(laptop2);

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);

        //Ornek 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdirin
        //"      Ali Can   " --> AC
        String name = "      ali cAN   ";
        //split() methodu bir stringi istedigimiz yerden parcalamaya yarar
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);

        System.out.println(""+first+last);







    }
}
