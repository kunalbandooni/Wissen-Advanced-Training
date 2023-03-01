package Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateAndTimeDemo {
    public void run(){
        func1();
        func2();
    }

    void func1(){
        LocalDateTime currTime = LocalDateTime.now();
        System.out.println("Current Time is " + currTime);

        LocalDate localDate = currTime.toLocalDate();

        DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM/dd/yy");
        String strDate = localDate.format(FORMAT);

        System.out.println("Modified Date Format: " + strDate);
        LocalTime localTime = currTime.toLocalTime();

        System.out.println("Current Local Date " + localDate);
        System.out.println("Current Local Time " + localTime);
        
        int month = localDate.getMonthValue();
        System.out.println("Month : " + month);

        // Similarily al functions of date, time and be done...
    }

    void func2(){
        LocalTime lt1 = LocalTime.now(ZoneId.of("Singapore"));
        System.out.println("Current time in Singapore" + lt1);

        Set<String> s = ZoneId.getAvailableZoneIds();
        System.out.println("list of zones :\n");
        
        s.forEach(x -> System.out.println(x));
    }
}
