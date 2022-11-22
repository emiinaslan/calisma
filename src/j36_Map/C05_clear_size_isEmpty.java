package j36_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpty {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.size(); -> girilen map'in entry(giris: eleman ) satısını   return eder
        //map.clear(); -> girilen map'in tüm entry(giris: eleman ) siler.
        //map.isEmpty(); -> girilen map'in entry(giris: eleman )varlığını kontrol eder boolean retrun eder


        hm.put("amazon","296 euro");
        hm.put("ebay","234 euro");
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("MediaMark","183 euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());
        System.out.println("hm.isEmpty() = " + hm.isEmpty());
        hm.clear();

        System.out.println("hm.size() = " + hm.size());
        System.out.println("hm.isEmpty() = " + hm.isEmpty());


    }
}
