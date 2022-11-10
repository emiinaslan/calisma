package j23_Varargs_StringBuilder.Varargs;

import java.lang.reflect.Array;

public class C02_Varrags {
    public static void main(String[] args) {
        // ahan da Trick köşesinde böğün :varargs method parametreleri array gibi tanımladığı için
        // varargs methoda parametre olarak array de verilebilir
        /*
        arr ve vararg methıd
         */
        int arr[] = {24, 42, 33, 19, 34, 35, 45, 58, 38};


    }//main sonu

    public static int arrTopla(int[] a) {
        int topla = 0;
        for (int w : a
        ) {
            topla += w;
        }
        return topla;

    }
public static int varargsTopla(int...b){
        int toplam=0;
    for (int s:b
         ) {toplam+=s;

    }

return toplam;
}

}//Clas sonu

