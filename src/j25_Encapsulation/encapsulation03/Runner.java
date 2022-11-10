package j25_Encapsulation.encapsulation03;

public class Runner {
    public static void main(String[] args) {//3.Step

         //4.Step
        Arac honda=new Arac("accord","siyah",-200,2012);
        Arac volvo=new Arac("siyah","s80",2000,-2015);

        Arac haciMurat=new Arac();
        haciMurat.setModel("serce");
        haciMurat.setMotor(1300);
        haciMurat.setYıl(1974);
        haciMurat.setRenk("cücük sarı");
        System.out.println("honda ne ararsan onda"+honda);
        System.out.println("hacı murat"+haciMurat);
        System.out.println("isveç tankı"+volvo);
    }
}
