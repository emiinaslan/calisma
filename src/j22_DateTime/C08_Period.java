package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        //Period-> iki tarih arasında geçen
LocalDate bugun =LocalDate.now();
        LocalDate mehmetBirtDay = LocalDate.of(1996,8,3);
        Period fark = Period.between(mehmetBirtDay,bugun);
        System.out.println("fark = " + fark);
        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());
        System.out.println("fark.getDays() = " + fark.getDays());
        System.out.println("****");
        System.out.println("bugun = " + bugun);
        Period period5Gun=Period.ofDays(5);//5 günde bir tekrarlayan period
        Period period7Ay=Period.ofMonths(7);//7 ayda tekrar eden period
        Period periodX =Period.ofMonths(7).ofDays(21);
        bugun=bugun.plus(period5Gun);
        System.out.println("bugun = " + bugun);
        bugun=bugun.minus(period7Ay);
        System.out.println("bugun = " + bugun);
        bugun=bugun.plus(periodX);
        System.out.println("bugun = " + bugun);
        // task--> 5 eylül 2022 de başlayan kursun süresi 9 ay olduğuna göre bitiş tasrihini birint eden code create ediniz
        LocalDate kursBaslama = LocalDate.of(2022, Month.SEPTEMBER,5);


        Period dokuzAylık=Period.ofMonths(9);
        System.out.println("kursBaslama.plus(dokuzAylık) = " + kursBaslama.plus(dokuzAylık));
        System.out.printf("kurs bitiş tarihi"+ kursBaslama.plus(dokuzAylık).format(DateTimeFormatter.ISO_DATE));

    }
}
