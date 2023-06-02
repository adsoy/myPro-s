package day24stringbuilder;

public class Student {
    /*

    Access Modifier
    1)public
    2)Protected
    3)default(Access Modifier i default yapmak icin basina Access Modifier yazmayiniz)
    4)private

    Note: Access Modifier lari genisten dara dogru siralayiniz
    public > default > protected > private

    Note:

    public ===> Her class dan kullanilabilir.

    protected ===> protected olanlar baska package lardan kullanilamaz
                    ancak baska package da child class icinden kullanilabilir.

     default ===> default olanlar baska package lardan kullanilamazlar.

     private ===> olanlar sadece olusturuldukları class icinde kullanilabilirler.


     Note: "protected ile "default"un farkini soyleyin.
            protected olanlar baska package lardan kullanilamaz ancak baska
            package da child class icinden kullanilabilir.
            default olanlar baska package lardan kullanilamazlar.

     */
    //public her class dan kullanilebilir
    public String stdName = "Ali Can";

    //protected olanlar kendi package ve baska package lardan child class lardan gorulur
    protected String address = "Istanbul";

    //default olanlar baska package dan kullanilamazlar
    String email="alican@gmail.com";

    //private olanlar sadece olusturulduklari class icinde kullanilirlar
    private String SsnId = "654879315";




}
