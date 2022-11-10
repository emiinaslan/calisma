package day10.random;

public class C4_OddEventNumber {
    public static void main(String[] args) {
//random kullanarak

        int min =10;
        int max=67;

        int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println(randomNum % 2 == 0 ? "cift" : "tek");


        int randomSayi = (int) (Math.random()*80);
        System.out.println("randomSayi = " + randomSayi);

        System.out.println(randomSayi %2 == 0 ? "cift": "tek");





    }
}
