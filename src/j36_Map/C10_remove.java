package j36_Map;

import java.util.HashMap;

public class C10_remove {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.remove(); -> girilen entry map'de var ise siler ve true return eder yoksa false return eder.
        //parametre olarak entry değil sadece key değer girilirse key vaersa siler ve key value'si return eder. yoksa null return eder


        hm.put("amazon","296 euro");
        hm.put("ebay","234 euro");
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("MediaMark","183 euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.remove(\"amazon\",\"296 euro\") = " + hm.remove("amazon", "296 euro"));
        System.out.println("hm.remove(\"amazon\",\"ebik gabık\") = " + hm.remove("amazon", "ebik gabık"));
        System.out.println("hm.remove(\"gabık\",\"296 euro\") = " + hm.remove("gabık", "296 euro"));
        System.out.println("hm.remove(\"ebay\") = " + hm.remove("ebay"));
        System.out.println("hm.remove(\"111 euro\") = " + hm.remove("111 euro"));
        System.out.println("hm = " + hm);

    }
}
