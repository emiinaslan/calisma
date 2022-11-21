package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        /*
        Deque : Double ended Queue'larda fifo deque'lerde hem fifo hem lifo geçerli
        lifo : last in first out
         */
        Deque<String>dq1=new LinkedList<>(Arrays.asList("küşleme","önkol","böbrek yatağı","ezme","haydari"));
        System.out.println("dq1 = " + dq1);//[küşleme, önkol, böbrek yatağı, ezme, haydari]
        dq1.add("humus");
        System.out.println(dq1);//[küşleme, önkol, böbrek yatağı, ezme, haydari, humus]
        System.out.println("dq1.getFirst() = " + dq1.getFirst());//
        System.out.println("dq1 = " + dq1);


        System.out.println("dq1.getLast() = " + dq1.getLast());
        System.out.println("dq1 = " + dq1);


        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
        System.out.println("dq1 = " + dq1);

        System.out.println("dq1.peekLast() = " + dq1.peekLast());
        System.out.println("dq1 = " + dq1);


        /*
        Trick -> getFirst();-> method deque boşsa exception fırlatır
        peakFirs();-> method deque  boş ise null return eder
         */

        dq1.clear();
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());//null
       // System.out.println("dq1.getFirst() = " + dq1.getFirst());//NoSuchElementException
        System.out.println("aga selametle");


        Deque<String>dq2=new LinkedList<>(Arrays.asList("havuç dilimi","güllaç","su muhallebisi","trilçe","kazan dibi"));
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());
        System.out.println("dq2.removeLast() = " + dq2.removeLast());
        System.out.println("aga selametle");
        dq2.clear();
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());// null
        System.out.println("dq2.pollLast() = " + dq2.pollLast());//null
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());//NoSuchElementException
        System.out.println("dq2.removeLast() = " + dq2.removeLast());//NoSuchElementException
        System.out.println("aga selametle");




    }
}
