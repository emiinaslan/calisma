package Task;

import java.util.Scanner;

public class Task09_Nested {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam sayı giriniz : ");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( " *");
            }
            System.out.println();
        }




    }
}
