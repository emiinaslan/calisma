package j15_Arrays;

import java.util.Arrays;

public class C06_MdArrays {
    public static void main(String[] args) {
        //MdArray tanımlama...
        int arr1 [][]=new int[3][5];//3 katlı 5 daireleri boş apartman // 3 satır 5 sütun
        // bir sitede 10 dairelik 8 katlı 6 apartman var
        // Trıck --> Arryi uzunlukları ile tanımlamak için inner(daire)
        int site[][][]=new int[6][8][10];
        //24 kişilik 3 sınıf ve 21 kişilik 5 sınıfı olan okul nasıl array olarak tanımlanır
        int sınıf24[][]=new int[3][24];
        int sınıf21[][]=new int[5][21];
        // MdArray eleman ekleme
        arr1[2][4]=35;
        arr1[0][3]=34;//0.kat 3 dairenin değeri 34 atandı

        System.out.println(arr1[0][3]);
        //elemanları girilerek array tanımlama
        int arr [][]={
                {1,2,3},
                {10,20},
                {101} } ;
        //101 eleman index->arr [2][0]




        //MdArray elemanları print etme
        System.out.println(arr[1]);
        System.out.println("Arrays.toString(arr[1]) = " + Arrays.toString(arr[1]));
        System.out.println(arr[1][0]);

        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));


    }//main
}
