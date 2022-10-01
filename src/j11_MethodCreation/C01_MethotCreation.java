package j11_MethodCreation;

public class C01_MethotCreation {
    public static void main(String[] args) {




topla2(34,43);

int maas = toppla3();
        System.out.println(maas);
        System.out.println(toppla3());


        topla();
        System.out.println("ağam çalıştı");




    }

  public static int toppla3() {

        int a = 35;
        int b = 30;
        return a+b;
    }

    public static void topla(){//parametresiz return type ılamayan void bir methot
        int a = 33;
        int b = 23;
        System.out.println(a+b);
        System.out.println("topla methodundan selamlar");


    }public static void topla2(int a , int b){
        System.out.println("bu methot parametreli");
        System.out.println(a + b);
        System.out.println("topla2 çalıştı bitti");
    }








}
