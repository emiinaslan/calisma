package j33_InterFace;

public interface DısDonanım {
    public void kapi();//abs. method

    void kaporta();//abs. method

    String RENK="opak kırmızııı";//public static final variable

    public default String sisLambasi(){//default concr method
        return "sisli havada dikkat!!!";
    }
    static void aga(){
        System.out.println("agam sensiz olmaz");
    }
    static  void anten(){//static conc. method
        System.out.println("agam yine antin kuntin işlerdesin  :)");
    }
    //public static default void sorunMethod(){//CTE -> static default keyword aynı anda kullanılamaz}
    // DisDonanim obj=new DisDonanim();//can not be instantied->obj olmaz olamazz

    // public static void main(String[] args) {
    //     System.out.println("renk"+RENK);//renkopak kırmızııı
//
    //     aga();//static method call//agam sensiz olmaz
//
//
    // }
}
