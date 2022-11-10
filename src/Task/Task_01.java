package Task;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");


        int sayı = sc.nextInt();

        if (sayı>=100){
            System.out.println("100 den küçk olmalı");
        }else {
            for (int i = 1; i < sayı; i++) {
                if (i%3==0 && i%5==0){
                    System.out.println(i + "Javacan");
                } else if (i%3==0) {
                    System.out.println(i + "java");

                } else if (i%5==0) {
                    System.out.println(i + "can");

                }else System.out.println(i+ "hiç bir şartı sağlamadı");


            }
        }















    }//main sonu
}
