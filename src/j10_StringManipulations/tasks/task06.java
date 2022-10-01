package j10_StringManipulations.tasks;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        /*
        girilen stringin son karakterini silen code craete edin
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("string girin :");
        String str = sc.nextLine();
        System.out.println(str.substring(0, str.length() - 1));


    }
}
