package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.entrySet(); -> girilen map'in key value tüm datalarını  set' atayıp return eder

        hm.put("amazon","296 euro");
        hm.put("ebay","234 euro");
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("MediaMark","183 euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.entrySet() = " + hm.entrySet());

        for ( Map.Entry<String,String> e :hm.entrySet()) {// entry sert ile gelen key value loop için Entry<key,value> data
                                                          //
            System.out.println("e.getValue() = " + e.getValue());
        }
    }
}
