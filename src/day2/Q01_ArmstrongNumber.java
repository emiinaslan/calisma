package day2;

import java.util.Scanner;

public class Q01_ArmstrongNumber {/*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayı girin: ");
        int sayı = sc.nextInt();

        armstrong(sayı);
        girilenSayıyaKadarOlanArmstorng(sayı);
    }

    private static void girilenSayıyaKadarOlanArmstorng(int sayı) {
        for (int i = 0; i < sayı; i++) {
            armstrong(i);

        }
    }

    private static void armstrong(int sayı) {
        int sayınınKuypleriToplamı = 0;
        int basamaktakiSayı = 0;
        int girilenSayı = sayı;

        while (sayı > 0) {
            basamaktakiSayı = sayı % 10;//birler basamağı
            sayınınKuypleriToplamı += (basamaktakiSayı * basamaktakiSayı * basamaktakiSayı);
            sayı = sayı / 10;


        }
        if (girilenSayı == sayınınKuypleriToplamı) {
            System.out.println(girilenSayı + "sayısı armstorm sayidir");

        } else System.out.println(girilenSayı + "sayısı armstorm sayı değildir");
    }
}
