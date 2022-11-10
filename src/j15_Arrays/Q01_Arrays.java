package j15_Arrays;

import java.util.Arrays;

public class Q01_Arrays {
    public static void main(String[] args) {
        //elemanların karesini bulunuz

        int arr[]={2,6,4,5,8,9};
        for (int i = 0; i <arr.length ; i++) {

            arr[i]*=arr[i];//arr[i]=


        }
        System.out.println(arr);//bu referans değeri verir
        System.out.println("elemanların karesi :" + Arrays.toString(arr));

    }
}
