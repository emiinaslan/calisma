package j10_StringManipulations.tasks;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("adınızı giriniz :");
        String ad = sc.nextLine();
        System.out.println("soyad giriniz :");
        String soyad = sc.nextLine();
        System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1));
        System.out.println(soyad.substring(0, 1).toUpperCase() + soyad.substring(1));


    }
}
