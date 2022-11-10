package Task;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("birinci sayı  giriniz");
        int sayı1 = sc.nextInt();

        System.out.println("ikinci sayı  giriniz");
        int sayı2 = sc.nextInt();

        if (sayı1<sayı2){


            for (int i = sayı1; i < sayı2; i++) {
               if (i%2==0){
                   System.out.print(i+" ");
               }
            }





        } else if (sayı1>sayı2) {
            for (int i = sayı2; i < sayı1; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }


        } else System.out.println("hatalı giriş");





    }//main sonu





}
