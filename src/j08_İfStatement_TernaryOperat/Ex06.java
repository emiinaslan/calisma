package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*
        task-->
         */
        Scanner sc = new Scanner(System.in);
        /*System.out.println("agam yıl gir: ");
        int sayi = sc.nextInt();*/
        System.out.println("cinsiyetiniz\n Kadın için-> K\nerkek için-->E");
        char cinsiyet = sc.nextLine().charAt(0);
        System.out.println("yaş giriniz: ");
        int yas = sc.nextInt();
        if (cinsiyet == 'K') {
            if (yas > 60) {
                System.out.println("prim günü girin: ");
                int prim = sc.nextInt();
                if (prim > 6000) {
                    System.out.println("emekli olmaya hak kazandınız");
                } else System.out.println("kalan prim:" + (6000 - prim));

            } else System.out.println("emekliliğe kalan yılınız: " + (60 - yas));
        } else if (cinsiyet == 'E') {
            if (yas > 65) {
                System.out.println("prim günü girin: ");
                int prim = sc.nextInt();
                if (prim > 7000) {
                    System.out.println("emekli olmaya hak kazandınız");
                } else System.out.println("kalan prim:" + (7000 - prim));

            } else System.out.println("emekliliğe kalan yılınız: " + (65 - yas));
        } else System.out.println("cinsiyetinizi tekrar girin");


    }


}

