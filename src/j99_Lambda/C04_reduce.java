package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {
    public static void main(String[] args) {
        //Lambda'nın bir diğer ,ismi ||Lambda --> Stream API||
       // List<Integer> sayi1 = new ArrayList<>(Arrays.asList(1, 3, 5,4,6,12,8));
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 45, 46, 55, 35, 25, 67, 16));
       //List<Integer> sayi = new ArrayList<>(Arrays.asList( 49, 33, 7, 3,  45,  55, 35, 25, 67));
        System.out.println("\n ****** ");
        ciftKareMaxPrint(sayi);
        System.out.println("\n ****** ");
        listElemanTopla(sayi);
        System.out.println("\n ****fasdf** ");
        ciftElCarpPrint(sayi);
        yirmiDörtBüyükMü(sayi);


    }//main sonu
//Task: List'in cift elemanlarının karelerinin wb buyuğünü print ediniz

private static void ciftKareMaxPrint(  List<Integer> sayi){
        Optional<Integer> maxElaman=sayi.
                stream().//List elemanları akışa alındı
                filter(C02_filter::çiftMi).//akıştaki list elemanları çift filtrelendi
                map(t->t*t).//filtrelenen cift akış elemanları karesi ile update edildi
                reduce(Math::max);//çift filtrelenen ve karesi alınan akış elemanları maxsimum elemanlara göre reduce-> azaltıldı
    System.out.println(maxElaman);
    minBul(sayi);
}
//list'teki tüm elemanların toplamını print ediniz.
    public static void listElemanTopla(List<Integer> sayi){
        System.out.println("sayi.stream().reduce(Integer::sum) = " + sayi.
                stream().
                reduce(Integer::sum));//çıktı sout içine alındı

        Optional<Integer> toplam=sayi.//List çağırıldı
                stream().//elemanlar akışa alındı
                reduce(Integer::sum);//çıktı data'ya bağlandı

        System.out.println("sayi.stream().reduce(0,(a,b)->a+b) = " + sayi.stream().reduce(0, (a, b) -> a + b));//lambda expression
        /*
        a: il k değerini her zaöamn atanan indentity değerden alır
        b: değerini her zaman stream() askıştan alır
        a: ilk değerden sonraki değrlerini action(işlem body)'den alır.
         */
    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
public static void ciftElCarpPrint(List<Integer> sayi){
    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.

    System.out.println("sayi1.stream().filter(C02_filter::çiftMi).reduce(Math::multiplyExact) = " + sayi.stream().filter(C02_filter::çiftMi).reduce(Math::multiplyExact));

    System.out.println("sayi1.stream().filter(C02_filter::çiftMi).reduce(1,(t,u)->t*u) = " + sayi.stream().filter(C02_filter::çiftMi).reduce(1, (t, u) -> t * u));

}
// list'tekii elemanlardan en küçüğünü 4 farklı yontem ile print ediniz.
    public static void minBul(List<Integer> sayi){
        System.out.println("sayi.stream().reduce(Math::min) = " + sayi.stream().reduce(Math::min));//1.Yöntem
        System.out.println("sayi.stream().reduce(Integer::min) = " + sayi.stream().reduce(Integer::min));//2.Yöntem
        System.out.println("sayi.stream().reduce(C04_reduce::byEminMinBul) = " + sayi.stream().reduce(C04_reduce::byEminMinBul));//3.Yöntem
        System.out.println("sayi.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b ? a : b) = " + sayi.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b));//4.yöntem

    }
    public static int byEminMinBul(int a,int b){//
        return a<b ? a : b;
    }
//Task: List'teki 24'ten büyük en küçük tek sayiyi print edeniz
    public static void yirmiDörtBüyükMü(List<Integer> sayi){
        System.out.println("sayi.stream().filter(t->t>24&&t%2==1).reduce(Integer::min) = " + sayi.stream().filter(t -> t > 24 && t % 2 == 1).reduce(Integer::min));

    }



}//class sonu
