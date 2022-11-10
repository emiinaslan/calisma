package j13_break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        //--> girilen tam sayının asal olmasını kontrol eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("tam sayı giriniz :");
        int sayı = sc.nextInt();
        boolean asalMı = true;
        for (int i = 2; i < sayı; i++) {
            sayı += i;
            if (sayı % i == 0) {
                asalMı = false;
                break;
            }
        }
        if (asalMı) {
            System.out.println("asal");

        } else System.out.println("asal değil");

    }
}
