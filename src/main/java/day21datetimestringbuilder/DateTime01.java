package day21datetimestringbuilder;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); //03:05:50.377478

        //How to format time
        //"hh" uses 12 hours system, "HH" uses 24 hours system
        //Using "a" at the end it tells you if it is AM or PM
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss  a");
        String myTime = dtf.format(currentTime);
        System.out.println(myTime); //03:20:49  AM

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2023-04-18T03:22:15.395514

        LocalDateTime ldtJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(ldtJapan); //2023-04-18T09:26:54.959031
    }
}
