package Task;

import java.util.Scanner;

public class Task08_Nested {
    public static void main(String[] args) {

        /*
        girilen boyutta kare çarpım tablosu print eden code create ediniz
         */


            Scanner scan = new Scanner(System.in);
            System.out.print("pozitif bir tam sayı giriniz : ");
            int sayi = scan.nextInt();

            for (int int1 = 1; int1 <=sayi; int1++) {//satır kontrolu
                for (int int2 = 1; int2 <= sayi; int2++) {//sutun kontrolu
                    System.out.print(" " + (int1 * int2));
                }
                System.out.println();
            }
    }
}
