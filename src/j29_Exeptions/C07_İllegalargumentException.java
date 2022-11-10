package j29_Exeptions;

import java.util.Scanner;

public class C07_İllegalargumentException {
    public static void main(String[] args) {
        /*
         İllegalargumentException-) kullanması istenmeyen değerlerde programın hata vermesi isteniyorsa
         bu exception fırlatılır
         örn: yas daatası için negatif değer girildiinde programın klırılmadan
         runn oklması ama girilen değer için exception fırlatması için kullnılır

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("yaş giriniz");
        int yas = sc.nextInt();


        try {

            if (yas < 18) {
                throw new IllegalArgumentException();//throw keyword ile Exceotion obj oluşturarak hata tanımlanır
                // şartlara uymayan değer içinde catch block' a düşürerek
            } else System.out.println("yasın hayırlı olsun");
            System.out.println("try block çalıştı");
        } catch (IllegalArgumentException e) {
            System.out.println("ehliet almak için yaşınız uygun değil");
            System.out.println("catch block çalıştı");
        }
        System.out.println("sonuna kadar çalıştı");
    }
}
