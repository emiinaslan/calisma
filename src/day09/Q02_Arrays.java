package day09;

public class Q02_Arrays {
    public static void main(String[] args) {

       String str = "verilen bir cümlenin bosluklar haric character sayisini bulunuz";
        System.out.println("str.replace(\" \",\"\").length() = " + str.replace(" ", "").length());

        String arr[]=str.replace(" ","").split("");
        System.out.println("arr.length = " + arr.length);


    }
}
