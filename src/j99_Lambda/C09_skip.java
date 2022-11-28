package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_skip {
    public static void main(String[] args) {
//skip(n)=> atlama demek. Akışın ilk n elemanına attıktan sonra bu akıştan kalan elemabnlardan olşuşan bir akış return eder
        // akış n den daha az eleman içeriyorsa skip(n) method'tan sonra  boş akış return eder skip ara işlemdir
        List<String> menu = new ArrayList<>(Arrays.asList("küşleme","soğanli" ,"trilçe" ,"bicibici" ,"buryan" , "melemen","cacıx","kokorec","yaglama", "guvec","arapAşi","tantuni"));
        System.out.println("\n============================");
        lstElmnlrnnSnHrfi(menu);




    }//main sonu
    //Task: list elemanlarını son harfine göre siralayıp ilk iki eleman hriç elemanları print ediniz

    public static void lstElmnlrnnSnHrfi( List<String> menu){

        System.out.println(Arrays.asList( menu.
                stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length()-1))).//akıştaki elemanları son karakterlerine göre sıralandı
                skip(2).//akıştaki ilk 2 eleman akıştan atıldı
                toArray()//akış elemanları Array' e atandı
        ));
        menu.stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length()-1))).//akıştaki elemanları son karakterlerine göre sıralandı
                skip(2).forEach(t->System.out.println(t+" "));


    }






}//class sonu
