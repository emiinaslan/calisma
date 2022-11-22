package j36_Map;

import java.util.HashMap;

public class C09_getOrDefaut {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.getOrDefault(size); -> girilen key map'te varsa key'e ait value yoksa default değer return eder

        hm.put("amazon","296 euro");
        hm.put("ebay","234 euro");
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("MediaMark","183 euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.getOrDefault(\"ebay\",\"ebikgabık\") = " + hm.getOrDefault("ebay", "ebikgabık"));
        // ebay key map'de var olduğu için ebay key'e ait value return edildi
        System.out.println("hm.getOrDefault(\"ebik\",\"gabık\") = " + hm.getOrDefault("ebik", "gabık"));
        // ebik key map'de olmadığı için bu key default değer gabık atanıp return eder
        System.out.println("hm = " + hm);//

    }
}
