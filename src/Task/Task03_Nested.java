package Task;

import java.util.Scanner;

public class Task03_Nested {
    public static void main(String[] args) {

        /*
        girilen boyutta bir kare için
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("kare için bir sayı giriniz :");
        int kare = sc.nextInt();

        for (int i = 0; i < kare; i++) {

            for (int j = 0; j < kare; j++) {
                if (i==j){
                    System.out.print(1);

                }else System.out.print(0);

            }
            System.out.println();
        }








    }
}
