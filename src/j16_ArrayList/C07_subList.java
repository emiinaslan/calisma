package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        ArrayList<String> listSehir=new ArrayList<>(List.of("münih","losangelas","londra","stokholm","ankara","konya"));

        System.out.println("listSehir.subList(3,5) = " + listSehir.subList(3, 5));

        ArrayList<String> city=new ArrayList<>(listSehir.subList(2,5));
        System.out.println("city = " + city);
    }
}
