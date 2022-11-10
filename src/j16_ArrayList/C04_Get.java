package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {

        //get();--> liste istene elemanı return eder (arr[3]-->arr' 3.indexteki elemanı ver)
        ArrayList<String> listSehir=new ArrayList<>(List.of("münih","losangelas","londra","stokholm"));
        System.out.println(listSehir.get(1));

    }
}
