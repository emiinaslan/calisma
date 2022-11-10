package j13_break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

        //task--> girilen bir ifadedeki a sayısına kadar c print  eden code cerate edeniz

        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bişey gir :");
        String str = sc.nextLine();
        int aSayısı= 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)=='a'){
                aSayısı++;

            } else if (str.charAt(i)=='c') {

                break;
            }
            System.out.println("döngüde işleme giren karakter :" + str.charAt(i));
        }
        System.out.println("girdiğin cümledeki a sayısı :"+ aSayısı);
    }
}
