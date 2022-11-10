package haftanınTaski;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPaneli {
    public static void giris(){

        Scanner sc = new Scanner(System.in);
        kayıt yeniKAyıt = new kayıt();//KAyıt Clas'erişim için prametresiz cons. ile yeni kayıt obj si ürettik


        ArrayList<Kullanıcı> kisi = new ArrayList<>();//Kullanıcı Class'dan uretilen obj tutulacağı bos list
        boolean cıkılsınMI = true;

        while (cıkılsınMI) {
            System.out.println("agam çıkmak için\n1->Kayıt Al\n2->Şanslı Kişi Bul\n3->Listele\n4->Çıkış\nSeçermisin: ");
            int tercih = sc.nextInt();
            switch (tercih) {
                case 1:
                    kisi=yeniKAyıt.kayıtAl();//KAyıt Class'dan yeniKayıt obj kayıtAl() method call edildi
                    break;
                case 2:
                    yeniKAyıt.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKAyıt.listele(kisi);
                    break;
                case 4:
                    cıkılsınMI = false;
                    break;
                default:
                    System.out.println("agam adam akıllı bir şey gir");
                    break;
            }


        }





    }

}
