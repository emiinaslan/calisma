package j13_break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {
    /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("mail girniz :");
        String mail = sc.nextLine();
        for (int i = 0; i < mail.length(); i++) {//0 index ten mail indexe kadar her karakteri döngüye al
            char c = mail.charAt(i);//döngüde kii her bir karakteri c ye atar
            if (c == ' ') {// c de @ karakteri varsa if blok run edilir
                continue;
            }
            System.out.print(c);
        }



    }//main sonu










}
