package j08_İfStatement_TernaryOperat.Task_Nestedİf;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner sc = new Scanner(System.in);
        System.out.print("yaşınızı giriniz :");
        double yas = sc.nextDouble();

        System.out.print("kilonuzu giriniz :");
        double kilo = sc.nextDouble();
       /* if (yas < 18 || kilo<50 ) {
            System.out.println("kan bağışı yapamaz");
        } else if (yas>18||kilo>50) {
            System.out.println("kan bağışı yapar");

        }*/



        /*else if (yas >= 18 && kilo < 50) {
            System.out.println("kan bağışı yapamaz1");


        } else if (yas >= 18 && kilo > 50) {
            System.out.println("kan bağşı yapabilir");

        }*/

        if (yas < 18 || kilo<50 ) {
            System.out.println("kan bağışı yapamaz");}
        else System.out.println("kan bağışı yapar");

    }

}
