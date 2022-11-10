package j15_Arrays;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //--> girilen int array elemanları toplamını print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("kaç elemanlı  ");

        int sayı =sc.nextInt();

        int arr[]=new int[sayı];
        int toplam =0;

        for (int i = 0; i <sayı ; i++) {
            System.out.print(i+". index elamanı giriniz :");
            arr[i]=sc.nextInt();
            toplam+=arr[i];

        }

        System.out.println("toplam :" + toplam);
        for (int a :arr) {
          //  toplam+=arr;
        }

    }//

}
