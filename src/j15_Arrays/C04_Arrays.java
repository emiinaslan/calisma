package j15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    //Arrays eşitlik kontroll equals()->methodu index ve value kontrolu yapar ve true/false return eder
    public static void main(String[] args) {
        int sayı1[] = {39, 3, 72, 63, 84};
        int sayı2[] = {84, 72, 63, 3, 39};
        System.out.println("Arrays.equals(sayı1,sayı2) = " + Arrays.equals(sayı1, sayı2));
        Arrays.sort(sayı1);
        Arrays.sort(sayı2);
        System.out.println("Arrays.equals(sayı1,sayı2) = " + Arrays.equals(sayı1, sayı2));
        // Array'i Stringe çevirme
String str = Arrays.toString(sayı1);
        System.out.println(str);//[3, 39, 63, 72, 84] --> arr',n tüm elemanları string olarak tanımlandı
        System.out.println(str.substring(6));
    }


}
