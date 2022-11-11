package j32_Abstract.abstract01;

public abstract class  Honda {//parent abstract class
    public abstract void motor();

     void sunroff(){
         System.out.println("lükse düşkünsün extra ücret");
    }

    abstract void koltuk();

     abstract void kapı();

     // abstract class'ta variable tanımlana bilir
      String  name ="emin aslan";
     //variable
    // final void finalMethod();//concerete method body'siz olmaz
    // abstract  final  void finalMethod();//abstract method final
    // private void privateMEthod();//
    // private abstract void privateMEthod();//

   // static abstract void gunesMethod();//abstract method static olamaz
    //
   // Honda abj=new Honda();// melekler doğurmaz abstract class obje üretmez
}
