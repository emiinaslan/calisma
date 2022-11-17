package j32_Abstract.örnek3;

public class Runner {
    public static void main(String[] args) {
        baklava b=new baklava();
        b.madeIn();
        b.taste();
        System.out.println("b = " + b);
        SezarSalad ss=new SezarSalad();
        ss.taste();
        ss.madeIn();

    }
}
