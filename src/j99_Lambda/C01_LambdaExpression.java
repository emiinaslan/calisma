package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_LambdaExpression {
    public static void main(String[] args) {

        List<Integer>sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,45,46,55,35,25,67,16));
        printStructured(sayi);
        printEtfunctional(sayi);
        System.out.println("\n ****** ");
        printEtfunctional1(sayi);
        System.out.println("\n ****** ");
        printEtfunctional2(sayi);
    }//main sonu
    public static void printStructured(List<Integer> sayi){
        for (Integer w :sayi) {
            System.out.print(w+" ");

        }
    }

    public static void printEtfunctional(List<Integer> sayi) {
        sayi.//aksiyona girecek list collection.
                stream().//List elemanlarını yukarudan aşağıya akışa alır.
                forEach((t)->System.out.print(t+" "));//data'nın parametresine göre akıştaki her bir elemanıişleme sokar


    }

    public static void printEtfunctional1(List<Integer> sayi) {//functional pr
        sayi.//aksiyona girecek list collection.
                stream().//List elemanlarını yukarudan aşağıya akışa alır.
                forEach((System.out::print));//Method referance->System.out yapısından method call edildi.
                                             //methodKaynağı::Method-> meth reference
    }
public static void yazdir(int a){//normal method tek aksiyonlul->seed method(tohum)->refere edilecek method
    System.out.print(a+" ");
}

    public static void printEtfunctional2(List<Integer> sayi) {//functional pr
        sayi.//aksiyona girecek list collection.
                stream().//List elemanlarını yukarudan aşağıya akışa alır.
                forEach((C01_LambdaExpression::yazdir));//Method referance->System.out yapısından method call edildi.
                                                        //methodKaynağı::Method-> meth reference
    }



}//Clas sonu
