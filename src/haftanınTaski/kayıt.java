package haftanınTaski;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class kayıt {
    ArrayList<Kullanıcı> kullanıcıkisiler = new ArrayList<>();//kullancı klassından oluşturulacak objleri

       //task 2.step
    public ArrayList<Kullanıcı> kayıtAl() {
        Scanner sc = new Scanner(System.in);
        System.out.print("adınızı giriniz: ");
        String ad = sc.nextLine();
        Kullanıcı k1 = new Kullanıcı(ad, LocalDateTime.now());//k1 obj name kullanıcıdan kayıtZamanı
        kullanıcıkisiler.add(k1);//oluşturulan k1 obj si liste eklendi

        return kullanıcıkisiler;// kullanıcıKisiler List'i method cıktısı return olarak tanımladı
    }
        // task'in 3.stepi
    public void sansliKullanici(ArrayList<Kullanıcı> kllObj) {//kullanıcı listeesindeki objlerin kayıtZamanı nın 10 sn az olup
        //olmamasına göre şanslı kullanıcı return eder

        for (Kullanıcı k : kllObj
        ) {
            if (k.kayıtZamanı.getSecond() <= 10) {
                System.out.println(k.name + "şanslı kişisin" + " " + "sisteme giriş zamanı: " + k.kayıtZamanı);
            } else System.out.println(k.name + "kaybettiniz");

        }


    }
    public void listele(ArrayList<Kullanıcı> kllObj){

        System.out.println(kllObj);



    }

}
