package j11_MethodCreation;

public class C011_Tekrar {
    public static void main(String[] args) {


        topla();// parametresiz method
        System.out.println("ağam bu yazıuı okuduysan method call oldu");

topla2(34,43);
        System.out.println("agaya selam");

        int maas = topla3();
        System.out.println(maas);
        System.out.println(topla3());
        System.out.println(topla4("selam", 48));


    }

    private static int topla4(String str, int a) {
        System.out.println(str);
        return a*2;
    }

    private static int topla3() {
        int a = 72;
        int b = 63;

        return a+b;


    }

    public static void topla (){
        int a = 33;
        int b = 23;
        System.out.println(a+b);
        System.out.println("topla methodundan selamlar");




    }
    public static void topla2(int a, int b){

        System.out.println("bu method parametreli");
        System.out.println(a+b);
        System.out.println("topla2 bitti");


    }








}
