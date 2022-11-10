package j25_Encapsulation.Task03;
 /* Task
 Bmı classfields -> name, age, weight,height: encapsulated
getBMI() method -> bmi=weight/(height*height) returb type olmalı
 getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
 runner class obj ile dataları print eden code create ediniz
  */

public class BMI {

   private  String name;
   private  int age;

   public String getStatus(){//
       if (getBMI()<18.5){
           return "zayıf";
       } else if (getBMI()<25) {
           return "normal";
       } else if (getBMI()<30) {
           return "kilolu";

       }else return "obez";
   }


public double getBMI(){
    double bmi=kilo/(boy*boy);
    return bmi;
}
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public BMI(String name, int age, double kilo, double boy) {
        this.name = name;
        this.age = age;
        this.kilo = kilo;
        this.boy = boy;
    }

    private  double kilo ;
   private  double boy;





}//Clas soonu
class Runner{// inner Class

    public static void main(String[] args) {

        BMI obj=new BMI("emin",26,67,1.75);
        System.out.println("BMI: "+obj.getName()+" "+obj.getStatus()+" "+obj.getBMI());


    }//Main sonu

}