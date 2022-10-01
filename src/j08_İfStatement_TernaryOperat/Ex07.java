package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*
        task-->7 yıl tecrübe 100000 km
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("ehliyet var ise E yoksa H giriniz : ");

        char ehliyet = sc.next().toUpperCase().charAt(0);
        if (ehliyet == 'E') {
            System.out.println("kaç yıllık:");
            int tcrb = sc.nextInt();
            if (tcrb >= 7) {
                System.out.println("kaç  km yol yaptın: ");
                int km = sc.nextInt();
                if (km > 100000) {
                    System.out.println("start alınız");
                } else System.out.println("start için gereken tecrübe: " + (100000 - km));

            } else System.out.println("gereken tecrübe: " + (7 - tcrb));


        } else System.out.println("karakter giriniz");


    }


}

