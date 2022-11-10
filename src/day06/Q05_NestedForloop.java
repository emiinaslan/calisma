package day06;

import java.util.Scanner;

public class Q05_NestedForloop {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("lütfen bir satır sayısı girniz :");
        int sayı1 = sc.nextInt();
        System.out.println("lütfen bir sütun sayısı girin :");
        int sayı2 = sc.nextInt();
        for (int i = 0; i < sayı1; i++) {
            for (int j = 0; j < sayı2 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }





    }
}
