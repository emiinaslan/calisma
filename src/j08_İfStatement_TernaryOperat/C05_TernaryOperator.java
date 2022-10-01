package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
        //---> sayı 0 dan büyük eşit ise 10 dan küçük olup olmadığını kontro lediniz
        //10 dan küçük ise ekrama rakam yazdırın değilse pozitif sayı yazdfırın

        Scanner sc = new Scanner(System.in);
        System.out.print("sayı gir :");
        int sayı=sc.nextInt();

        System.out.println(sayı >= 0 ? (sayı < 10 ? "rakam" : "pozitif sayı") : "negatif sayı");



    }
}
