package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class C06_TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("sayı gir :");
        int sayı=sc.nextInt();
        System.out.println(((sayı > 999 && sayı < 10000) ? "4 basamaklı" : sayı % 2 == 0 ? "4 basamaklı olöayan çiift sayı" : "4 basamaklı olöayan tek sayı"));


    }
}
