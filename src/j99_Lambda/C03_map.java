package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 45, 46, 55, 35, 25, 67, 16));
        System.out.println("\n ****** ");
        ciftKarePrint(sayi);
        //System.out.println("sayi = " + sayi);
        System.out.println("\n ****** ");
        tekElemanlarınKüpünBirFazlası(sayi);
        System.out.println("\n ****** ");
        kareKök(sayi);

    }//main sonu

    public static void ciftKarePrint(List<Integer> sayi) {
        sayi.stream().//List elemanlarıu akışa alındı
                filter(C02_filter::çiftMi).//akıştaki çift elemanlar filtrekendi
                map(t -> t * t).//akışta filtrelenen cift elemanlar karesi alınarak update edildi akısa sokuldu
                forEach(C01_LambdaExpression::yazdir);//akışta filtrelenmiş çift elemanların karesi alınıp işaretlenen akışa print edildi


    }

    public static void tekElemanlarınKüpünBirFazlası(List<Integer> sayi) {
        sayi.
                stream().//List elemanlarıu akışa alındı
                filter(C03_map::tekMi).//yöntem2-> (.filter(t->t%2==1))//akıştaki çift elemanlar filtrekendi
               //map(t -> t * t * t + (1)).//akışta filtrelenen cift elemanlar karesi alınarak update edildi akısa sokuldu
                map(t->(int)Math.pow(t,3)+1).
                forEach(C01_LambdaExpression::yazdir);//akışta filtrelenmiş çift elemanların karesi alınıp işaretlenen akışa print edildi


    }
public static boolean tekMi(int x){
        return x%2==1;
}

    public static void kareKök(List<Integer> sayi) {
        sayi.
                stream().//List elemanlarıu akışa alındı
                filter(C02_filter::çiftMi).//yöntem2-> (.filter(t->t%2==1))//akıştaki çift elemanlar filtrekendi
                        map(Math::sqrt).//
                forEach(t->System.out.print(t+" "));//akışta filtrelenmiş çift elemanların karesi alınıp işaretlenen akışa print edildi


    }



}//class sonu
