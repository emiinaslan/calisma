package j33_InterFace;

public class Runner {
  public static void main(String[] args) {
    Sahin dgnshn=new Sahin();
    dgnshn.ebat();
    dgnshn.jant();
    dgnshn.kapi();
    dgnshn.kaporta();
    dgnshn.klima();
    dgnshn.koltuk();
    dgnshn.motor();
    dgnshn.sisLambasi();//default concr met->obj ile call
    dgnshn.sunroaf();
    dgnshn.yakit();
    System.out.println("DısDonanım.RENK = " + DısDonanım.RENK);//-> aynı isimli variable interface name ile call edilir
//İcDonanim.KUMAS="deri";//CTE-> final variable atama yapılamaz
    System.out.println("İçDonanım.KUMAS = " + İçDonanım.KUMAS);
    System.out.println("İçDonanım.MUSİC = " + İçDonanım.MUSİC);
    System.out.println("İçDonanım.RENK = " + İçDonanım.RENK);
    DısDonanım.anten();//static conc meth Interface name .call
  }
}
