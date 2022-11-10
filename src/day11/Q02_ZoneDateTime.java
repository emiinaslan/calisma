package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q02_ZoneDateTime {
    public static void main(String[] args) {
        // Baska ülke veya bolgelerin saat dilimine gore zamani alma
// Asia/Tokyo nun saat dilimine gore saat ?
// zoneId Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("zdt = " + zdt);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("zdt.format(format) = " + zdt.format(format));


    }
}
