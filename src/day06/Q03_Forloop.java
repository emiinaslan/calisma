package day06;

public class Q03_Forloop {
    public static void main(String[] args) {

        //convert "java"to "j*a*v*a"
        //forloop print event numbers from 100 to 0 but do not use decrement (i--)

String s = "java";
        for (int i = 0; i < s.length() ; i++) {
            System.out.print(s.charAt(i)+"*");

        }
        System.out.println();
int num = 100;
        for (int i = num; i >= 0; i-=2) {
            System.out.print(i+" ");
        }

    }
}
