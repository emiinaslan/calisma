package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

    public static void main(String[] args) {

        LocalDate bugün =LocalDate.now();
        System.out.println(bugün.getYear());
        System.out.println(bugün.getMonth());
        System.out.println(bugün.getMonthValue());
        System.out.println(bugün.getChronology());
        System.out.println(bugün.getDayOfWeek());
        System.out.println(bugün.getEra());
        LocalDate date1=LocalDate.of(1923,10,29);
        LocalDate date2=LocalDate.of(1923, Month.OCTOBER,29);
//verilen bir tarihin öncesi ve sonrsasına gitme... minus()->geçmişe plus()->geleceğe
        System.out.println("date1.plusDays(12) = " + date1.plusDays(12));
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));
        System.out.println("bugün.plusWeeks(6) = " + bugün.plusWeeks(6));
        System.out.println("bugün.minusMonths(5) = " + bugün.minusMonths(5));
        System.out.println(bugün.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2));


    }//main sonu
}
