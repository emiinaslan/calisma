package day1;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("bir cümle giriniz: ");
        String cümle =sc.nextLine();


        System.out.println("harf giriniz :");
        char harf =sc.next().charAt(0);


        int count=0;


        for (int i = 0; i <cümle.length() ; i++) {
            if (cümle.charAt(i)==harf){
                count++;

            }
        }

        System.out.println("girdiğiniz cümlede " +harf+" harfi "+count+" kere kullanılmıştır");
    }
}
