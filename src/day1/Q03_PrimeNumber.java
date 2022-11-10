package day1;

import java.util.Scanner;

public class Q03_PrimeNumber {
    public static void main(String[] args) {
        /*
Ask user enter a positive number and check if it is prime or not
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı girin");
        int sayı=sc.nextInt();
        boolean flag=true;
        if (sayı>=2){
            for (int i = 2; i <sayı ; i++) {
                if (sayı%i==0){
                    flag=false;
                    break;
                }
            }
            if (flag==true) System.out.println("sayı asaldır");
            else System.out.println("sayı asal değildir");


        }else System.out.println("sayı asal değildir");




    }
}
