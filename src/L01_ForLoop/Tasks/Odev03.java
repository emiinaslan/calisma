package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz :");
        int sayı = sc.nextInt();
        
        getAsalMi(sayı);
        
        
        
        
    }//main sonu

    private static void getAsalMi(int sayı) {
        for (int i =0 ; i < 0; i++) {

            if (sayı/sayı==0){
                boolean aslan = true;
                System.out.println("hjjhjh");
            }
        }
    }
}
