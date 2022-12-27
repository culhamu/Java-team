package Day23_dateTime_varags;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_localDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now(ZoneId.of("Japan"));
        System.out.println(ldt);// japon saati 2022-12-20T18:30:57.832446600
        ldt=LocalDateTime.now();
        System.out.println(ldt);// türkiye saati 2022-12-20T12:30:57.844985400
        System.out.println(ldt.getDayOfWeek());

    }
}
