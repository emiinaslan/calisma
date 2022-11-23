package ProjeCarsamba;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    Scanner sc=new Scanner(System.in);
    private String ad;
    private  int no;
    ArrayList<Student> students=new ArrayList<>();

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void ogrenciKaydet(){
        System.out.println("lütfen ad ve soyadınızı giriniz : "); String ad= sc.nextLine();
        System.out.println("lütfen öğrenci no giriniz : "); int no= sc.nextInt();


    }

}
