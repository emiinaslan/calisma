package j01_ScannerClass.tasks;

import java.util.Scanner;

//import static jdk.vm.ci.hotspot.aarch64.AArch64HotSpotRegisterConfig.fp;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6" */

        Scanner scan = new Scanner(System.in);

        System.out.println("vize:");
        double vp=scan.nextDouble();

        System.out.println("final:");
        double fp=scan.nextDouble();

        System.out.println("proje:");
        double pp=scan.nextDouble();

        System.out.println("not ortalamanız:"+(vp/100*30)+(fp/100*50)+(pp/100*20));















    }
}
