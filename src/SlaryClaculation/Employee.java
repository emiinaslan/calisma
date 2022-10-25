package SlaryClaculation;

public class Employee {
    String name ;
    int salary;
    int workHours;
    int year ;

    public Employee(String name, int salary, int workHours, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }
    public double tax (){
        double paymentOfTax =0;
        if (salary<10000) {
            paymentOfTax = 0;
        }else{
            paymentOfTax=salary* 0.03;
        }
return paymentOfTax;
    }

public int bonus (){
        int paymentOfBonus=0;
        int addinitionalBonus=50;
        if (workHours>40){
            paymentOfBonus=(workHours-40)*addinitionalBonus;

        }
        return paymentOfBonus;

}
public double raiseSalary(){
        int timeOfYear=2021;
        int sumOfyear=timeOfYear-year;
        double raising ;
        if (sumOfyear<5){
            raising=(salary+tax())*0.05;

        } else if (sumOfyear<15) {
            raising=(salary+tax())*0.01;
            raising=(salary+tax())*1000000;

        }else {
            raising=(salary+tax())*0.02;

        }
return raising;
}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", year=" + year +
                '}';
    }
}//class sonu
