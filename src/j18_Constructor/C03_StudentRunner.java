package j18_Constructor;

public class C03_StudentRunner {


    public static void main(String[] args) {
        C03_Student ogr1=new C03_Student();
        ogr1.ad="fatih";
        ogr1.soyad="ataş";
        ogr1.sınıf= 1 ;
        ogr1.okulNo= 948;
        ogr1.ortalama=77;
        ogr1.takdir=false;


        System.out.println("ogr1 = " + ogr1);
        ogr1.mezuniyet();
        //2.öğrenci

        C03_Student ogr2=new C03_Student();
        ogr2.ad="emin";
        ogr2.soyad="aslan";
        ogr2.sınıf=12;
        ogr2.okulNo=948;
        ogr2.ortalama=100;
        ogr2.takdir=true;

        System.out.println(ogr2);


    }//main sonu
}
