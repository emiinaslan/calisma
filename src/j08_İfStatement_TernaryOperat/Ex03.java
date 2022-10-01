package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("agam yıl gir: ");
        int yıl = sc.nextInt();
        if ((yıl % 4 == 0) && (yıl % 100 != 0) || (yıl % 400 == 0)) {
            System.out.println("artık yıl");
        } else {
            System.out.println("artık yıl değil");
        }


    }


}

