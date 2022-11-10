package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task16 {
    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("---Kelime oyunu'na hoşgeldiniz---");
        System.out.println("  lütfen kelime giriniz\n\t\t\t'\n\t\t\t' ");
        String kelime = sc.nextLine();

        grlnKlmyOnylyrmu();
        System.out.println("oyuna devam etmek istiyor musunuz\nDevam etmek istiyorsanız\n1\nistemiyorsanız\n0");
        int ikinciOyunuDevam = sc.nextInt();
        switch (ikinciOyunuDevam){
            case 1 :
                System.out.println("eklemek istediğiniz kelimeyi girin");
                String eklemekİstenen = sc.nextLine();
                break;

        }






    }// main sonu





    public static void grlnKlmyOnylyrmu(){
        System.out.println("girilen kelimeyi onaylıyorsanız-->1\nOnaylamıyorsanız-->0");
        int onylıyormu = sc.nextInt();
        if (onylıyormu==1){


        }else System.out.println("oyunu 2.oyuncu kazandı");


    }//ONAYLIYORU MU
    public static int skorTablosu (int sayı){



        return sayı ;
    }











}//Class
