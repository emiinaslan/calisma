package SlaryClaculation;

public class Runner {
    public static void main(String[] args) {
        Employee employee =new Employee("Drake",20000,41,2020);
        System.out.println("name:"+employee.name);
        System.out.println("maas"+employee.salary);

        System.out.println("ödenecek vergi:"+employee.tax() + "tl");
        System.out.println("odenecek bonus: " + employee.bonus() + "tl");
        System.out.println("maaş artışı:"+employee.raiseSalary()+ "tl");
        System.out.println("toplam ödenecek ücret:"+((employee.salary)+(employee.raiseSalary())));


    }
}
