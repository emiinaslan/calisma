package j18_Constructor;

public class MyConstructor {
    int x=3;
    int y=5;
    public MyConstructor() {
        x+=1;//ins variable +1 uptade edildi
        System.out.println("-x"+x);
    }
    public MyConstructor(int i ){
        this();//parametresiz cons call edildi
        this.y = i;//conc. parametresi i değeri inst variable y'ye atandı
        x+=y;//inst. y değeri inst. x değerine toplanarak atandı
        System.out.println("-x"+x);
    }
    public MyConstructor(int i, int i2) {
        this(3);//int o'li cons. parametre 3 Atanarak call edildi
        this.x -= 4;//inst. x veriablesi -4 update edildi
        System.out.println("-x"+x);
    }

    public static void main(String[] args) {
        MyConstructor mc1= new MyConstructor(4,3);//2 int parametre 4 ve 3 atanara cons. call edildi
    }

}
