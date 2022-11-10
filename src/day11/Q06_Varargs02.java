package day11;

import java.util.Scanner;

public class Q06_Varargs02 {

    public static void main(String[] args) {
        SayılarıTopla(3,5);

    }

    private static void SayılarıTopla(int...sayı) {
        int carp=1;
        for (int w:sayı) {
            carp*=w;
        }
        System.out.println(carp);
    }
}
