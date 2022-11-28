package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class C08_limit {
    public static void main(String[] args) {
    //limit(a) akıstan cıkan elemanları a parametresine göre ilk a elemanı alır
        List<String> menu = new ArrayList<>(Arrays.asList("küşleme","küşleme","küşleme","soğanli" ,"trilçe" ,"bicibici" ,"buryan" , "welemen","cacıx","kokorec","yaglama", "guvec","arapAşi","tantuni"));
        System.out.println("\n============================");
        enBüyük(menu);

    }//main sonu
    //Task: Karakter sayisi en büyük elemanı yazdırınız

    public static void enBüyük( List<String> menu) {
        Stream<String> sonİsim1 = menu.
                stream().
                sorted(Comparator.comparing(String::length).//
                        reversed()).//reversed() tersten sıralıyor
                        limit(1);//akıştaki ilk 1 eleman alındı
        //System.out.println(sonİsim);//referance değerlerini yazdırır-> limit meth bir stream yani akış (birden çok eleman)
        //dolayısıyla limit çıktısı doğrudan sou ile print edilemez limnit çıktısı list veya array
        System.out.println(Arrays.toString(sonİsim1.toArray()));

        Object [] sonİsim2 = menu.
                stream().
                sorted(Comparator.comparing(String::length).//
                        reversed()).//reversed() tersten sıralıyor
                        limit(1).toArray();
        System.out.println(Arrays.toString(sonİsim2));

      menu.
                stream().
                sorted(Comparator.comparing(String::length).//
                        reversed()).findFirst();



    }




}//class sonu
