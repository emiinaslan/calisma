package Task;

import java.util.Scanner;

public class Task03_Faktoriyel {

    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = sc.nextInt();
        faktoriyel(sayı);





    }//main sonu

    private static void faktoriyel(int in) {
        int faktoriyel = 1 ;
        for (int i = in ; i >= 1; i--) {
            faktoriyel*=i;


        }
        System.out.println(faktoriyel);
    }


}//class sonu
