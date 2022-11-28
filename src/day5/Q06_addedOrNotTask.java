package day5;

import java.util.*;

public class Q06_addedOrNotTask {

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(3);
            numbers.add(1);
            numbers.add(2);
            numbers.add(4);
            numbers.add(5);
            numbers.add(3);

            int tekrarlıEleman = 0;

            Set<Integer> uniqeNumbers = new HashSet<>();
            List<Integer> duplication = new ArrayList<>();

            for (int i = 0; i < numbers.size(); i++) {
                boolean ekliMi = uniqeNumbers.add(numbers.get(i));

                if (!ekliMi) {
                    tekrarlıEleman++;
                    duplication.add(numbers.get(i));
                }
            }
            System.out.println("tekrarlıEleman = " + tekrarlıEleman);
            System.out.println("duplication = " + duplication);

        }
    }
