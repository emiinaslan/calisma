package j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {


        //--->girilen ay numarasına göre kaç gün çektiğini gösteren code create ediniz
        Scanner sc = new Scanner(System.in);

        System.out.print("bir ay numarası girin giriniz :");
        int ay = sc.nextInt();
        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                System.out.println("ay 31 gündür");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("ay 30 gündür");
                break;
            case 2:
                System.out.print("yıl giriniz: ");
                int yıl = sc.nextInt();
                if (yıl % 4 == 0) {
                    System.out.println("ay 29 gündür");
                } else System.out.println("ay 29 gündür");
                break;


            default:
                System.out.println("ay giriniz");
        }


    }
}
