package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2023-06-10T22:21:43.824390900

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatteddtf = dtf.format(ldt);
        System.out.println(formatteddtf);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a ");
        String formattedldt2 = dtf2.format(ldt);
        System.out.println(formattedldt2);
    }
}
