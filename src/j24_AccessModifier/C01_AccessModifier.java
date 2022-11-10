package j24_AccessModifier;

public class C01_AccessModifier {

    private int privateYas=24;
    int defaultYas=33;//
    protected int protectedYAs=48;
    public int puplicYas=48;


    private C01_AccessModifier(){//private p'siz cons.
        System.out.println("private cons");
    }

    public C01_AccessModifier(int privateYas,int defaultYas){//puplic 2p'li cons.
        System.out.println("public cons.");

    }
    private void privateMethod(){
        System.out.println("private methodt");
    }
    protected  void protectedMethod(){
        System.out.println("protected method");
    }
   // C01_AccessModifier obj3=new C01_AccessModifier();
}
