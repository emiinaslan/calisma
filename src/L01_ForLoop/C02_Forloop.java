package L01_ForLoop;

import java.util.Scanner;

public class C02_Forloop {
    public static void main(String[] args) {

        //--> girilen sayıdan 100 e kadar +un katu tamsayıları print eden code create edelim


        Scanner sc = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz :");
        int sayı = sc.nextInt();
        if (sayı>100){
            System.out.println("ağam hani birden küçük yazıcaktın");
        }else for (int i = sayı; i < 100 ; i++) {
            if (i%4==0){
                System.out.print(i+" ");
            }
        }









    }//main sonu
}
