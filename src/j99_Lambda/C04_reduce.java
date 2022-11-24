package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {
    public static void main(String[] args) {
        //Lambda'nın bir diğer ,ismi ||Lambda --> Stream API||
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 45, 46, 55, 35, 25, 67, 16));
       //List<Integer> sayi = new ArrayList<>(Arrays.asList( 49, 33, 7, 3,  45,  55, 35, 25, 67));
        System.out.println("\n ****** ");
        ciftKareMaxPrint(sayi);


    }//main sonu
//Task: List'in cift elemanlarının karelerinin wb buyuğünü print ediniz

private static void ciftKareMaxPrint(  List<Integer> sayi){
        Optional<Integer> maxElaman=sayi.
                stream().//List elemanları akışa alındı
                filter(C02_filter::çiftMi).//akıştaki list elemanları çift filtrelendi
                map(t->t*t).//filtrelenen cift akış elemanları karesi ile update edildi
                reduce(Math::max);//çift filtrelenen ve karesi alınan akış elemanları maxsimum elemanlara göre reduce-> azaltıldı
    System.out.println(maxElaman);
}


}//class sonu
