package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        Map<String, String> nazımKartvzt = new HashMap<>();
        nazımKartvzt.put("isim", "nazım");
        nazımKartvzt.put("email", "nazım@hotmail.com");
        nazımKartvzt.put("adre", "clarusway offer koltuğu");
        nazımKartvzt.put("tel no :", "123456789");

        Map<String, String> mehmetKrtvzt = new HashMap<>();
        mehmetKrtvzt.put("isim", "mehmet");
        mehmetKrtvzt.put("email", "mehmet@gmail,com");
        mehmetKrtvzt.put("adre", "clarusway offer koltuğu");
        mehmetKrtvzt.put("tel no :", "123456789");

        Map<String, Map<String, String>> kartvizit = new HashMap<>();
        kartvizit.put("QA zanım", nazımKartvzt);
        kartvizit.put("Dev mehmet", mehmetKrtvzt);
        System.out.println("kartvizit = " + kartvizit);

        System.out.println("kartvizit.get(\"Dev mehmet\").get(\"telefon\") = " + kartvizit.get("Dev mehmet").get("tel no :"));
        //*********************2.yol********************
        Map<Integer, Kartvizit> krt = new HashMap<>();
        Kartvizit k1 = new Kartvizit("enise", "enise@gmail.com", "google", 1212154);
        krt.put(k1.id, k1);
        System.out.println("krt = " + krt);
        System.out.println("krt.get(k1.id) = " + krt.get(k1.id));//k1.id key values
        System.out.println("krt.get(101) = " + krt.get(101));// 101 key values:isim
        System.out.println("k1.isim = " + k1.isim);
        Kartvizit k2=new Kartvizit("mehmet","mhmt@gmail.com","ebikgabık",2121241);
        System.out.println("k1.id = " + k1.id);
        System.out.println("k2.id = " + k2.id);


    }
}
