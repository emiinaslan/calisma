package j08_İfStatement_TernaryOperat;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        task-->girilen karakterin harf olup olmadıpını kontrol edin
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("karakter gir: ");
        char sh = sc.nextLine().charAt(0);
        if ((sh >= 'A' && sh <= 'Z' ) || (sh >= 'a' && sh <= 'z')){
            System.out.println("girdiğiniz karakter harftir");

        }
        else System.out.println("harf değildir");



    }


}

