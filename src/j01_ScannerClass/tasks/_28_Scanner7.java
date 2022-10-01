package j01_ScannerClass.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        Scanner scan = new Scanner(System.in);

        System.out.println("banka hesabınız var mı? true veya false olarak cevap veriniz:");

        boolean bh=scan.nextBoolean();

        System.out.println("");


    }
}
