package j11_MethodCreation;


import java.util.Scanner;

public class Taks04_10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("kaç sayı toplamak istiyorsunuz :");

        secim();

    }//main sonu

    private static void ikisayıTopla() {
        System.out.println("iki sayı giriniz");
        double sayı1 = sc.nextDouble();
        double sayı2 = sc.nextDouble();
        System.out.println("sayılarınızın toplamı :" + sayı1 + sayı2);
        secim();

    }

    private static void ucSAyıtopla() {
        System.out.println("üç sayı giriniz");
        double sayı1 = sc.nextDouble();
        double sayı2 = sc.nextDouble();
        double sayı3 = sc.nextDouble();
        System.out.println("sayılarınızın toplamı :" + sayı1 + sayı2 + sayı3);
        karar();

    }

    private static void dörtSayıTopla() {
        System.out.println("dört sayı giriniz");
        double sayı1 = sc.nextDouble();
        double sayı2 = sc.nextDouble();
        double sayı3 = sc.nextDouble();
        double sayı4 = sc.nextDouble();
        System.out.println("sayılarınızın toplamı :" + sayı1 + sayı2 + sayı3 + sayı4);
        karar();
    }

    public static void karar() {
        System.out.println("toplama işlemine devam etmek istiyor musunuz\nistiyorum-->1\nistemiyorum-->0");
        int karari = sc.nextInt();
        if (karari == 1) {
            secim();

        } else if (karari == 0) {
            System.out.println("güle güle");
            karar();

        }
    }

    public static void secim() {

        int adet = sc.nextInt();

        if (adet < 2) {
            System.out.println("en az 2 sayı giriniz");
            karar();

        } else if (adet == 2) {
            ikisayıTopla();

        } else if (adet == 3) {
            ucSAyıtopla();

        } else if (adet == 4) {
            dörtSayıTopla();

        } else System.out.println("çok sayı girdiniz ben toplamam");
    }


}
