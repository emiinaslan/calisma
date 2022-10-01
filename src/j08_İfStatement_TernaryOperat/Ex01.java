package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayı gir: ");
        int sayi = sc.nextInt();
        if (sayi > 0) {
            System.out.println("girilen sayı pozitif");
        } else if (sayi < 0) {
            System.out.println("girilen sayı negatif");
        } else {
            System.out.println("girilen sayı nötr");
        }

    }
}
