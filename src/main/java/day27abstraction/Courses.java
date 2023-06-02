package day27abstraction;

public abstract class Courses {
    //Abstraction
    public abstract void math();
    public void art(){
        System.out.println("Learn art");
    }


    /*
    1)Eger bir classtan object olusturulmasini istemiyorsak ve bu classi sadece
    child classlarin yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak
    "Abstraction" yapariz.
    2)Bazen parent class daki methodun bodysi hicbir child class tarafindan kullanilmaz.
    Bu durumda parenttaki methoda body yazmak hic kullanilmadigi icin mantikli degildir
    Bizde yazmayiz
    3)Body si yazilmayan method Abstract Mehod denir. Abstract ingilizcede vucutsut yada soyut demektir
    4)Methodun body sini yazmayinca java bize hata verir, bizde abstract keywordunu kullanarak
    javaya bu methodun bodyis olmayacak deriz
    5)abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz
    o yuzden classi da abtstract yapmaliyiz
    6) Parent taki method abstract ise butun child classlar o methodu override etmek zorundadir
    Bu yuzden tum childler icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir.
    7)Body si olan methodlar (=Concrete Method) abstract class larin icine yazilabilir.
    Abstract methodlar concrete class larin icine yazilamazlar. Concrete methodlar child class lar
    tarafindan override edilmek zorunda degildir.
    8)"abstract" keyword ile method body bir methodda ayni anda kullanilamaz.
    9)Final methodlar abstract olamazlar. Final methodlar override edilemezler, halbuki abstract
      methodlar override edilmek icin olusturulurlar. bu bir celiskidir. Bu yuzden java abstract methodların
      aynı olmasına musaade etmez.
    10)"abstract class larin icinde absract methodlar olur."abstract" methodlar body si olmadıgından
         eksşk methodlar gibi dusunulebilir. yani abstract class icinde eksik bir yapi barindirir.
         Eger siz abstract class dan object uretirseniz bu eksiklik objeye yansir. java bunu istemez cunku
         eksik obje eksik ıs yapar. bu da application un yanlıs calısmasına neden olur.
         java applicationu korumak icin absract classlardan object uretilmesini engellemistir.
    11)abstract" class ların constructor ları vardır. ama object olusturamazlar.
    12)"abstract" class in abstract child i olabiliyor. Eger child absract ise abstract methodlari
       override etmek zorunda degildrir.
    13)"abstract" methodlar private olamazlar cunku child class lar abstract methodlari kullanirlar
       private yapinca kullanima kaopali olur bu celiskidir, bu yuzden java abstract methodlarin
      private olmasina musaade etmez
     14)Classlar final oldugunda child class a sahip olamazlar. ama abstract class lar icin
     child class olmalidir. cunku child class lar abstract parent class taki abstract methodlari kullanirlar.
     bu yuzden java abstract class larin final olmasina musaade etmez.


     */

}