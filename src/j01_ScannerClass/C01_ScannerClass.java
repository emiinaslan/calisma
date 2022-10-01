package j01_ScannerClass;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        // kullanıcıdan veri almak içinn şu adım takip edilir
        //1. adım-> Scanner class'dan obj create edilir.

        //  Scanner scan = new Scanner(System.in);// Scanner classından scan isminde değerini System içinden alan bir obj.

        //  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
        //  System.out.print("adınızı giriniz :");

        //  // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
        //  String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı

        //  System.out.println("isim = " + isim);

        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...

        Scanner sc = new Scanner(System.in);//1. adım
        //  System.out.print("karenin kenarı giriniz : ");// 2. adım
        //  int kenar=sc.nextInt();//3. adım
        //  System.out.println("alan : "+(kenar*kenar)+" çevre :"+(kenar*4));
         /*
         Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
         Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
         1 seker = 1.7 gr
         Ornek : Input : cay sayisi : 10 seker sayisi :2
                 Output : Yilda 12.41 kg seker kullaniyorsunuz

        System.out.println("yıllık seker tüketiminiz : "+(caySayisi*seker*1.7*365)/1000+"kg");

          */

       Scanner s = new Scanner(System.in);

       System.out.println("çay sayısı:");

       int çay=s.nextInt();

       System.out.println("şeker sayısnı giriniz:");

       int şeker =s.nextInt();

       System.out.println("yıllık şeker tüketimi:"+ (çay*şeker*365*1.7)/1000+"kg");

      // Scanner sc=new Scanner(System.in);



















    }
}
