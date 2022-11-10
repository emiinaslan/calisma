package day06;

import java.util.Scanner;

public class Q07_Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayıyı girniz :");
        int sayı1 = sc.nextInt();
        System.out.println("2 .sayısı girin :");
        int sayı2 = sc.nextInt();
        int toplam = 0;
        if (sayı1 < sayı2) {
            for (int i = sayı1; i <= sayı2; i++) {
                toplam += i;
            }
            System.out.println(sayı1 + " ile " + sayı2 + "arasındaki sayıların toplamı :" + toplam);

        } else if (sayı1 > sayı2) {
            for (int i = sayı2; i <= sayı1; i++) {
                toplam += i;
            }

            System.out.println(sayı1 + " ile " + sayı2 + "arasındaki sayıların toplamı :" + toplam);
        } else System.out.println("sayılar eşit");


    }
}
