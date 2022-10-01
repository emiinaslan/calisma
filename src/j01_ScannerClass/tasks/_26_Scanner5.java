package j01_ScannerClass.tasks;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */

        Scanner scan = new Scanner(System.in);

        System.out.println("10 sene önce hangi şehirde yaşıyordunuz:");

        String şehir=scan.nextLine();

        System.out.println("10 sene önceki şehir:"+şehir);




    }
}
