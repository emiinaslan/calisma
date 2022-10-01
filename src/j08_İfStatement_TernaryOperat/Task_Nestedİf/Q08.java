package j08_İfStatement_TernaryOperat.Task_Nestedİf;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ürün adedi :");
        int adet=sc.nextInt();

        System.out.print("liste fiyatı: ");
        double fiyat= sc.nextDouble();

        System.out.println("kartınız var ise 1 yoksa 2 yazın");
        int kart= sc.nextInt();
        if (kart==1 && adet>10){
            System.out.println("indirimli tutar: "+ (fiyat/100)*(20));
            if (kart!=2){
                System.out.println("indirimli tutar :"+(fiyat/100)*15);
            }


        }

















    }

}
