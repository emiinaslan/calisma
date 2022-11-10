package day07;

import java.util.Scanner;

public class Q01_WhileDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("lüfen bir sayı giriniz :");
        int sayı = sc.nextInt();

        System.out.println(basamakToplamı(sayı));


    }

    private static int basamakToplamı(int sayı) {
        int toplam = 0 ;
        while (sayı!=0){
            toplam+=sayı % 10;
            sayı /=10;
        }
        return toplam;
    }
}
