package Task;

import java.util.Scanner;

public class TaskTekrar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = sc.nextInt();


        faktoriyelHesaplama(sayı);











    }

    private static void faktoriyelHesaplama(int sayı) {
        int faktoriyel = 1;

        for (int i = sayı; i > 0; i--) {

            System.out.println(faktoriyel *= i);

        }

    }
}
