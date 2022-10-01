package j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("bir gün girin :");
        String gün = sc.next().toLowerCase();
        switch (gün) {
            case "pazartesi", "salı", "çarşamba", "perşembe", "cuma":
                System.out.println("hafta içidir");
                break;
            case "cumartesi", "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gün giriniz");

        }


    }
}
