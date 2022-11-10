package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //task--> 2 string arry elemanlarının aynı ortak olmasını kontrol eden cofe create deniz

        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "çiğdem" };
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "çiğdem" };

        for (String a : arr1) {
            for (String b : arr2) {
                if (a == b) {
                    System.out.println(a);
                }
            }
        }

// 2.yol

        List<String> ortakList = new ArrayList<>();
        for (String str1 : arr1) {
            for (String str2 : arr2) {
                if (str2.equalsIgnoreCase(str1)) {
                    ortakList.add(str1);

                }

            }
        }
        if (ortakList.isEmpty()) {
            System.out.println("arryler de ortak isim yok" + ortakList);
        } else System.out.println(ortakList);
    }
}
