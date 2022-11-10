package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //bir listte istenen sayının varlığını kontrol ednen code create edeniz
        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38));
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen istediğiniz sayının ");
        int ara = sc.nextInt();
        boolean varMi = false;

        for (int i = 0; i < listSayi.size(); i++) {
            if (listSayi.get(i) == ara) {
                varMi = true;
                System.out.println("sayı var");
                break;
            }
        }
        if (!varMi) {
            System.out.println("aradığın sayı yk");
        }
    }
}
