package j04_AritmaticOperatörs;

import java.util.Scanner;

public class C02_IncrementDecrement {
    public static void main(String[] args) {

        int a=7;
        System.out.println(++a);

        System.out.println(a++);

        System.out.println(a);

        System.out.println(a++ + ++a);

        Scanner sc= new Scanner(System.in);
        System.out.println("3 basamaklı sayı gir:");

        int sayi= sc.nextInt();
        int birler= sayi%10;
        sayi/=10;
        int onlar=sayi%10;
        int yüzler= sayi/10;

        System.out.println("bs:"+birler+"\nob:"+onlar+"\nyüzler:"+yüzler);








    }
}
