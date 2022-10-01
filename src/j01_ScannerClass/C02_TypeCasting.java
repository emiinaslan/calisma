package j01_ScannerClass;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {
        //boolean başarılı = true;
      // boolean başarı = başarılı;

        //System.out.println("başarılı = " + başarılı);
       // System.out.println("başarı = " + başarı);

        double d=17;
        System.out.println("d = " + d);// auto widding
        int sayi1=33;
        int sayi2=7;
        System.out.println(sayi1/sayi2);
        byte b=127;
        int i=b;
        System.out.println("i = " + i);
        int num=1453;
        double d1=num;
        System.out.println("d1 = " + d1);
        double db=d1/num;
        System.out.println("db = " + db);

        double d3=14.53;
        int num2= (int) d3;
        System.out.println("num2 = " + num2);

        int num3=150;




        double d4=333;
        long l=(long) d4;
        System.out.println("l = " + l);

        double d5=571.444;
        long l2=(long) d5;
        System.out.println("l2 = " + l2);

        Scanner s = new Scanner(System.in);
        System.out.println("ascii değerini istediğin karakteri gir:");
        char ch=s.nextLine().charAt(0);
        int chAsciiDegeri=ch;
        System.out.println(ch+" 'ın chAsciiDegeri = " + chAsciiDegeri);


    }
}
