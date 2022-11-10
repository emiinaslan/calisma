package j22_DateTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZonedDataTime {
    public static void main(String[] args) {

        // herhangi bir ülke şehir -> local tarih ve zaman bilgisi tutar

        LocalDate trhZone = LocalDate.now(ZoneId.of("America/New_York"));//america/NewYork localinin anlık tarihi belirlendi
        LocalDate trhZone1 = LocalDate.now(ZoneId.of("Japan"));
        System.out.println("trhZone1 = " + trhZone1);
        System.out.println("trhZone = " + trhZone);
        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zdt2=ZonedDateTime.now(ZoneId.of("Japan"));
        System.out.println("zdt1 = " + zdt1);
        System.out.println("zdt2 = " + zdt2);


    }
}
