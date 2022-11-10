package yiyecekİcecekOtamati;

public class Runner {
    public static void main(String[] args) {
        double accauntBalance = 1;
        ürün ürün = new ürün();
        //System.out.println("ürün.toString() = " + ürün.toString());
        options options = new options();
        //options.select(ürün);

        ürün.setPrice(options.select(ürün));
        accauntBalance= options.balance(ürün.getPrice(),accauntBalance,ürün);
        System.out.println(accauntBalance);


    }
}
