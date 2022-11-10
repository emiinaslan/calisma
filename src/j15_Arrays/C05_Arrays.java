package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy--->copyOf(arr,newLenght)
        int sayi[]={63,21,47,27,35,12,36,31,46,24};
        int yeniArr[]= Arrays.copyOf(sayi,5);
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));
        int baskaArry[]=Arrays.copyOfRange(sayi,3,8);//3 dahil 8 hariç index elemanlar kopyalanır
        System.out.println("Arrays.toString(baskaArry) = " + Arrays.toString(baskaArry));
        //Array'in belirli bir eleman ile update(set)etme ... fill(arr,value);
        Arrays.fill(sayi,99);//
        System.out.println("Arrays.toString(sayi) = " + Arrays.toString(sayi));
        Arrays.fill(sayi,3,7,33);//3.4.5.6 index elemanları 33 ile update edildi
        System.out.println("Arrays.toString(sayi) = " + Arrays.toString(sayi));











    }
}
