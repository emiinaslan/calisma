package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Q04_NumberOfDaysInMonths {
    public static void main(String[] args) {
        /*
Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:
Ay Numarasi:
2
Yil :
2016
OUTPUT :
Subat 2016 29 Gundur.
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("ay no: ");
        int ay= sc.nextInt();
        System.out.println("yıl no: ");
        int yıl = sc.nextInt();

        LocalDate date=LocalDate.of(yıl,ay,1);
        System.out.println(date.getMonth()+" "+date.getYear()+" "+date.lengthOfMonth());


    }
}
