package L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Tam sayıyı giriniz :");
        int sayı = sc.nextInt();

        System.out.println("2.tam sayı giriniz :");
        int sayı2 = sc.nextInt();

        for (int i = sayı; i > sayı2; i++) {

            System.out.println(i);


        }
        System.out.println("çalışmadı");



    }
}
