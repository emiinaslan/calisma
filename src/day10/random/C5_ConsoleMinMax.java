package day10.random;

import java.util.Scanner;

public class C5_ConsoleMinMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("min sayı giriniz :");
        int min = sc.nextInt();
        System.out.println("max bir sayı girin :");
        int max = sc.nextInt();

        double random = Math.random();

        int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomNum = "+randomNum);

    }
}
