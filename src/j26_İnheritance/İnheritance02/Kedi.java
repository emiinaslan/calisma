package j26_İnheritance.İnheritance02;

public class Kedi extends Mammal {//Mamal parent class child

    /*
    child obje olmadan parent clas variable ve method'lara ulaşabilir
     */
    public Kedi() {//p'siz const...
        super();
        System.out.println("ahanda kedi p'siz cons..");
    }

    public Kedi(String str) {//p'siz const...
        this();
        System.out.println(super.c);
        System.out.println("ahanda kedi p'li cons..");

    }

    public void cırmalar() {
        System.out.println("kedi fena cırmalar");
    }

    int c = 2;
    int d = 5;

    @Override
    public void mC() {
        System.out.println("mC- > KEdi class method call edildi");

    }

}
