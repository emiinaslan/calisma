package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        java pass by value bir proglama dilidir
        bir primitive variable argument olarak bir medhoda call edildiğinde
        variable değil bir copy clone (vesikalık) (pointer ) değeri gönderilir.

         */

        //Task -> verilen fiyat için %24 artırılmış print eden method create ediniz.


        double fiyat = 100;
        System.out.println("method call öncesi fiyat değeri = " + fiyat);

        fiyatArttır(fiyat);// fiyat veriable method'a parametre call edildi

        System.out.println("method call sonrası fiyat değeri = " + fiyat);

    }// main sonu


    public static void fiyatArttır(double bisey) {
        bisey *= 1.24;
        System.out.println("artırılmış fiyat: " + bisey);

    }
}
