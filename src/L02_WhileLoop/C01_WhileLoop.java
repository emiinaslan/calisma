package L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        başlangıç ve bitiş değerleri net olan tekrarlarda foor loop ama adım sayısı belli olmayıp bir şarta duruma
        bağlı olan tekrarlarda while lopp kullanılmalı
         */
        System.out.println("for çözüm");
        for (int i = 11; i < 21; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("while çözüm");

        int basla = 11;
        while (basla < 21) {
            System.out.println(basla + " ");
            basla++;

        }

        int basl1a = 1;
        while (basl1a < 8) {
            System.out.println(basl1a + ".javaCan");
            basl1a++;

        }
//--> 2 basamaklı tek sayıları yanyana print eden code create ediniz


        int a = 11;
        while (a < 100) {
            System.out.print(a + " ");
            a += 2;
        }


//----> girilen metni tersten yazdıran code create ediniz
          Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir strin girin :");
        String str = sc.nextLine();
        int metinUznluk = str.length();
        while (metinUznluk >= 1) {
            System.out.print(str.charAt(metinUznluk - 1));

            metinUznluk--;
        }
//-------> girilen sayıya kadar tam sayılarının toplamını print edeb code create edeniz



        //System.out.println("bir tam sayı girin :");
        //int sayı = sc.nextInt();

        //int toplam = 0;
        //while (sayı>0){
          //  toplam+=sayı;
            //sayı--;
        //}
        //System.out.println(toplam);
        //System.out.println("lütfen sayı ");

        System.out.println("bir tam sayı girin :");
        int sayı = sc.nextInt();

        int faktoriyel = 1;
        while (sayı>0){
          faktoriyel*=sayı;
        sayı--;
        }
        System.out.println(faktoriyel);






    }//main sonu

}
