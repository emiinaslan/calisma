package j36_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.putIfAbsent(); -> girilen key  map'de  yoksa entry(key,value) map'e ekler ve null return eder,
        //girilen key map'de var ise ait value return eder.

        hm.put("amazon","296 euro");
        hm.put("ebay","234 euro");
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("MediaMark","183 euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.putIfAbsent(\"ebik\",\"gabık\") = " + hm.putIfAbsent("ebik", "gabık"));
        System.out.println("hm.putIfAbsent(\"ebay\",\"javacan\") = " + hm.putIfAbsent("ebay", "javacan"));//ebay key olduğu için ebay key'e ait value return edildi
        System.out.println("hm = " + hm);

    }
}
