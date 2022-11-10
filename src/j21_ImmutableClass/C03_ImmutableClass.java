package j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClass {
    public static void main(String[] args) {
        String name ="merve";
        System.out.println(name);
        name.concat("javacan");
        System.out.println(name);
        List<String>isimlsit=new ArrayList<>();
        System.out.println(isimlsit);
        isimlsit.add("fatih");
        isimlsit.add("erkan");
        isimlsit.add("serhat");
        isimlsit.remove(1);
        isimlsit.set(1,"javacan");
        System.out.println(isimlsit);


    }//main sonu
}
