package j26_İnheritance.İnheritance02;

public class Hayvancık {//G parent super dede class

    public Hayvancık() {//p'siz cons
        System.out.println(" HAYVANCIK p'siz cons..");
    }

    public Hayvancık(int i) {//p'siz cons
        System.out.println("hayvancık p'li cons..");
    }

    public void mA() {
        System.out.println("mA->  hayvancık method call");
    }

    public void mM() {
        System.out.println("mM-> hayvancık class method call");
    }

    int a;
   int m =3;


}
