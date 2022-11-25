package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task09 {

    /*
     Task-> aşağıdaki çıktıyı print eden code create ediniz.
     Kiraz 100
     İncir 200
     Enginar 150
     Üzüm 145
     Nar 250

     */

/* || entrySet() ||
Returns a Set view of the mappings contained in this map.
Bu MAP'te yer alan eşlemelerin Set görünümünü döndürür.
Küme MAP tarafından desteklenir, bu nedenle MAP'te yapılan değişiklikler kümeye yansıtılır ve bunun tersi de geçerlidir.
Set üzerinde bir yineleme devam ederken MAP değiştirilirse (yineleyicinin kendi remove işlemi veya yineleyici tarafından döndürülen
bir MAP girişindeki setValue işlemi dışında) yinelemenin sonuçları tanımsızdır.
Set, Iterator.remove , Set.remove , removeAll , retainAll ve clear işlemleri aracılığıyla karşılık gelen eşlemeyi MAP'ten kaldıran
öğe kaldırmayı destekler. add veya addAll işlemlerini desteklemez.
 */
    public static void main(String[] args) {


       Map<String,Integer>hm=new HashMap<>();
       hm.put("Kiraz",100);
       hm.put("İncir",200);
       hm.put("Enginar", 150);
       hm.put("Üzüm",145);
       hm.put("Nar",250);

        for (Map.Entry<String,Integer>hm2: hm.entrySet()) {
            System.out.println(hm2.getKey()+" "+hm2.getValue());

        }
    }
}
