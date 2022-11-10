package j13_break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {
        //--> string data typ bir pin datasını 3 girişi hakkıda kontorol eden code create ediniz.

        Scanner sc = new Scanner(System.in);


        String dgrPin = "javaCAN";
        int girisHakkı = 3;
        while (true) {
            System.out.println("şifre giriniz :");
            String pin = sc.nextLine();
            if (pin.equals(dgrPin)) {
                System.out.println("doğru pin");
                break;
            } else {
                System.out.println("tekrar giriniz");
                girisHakkı--;
                System.out.println("kalan deneme sayısı " + girisHakkı);
                if (girisHakkı == 0) {
                    System.out.println("hakkın bitti");
                    break;
                }

            }
        }

    }//
}
