package Task;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str = sc.nextLine();

        polindrome(str);







    }

    private static void polindrome(String str) {
        String tersStr ="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            tersStr+=str.charAt(i);
        }
        System.out.println(tersStr);
        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("polindromedur");
        }else System.out.println("polidrome değildir");
    }
}
