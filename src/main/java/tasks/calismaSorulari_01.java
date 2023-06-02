package tasks;

import java.util.Scanner;

public class calismaSorulari_01 {
    public static void main(String[] args) {
        //kullanıcıdan bir string alin
        //bu stringde kaç harf,kaç rakam,kaç harf ve rakam disi karakter var bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.println("bir seyler giriniz");
        String str= scan.nextLine().toLowerCase();
        int harfsayi=0;
        int rakamsayi=0;
        int diger=0;
        int k=0;

        do{if(str.length()==0){
            System.out.println("string giriniz");
        }
        else if(str.charAt(k)>='a'&&str.charAt(k)<='z'){
            harfsayi++;
        }else if(str.charAt(k)<='9'&&str.charAt(k)>='1'){
            rakamsayi++;
        }else {
            diger++;
        }

            k++;
        }while (k<str.length());
        System.out.println("harfsayi = " + harfsayi);
        System.out.println("rakamsayi = " + rakamsayi);
        System.out.println("diger = " + diger);


        scan.close();

    }
}