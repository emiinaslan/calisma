package day1;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("bir String giriniz: ");
        String str=sc.nextLine();

        System.out.println("bir sayı giriniz: ");
        int sayı=sc.nextInt();


        System.out.println("ilkSonHarf(str,sayı) = " + ilkSonHarf(str, sayı));


    }

    private static String ilkSonHarf(String str, int sayı) {
        String ilkSonHarf=str.substring(0,1)+str.substring(str.length()-1);
        String output="";

        for (int i = 0; i <sayı ; i++) {

            output+=ilkSonHarf;

        }
        return output;
    }
}/*
 * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
 * return eden metod yaziniz
 *
 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 */
