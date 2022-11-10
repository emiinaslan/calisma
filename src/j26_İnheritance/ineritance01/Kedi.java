package j26_İnheritance.ineritance01;

public class Kedi extends Mammal {//Mamal parent class child
/*
child obje olmadan parent clas variable ve method'lara ulaşabilir
 */
    public Kedi() {//p'siz const...
        System.out.println("ahanda kedi p'siz cons..");
    }

    public void cırmalar (){
        System.out.println("kedi fena cırmalar");
    }
}
