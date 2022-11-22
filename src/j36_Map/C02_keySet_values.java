package j36_Map;

import java.util.HashMap;

public class C02_keySet_values {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.keySet(); -> girilen map key değerlerini set' atayıp return eder
        //map.values(); -> girilen value değerlerini coll. atayıp return eder
        hm.put("amazon","296 euro");
        hm.put("ebay","234 euro");
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("MediaMark","183 euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());



        //task -> hasMap key ve value değerlerini satır satır print ediniz. with loop(for-each)

        for (String s : hm.keySet() ) {//key
            System.out.println( s +" ");
        }
        System.out.println();
        for (String w: hm.values()) {//value
            System.out.println(w+ " ");
        }
    }
}
