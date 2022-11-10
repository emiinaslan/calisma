package j11_MethodCreation.tasks;

import java.util.Scanner;

public class C0111_Taks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("string giriniz :");
        String str = sc.nextLine();

        if (str.indexOf(" ")== -1 && !str.isEmpty()){
            System.out.println("şartlar sağlandı");
        }else System.out.println("şartlar sağlanmadı");


    }
}
