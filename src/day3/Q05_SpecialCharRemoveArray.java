package day3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Q05_SpecialCharRemoveArray {
    /*
Problem Tanımı :
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı

Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.
 */
    public static void main(String[] args) {

        ArrayList<String>arr=new ArrayList<>(Arrays.asList("$13"+"$15"+"$20"));

        System.out.println("toplam = " + getSum(arr));
    }

    public static int getSum(ArrayList<String> arr) {
        int sum=0;

        for (String w : arr) {
            String str= w.replace("$","");//$dolar işaretlerini hiçliğe dönüştürdük

            sum+=Integer.parseInt(str);// str'deki Stringleri İnteger'a cevirdik sum'a ekledik
        }

        if (sum<0){
            return -1 ;
        }else return sum;
    }
}
