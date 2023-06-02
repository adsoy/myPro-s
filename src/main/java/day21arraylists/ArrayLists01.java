package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {
        /*
1-  Ayni data typeindaki coklu datalari kullanmak icin kullanilir
2- Arraylerin negatif yonu var icine koyacagimiz eleman siyisini belirlemek gerekir.
3- Array eleman sayinda esnek degildirler bu yuzden ArrayList adli bir yapi olusturmus.
Bu yapi eleman sayisinda esnektir.Hic eleman koymazsaniz eleman sayisini 0 olarak ayarlar.
4- ArrayList yerine List de diyebilirsiniz.
5- Java Arraylistleri olusturduktan sonra Array leri iptal etmedi;
  a-Arrayler superfasttir.
  b-Arrayler memoryde cok az yer kaplar
  c-bu nedenle eleman sayisi belli olan datalai depolamak icin Arrayler tercih edilir.
6-Arrayler pirimitive data typelari ve referanslari depolayabilir.
Ama Arraylistler non-primitive data typelari depolar.Bu nedenle Arraylistler arraylerden daha cok yer kaplar.
   */

        //ArrayList nasil olusturulur?

        ArrayList<Integer> ages = new ArrayList<Integer>();

        //ArrayList console a nasıl yazdirilir?
        System.out.println(ages);

        //ArrayList lere eleman nasil eklenir?
        //Arraylist lere eleman eklemek icin add() methodunu kullaniriz
        //elemanlari sizin verdiginiz sirada "list"e ekler(insertion order)

        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(888);

        System.out.println(ages);//[9, 656, 12, 10, 888]

        //List e çoklu eleman nasil eklenir? veya List e baska bir list nasil eklenir?
        //Bir List e çoklu eleman eklemek icin o elemanlari bir list in içine koymalisiniz

        ArrayList<Integer> newAges= new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);//[8, 9, 10]

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 10, 888, 8, 9, 10]

        //Arraylist te eleman sayisi nasıl bulunur?
        //size() arraylist teki eleman sayisini verir

        int numOfElement = ages.size();
        System.out.println(numOfElement);//11

        //ArrayList te specific bir eleman nasıl alınır?
        //get() methodu index kullanarak istedigimiz elemani almaya yarar
        int elm1=ages.get(1);
        System.out.println(elm1);//656

        //ArrayList te specific bir elemani nasil degistirebiliriz
        ages.set(6,111);
        System.out.println(ages);

        ages.set(4,313);
        System.out.println(ages);

        //Bir List te tum elemanlari nasil silebiliriz?
        //ages.clear();
        //System.out.println(ages); //[]

        //ArrayList te specific bir elemanin var olup olmadigini nasil anlariz?
        boolean r= ages.contains(313);
        System.out.println(r);//true

        //Bir ArrayList in bos olup olmadigini nasıl kontrol ederiz
        //isEmpty() methodu ArrayList bos ise true degilse false return eder.
        boolean r2= ages.isEmpty();
        System.out.println(r2);

        //Ornek1:
        //size verilen bir list in bos olup olmadıgını kontrol eden kodu yaziniz.
        ArrayList<String> names = new ArrayList<>();
        names.add("Gulce");
        names.add("Seda");
        names.add("Benna");
        names.add("Rıdvan");
        names.add("Enes");

        //1. way:
        if (names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

        names.clear();

        //2. way Recommended-tavsiye edilir
        if (names.isEmpty()) {
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

     /*
        Bir method u ogrenirken asagidaki 3 seyi ogrenin
        1) o method ne is yapar?
        2) o method nasil kullanilir?
        3) o method size neyi verir?
         */

    }
}
