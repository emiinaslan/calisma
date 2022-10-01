package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        /*
        task-->ullanicidan bir sayi alin

Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
Eger 10 dan buyuk ise "Buyuksun!" yazdirin
Eger 10 dan kucuk ise "Normalsin!" yazdirin

Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
Eger -10 dan buyuk ise "Negatifsin!" yazdirin
Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("agam sayı gir: ");
        int sayi = sc.nextInt();
        if (sayi > 0) {
            if (sayi > 10) {
                System.out.println("büyüksün");

            } else if (sayi < 10) {
                System.out.println("normalsin");
            } else System.out.println("sayı 10 eşit");

        } else if (sayi < 0) {
            if (sayi > -10) {
                System.out.println("negatifsin");
            }
            if (sayi < -10) {
                System.out.println("çok negatifsin");
            }
        } else System.out.println("sayı nötr");


    }
}



