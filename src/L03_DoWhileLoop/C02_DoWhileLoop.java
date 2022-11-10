package L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        //Task --> girilen sayı 17 den küçük ise kazanfdınız büyük ise kaybettiniz print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println( "ağam sayı gir :");
        int agaSayısı = sc.nextInt();

        do {
            System.out.println("ağam kazandınız");
agaSayısı++;
        }while (agaSayısı<16);
        System.out.println("kaybettin");



    }
}
