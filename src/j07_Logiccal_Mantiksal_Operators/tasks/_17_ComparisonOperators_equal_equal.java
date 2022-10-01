package j07_Logiccal_Mantiksal_Operators.tasks;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */

        Scanner sc= new Scanner(System.in);
        System.out.print("numara 1'i giriniz: ");
        int num1= sc.nextInt();
        System.out.print("numara 2'yi giriniz: ");
        int num2= sc.nextInt();
        System.out.println(num1==num2);




    }
}
