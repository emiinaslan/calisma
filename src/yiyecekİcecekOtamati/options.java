package yiyecekİcecekOtamati;

import java.util.Scanner;

public class options {
   /*
Urun urun=new Urun();

1)kullanıcıya ürünleri gösteredfeğiz-> ürün classından bir obj toString
2)Scanner -> Scanner bir obj create ediniz.(productNum a set edilmeli,setProductNum())
3)Loop->do while loop->kullanıcı 1-7 rakamları arasında bir seçim yapmalı ve
eğer girmiş oldupu rakam 1 den küçük ya sda 7 den büyük ise döngğ devam etmeli ve
kulllanıcı 1-7 arasında bir seçim yapmaya force edilmeli
4)0 a basarak menüden çıkabilmeli--> yine bekleriz yazısı console a yazdıralım
5)kullanıcıdan productNum (1-7 arasında rakam{kullanıcı 1 rakamını seçerse ->Kraker, 2 kamanıseçerse->cips etc...}) switch case yapısı kurmalıyım
6)switch benden productNum ve alınan productNum a göre ilgili ürünün price ı alınmalı.urun.getKraker(),urun.getCips(),urun.getCocoCola(),etc...
(price set edebilmek için price ı setPrice() methodunu kullanmalıyım)
7)return olarak bana price dönmeli.return getPrice()(double)

 */

    public double select(ürün urun) {

        System.out.println(urun.toString());
        Scanner sc = new Scanner(System.in);



        do {
            System.out.println("lütfen 1 ile 7 arasında ürün seçiniz");
            System.out.println("çıkış için 0");
            urun.setProductNum(sc.nextInt());
            if (urun.getProductNum() < 0 || urun.getProductNum() > 7) {
                System.out.println("lütfen belirtilen aralıkta bir rakam giriniz");
            }
        } while (urun.getProductNum() < 0 || urun.getProductNum() > 7);

        switch (urun.getProductNum()) {
            case 0:
                System.out.println("yine bekleriz");
                break;
            case 1:
                urun.setPrice(urun.getKraker());
                break;
            case 2:
                urun.setPrice(urun.getCips());
                break;
            case 3:
                urun.setPrice(urun.getCocaCola());
                break;
            case 4:
                urun.setPrice(urun.getFanta());
                break;
            case 5:
                urun.setPrice(urun.getSu());
                break;
            case 6:
                urun.setPrice(urun.getCay());
                break;
            case 7:
                urun.setPrice(urun.getFiltreKahve());
                break;


        }
        return urun.getPrice();


    }

    public double balance(double pricee, double accountBalance, ürün urun) {
        double fonlama;
        while (accountBalance < pricee) {
            Scanner sc = new Scanner(System.in);
            System.out.println("yeterli bakiyeniz bulunmamaktadır\nekleme yapmak istiyor musun (Y/N)");

            char confirm = sc.next().toLowerCase().charAt(0);
            if (confirm == 'n') {
                System.out.println("mevcut bakiye :" + accountBalance);
                System.out.println("yine bekleriz");
                break;

            } else {
                System.out.println("ne kadar ekleme yapılacsjk");
                fonlama = sc.nextDouble();
                accountBalance = accountBalance + fonlama;
                System.out.println("yeni bakiyeniz" + accountBalance);
                pricee = select(urun);
            }
        }
        return accountBalance;
    }
}
