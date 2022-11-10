package j15_Arrays;

import java.util.Arrays;

public class Q02_Arrays {
    public static void main(String[] args) {

     int arr[]={1,2,3,4,5,6,7};
     int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
        }     double ortalama = toplam/arr.length;
        System.out.println("ortalama = " + ortalama);



    }
}
