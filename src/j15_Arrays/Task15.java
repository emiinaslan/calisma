package j15_Arrays;

public class Task15 {
    public static void main(String[] args) {
        //task --> tüm elemanların çarpımını yazınız

        int sayı [][]={{1,2,3},{9,8}};
        int toplam =1;

        for (int kat = 0; kat < sayı.length; kat++) {

            for (int daire = 0; daire < sayı[kat].length ; daire++) {
                toplam*=sayı[kat][daire];

            }
        }
        System.out.println(toplam);
    }
}
