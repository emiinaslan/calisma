package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //Stringi Arry'e çevirme parçalanır veya ayıklanır
String str = "JAva canlara selM OLSUN EN KISA ZAMANDA bolcana offer";
//-->String  ifadeyi kelimee sayısını print eden
String strArry[]=str.split(" ");//str " " karaktere göre parçalanır
        System.out.println(Arrays.toString(strArry));
        System.out.println(strArry.length);
        //-->String  ifadeyi harf sayısını print edin
        String harfArry[]=str.split("");
        System.out.println(Arrays.toString(harfArry));

        System.out.println(harfArry.length);
    }
}
