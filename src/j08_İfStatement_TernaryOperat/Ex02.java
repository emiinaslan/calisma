package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("notu gir: ");
        int sayi = sc.nextInt();
        if (sayi < 0 || sayi > 100) {
            System.out.println("adam akıllı sayı gir");
        } else if (sayi < 50) {
            System.out.println("D");
        } else if (sayi < 60) {
            System.out.println("C");
        } else if (sayi < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");

        }


    }
}
