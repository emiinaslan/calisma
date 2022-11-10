package j26_İnheritance.İnheritance02;

public class Mammal extends Hayvancık {//hayvancık parent'in child class'ıdır

    public Mammal() {//p'siz cons
        this('y');
        System.out.println("ahanda bu MAMAL p'siz cons..");
    }

    public Mammal(char c) {//p'li cons
        super(17);
        System.out.println("ahanda bu MAMAL p'siz cons..");
    }

    public void mC() {
        System.out.println("mC->mammal class method call ");
    }

    @Override
    public void mM() {
        System.out.println("mM-> mammal class method call");

    }
    int m=1;
    int c=4;

}
