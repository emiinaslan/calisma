package callisma;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ders {
    public static void main(String[] args) {
        String str="javacan javatar";
        //methodUnicodeRLO(str);


        Stream.of(str)
                .map(t->t.split("")).flatMap(Arrays::stream).reduce("",(s,c)->c+s);
        System.out.println(str.chars().mapToObj(ch -> Character.toString(ch)).reduce("", (s, c) -> c + s));
Stream.of(str).map(t->new StringBuilder(t).reverse()).collect(Collectors.joining());

    }

    private static void methodUnicodeRLO(String str) {
        System.out.println("uniCode: "+"\u202E" + str);

    }


}
