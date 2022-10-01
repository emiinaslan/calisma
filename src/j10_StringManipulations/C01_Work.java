package j10_StringManipulations;

import java.util.Scanner;

public class C01_Work {
    public static void main(String[] args) {


/*task--< girilen email hesabının @gmail.com içermiyorsa"lütfen gmail hesabı giriniz: "
        @gmail.com ile bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz." print eden code create ediniz.
        */


        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen gmail hesabı giriniz: ");
        String email= sc.next();
        if (!email.contains("@gmail.com")){
            System.out.println("lütfen gmail hesabı girin");}

            else if (email.endsWith("@gmail.com")){
            System.out.println("hesabınız onaylandı");

            }else System.out.println("geçerli hesap giriniz");

            String s1 = "123456789    66" ;
        System.out.println(s1.trim(    ));


    }









    }

