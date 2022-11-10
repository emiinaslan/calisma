package day06;

import java.util.Scanner;

public class Q04_Forloop {
    /*
    kullanıcıdan
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1'den büyük birt tam sayı giriniz :");
        int sayi = sc.nextInt();
        int karetoplam = 0;
        for (int i = 1; i < sayi; i++) {
            karetoplam+=i*i;

        }
        System.out.println("kare toplam :" +karetoplam);




    }
}

