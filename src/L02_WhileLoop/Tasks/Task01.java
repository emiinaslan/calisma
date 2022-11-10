package L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        System.out.println("lütfen bir sayı giriniz");



        int toplam = 0;
        int sayıAdedi =0;

        while (toplam<333){
            int sayı = sc.nextInt();
             toplam+=sayı;
            sayıAdedi+=1 ;
            sayı++;
        }
        System.out.println("girilen sayıların toplamı :"+ toplam +" girilen sayı adedi :" +sayıAdedi);





    }// main sonu






    }

