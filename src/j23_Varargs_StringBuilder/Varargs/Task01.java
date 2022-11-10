package j23_Varargs_StringBuilder.Varargs;

public class Task01 {
    public static void main(String[] args) {
        /*
        verilen stringleri birlestiren concat isimli method create ediniz
        impuut : "m","e","r","v","e";

         */
        String arr1[] = {"m", "e", "r", "v", "e"};
        String arr2[] = {"a", "l", "i"};
strBirlestir(arr1);
    }//main sonu

    public static void strBirlestir(String... str) {
        String birlesenStr = "";

        for (String w : str
        ) {
            birlesenStr = birlesenStr.concat(w);
        }
        System.out.println("birlesenStr = " + birlesenStr);
    }

}
