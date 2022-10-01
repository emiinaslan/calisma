package day02;

import java.util.Scanner;

public class Q02_Modulus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("5 basamamlı sayı giriniz: ");
        int sayi= sc.nextInt();
        if (sayi>9999 || sayi<100000){
            System.out.println("hatalı sayı girdiniz :)");
        }
        int a=sayi/1000;
        int b=sayi%100;

        int ilkikitop=(a/10)+(a%10);
        System.out.println("ilkikitop = " + ilkikitop);
        int sonikitop=(b/10)+(b%10);
        System.out.println("sonikitop = " + sonikitop);
        System.out.println("esas toplam = " + (ilkikitop + sonikitop));


    }
}
