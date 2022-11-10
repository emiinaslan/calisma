package j22_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        // saat dakika saniyte tuatar
        LocalTime sunAn=LocalTime.now();//sytmde anlık zaman bilgisi atanır
        System.out.println("sunAn = " + sunAn);
        System.out.println(sunAn.getHour());
        System.out.println(sunAn.getMinute());
        System.out.println(sunAn.getNano());
        System.out.println(sunAn.getSecond());

        // beirli zamanda ileri geri zamana gidilebilir
        LocalTime time1=LocalTime.of(13,43,34);
        System.out.println("time1.plusMinutes(90) = " + time1.plusMinutes(90));
        System.out.println("time1.plusMinutes(150) = " + time1.plusMinutes(150));
        System.out.println("time1.minusHours(23) = " + time1.minusHours(23));
        System.out.println("time1.minusMinutes(100) = " + time1.minusMinutes(100).plusHours(2));

        LocalTime forBası=LocalTime.now();
        System.out.println("forBası = " + forBası.getSecond());
        int sayı =0;
        for (int i = 0; i <100000 ; i++) {
            sayı+=i;
        }
        LocalTime forSonu=LocalTime.now();
        System.out.println("forSonu = " + forSonu.getSecond());
        System.out.println("(forSonu.getNano()-forBası.getNano()) = " + (forSonu.getSecond() - forBası.getSecond()));


    }
}
