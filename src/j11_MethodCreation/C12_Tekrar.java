package j11_MethodCreation;

import java.awt.*;
import java.util.Scanner;

public class C12_Tekrar {
    public static void main(String[] args) {
        //task--> girilen 3 notun ortalamasını yapan method create ediniz.
        Scanner sc = new Scanner(System.in);

        System.out.println("1.not :");
        double not1 = sc.nextDouble();

        System.out.println("2.not :");
        double not2 = sc.nextDouble();

        System.out.println("3.not :");
        double not3 = sc.nextDouble();

     double ortalamanız = ortalamaHesapla(not1,not2,not3);
        System.out.println(ortalamaHesapla(23, 45, 17));
        System.out.println(" not ortalamanız = " + ortalamanız);


    }//main bitiş

    private static double ortalamaHesapla(double a, double b, double c) {

        return (a+b+c) / 3 ;
    }


}//clas bitiş
