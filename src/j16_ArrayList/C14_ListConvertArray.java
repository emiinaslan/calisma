package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C14_ListConvertArray {
    public static void main(String[] args) {
        //listi Arrye çevirme --> toArray();
        //1.--> toArray
        ArrayList<String> listUlke=new ArrayList<>(List.of("almanya","amerika","ingiltere","isvec"));
        String arrUlke[]=listUlke.toArray(new String[0]);
        System.out.println(listUlke);
        System.out.println("Arrays.toString(arrUlke) = " + Arrays.toString(arrUlke));

        //2.yötem-->oluşturulan Array'in data type objeck olarak atanır.
        //Trıck --> Objeckt class java'da tüm class'ların parent (atası : HZ ADEM)

        Object arrUlkeler[]=listUlke.toArray();
        System.out.println("Arrays.toString(arrUlke) = " + Arrays.toString(arrUlke));




    }
}
