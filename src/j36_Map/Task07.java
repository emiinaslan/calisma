package j36_Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Task07 {

    /*
    returnKey() isminde bir method oluşturun.
    Parametresi     String-Integer HashMap olsun.
    Return tipi Array List olsun.
    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5
    Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
     */

    public static void main(String[] args) {
HashMap<String,Integer>hashMap=new HashMap<>();
hashMap.put("Lion",     1);
hashMap.put("Tiger",    2);
hashMap.put("Elephant", 3);
hashMap.put("Cat",      4);
hashMap.put("Dog",      5);

        System.out.println("returnKey(hashMap) = " + returnKey(hashMap));

        HashMap<String,Integer>hashMap1=new HashMap<>();
        hashMap1.put("merfjs",     1);
        hashMap1.put("aksdjfasd",    2);
        hashMap1.put("akfjsd", 3);
        hashMap1.put("sdkafhsdjk",      4);
        hashMap1.put("asfdhasd",      5);
        System.out.println("returnKey(hashMap1) = " + returnKey(hashMap1));


    }//main sonu

    private static ArrayList<String> returnKey(HashMap<String, Integer> j) {
        ArrayList<String>arrayList=new ArrayList<>();
        for (String w: j.keySet()) {
          arrayList.add(w);
        }

        return arrayList ;
    }


}//class sonu


