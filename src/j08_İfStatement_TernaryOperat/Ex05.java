package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /*
        task-->girilen 2 sayıyı seçilen dört işlemden birine uygulayıp sonucu rint eden code crate ediniz
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("sayı1: ");

       double sayi1=sc.nextDouble();

        System.out.println("sayı2: ");

        double sayı2= sc.nextDouble();
        System.out.println("+için--1 seçiniz\n-için--2seçiniz\n*--3seçin\n/için--4 seçin");
        int secim= sc.nextInt();
        if (secim==1){
            System.out.println("toplama sonucu: "+sayi1+"+" +sayı2+ "="+ sayi1+sayı2);

        }
        else if (secim==2){
            System.out.println("toplama sonucu: "+sayi1+"-" +sayı2+ "="+ sayi1+sayı2);
        }
        else if (secim==3){
            System.out.println("toplama sonucu: "+sayi1+"+" +sayı2+ "="+ sayi1+sayı2);
        }
        else if (secim==4){
            System.out.println("toplama sonucu: "+sayi1+"+"+ sayı2+ "="+ sayi1+sayı2);
        }
        else System.out.println("sayı giriniz");



    }


}

