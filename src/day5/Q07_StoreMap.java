package day5;

import java.util.HashMap;
import java.util.Scanner;

public class Q07_StoreMap {
    public static void main(String[] args) {
        String secim = "";
        HashMap<Integer, HashMap<String, String>> kisiList = new HashMap<>();
        HashMap<String, String> kisiBilgileri = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("adınızı ve soy adınızı giriniz :");
            kisiBilgileri.put("isim", sc.nextLine());
           // sc.nextLine();
            System.out.println("lütfen tel no girin");
            kisiBilgileri.put("tel", sc.nextLine());
            //sc.nextLine();
            System.out.println("4 haneli kimlik no girniz: ");
            kisiList.put(sc.nextInt(), kisiBilgileri);
            //sc.nextLine();

            System.out.println(kisiBilgileri);
            System.out.println(kisiList);
            System.out.println("devam etmek istiyor musunuz(E/H)");
            secim = sc.next();
            sc.nextLine();

        } while (secim.equalsIgnoreCase("E"));
        System.out.println("görüntülemek istediğiniz kişinin tc no giriniz: ");
        System.out.println(kisiList.get(sc.nextInt()));

    }
}