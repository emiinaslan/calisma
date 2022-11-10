package day06;

import java.util.Scanner;

public class Q06_MetCreationForloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("lütfen bir satır sayısı girniz :");
        String str = sc.nextLine();

        System.out.println(tersineCevir(str));

    }//main sonu

    private static String tersineCevir(String str) {
        String tersStr = "";
        for (int i = str.length()-1; i>= 0; i--) {
            tersStr+=str.charAt(i);
        }
        return tersStr;
    }
}
