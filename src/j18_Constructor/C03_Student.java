package j18_Constructor;

public class C03_Student {//main olmayan sadece student obje create etmek için pojo -> plan old objeck java
    //fields
    String ad;
    String soyad;

    @Override
    public String toString() {
        return "ogr2 "+
                " \nad= " + ad +
                " \nsoyad= " + soyad +
                " \nsınıf= " + sınıf +
                " \nortalama= " + ortalama +
                " \nokulNo= " + okulNo +
                " \ntakdir= " + takdir ;
    }

    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;

    public  void mezuniyet (){//method
        if (ortalama>=50){
            System.out.println("ağam diploma hayırlı olsun");
        }else System.out.println("seneyede bekleriz");
    }

}//clas
