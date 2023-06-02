package day24stringbuilder;

public class Sb03 {

    public static void main(String[] args) {
        /*
        1)StringBuffer java'da String ureten bir diger class tir.
        StringBuffer java nin string uretmek icin olusturdugu ilk class tir.

        2)StringBuffer, StringBuilder'a cok benzer. yani ikisi de "mutable" string uretir.
        3)StringBuffer "multi-thread"dir, ama String Builder "multi-thread" degildir.
        4)StringBuilder "multi-thread" olmadigi icin StringBuffer dan daha hizli calisir.
        5)multi-thread yaparken yapilan islerin siralamasi onem arz eder,
            yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir.
            StringBuffer "multi-thread" oldugundan ayni zamanda "synchronized"dir.


        3 tane String olusturma class ogrendik
                1)Immutable string lazımsa, String Class
                2) Mutable string lazımsa StringBuffer veya String Builder
                    a)String Buffer i multi thread gerekirse kullaniriz
                    b)String Builder i multı thread gerekemz ise kullaniriz
         */

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java


    }
}
