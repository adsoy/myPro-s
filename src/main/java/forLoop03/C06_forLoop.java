package forLoop03;

public class C06_forLoop {
    public static void main(String[] args) {
        /*
        Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        */
        String str="Java bugun cok guzeldi";
        char bosChar;
        //String bosStr;
        //System.out.println(str.indexOf("a"));
        //System.out.println(str.lastIndexOf("a"));
        for (int i = 0; i <str.length(); i++) {
            bosChar=str.charAt(i);
            //bosStr=str.substring(i,i+1);
            if (str.indexOf(bosChar)==str.lastIndexOf(bosChar)){
                System.out.print(bosChar+" ");
            }
        }

    }
}