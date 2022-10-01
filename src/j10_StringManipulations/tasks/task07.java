package j10_StringManipulations.tasks;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        /*
        girilen s
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("ad gir :");
        String str = sc.next();
        System.out.println("index gir :");
        int index = sc.nextInt();
        if (str.length()>index){
            System.out.println(str.substring(index,index+1));

        }else System.out.println("istdeğiniz index mevcut değğil");












    }


}
