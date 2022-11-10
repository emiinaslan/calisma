package j26_İnheritance.task02;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.my_method();
    }
    int num= 10;

    @Override
    public void goster() {

        System.out.println("Bu method Sub classsın görüntülenme methodudur.");
    }

    public void   my_method(){
     goster();
     super.goster();
      System.out.println("subClass"+num);
      System.out.println("superClass"+super.num);
    }
}
