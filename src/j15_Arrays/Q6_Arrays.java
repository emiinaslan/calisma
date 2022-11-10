package j15_Arrays;

public class Q6_Arrays {
    public static void main(String[] args) {
        int arr1[][]={{0,2,-1},{3,8,9},{7}};
        int arr2[][]={{-7,6,-9},{0,12},{19}};
        int toplam =0;
        for (int i = 0; i <arr1.length ; i++) {//outher
            for (int j = 0; j < arr1[i].length; j++) {
                toplam+=arr1[i][j];
            }
        }
        System.out.println(toplam);
        int toplam2 =0;
        for (int i = 0; i <arr2.length ; i++) {//outher
            for (int j = 0; j < arr2[i].length; j++) {
                toplam2+=arr2[i][j];
            }
        }
        System.out.println(toplam2);




    }
}
