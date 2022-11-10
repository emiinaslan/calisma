package j15_Arrays;

public class Task17 {
    public static void main(String[] args) {
        /* Task--> sayı arryinde ki en büyük elemanı print code creare ediniz */

        int sayı [][]={{1,2,3},{9,8},{24,0,4}};
        int maxEleman = sayı[0][0];

        for (int kat = 0; kat < sayı.length; kat++) {
            for (int daire = 0; daire < sayı[kat].length; daire++) {
                if (sayı[kat][daire] > maxEleman){
                    maxEleman = sayı[kat][daire];
                }

            }
        }
        System.out.println("maxEleman = " + maxEleman);


    }//main
}
