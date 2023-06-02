package day_08;

public class C02_StringBuilder {
    public static void main(String[] args) {
         /*
        kapasitesi 7 olan bir stringbuilder objesi olusturun, capacity, lenght yazdırın
        "hava guzel" verisini ekleyin, yazdırın
        sbdeki boslugu silin
        sb'yi ters cevirin
        sbnin son 4 karakterini silin
        sbyi tekrar ters cevirin ve "Java guzel" yazısını elde edin
         */
        StringBuilder sb=new StringBuilder(7);
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());

        sb.append("hava guzel");
        System.out.println(sb);//hava guzel
        //space karakterinin index ini bulup daha sonra delete yapabilirim
        int idx= sb.indexOf(" ");
        sb.deleteCharAt(idx);
        System.out.println(sb);//havaguzel

        sb.reverse();//ters cevirir
        System.out.println(sb);//lezugavah

        sb.delete(sb.length()-4, sb.length());//son 4 karakteri siler
        System.out.println(sb);//lezug

        sb.reverse();//ters cevirdi
        System.out.println(sb);

        sb.insert(0, "Java ");//başa Java yazısını ekledi
        System.out.println(sb);






    }
}
