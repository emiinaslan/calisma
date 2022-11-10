package day10.random;

import java.util.Random;
import java.util.Scanner;

public class C2_MethClassMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("matrix boyut sayısı");
        int sayi = sc.nextInt();

        Random random =new Random();
        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < sayi; j++) {
                System.out.print((int) (Math.random()*2)+ " ");

            }
            System.out.println();
        }





    }
}
