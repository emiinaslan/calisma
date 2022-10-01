package j04_AritmaticOperatörs;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {
        //kullanıcıdan alınan 3 basamaklı bir sayının rakamları toplamını print eden cod crate ediniz
        Scanner sc= new Scanner(System.in);
        System.out.println("3 basamaklı sayı gir:");

        int sayi= sc.nextInt();
        int birler= sayi%10;
        sayi/=10;
        int onlar=sayi%10;
        int yüzler= sayi/10;

      int rakamlarToplami=birler+onlar+yüzler;
        System.out.println("rakamlarToplami = " + rakamlarToplami);



    }
}
