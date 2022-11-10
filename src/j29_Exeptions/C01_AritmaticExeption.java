package j29_Exeptions;

import java.util.Scanner;

public class C01_AritmaticExeption {
    //ArithmeticException:
    public static void main(String[] args) {
        String str ="";
        //str.charAt(2);//Rte
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int sayı1= sc.nextInt();

        System.out.println("lütfen sayı giriniz");
        int sayı2= sc.nextInt();

        int oran;//-->(rte)->.ArithmeticException: / by zero

        try {//-> hatanın olma ihtimalinin olduğu code bloğudur
            /*
            1-)try catch kullanıldığında try block hatsız çalışırsa catch block asla çalışmaz
            2-) try block catch veya finally olmadan cte verir try blocktan sonra birden fazla catch bloc tanımlana bilir
            aynı anda 1 carch block çalışa bilir hiç bir catch block çalışmaya bilir
            3-) parent -child ilişkisi olan catch'lerde child önce yazılmalı yoksa CTE

             */
            oran =sayı1/sayı2;//

            System.out.println(oran);
            System.out.println("try blacktan selamlar");

        }catch (ArithmeticException falanfilan){
           System.out.println("bölen sıfır olamaz"+falanfilan.getMessage());
           falanfilan.printStackTrace();//oluşan excaption'un tüm detay bilgisini
           System.out.println("çırak catchden selamlar");

       }catch (ArrayIndexOutOfBoundsException arryExc){

          System.out.println("agam arryde olmaytan eleman istiyorsun");

       }
       catch (Exception e){//hata yakalandığında yapılşacak işlem aksiyon

           System.out.println("0 bölmez:(");
           System.out.println("ustadan selam");
        }
        finally {
            /*
            try-catch için de yapılan işlemlerden sonra mutlaka çalışması gereken block varsa
            finaly tanımlanır hata durumdacatch çalışmazsa pr sonlanır ama finaly catch çalışmazsa bile
            pr akışı devam eder. Finaly block hata  olsada çalışır olmasa da çalışırr
            Cloud database ortamlarında bağlantı kesmek için çalışır.
            cloud ile connetion bağlantı yazdoğınız d code başarılşı bir lekiklde çalkışrsa işlem bittiğim de finally ile
            connetion kapanmazsa sartaırına pahalı olur
            */
            System.out.println("ağam finally blocktan selam");
        }
        //catch (ArithmeticException falanFilan){

        //}

        System.out.println("selam devam");// progaramın sonuna kadar sorunsuz çalıştığını kontrol eder
    }
}
