package j36_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"lion");
        hm.put(2 ,"tiger");
        hm.put(3,"elephant");
        hm.put(4 ,"cat");
        hm.put(5,"dog");
        Scanner sc=new Scanner(System.in);
        System.out.println("aga sayı gir: ");
        int sayi= sc.nextInt();
        System.out.println("map1(hm,sayi) = " + map1(hm, sayi));


    }//main sonu

    private static String map1(HashMap<Integer, String> hm, int sayi) {
        //String str = hm.get(sayi);
        return hm.get(sayi);
    }


}
