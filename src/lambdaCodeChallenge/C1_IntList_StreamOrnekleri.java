package lambdaCodeChallenge;

import java.util.*;
import java.util.stream.Collectors;

public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        yazdır(list);
        negatifYazdır(list);
        pozitifList(list);
        System.out.println("kareList(list) = " + kareList(list));
        kareTekrarsız(list);
        sirala(list);
        bkSırala(list);
        System.out.println("son5bas(list) = " + son5bas(list));
        System.out.println(son5basdegil(list));
        System.out.println("topla(list) = " + topla(list));
        negatifKareList(list);
        System.out.println("negatifKareToplam(list) = " + negatifKareToplam(list));
        System.out.println("pozitifKupMax(list) = " + pozitifKupMax(list));

    }//main sonu

    private static Optional<Integer> pozitifKupMax(List<Integer> list) {
        return list.stream().filter(Methods::pozitifMi).map(Methods::kupBul).reduce(Math::max);
    }

    private static Optional<Integer> negatifKareToplam(List<Integer> list) {
        return list.stream().filter(Methods::negatifMi).map(Methods::kareBul).reduce(Methods::toplam);

    }

    private static List<Integer> negatifKareList(List<Integer> list) {
        return list.stream().filter(x->x<0).peek(x->System.out.print("negatifler: "+ x)).
                map(x->x*x).peek(x->System.out.print("kareleri:" + x )).collect(Collectors.toList());
    }

    private static int topla(List<Integer> list) {
        System.out.println();
        return list.stream().reduce(0,(x,y)->(x+y));
    }

    private static List<Integer> son5basdegil(List<Integer> list) {

        return list.stream().filter(x->x>0).map(t->t*t).filter(x->x%10!=5).collect(Collectors.toList());
    }

    private static List<Integer> son5bas(List<Integer> list) {
        System.out.println();
        return list.stream().filter(x->x>0).map(t->t*t*t).filter(x->x%10==5).collect(Collectors.toList());
    }

    private static void bkSırala(List<Integer> list) {
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+" "));
    }

    private static void sirala(List<Integer> list) {
        System.out.println();
        list.stream().sorted().forEach(x->System.out.print(x+" "));
    }

    private static List<Integer> kareTekrarsız(List<Integer> list) {
        System.out.println();
        return list.stream().map(t->t*t).distinct().collect(Collectors.toList());
    }

    private static List<Integer> kareList(List<Integer> list) {
        System.out.println();
        return list.stream().map(t->t*t).collect(Collectors.toList());

    }

    //s3:pozitif olanlarla yeni bir list oluştur
    private static void pozitifList(List<Integer> list) {
        System.out.println();
        list.stream().filter(t->t>0).collect(Collectors.toList());
    }

    private static List<Integer> negatifYazdır(List<Integer> list) {
        return list.stream().filter(x->x<0).collect(Collectors.toList());
    }
    private static void yazdır(List<Integer> list) {
        list.stream().forEach(x->System.out.print(x+" "));
    }


}//clas sonu
