package j13_break_Continue;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz :");
        double num = sc.nextDouble();
        PowersofTwo(num);


    }

    private static void PowersofTwo(double num) {
        double kalan = 1;

        for (double i = num; i >= 3; i /= 3) {

            kalan = i;

        }
        if (kalan == 3) {
            System.out.println(num + " 2'nin kuvveti");
        } else System.out.println(num + " 2'nin kuvveti değil");


    }


}


