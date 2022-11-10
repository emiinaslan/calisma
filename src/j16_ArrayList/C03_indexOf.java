package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        //indexOf();-->
        ArrayList<String> listUlke=new ArrayList<>(List.of("almanya","amerika","ingiltere","isvec"));

        ArrayList<String>listSehir=new ArrayList<>(List.of("münih","losangelas","londra","stokholm"));
        listUlke.add("amerika");

        System.out.println(listSehir.indexOf("londra"));
        System.out.println(listSehir.indexOf("Angara"));

        listUlke.add("amerika");
        System.out.println(listUlke.indexOf("amerika"));
        System.out.println(listUlke.lastIndexOf("amerika"));


    }
}
