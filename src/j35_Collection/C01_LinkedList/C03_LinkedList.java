package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String > ll1=new LinkedList<>(Arrays.asList("JavaCan","Ebubekir","Gülsüm","Ebubekir","Adem","İlker","Merve","JavaCan"));
        // LinkedList remove()... ilk node silinir ve silinen node return edilir
        System.out.println("ll1.remove() = " + ll1.remove());//JavaCan
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gülsüm, Ebubekir, Adem, İlker, Merve, JavaCan]


        System.out.println("ll1.remove(3) = " + ll1.remove(3));//ll1.remove(3) = Adem
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gülsüm, Ebubekir, İlker, Merve, JavaCan]
        System.out.println("ll1.remove(\"merve\") = " + ll1.remove("Merve"));//ll1.remove("merve") = true
        System.out.println("ll1.remove(\"javaTAR\") = " + ll1.remove("javaTAR"));//ll1.remove("javaTAR") = false
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gülsüm, Ebubekir, İlker, JavaCan]


        System.out.println("ll1.removeFirstOccurrence(\"Ebubekir\") = " + ll1.removeFirstOccurrence("Ebubekir"));//ll1.removeFirstOccurrence("Ebubekir") = true
        System.out.println("ll1 = " + ll1);//ll1 = [Gülsüm, Ebubekir, İlker, JavaCan]


        System.out.println("ll1.element() = " + ll1.element());//İlk node return eder-> ll1.element() = Gülsüm

        LinkedList<String > ll2=new LinkedList<>(Arrays.asList("JavaCan","Ebubekir","Gülsüm","Ebubekir","Adem","İlker","JavaCan"));
        LinkedList<String > ll3=new LinkedList<>(Arrays.asList("Hasan","Harun","Haluk","Hasmayan"));


        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2);//
        System.out.println("ll2.removeAll(ll3) = " + ll2.removeAll(ll3));//
        System.out.println("ll2 = " + ll2);//
//LinkedList get(), getFirst(),getLast()... girilen index ve ilk son node return eder
        System.out.println("ll2.get(2) = " + ll2.get(2));//ll2.get(2) = Gülsüm
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//ll2.getFirst() = JavaCan
        System.out.println("ll3.getLast() = " + ll3.getLast());//ll3.getLast() = Hasmayan





    }
}
