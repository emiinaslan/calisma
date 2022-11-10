package j15_Arrays;

import java.util.Scanner;

public class Q5_Arrays {
    public static void main(String[] args) {
        int sayı[]=new int[8];
        Scanner sc = new Scanner(System.in);
       int count =0;
        for (int i = 0; i < 8; i++) {
            System.out.println(i+ "  .indexteki elemanı girin :");
            sayı[i]=sc.nextInt();
            if (sayı[i]%3==0){
                System.out.println(sayı[i]);
                count++;

            }

        }

        System.out.println("count = " + count);


    }
}
