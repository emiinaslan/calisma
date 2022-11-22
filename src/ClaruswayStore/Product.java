package ClaruswayStore;

public abstract class Product {
    private int id;
    private String name;
    private double price;
    private double discountRate;
    private int amount;
    private Brand brand;
    private double scerenSizeİ;
    private int ram;
    private int memory;

    public abstract void menu();
    public abstract void addItem();
    public abstract void getProducts();
    public abstract void deleteItem();

    public Product(int id, String name, double price, double discountRate, int amount, Brand brand, double scerenSizeİ, int ram, int memory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.amount = amount;
        this.brand = brand;
        this.scerenSizeİ = scerenSizeİ;
        this.ram = ram;
        this.memory = memory;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discountRate=" + discountRate +
                ", amount=" + amount +
                ", brand=" + brand +
                ", scerenSizeİ=" + scerenSizeİ +
                ", ram=" + ram +
                ", memory=" + memory +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getScerenSizeİ() {
        return scerenSizeİ;
    }

    public void setScerenSizeİ(double scerenSizeİ) {
        this.scerenSizeİ = scerenSizeİ;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
