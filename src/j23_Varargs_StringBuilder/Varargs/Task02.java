package j23_Varargs_StringBuilder.Varargs;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        toplaÇarp(5,1,2,3,4,5);



    }//
    public static void toplaÇarp(int a ,int...b){
        int topla =0;
        for (int w : b) {topla+=w;
        }
        topla*=a;
        System.out.println("topla = " + topla);
    }
}
