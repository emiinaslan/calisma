package j15_Arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        //task --> iç arryleri toplamını yeni bir arr ye  atayıp print eden code create ediniz
        int sayı[][] = {{1, 2, 3}, {9, 8}, {24, 0, 4}};
        int yeniArr[] = new int[sayı.length];
        for (int kat = 0; kat < sayı.length; kat++) {
            for (int daire = 0; daire < sayı[kat].length; daire++) {

                yeniArr[kat] += sayı[kat][daire];

            }
        }
        System.out.println("yeni oluşturulan arry = " + Arrays.toString(yeniArr));

    }//main sonu
}
