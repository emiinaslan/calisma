package L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        //----> girilen tam sayının tam bölen sayısını print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("bir tam sayı girin :");
        int sayı = sc.nextInt();
        int bölensayılar = 1;
        int tamBölen=0;
        while (bölensayılar<=sayı){

            if (sayı%bölensayılar==0){
                tamBölen++;




            }
            bölensayılar++;//loop sonsuza düşmesin diye
        }


        System.out.println("ağam " + sayı + " nın " + tamBölen+" kadar böleni var" );



    }//main sonu
}
