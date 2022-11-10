package day10.random;

public class C3_RandomFormula {
    public static void main(String[] args) {

        Math.random();
        double random = Math.random();

        int min =10;
        int max=67;

        int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomNum = "+randomNum);



    }
}
