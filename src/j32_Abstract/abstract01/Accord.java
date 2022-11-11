package j32_Abstract.abstract01;

public class Accord extends Honda{

    @Override
    public void motor() {//Implement method
        System.out.println("2.0 turbo ");

    }

    @Override
    void sunroff() {//ovirride edilen method concrate method
        System.out.println("sunroff açmayı unutmayın");
    }

    @Override
    void koltuk() {
        System.out.println("deri koltuk");
    }

    @Override
    void kapı() {
        System.out.println("vakumlu kapı");
    }
}
