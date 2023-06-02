package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);


        //Reverse method
        sb1.reverse();//String in cevrilmesi looplar ile yapılir bu kisa yoldur.
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);
        System.out.println(sb1);//ysae s avaJ

        sb1.delete(4,7);//baslangic indeksi dahil bitis indeksine kadar (haric) karakterleri siler
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(5,6,"000");
        System.out.println(sb1);//ysaea000aJ

        sb1.insert(3,"XXX");
        System.out.println(sb1);//ysaXXXea000aJ

        StringBuilder sb2= new StringBuilder("Java");
        StringBuilder sb3= new StringBuilder("Lava");

        //sonuc 0 ise alfabetik olarak ayni siradalar demektir.
        //sonuc -1 ise sb2 sb3 ten alfabetik olarak bir önde demektir.
        //sonuc +1 ise sb2 sb3 ten alfabetik olarak bir sonda demektir.

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);

        //StringBuilder nasil string e cevrilir?
        String str = sb2.toString().toUpperCase();
        System.out.println(str);//JAVA

        //String  nasil StringBuilder a cevrilir?
        StringBuilder newSb2= new StringBuilder(str);
        System.out.println(newSb2);











    }
}
