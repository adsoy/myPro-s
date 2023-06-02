package day_06;

public class C06_Scope {

    /*
        Scope kapsam anlamina gelir.
        Bir variable ın nerede gecerli oldugunu bildirir.
        4 cesit scope vardir.
        1-static variable lar=class variable lari
        2-instance variable lar=object variable lar
        --->static ve instance variable lar class level da olusturulur
        3-local variable lar=methodlarin icinde olusturulan variable lar ve methodun icinde gecerli olur
        4-loop variable lar=loop un icinde olusturulan variable lar ve ve loop un icinde gecerli olur
         */
   static int staticSayi;//static variable--> deger atamasi yapmadigimiz zaman java bunlara otomatik default degerler atar
   int instanceSayi;//instance variable--> deger atamasi yapmadigimiz zaman java bunlara otomatik default degerler atar


    public static void main(String[] args) {
        int localSayi=0;//local variable -->java bunlara otomatik default degerler atamaz(deger atamasi yapmadan kullanilamaz)

        for (int i = 0; i < i ; i++) {
            System.out.println(i);//buradaki i loop variable dır.

        }
        System.out.println(staticSayi);//
        //System.out.println(instanceSayi);---> instance variable static method da direkt kullanilamaz
        //kullanabilmek icin object olusturmamiz gerekir
        C06_Scope obj=new C06_Scope();
        System.out.println(obj.instanceSayi);



    }
}
