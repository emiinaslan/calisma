package j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("bir ay giriniz :");
        int ay = sc.nextInt();
        switch (ay) {
            case 12, 1, 2:
                System.out.println("kış");
                break;
            case 3, 4, 5:
                System.out.println("ilk bahar");
                break;
            case 6, 7, 8:
                System.out.println("yaz");
                break;
            case 9, 10, 11:
                System.out.println("son bahar");
                break;

            default:
                System.out.println("ay giriniz");
        }


    }
}
