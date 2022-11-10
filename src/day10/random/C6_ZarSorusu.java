package day10.random;

import java.util.Scanner;

public class C6_ZarSorusu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int min  =1 ;
int max =6;
 int zar1 = (int) (Math.random()*((max-min))+1)+min;
 int zar2 = (int) (Math.random()*((max-min))+1)+min;
        //System.out.println("zar1 = " + zar1);
        //System.out.println("zar2 = " + zar2);
        int toplam = zar1+zar2;
        if (toplam==9){
            System.out.println("zarların topla mı: "+toplam+"\nkazandınız");
        }else System.out.println("zarların topla mı: "+toplam+"\ntekrar deneyiniz");

        //for (int i = 0; i < 2 ; i++) {
        //    System.out.println((i+1)+ " zarı atmak için 0 basınız");
        //    int zar1= sc.nextInt();
        //}


       //double random = Math.random();

       //int min =10;
       //int max=67;

       //int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;

       //System.out.println("randomNum = "+randomNum);



    }
}
