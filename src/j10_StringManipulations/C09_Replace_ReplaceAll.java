package j10_StringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {

        String str = "java canlara selam olsun java ile bolcana offer";
        System.out.println(str.replace('a', '*'));
        System.out.println(str.replace("can", "kan"));
        System.out.println(str.replaceFirst("a", "*"));
        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler
        System.out.println(str.replaceAll("\\s", "09"));
        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
// isim-soyisim : M*** B***
// kart no : ** ** ** 1234

/*
String isim = "Çigdem Merve";
        String soyad = "Şen";
        String kartNo = "1234567890123456";
        String yeniIsim = isim.charAt(0) + isim.substring(1).replaceAll("\\w", "*");
        String yeniSoyısım = soyad.charAt(0) + soyad.substring(1).replaceAll("\\w", "*");

        String yeniKartNo = "** ** ** **" + kartNo.substring(12);

        System.out.println("isim-soyisim :"+yeniIsim+" "+yeniSoyısım+ " kart no : "+yeniKartNo);
 */
        // Scanner sc =new Scanner(System.in);
        // System.out.println("adınız :");
        // System.out.println("soy ad :");
        // String soyad = sc.nextLine();
        // String ad = sc.nextLine();
        // System.out.println("kart no :");
        // String kartNo = sc.nextLine();
        // String yeniad = ad.charAt(0)+ad.substring(1).replaceAll("\\w","*");
        // String yenisoy = soyad.charAt(0)+soyad.substring(1).replaceAll("\\w","*");


        // System.out.println("isim-soyisim : "+yeniad+yenisoy+ "kart no :"+ yeninoo);

        //Scanner sc = new Scanner(System.in);
        //System.out.println("lütfen bir kelime girin");
        //String kelime1 = sc.nextLine();
        //String kelime2 = sc.nextLine();
        //String kelime3 = sc.nextLine();
        //String kelime4 = sc.nextLine();
        //System.out.println(kelime1.substring(0,1).toUpperCase()+kelime1.substring(1) + " "+ kelime2 +" " +kelime3 +" " + kelime4+".");

       // Scanner sc = new Scanner(System.in);
       // System.out.println("enter string :");
       // String s = sc.nextLine().toLowerCase();
       // if (s.startsWith("gh")) {
       //     System.out.println(s);
       // } else if (s.startsWith("g")) {
       //     System.out.println(s.charAt(0) + s.substring(2));
//
       // } else if (s.charAt(1) == 'h') {
       //     System.out.println(s.substring(1));
//
       // } else System.out.println(s.substring(2));



        Scanner sc = new Scanner(System.in);
        System.out.println("enter string :");
        String s = sc.nextLine();
        boolean içeriyormu= false;

        if (s.contains("xyz")){
            içeriyormu = true;
            System.out.println(içeriyormu);

        }else{
            içeriyormu = false;
            System.out.println(içeriyormu);
        }



    }
}
