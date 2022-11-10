package j15_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //Arry elemanı varlığını kontrol etme

        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};

        int sayi=1;

        boolean flag = false ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==sayi){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("sayı arryde var ");
        }else System.out.println("arry de yok");


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 34));//method aranan elamanının index ini return eder
        System.out.println(Arrays.binarySearch(arr, 21));//olmayan eleman olsaydı kaçıncı sırada olacağınıu (-)ile cevap verir
        System.out.println(Arrays.binarySearch(arr, 1));//olmayan eleman olsaydı kaçıncı sırada olacağınıu (-)ile cevap verir
        System.out.println(Arrays.binarySearch(arr, 7));//olmayan eleman olsaydı kaçıncı sırada olacağınıu (-)ile cevap verir

    }//main sonu
}
