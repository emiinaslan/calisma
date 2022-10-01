import java.util.Scanner;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name="Esma";
        int yas=28;

        System.out.println(name.toLowerCase());//esma


       // String tc="12365478912";
        //String id="58964";

        //task: id ve String değerlerinin toplamını print eden code yazınız.

       // int yeniTc=Integer.parseInt(tc);// tc stirng değerini int çevirdi.//run time Exception: çalışma zamanı hatası
        //int yeniId=Integer.valueOf(id);// id stirng değerini int çevirdi
        //System.out.println("yeniTc = " + yeniTc);
        //System.out.println("yeniId = " + yeniId);

        //String okulNo="58964L";
       // int yeniOkulNo=Integer.valueOf(okulNo);
        //System.out.println("yeniOkulNo = " + yeniOkulNo);


        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.
        //task-- byte short int

        byte maxByteDegeri= Byte.MAX_VALUE;
        byte minByteDegeri= Byte.MIN_VALUE;

        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        Scanner scan = new Scanner(System.in);

        System.out.print("adınızı giriniz :");

        String ad=scan.nextLine();

        System.out.println("isim = " + ad);



        Scanner sca = new Scanner(System.in);

        System.out.println("sca");











    }
}