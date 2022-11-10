package j12_Lopps;

import java.util.Scanner;

public class T01_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen sıçrama yüksekliği giriniz :");
        double yukseklik = sc.nextDouble();

        double zip =0;
        double toplamYol = 0;

        do {
            yukseklik*=0.75;// 3 ile çarp 4 e böl
           // yukseklik/=4;
             zip+=1;
            toplamYol+=yukseklik+(yukseklik*0.75);
        }while (yukseklik>1);System.out.println("toplam sıçrama "+zip+"\ntoplam mesafe :"+toplamYol);

    }// main sonu
}
