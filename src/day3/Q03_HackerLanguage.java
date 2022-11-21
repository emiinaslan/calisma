package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_HackerLanguage {
    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)

    public static void main(String[] args) {
      //String arr[]={"java ile hersey guzel"};
        //hackerDili(arr);
hackerDili("java ile hersey guzel");


hackerDili2("java ile hersey guzel");
    }

    private static void hackerDili2(String strr) {
        String arr[]=new  String[strr.length()];
        for (int i = 0; i <strr.length() ; i++) {
            arr[i]=strr.substring(i,i+1);
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
        for (int j = 0; j <strr.length() ; j++) {
            if (arr[j].contains("s")){arr[j]="5";}
            if (arr[j].contains("a")){arr[j]="4";}
            if (arr[j].contains("e")){arr[j]="3";}
            if (arr[j].contains("i")){arr[j]="1";}
            if (arr[j].contains("o")){arr[j]="0";}
            System.out.print(arr[j]);
        }
    }

    private static void hackerDili(String str) {
        System.out.println(str.replaceAll("s", "5").replaceAll("a", "4")
                .replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0"));

    }

    // public static void hackerDili(String[] arr) {
  //     List<String> list=new ArrayList<>(Arrays.asList("s","a","e","i","o"));
  //     for (int i = 0; i < arr.length ; i++) {
  //         if (!list.contains(arr[i])){
  //
  //
  //         }
  //     }
  // }


}

