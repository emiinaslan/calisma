package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("yaş gir: ");
        int yas = sc.nextInt();
        if (yas > 18) {
            System.out.println("yasınız 18 den büyük");

        }
        else System.out.println("ehliyet alamazsınız");




    }
}
