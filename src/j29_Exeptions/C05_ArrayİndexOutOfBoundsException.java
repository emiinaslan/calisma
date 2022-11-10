package j29_Exeptions;

public class C05_ArrayİndexOutOfBoundsException {
    public static void main(String[] args) {
        //ArrayİndexOutOfBoundsException-) array'lerde olmayan bir index elemanı ilşe işlem yapıldığında RTE exception.
        int arr[] = {24, 27, 38, 41, 54};
        System.out.println("arr[0] = " + arr[0]);


        try {
            System.out.println("arr[7] = " + arr[7]);
            System.out.println("try block çalıştı");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch block çalıştı");


        }
        try {
            System.out.println("arr[2] = " + arr[2]);
            System.out.println("try block çalıştı");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch block çalıştı");


        }
        System.out.println("bu satıra geldiysen sorunsuz çalıştı");


    }
}
