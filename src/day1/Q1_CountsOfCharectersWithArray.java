package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_CountsOfCharectersWithArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("bir string girin:");
        String str = sc.nextLine();



        String[]arr =str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int count =0;
        for (int i = 1; i <arr.length; i++) {
            if (arr[i-1].equals(arr[i])){
                count++;

            }else {
                System.out.println(arr[i] + " sayisi " + (count + 1));
                count = 0;
            }

            if (i== arr.length-1){
                System.out.println(arr[i]+" sayısı"+(count+1));
            }


        }




    }
}
