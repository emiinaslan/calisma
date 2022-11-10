package L01_ForLoop;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        /*
        girilen 5 sayının 10 ile 20 hariç diğerlerinin toplamını hesab eden code create ediniz

         */

        Scanner sc = new Scanner(System.in);
int toplama = 0;

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("lütfen " + i +". sayı giriniz :");
            int sayı= sc.nextInt();
            if (sayı<=10 || sayı>=20){
                toplama+=sayı;
            }//if sonu

        }System.out.println("girilen sayıların toplamı :"+ toplama );










    }//main sonu








}
