package j22_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {


        LocalDate bugun = LocalDate.now();
        LocalDate falanGun = bugun.minusDays(2);
        LocalDate fesmekanGun = bugun.plusDays(3);

        LocalDate mehmetBirtDay = LocalDate.of(1996,8,3);

        System.out.println("bugun.isBefore(falanGun) = " + bugun.isBefore(falanGun));
        System.out.println("bugun.isBefore(fesmekanGun) = " + bugun.isBefore(fesmekanGun));
        System.out.println("falanGun.isBefore(fesmekanGun) = " + falanGun.isBefore(fesmekanGun));

        System.out.println("bugun.isAfter(falanGun) = " + bugun.isAfter(falanGun));
        System.out.println("falanGun.isAfter(fesmekanGun) = " + falanGun.isAfter(fesmekanGun));
        //artık yıl mı .isLeapYear
        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());

        System.out.println("bugun.compareTo(falanGun) = " + bugun.compareTo(falanGun));
        int gunFarkı = bugun.compareTo(falanGun);
        System.out.println("gunFarkı = " + gunFarkı);


        System.out.println("bugun.compareTo(mehmetBirtDay) = " + bugun.compareTo(mehmetBirtDay));


    }
}
