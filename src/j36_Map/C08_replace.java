package j36_Map;

import java.util.HashMap;

public class C08_replace {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.replace(); -> girilen value değeri ilgili Key'de update return eder.

        hm.put("amazon","296 euro");
        hm.put("ebay","234 euro");
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("MediaMark","183 euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"amazon\",\"314 euro\") = " + hm.replace("amazon", "314 euro"));
        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"sefil\",\"haluk\") = " + hm.replace("sefil", "haluk"));// olamayan key için null retrun eder



    }
}
