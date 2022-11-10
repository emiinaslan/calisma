package L01_ForLoop;

public class C03_NestedForloop {//eğer bir döngünün badisin de başka bir döngü bulunuyorsa bu tür döngülere nested-loop yani iç içe döngü denir
    // iç döngü dış döngünün her adımında çalışır iç içe döngülerin en içteki döngü en önce çalışır
    public static void main(String[] args) {
        for (int apartman = 1; apartman < 10 ; apartman++) {//dış döngü
            System.out.println("apartman döngü" + apartman);
            for (int daire = 1; daire < 6; daire++) {//iç döngü
                System.out.println("apartman "+ apartman + "için iç döngü daire" + daire);
            }
        }
    }
}
