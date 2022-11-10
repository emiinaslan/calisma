package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task15 {
    static Scanner sc = new Scanner(System.in);

     /*
     A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
     Bilet tarifesi:
     km birim fiyati : 0.10$
     yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
     12 ve 24 yas arasindaysa 10% indirim,
     65 yasindan buyukse 30% indirim,
     bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
      */

    public static void main(String[] args) {
        System.out.println("ASLAN Airlines'e hoşgeldiniz :)\nB C D rotasını seçiniz");
        String rota = sc.nextLine().toUpperCase();
        System.out.println("uçuş yönünü seçiniz\n-->0\nçift yön-->1\nseçiniz" );
        int ucusYön = sc.nextInt();
        System.out.println("yaşınız :");
        int yas = sc.nextInt();


        double fiyatB = 500 * 0.10;
        double fiyatC = 500 * 0.10;
        double fiyatD = 500 * 0.10;


        if (rota.equals("B") || rota.equals("C") || rota.equals("D")){

            if (yas>65){
                if (rota.equals("B")){
                    if (ucusYön==1){//çift yön
                        System.out.println("çift yön B şehri 65 yaş üstü indirimi :" + (fiyatB*0.7*0.8*2) + "$");

                    } else if (ucusYön==0) {
                        System.out.println("tek yön B şehri 65 yaş üstü indirimi :" + (fiyatB*0.7) + "$");

                    }else System.out.println("yönü seçiniz");

                } else if (rota.equals("C")) {//rota C şehri
                    if (ucusYön==1){//çift yön
                        System.out.println("çift yön C şehri 65 yaş üstü indirimi :" + (fiyatB*0.7*0.8*2) + "$");

                    } else if (ucusYön==0) {
                        System.out.println("tek yön C şehri 65 yaş üstü indirimi :" + (fiyatB*0.9) + "$");

                    }else System.out.println("yönü seçiniz");

                } else if (rota.equals("D")) {
                    if (ucusYön==1){//çift yön
                        System.out.println("çift yön D şehri 65 yaş üstü indirimi :" + (fiyatB*0.7*0.8*2) + "$");

                    } else if (ucusYön==0) {
                        System.out.println("tek yön D şehri 65 yaş üstü indirimi :" + (fiyatB*0.7) + "$");

                    }else System.out.println("yönü seçiniz");
                }else System.out.println("rota seçmediniz");

            } else if (yas<24 && yas>=12) {

            }else if (yas<12){

            }else System.out.println("standart tarife");


        }else System.out.println("hizmet dışı rota seçildi");









    }//main finis







}//
