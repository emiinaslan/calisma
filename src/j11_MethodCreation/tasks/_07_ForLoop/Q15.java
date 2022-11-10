package j11_MethodCreation.tasks._07_ForLoop;

public class Q15 {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
    public static void main(String[] args) {
        int harf = 65;
        for (int i = 0; i < 6 ; i++) {//apartman
            for (int j = 0; j <=i ; j++) {//daire
                System.out.print((char) (harf+i) +" ");
            }
            System.out.println();
        }









    }
}
