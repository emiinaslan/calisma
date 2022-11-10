package day09;

import java.util.Arrays;

public class Q04_Arrays {
    public static void main(String[] args) {
        String s = "Apex,nesne yönelimli bir programlama dilidir ";
        System.out.println(s = s.replace(",", "").replace(" ", ""));

        String arr[] = s.split("");
        System.out.println(Arrays.toString(arr));
        String arrSesli[] = {"a", "e", "i", "o", "u" };
        System.out.println(Arrays.toString(arrSesli));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arrSesli.length; j++) {
                if (arr[i].equalsIgnoreCase(arrSesli[j])) {
                    count++;
                }
            }
        }
        System.out.println("count = " + count);

    }
}
