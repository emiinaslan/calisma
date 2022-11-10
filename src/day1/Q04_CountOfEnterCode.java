package day1;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin="sümeyra12345";

        int girisHakki=4;
        Scanner sc=new Scanner(System.in);
        System.out.println("****HG*****");

        while (true){
            System.out.println("pin kodu giriniz: ");
            String girilenPin=sc.nextLine();
            if (pin.equals(girilenPin)){
                System.out.println("başarılı giriş yaptınız");
                break;
            }else {
                System.out.println("yanlıs giriş yaptınız");
                girisHakki--;
                System.out.println("kalan giriş hakkı:" + girisHakki);


            }if (girisHakki==0){
                System.out.println("giriş hakkınız kalmadı  sim kart bloke oldu");
                break;
            }


        }
    }
}
