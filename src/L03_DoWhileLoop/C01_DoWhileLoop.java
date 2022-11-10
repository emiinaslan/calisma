package L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        /*
        while loop önce şart  kontrol edilir eğer true alınırsa body action çalışır
        do-While loop-> önce body action çalışır sonra şart kontrol edilir. Şart true ise döngü devam eder
        şart false ise döngü kırılır ve döngüden sonra ki ilk satır çalışır
        do-While loop-->
         */

        int yas = 31;

        while (yas < 33 ){
            System.out.println("agam yas :" + yas );

            yas++;
        }

        do {
            System.out.println("agam yas :"+yas);
            System.out.println("do while body action");
            yas++;
        }while (yas<33);




    }
}
