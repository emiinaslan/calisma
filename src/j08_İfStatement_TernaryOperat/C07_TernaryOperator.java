package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class C07_TernaryOperator {
    public static void main(String[] args) {
/*
		 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
         %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
		 */
        Scanner sc = new Scanner(System.in);

        System.out.print("ürün miktarı :");
        int urunmik=sc.nextInt();

        System.out.println("ürün fiyatı");
        int fiyat= sc.nextInt();

        Double fatura = urunmik > 100 ? (urunmik*fiyat*0.67) : urunmik*fiyat;
        System.out.println("fatura = " + fatura);


    }
}
