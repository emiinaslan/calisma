package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
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
        System.out.println(Arrays.toString(arr));
        System.out.println("toplam :" + toplam);
int ortalama = toplam/sayı;
        System.out.println("ortalama = " + ortalama);
        int elemanSayısı=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama){
                elemanSayısı++;
            }
        }
        System.out.println("ortalamayı gçene eleman sayısı :" +elemanSayısı );
    }//main sonu

}
