package j11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // girilen 3 notun ortalamasını hesdaplayan code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.print("1.notunuzu giriniz :");
        double not1 = sc.nextDouble();


        System.out.print("2.notunuzu giriniz :");
        double not2 = sc.nextDouble();



        System.out.print("3.notunuzu giriniz :");
        double not3 = sc.nextDouble();
        double ortalamanız;
        ortalamanız = ortalamaHesapla(not1,not2,not3);
        System.out.println("not ortalmanız :" + ortalamanız);


    }

    public static double ortalamaHesapla(double a, double b, double c) {
        return (a+b+c) / 3;
    }
















}
