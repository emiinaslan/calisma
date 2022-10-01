package j10_StringManipulations.tasks;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

 */
        Scanner sc = new Scanner(System.in);
        System.out.println("paralo giriniz :");
        String sifre = sc.next();
        //String strSifre = String.valueOf(sifre);
       // if (strSifre.charAt(0)>= 'A' && strSifre.charAt(0)>= 'Z' ){
       //  if (strSifre.charAt(strSifre.length())-1 >= '0' && strSifre.charAt(strSifre.length()-1)<='9'){
//
       //  }if (strSifre.length()>5){
       //         System.out.println("şifre doğru");
       //     }
       // }else System.out.println("hatalı şifre girdiniz");
        if ((sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z') && (sifre.charAt(sifre.length()-1)>='0'&& sifre.charAt(sifre.length()-1) <= '9')
                &&sifre.length()>=6) {
            System.out.println("şifre tanımlandı");
        }else System.out.println("şifer yanlış");

//Scanner sc = new Scanner(System.in);
//        System.out.println("password girişi yapınız : ");
//        String password = sc.nextLine();
//
//        if ((password.charAt(0)>='A'&&password.charAt(0)<='Z') &&(password.charAt(password.length()-1)>='0'&&
//                            password.charAt(password.length()-1)<='9')&&(password.length()>=6)) {
//            System.out.println("password geçerli");
//        }else System.out.println("password geçersiz");
//
//
//
//
//







    }
}
