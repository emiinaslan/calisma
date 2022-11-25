package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_sorted {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 45, 46, 55, 35, 25, 67, 16));
        cftElmnKrlri(sayi);
        System.out.println("\n============================");
        byktnKcgPrnt(sayi);
    }//main sonu

    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.

public static void cftElmnKrlri(List<Integer> sayi){
    sayi.
            stream().//list elemanları akışa alındı
            filter(C02_filter::çiftMi).//akışa alınan elemanlar çift şartına göre filtreledi
            map(t->t*t).//filtrenen çift elemanları karelerine update edildi
            sorted().//akıştaki karesine update edilen elemanlar sıralandı(NO(doğal))
            forEach(C01_LambdaExpression::yazdir);//print
    //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
    //Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.
}
    // Task : list'in cift  elemanlarinin karelerini  buyukten  kucuğe print ediniz.
public static void byktnKcgPrnt(List<Integer> sayi){
        sayi.
                stream().
                filter(C02_filter::çiftMi).
                map(t->t*t).
                sorted(Comparator.reverseOrder()).//Comparator.reverseOrder() method call. edildi
                forEach(C01_LambdaExpression::yazdir);
    //reverseOrder() => Comparator Class'ının bir methodudur. Doğal sıralamanın tersini (büyükten küçüğe) uygulayan
// bir Comparator (karşılaştırıcı) return eder.
}




















}//clas sonu
