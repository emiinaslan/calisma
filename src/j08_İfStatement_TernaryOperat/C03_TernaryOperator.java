package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("sayı giriniz :");
        int sayı = sc.nextInt();
        if (sayı % 2 == 0) {
            System.out.println("sayınız çift");
        } else System.out.println("sayınız tektir");
        System.out.println(sayı%2==00 ? "agam sayı çiftt" : "sayı tek");
        System.out.println((sayı < 0 ? "sayı negatif" : "sayı çift"));


    }
}
