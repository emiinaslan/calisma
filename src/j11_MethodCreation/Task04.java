package j11_MethodCreation;

import java.util.Scanner;

public class Task04 {

   static Scanner sc = new Scanner(System.in);
   static int bakiye = 1000;

    public static void main(String[] args) {
        System.out.println("menü:)\nbakiye-->1\npara yatırma-->2\nPara çekme-->3\nçıkış-->4");

        secim();


    }//main fnish

    private static void secim() {

        System.out.println("yapmak istediğiniz işlemi seçiniz :");
        int seçim = sc.nextInt();
        switch (seçim){

            case 1:
                bakiye();
                break;

            case 2:
                paraYatır();
                break;
            case 3:
                paraÇek();
                break;
            case 4:
                çıkış();
                break;
            default:
                System.out.println("hatalı tuş   tekrar seçiniz");
                secim();
        }
    }

    private static void çıkış() {
        System.out.println("güle güle :)");

    }

    private static void paraÇek() {System.out.println("çekilmek istenen tutarı girin:");
        int çekilen = sc.nextInt();
        if (çekilen > bakiye) {
            System.out.println("bakiye yetersiz hocam");
            paraÇek();
        } else System.out.println("yeni bakiye :" + (bakiye - çekilen));
        karar();

    }

    private static void paraYatır() {System.out.println("yartırılacak miktar");
        int yatırılan = sc.nextInt();
        bakiye+=yatırılan;
        System.out.println("yeni bakiyeniz: " + bakiye  );
        karar();
    }

    private static void bakiye() {
        System.out.println("bakiyen: " + bakiye);
        karar();

    }
    public static void karar(){
        System.out.println("devam etmek istiyorsanız--1\nçıkış için-->0");
        int karar = sc.nextInt();
        if (karar==1){System.out.println("menü:)\nbakiye-->1\npara yatırma-->2\nPara çekme-->3\nçıkış-->4");
            secim();
        }else if (karar == 0)
            çıkış();
        else System.out.println("0 yada 1 giriniz");
        secim();

    }


}
