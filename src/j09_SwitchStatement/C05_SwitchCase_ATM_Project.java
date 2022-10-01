package j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("yapmak istediğiniz işlemi girin: ");

        System.out.print("bakiye-->1\npara yatırma-->2\nPara çekme-->3\nçıkış-->4\n giriniz: ");
        int seçim = sc.nextInt();
        int bakiye = 1000;




        switch (seçim) {
            case 1:
                System.out.println("bakiyen: " + bakiye);
                break;
            case 2:
                System.out.println("yartırılacak miktar");
                int yatırılan = sc.nextInt();
                bakiye+=yatırılan;
                System.out.println("yeni bakiyeniz: " + bakiye  );
                break;
            case 3:
                System.out.println("çekilmek istenen tutarı girin:");
                int çekilen = sc.nextInt();
                if (çekilen > bakiye) {
                    System.out.println("bakiye yetersiz hocam");
                } else System.out.println("yeni bakiye :" + (bakiye - çekilen));


                break;
            case 4:
                System.out.println("güle güle :)");
                break;
            default:
                System.out.println("yanlış seçim yaptınız");



        }


    }
}
