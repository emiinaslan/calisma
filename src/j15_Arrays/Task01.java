package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task--> kullanıcıdan alınan datalarla int Arry create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("kaç elemanlı arry ");
        int arryBoyut =sc.nextInt();
        int arr[]=new int[arryBoyut];//
        for (int i = 0; i <arryBoyut ; i++) {
            System.out.print(i+". index elamanı giriniz :");
            arr[i]=sc.nextInt();

        }
        System.out.println("ağam istediğin : " + Arrays.toString(arr));
        Arrays.sort(arr);//arr k->b sortingen yapıldı
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
