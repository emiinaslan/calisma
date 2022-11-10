package j26_İnheritance.ineritance01;

public class Mammal extends Hayvancık {//hayvancık parent'in child class'ıdır

    public Mammal() {//p'siz cons
        System.out.println("ahanda bu MAMAL p'siz cons..");
    }

    public void sutBeslenme(){
        System.out.println("bebeleri süt ile beslenir");
    }

    public void dogum(){
        System.out.println("bebesini doğurup analık eder :)");

    }



}
