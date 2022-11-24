package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_filter {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,45,46,55,35,25,67,16));
        prinetÇiftElemanStructured(sayi);
        System.out.println("\n ****** ");
        prinetÇiftElmnFunctional(sayi);
        System.out.println("\n ****** ");
        prinetÇiftElmnFunctional1(sayi);

    }//main sonu
    public static void prinetÇiftElemanStructured(List<Integer> sayi){//amele code
        for (Integer w :sayi) {
            if (w%2==0)
                System.out.print(w+" ");
        }

    }

    public static void prinetÇiftElmnFunctional(List<Integer> sayi){

        sayi.
                stream().//list elemanları akışa alındı
                filter(t->t%2==0).//lisrt elemanları çift olmayansına göre filtreklendi akıştan çıkarıldı->lambda exp.. bad practice
                forEach(C01_LambdaExpression::yazdir);//C01 class'taki yazdır method call edildi

    }

public static boolean çiftMi(int x){


        return x%2==0;
}
    public static void prinetÇiftElmnFunctional1(List<Integer> sayi){

        sayi.
                stream().//list elemanları akışa alındı
                filter(C02_filter::çiftMi).//lisrt elemanları çift olmayansına göre filtreklendi:akıştan çıkarıldı->method ref. best practice
                filter(C02_filter::çiftMi2).
                forEach(C01_LambdaExpression::yazdir);//C01 class'taki yazdır method call edildi

    }
    public static boolean çiftMi2(int x){

        return x<35;
    }

    public static void prinetÇiftElmnFunctional2(List<Integer> sayi){

        sayi.
                stream().//list elemanları akışa alındı
                filter(t->t%2==0||t>34).//lisrt elemanları çift olmayansına göre filtreklendi:akıştan çıkarıldı->method ref. best practice

                forEach(C01_LambdaExpression::yazdir);//C01 class'taki yazdır method call edildi

    }
}//Clas sonu
