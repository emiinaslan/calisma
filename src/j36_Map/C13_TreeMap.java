package j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
        /*
        TreeMap ->
        1.TreeMap key'lerde null değer tanımlanamaz. Fakat value'larda null değer tanımlana bilir
        2.TreeMap Elemanlarını key naturel order'a göre tanımlar
        3.TreeMap synchronized ve thread-safe dağildir
        4.TreeMap en yavaş map turudur. app hızı için kullanılırken çok dikkat edilmelidir
         */
        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(104,"uğur");
        tm.put(103,"enise");
        tm.put(102,"kevser");
        tm.put(101,"fatih");
        tm.put(105,"emine");
        System.out.println("tm = " + tm);
       // tm.put(null,"fatih");//NullPointerException
        tm.put(104,"hüma");
        tm.put(106,null);
        tm.put(107,null);
        System.out.println("tm = " + tm);

        HashMap<String,String> hm=new HashMap<>();
        hm.put("amazon","296 euro");
       // hm.put(null,"200 euro");
        //hm.put(null,"222 euro");
        //hm.put("ebay",null);
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("Apple store","500 euro");//Apple store key'deki value 333 euro iken 500 euro olarak uptade edildi
        hm.put("MediaMark","333 euro");
        System.out.println("hm = " + hm);

        TreeMap<String,String>tm1=new TreeMap<>(hm);
        System.out.println("tm1 = " + tm1);//

        tm.ceilingKey(103);//ceilingKey(103);--> method parametre olarak girilen key değer map'de varsa return eder
        //yoksa parametreden büyük en küçük değerini return eder
        //parametre map'te yok ve parametreden büyük en küçük key de yoksa null return eder
        //ceilingKey(Key)-> en küçük abi-abla
        System.out.println("tm.ceilingKey(103) = " + tm.ceilingKey(103));
        System.out.println("tm.ceilingKey(108) = " + tm.ceilingKey(108));
        System.out.println("tm1.ceilingKey(\"n\") = " + tm1.ceilingKey("z"));

        // asceding order -> artan sıralama
        // desceding order -> azalan sıralama
        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());
        System.out.println("tm.keySet() = " + tm.keySet());
        System.out.println("tm.firstKey() = " + tm.firstKey());
        System.out.println("tm.lastKey() = " + tm.lastKey());


    }
}
