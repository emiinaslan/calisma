package j36_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.containesKey(size); -> girilen key değerini map'te varlığını kontrol eder boolean return eder
        //map.containesValue(size); -> girilen value değerini map'te varlığını kontrol eder boolean return eder

        hm.put("amazon","296 euro");
        hm.put("ebay","234 euro");
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("MediaMark","183 euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.containsKey(\"amazon\") = " + hm.containsKey("amazon"));
        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon"));
        System.out.println("hm.containsValue(\"296 Euro\") = " + hm.containsValue("296 euro"));
        System.out.println("hm.containsValue(\"ebikGabık\") = " + hm.containsValue("ebikGabık"));

    }
}
