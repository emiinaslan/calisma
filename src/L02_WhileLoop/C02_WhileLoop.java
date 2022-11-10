package L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //----> girilen tam sayının rakamları toplamını print eden method create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("bir tam sayı girin :");
        int tamSayı = sc.nextInt();

        System.out.println("sayılarınToplamı(tamSayı) = " + sayılarınToplamı(tamSayı));


    }//main sonu

    private static int sayılarınToplamı(int tamSayı) {
        int toplam = 0;
        while (tamSayı > 0) {
            toplam += tamSayı % 10;
            tamSayı /= 10;


        }
        return toplam;
    }
}
