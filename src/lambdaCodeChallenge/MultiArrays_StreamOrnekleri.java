package lambdaCodeChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        String arr[][]={
            {"elma","muz"},
            {"portakal","cilek","limon"},
            {"havuc","erik"}
        };
        listele(arr);
        doubleYaz(arr);


    }

    private static void doubleYaz(String[][] arr) {

        //Arrays.stream(arr).flatMap(t->Arrays.stream(t).map(t->t+t)).filter(x->x.startsWith("e")).forEach(t->System.out.print(t));
        listele(arr).stream().filter(x->x.startsWith("e")).map(t->t+t).forEach(t->System.out.print(t));
    }

    private static List<String> listele(String[][] arr) {
        return Arrays.stream(arr).flatMap(t->Arrays.stream(t)).collect(Collectors.toList());

    }

}
