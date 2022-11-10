package day11;

import java.util.ArrayList;

public class Q05_Varargs01 {
    public static void main(String[] args) {
        /*
        istediğimiz kadar sayı girdiğimizde
        toplamlarını bize veren bir method create ediniz
         */

        SayılarıTopla(2,3,5,5);

    }

    private static void SayılarıTopla(int...satı) {
        int topla=0;
        for (int w:satı) {
            topla+=w;
        }
        System.out.println(topla);
    }
}
