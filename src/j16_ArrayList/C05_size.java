package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {
        ArrayList<String> listSehir=new ArrayList<>(List.of("münih","losangelas","londra","stokholm"));
        System.out.println(listSehir.size());//eleman sayarken (1 den başlar eleman sayısı)
    }
}
