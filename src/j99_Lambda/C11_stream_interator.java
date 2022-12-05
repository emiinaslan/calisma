package j99_Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C11_stream_interator {
    public static void main(String[] args) {
        System.out.println("toplaAmele(5) = " + toplaAmele(10));
        System.out.println("=======================================");
        System.out.println("toplaCincix(10) = " + toplaCincix(10));
        System.out.println("=======================================");
        System.out.println("toplaCift(24) = " + toplaCift(24));
        System.out.println("=======================================");
        System.out.println("toplaİlkXsayi(10) = " + toplaİlkXsayi(10));
        System.out.println("=======================================");
        System.out.println("ilkXtekSayi(10) = " + ilkXtekSayi(10));
        System.out.println("=======================================");
        ilkXkuvveti(7);
        System.out.println("=======================================");
        System.out.println("Task 08= " + istenensayi2inciKvt(10, 2));


    }//main sonu

    public static int toplaAmele(int x){
        int toplam=0;
        for (int i = 0; i < x; i++) {
            toplam+=i;
        }
        return toplam;
    }
    //FUNCTİONAL PROGRAMİNG (CİNCİX CODE...)

    public static int toplaCincix(int x){
       return IntStream.
               range(1,x+1).// 1 dahil x+1 hariç ->1 2 3....x int sayıların'dan aralık tanımlandı
               sum();//akışa giren 1,2,3....x tam satyılar toplandı

    }
      //TASK 02 ===>1'den x'e kadar çift tamsayıları toplayan bir program create ediniz
public static int toplaCift(int x){
    return  IntStream.
            // range(1,x+1).
    rangeClosed(1,x).
            filter(C02_filter::çiftMi).
            sum();
}
     //TASK03 => ilk x pozitif cift tam sayıyı toplayan code create ediniz
public  static int toplaİlkXsayi(int x) {
   return IntStream.iterate(2, t -> t + 2).//2'den başlayıp 2 artıran tekrar işlemi tanımlandı=>2,4,6,8....
    limit(x).//akıştaki ilk x eleman akışa alınır
    sum();//akıştaki ilk x eleman toplanır
    //iterate(seed, repeat action) --> seed'den başlayarak repeat action'a göre  sonsuza kadar elemanları akısa alır.
}

    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
public static int ilkXtekSayi(int x){
        return IntStream.iterate(1,t->t+2).////1'den başlayıp 2 artıran tekrar işlemi tanımlandı=>2,4,6,8....
                limit(x).sum();
}
         //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public  static void ilkXkuvveti(int x){
 IntStream.iterate(2,t->t*2).// 2 den başlayıp 2 ile çarpılarak
        limit(x).forEach(C01_LambdaExpression::yazdir);
    }

//TASK 08 =>
public  static OptionalInt istenensayi2inciKvt(int istenensayı , int x){
   return IntStream.iterate(istenensayı,t->t*istenensayı).// istenen sayı dan başlayıp istenensayı ile çarpılarak tekrar işlemi tanımlanıd
            limit(x).
           skip(x-1).//akıştaki x den önceki elemanlar atlandı kalanlar akışa alındı
           findFirst();//
}



}//clas sonu

