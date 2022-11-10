package EmailCreation;

import java.util.Locale;
import java.util.Scanner;

public class EmailApp {
    String firstName;
    String lastName;
    String passWord;
    String department;
    String email;
    String emailSuffix = "clarusway.com";//Şirket domaini @
    int mailBoCapacity = 1000;
    int defaultPasawordLenght = 12;

    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        //System.out.println("department: " + department);

        this.passWord = setRandomPassWord(defaultPasawordLenght);
        //System.out.println("pasword: " + passWord);
        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + emailSuffix;
    }


    /*
    testautomation.
    fullstackdeveloper.
    salesforce.
    hicbiri
     */
    public String setDepartment() {

        System.out.print("lütfen aşağıda belirtilen departmanlardan herhangi birini seçiniz...\n" + "1 test automation\n2  fullstackdeveloper\n3 salesforce\n0 hicbiri ");
        Scanner sc = new Scanner(System.in);
        int options = sc.nextInt();
        if (options == 1) {
            return "testautomation.";

        } else if (options == 2) {
            return "fullstackdeveloper";


        } else if (options == 3) {
            return " salesforce";

        } else {
            return "hicbiri";
        }


    }


    public String setRandomPassWord(int lenght) {
        String passWordSet = "ABCDEFGLMNOPRSTUVYZ1234567890?*!'+abcdefglmnjklmanoprstyuivyz";
        char[] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int random = (int) (Math.random() * passWordSet.length());//random dooble methodunu int ile cast yapıldı
            password[i] = passWordSet.charAt(random);                //random
        }


        return new String(password);
    }

    public String showInfo() {
        return "ad-soyad:" + firstName + " " + lastName + "\n" +
                "sirket email: " + email + "\n" +
                "capasity: " + mailBoCapacity + "mb\n" +
                "pasword: " + passWord;
    }


}