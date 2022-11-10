package j15_Arrays;

import java.util.Arrays;

public class Q3_Arrays {
    public static void main(String[] args) {
        String str = "HeySiri";
        str = str.replace("Hey", "bye");
        String arr[] = new String[1];
        arr[0] = str;
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
