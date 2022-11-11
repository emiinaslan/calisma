package j32_Abstract.abstract01;

public class Crv extends Honda {
    @Override
    public void motor() {
        System.out.println("2.5 super turbo");
    }

    @Override
    void koltuk() {
        System.out.println("deri koltuk");
    }

    @Override
    void kapı() {
        System.out.println("5 kapılı vakumlu");
    }
}
