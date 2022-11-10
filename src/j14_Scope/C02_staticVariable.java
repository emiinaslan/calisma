package j14_Scope;

public class C02_staticVariable {
    public static void main(String[] args) {//main başı


        System.out.println("firmaID = " + firmaID);
        firmaID = 1001;//-->best pratice
        System.out.println("firmaID = " + firmaID);
        C02_staticVariable.firmaIT=true;//--> bad pratice

staticMethod();//static method maine call edildi --> astral seyahat etti

    }// main sonu

    static String firmaName = "clarusway";
    static int firmaID;
    static boolean firmaIT;

    public static void staticMethod(){//static method --> glaksi
        firmaID=2002;
        System.out.println("ağam yeni ID hayırlı olsun :"+ firmaID);
    }
    public void non_staticMethod(){
        firmaName="JavaCanlar";//non-static method -->sefil dünyalı
        System.out.println("yeni firma adı :"+firmaName);


    }


}
