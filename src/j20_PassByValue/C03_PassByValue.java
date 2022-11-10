package j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*java non-primitive(Class array list->) data türlerinde objenin kendisi değil de dataları  değişirse objenin referans
        ve kendisi değişmediği dataları değişikliğini kalıcı yapar

         */

        //TAsk --> lis elemanları 24,20,87 iki farklı method ile list elemanlarını

        List<Integer> list = new ArrayList<>(Arrays.asList(24, 20, 87));
        System.out.println("method öncesi list = " + list);
        listUpdate(list);
        listUpdate1(list);
        System.out.println("method sonrası list = " + list);
    }//main sonu

    public static void listUpdate(List<Integer> list) {
        for (Integer v : list
        ) {
            v *= 2;


        }
        System.out.println(list);
    }

    public static void listUpdate1(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);

        }
        System.out.println(list);

    }


}
