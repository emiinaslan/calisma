package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
        Queue call. interface olduğu için child class linkedlist ve priorityQueue
        ile obj uretilir
        Eczane yemekhane vs belirli şart aksiyon olan elemanlar için kullanırlır
        cons seçimine göre queue obj çzeliikleri belirlenir
        fifo- >
         */
        Queue<String>q1=new LinkedList<>(Arrays.asList("Cebrail","sümeyra","Yakup","Muharrem"));

        System.out.println("q1 = " + q1);
        q1.add("Erol");
        System.out.println("q1 = " + q1);
        Queue<String>q2=new PriorityQueue<>(Arrays.asList("javacan","javasu","javanaz","javiye"));
        System.out.println("q2 = " + q2);
        q2.add("java");
        System.out.println("q2 = " + q2);


        System.out.println("q1.element() = " + q1.element());
        System.out.println("q1.peek() = " + q1.peek());// peak();->//Bu kuyruğun başını alır, ancak kaldırmaz veya bu sıra boşsa null değerini döndürür.

        System.out.println("q1.remove() = " + q1.remove());//remove()-> Bu kuyruğun başını alır ve kaldırır. Bu yöntem poll() yönteminden yalnızca bu sıra boşsa bir istisna atması bakımından farklıdır.
        System.out.println("q1.poll() = " + q1.poll());//poll()->Bu kuyruğun başını alır ve kaldırır veya bu sıra boşsa null değerini döndürür.
        System.out.println("q1 = " + q1); //[Yakup, Muharrem, Erol]
        q1.clear();//queue elemanları silindi
        System.out.println("q1 = " + q1);//q1 = []
        System.out.println("q1.size() = " + q1.size());//size() = 0
        System.out.println("q1.poll() = " + q1.poll());//poll() = null
        // System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException


        //offer(); ->collectiona eleman eklemek için kullanılır
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));
/*
ahanda TRİCK-> offer ve add farkı-> egert queue call eleman kısıtlaması yapılmış ise
add meth Exception offer ise true-false return eder
 */

    }
}
