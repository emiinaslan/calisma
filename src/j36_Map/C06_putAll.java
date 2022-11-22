package j36_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        //map.putAll(size); -> girilen map istenen map'e ekler

        hm.put("amazon","296 euro");
        hm.put("ebay","234 euro");
        hm.put("saturn","300 euro");
        hm.put("vatan","111 euro");
        hm.put("Apple store","333 euro");
        hm.put("MediaMark","183 euro");

        System.out.println("hm = " + hm);

        HashMap<String,String> hm1 =new HashMap<>();


        hm1.put("köfteci yusuf","kaburga ızgara");
        hm1.put("starbucks","flat white");
        hm1.put("güllüoğlu","cennet çamuru");
        hm1.put("nusret","dana spagetti");
        hm1.put("clarusway","bolcana offer");
        hm1.put("javacan","javanaz");


        hm.putAll(hm1);
        System.out.println("hm = " + hm);
        System.out.println("hm1 = " + hm1);

        //cincix code...
        HashMap<String,String>hm2=new HashMap<>(hm1);//hm2 map tanımlandı hemde entry olarak parametre olarak entry atandı
        System.out.println("hm2 = " + hm2);

    }
}
