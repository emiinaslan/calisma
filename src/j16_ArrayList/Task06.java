package j16_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        int sayiArr[]=new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <sayiArr.length ; i++) {
            System.out.println(i+ 1 +  " elemanı giriniz :");
            sayiArr[i]= sc.nextInt();
        }

        System.out.println("tekElemanlar(sayiArr) = " + tekElemanlar(sayiArr));

    }//main sonu

    private static ArrayList<Integer> tekElemanlar(int[] sayiArr) {
        ArrayList<Integer>tekSayılar = new ArrayList<>();
        for (int i = 0; i <sayiArr.length ; i++) {
            if (sayiArr[i]%2 ==1 ){
                tekSayılar.add(sayiArr[i]);
            }
        }
        return tekSayılar ;
    }


}
