package j16_ArrayList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArryConvertList {
    public static void main(String[] args) {
        //King of Trick --> Arry'dan çevrilen list aray kaynaklı olduğu için array davranışı
        String arrJavaCan []={"akif","gamze","musty","sevdenur"};
        List<String>listJavatar = Arrays.asList(arrJavaCan);
        System.out.println("listJavatar = " + listJavatar);
        System.out.println("listJavatar.size() = " + listJavatar.size());
       // listJavatar.add("sefilcan haluk");
        // Trick-> List data type ArrayList tanımlşanırsa rte vermez kaynağı array de olsa list davranır boyut esnekliği yapar

        AbstractList<String>listJavaTar1 = new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar1.add("sefilhaluk");
        System.out.println("listJavaTar1 = " + listJavaTar1);


    }
}
