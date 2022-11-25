package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,45,46,55,35,25,67,16));
        List<String> menu = new ArrayList<>(Arrays.asList("küşleme","küşleme","küşleme","soğanli" ,"trilçe" ,"bicbici" ,"buryan" , "melemen","cacık","kokorec","yaglama", "guvec","arapAşi","tantuni"));
        System.out.println("\n============================");
        alfbtkBykHarfTkrrsz(menu);
        System.out.println("\n============================");
        chrSytTersSıraPrint(menu);
        System.out.println("\n============================");
        krtktrSysKctnByg(menu);
        System.out.println("\n============================");
        hrfTrstnSırala(menu);
        System.out.println("\n============================");
        krktrlrniCiftSayılıKarelerini(sayi);
    }//main sonu
//List eleamnalarını alfabetik buyuk harf ve tekrarsız print ediniz
    public static void alfbtkBykHarfTkrrsz(List<String> menu){
        menu.
                stream().
                map(String::toUpperCase).
                sorted().
                distinct().
                forEach(t->System.out.print(t+" "));
    }
    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void chrSytTersSıraPrint( List<String> menu){
        menu.
                stream().
                map(String::length).//akıştaki String elemanlar karakter sayısına update edildi
                sorted(Comparator.reverseOrder()).
                distinct().forEach(t->System.out.print(t+" "));


    }
    // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static void krtktrSysKctnByg(List<String> menu){
        menu.
                stream().
                sorted(Comparator.comparing(String::length)).//akış length 'tine göre doğal sıra yapıldı
                forEach(t->System.out.print(t+" "));


    }
    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void hrfTrstnSırala(List<String> menu){
        menu.
                stream().//elemanlar akışa sunuldu
                sorted(Comparator.comparing(t->t.toString().//akıştan gelen elemanları String yaptık
                        charAt(t.toString().length()-1)).//akıştan gelen stringe çevirilen elemanların son harfini aldık
                        reversed()).//akıştan gelen son harflerin  tersten sıraladık
                forEach(t->System.out.print(t+" "));//print

    }
    // Task : listin elemanlarin karakterlerinin cift sayıların karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...

    public static void krktrlrniCiftSayılıKarelerini(  List<Integer> sayi){
        sayi.
                stream().filter(C02_filter::çiftMi).map(t->t*t).distinct().sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+" "));

    }


}//class sonu
