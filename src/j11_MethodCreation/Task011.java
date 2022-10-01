package j11_MethodCreation;

import java.util.Scanner;

public class Task011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("sayı 1 :");
        int sayı1 = sc.nextInt();

        System.out.println("sayı 2 :");
        int sayı2 = sc.nextInt();

        System.out.println(esitKontrol(sayı1, sayı2));
        System.out.println(esitKontrol(sayı1, sayı2));
        System.out.println(esitKontrol(3,5));
        System.out.println(esitKontrol(33,33));
        esitKontrol2(56,67);
        esitKontrol2(61,61);



    }//main bitiş

    private static boolean esitKontrol(int sayı1, int sayı2) {
        boolean esitMi = false ;
        if (sayı1==sayı2){
            esitMi = true;

        }else esitMi = false ;

        return esitMi ;
    }
public static void esitKontrol2(int a, int b){
        if (a==b){
            System.out.println("eşit");
        }else System.out.println("eşit değil");
}

}//clas bitiş
