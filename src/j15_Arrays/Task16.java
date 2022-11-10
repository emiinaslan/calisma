package j15_Arrays;

public class Task16 {
    public static void main(String[] args) {
        //Task--> sayı arr deki son elemanların çarpımını print eden code create ediniz
        int sayı [][]={{1,2,3},{9,8},{24,0,4}};

        int çarpım=1;


        for (int i = 0; i < sayı.length; i++) {

                çarpım*=sayı[i][sayı[i].length-1];


        }
        System.out.println("çarpım = " + çarpım);
    }
}
