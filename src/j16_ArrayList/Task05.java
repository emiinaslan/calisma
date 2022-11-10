package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {

        String isimArr[][] = {{"ali", "veli", "ayşe"}, {"hasan", "can"}, {"suzan"}};

        yeniList(isimArr);

    }

    public static void yeniList(String[][] isimArr) {

        List<String> isimList = new ArrayList<>();
        for (int i = 0; i < isimArr.length; i++) {
            for (int j = 0; j < isimArr[i].length; j++) {
                isimList.add(isimArr[i][j]);
            }
        }
        System.out.println("isimList = " + isimList);
        Collections.sort(isimList);
        System.out.println("isimList = " + isimList);


    }
}
