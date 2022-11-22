package j36_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.get(key); -> girilen key değerlerinin value'sını  return eder

        hm.put("amazon","296 euro");
        hm.put("ebay","234 euro");
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("MediaMark","183 euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.get(\"Ebay\") = " + hm.get("ebay"));
        System.out.println("hm.get(\"Ebay\") = " + hm.get("sefil haluk"));
        System.out.println("hm.get(12) = " + hm.get(12));//null: key data type farketmeksizin olmayan key null return eder



    }
}
