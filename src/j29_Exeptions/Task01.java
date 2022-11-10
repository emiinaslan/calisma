package j29_Exeptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        task-) girilen passwor'un 6 karakterden az 10 nkarakterden fazla olmamasını kontrol eden code create ediniz

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("lütfen password giriniz: ");

        String password = sc.next();
        try {
            if (password.length() < 6 || password.length() > 10) {
                throw new IllegalArgumentException("password geçersizzz");
            } else System.out.println("password geçerli");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            //System.out.println(e.getMessage());

        }
        System.out.println("sorun handle edildi codun sonuna geldin");

    }//main sonu
}
