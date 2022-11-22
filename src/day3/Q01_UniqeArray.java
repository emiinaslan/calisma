package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q01_UniqeArray {
    public static void main(String[] args) {

        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */

int arr[]={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (!list.contains(arr[i]))
                list.add(arr[i]);

        }
        System.out.println(list);
        int [] tekrarsızArry = new int[list.size()];


        for (int i = 0; i <tekrarsızArry.length ; i++) {

        }
        System.out.println("array: "+ Arrays.toString(tekrarsızArry));

        //2.yol -> HashSet'le çözümü
        HashSet<Integer>liste=new HashSet<>( Arrays.asList(1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10));

        System.out.println("liste = " + liste);


    }
}