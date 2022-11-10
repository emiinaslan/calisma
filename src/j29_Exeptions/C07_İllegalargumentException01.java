package j29_Exeptions;

import java.util.Scanner;

public class C07_İllegalargumentException01 {
    public static void main(String[] args) {
        /*
        TRİCK-->    "throw" - "thorws"    FARKLARI
        1-)"throws" main method kapnış parantezi ile method body açılış parantezi arasına tanımlanır
           "throw"  method body içinde

           2-) "throws" Keywordden sonra birden fazla exception tanımlanı bilir
               "throw"  Keywordden sonra sadece birtane exception tanımlanabilir

           3-) "throws" keywordden sonra sadece exception class name yazılır
               "throw"  Keyworddan sonra exception obj tanımlanır

           4-) "throws" keyword method ilk satırda sadece bir kez tanımlanır
               "throw" istenildiği kadar method body' de tanımlana bilir
         */
        /*
         İllegalargumentException-) kullanması istenmeyen değerlerde programın hata vermesi isteniyorsa
         bu exception fırlatılır
         örn: yas daatası için negatif değer girildiinde programın klırılmadan
         runn oklması ama girilen değer için exception fırlatması için kullnılır

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("yaş giriniz");
        int yas = sc.nextInt();
        //if (yas < 18) {
        //    System.out.println("yaşınız: " + yas + " ehliyet için uygun değil");
        //    throw new IllegalArgumentException();//hrow komutu try -catch block olmadan da istenen method body'de tanımlanır
        //} else System.out.println("yaşınız: " + yas + " ehliyet  için uygun");

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
