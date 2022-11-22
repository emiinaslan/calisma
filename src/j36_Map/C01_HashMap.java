package j36_Map;

import java.util.HashMap;

public class C01_HashMap {
    public static void main(String[] args) {
        HashMap<String,String>hm=new HashMap<>();
        //map.put;-> girilen key value datayı map'e eleman olrak ekler
        hm.put("amazon","296 euro");
        hm.put(null,"200 euro");
        hm.put(null,"222 euro");
        hm.put("ebay",null);
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("Apple store","500 euro");//Apple store key'deki value 333 euro iken 500 euro olarak uptade edildi
        hm.put("MediaMark","333 euro");

        //map sout komutuna paremetre olarak porint edlir
        System.out.println("hm = " + hm);
    }

}
