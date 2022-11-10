package day11;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Q03_FirstTenSecond {
    public static void main(String[] args) {
        //local time ile//her dakikanın ilk 10 saniyesi
        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);
        if (time.getSecond()<=10){
            System.out.println("ilk 10 sn içinde");

        }else System.out.println("ilk 10 sn dışında");


    }
}
