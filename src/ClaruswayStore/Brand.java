package ClaruswayStore;

import java.util.ArrayList;
import java.util.List;

public class Brand {
    private int id;
    private String name;
    private static List<Brand>brand=new ArrayList<>();
static {
    createBrands();
}
    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
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

    public static void createBrands(){
        brand.add(new Brand(1,"samsung"));
        brand.add(new Brand(2,"lenevo"));
        brand.add(new Brand(3,"Apple"));
        brand.add(new Brand(4,"Huawei"));
        brand.add(new Brand(5,"HP"));
        brand.add(new Brand(6,"Asus"));
        brand.add(new Brand(7,"LG"));
        brand.add(new Brand(8,"Monster"));
        brand.add(new Brand(9,"Casper"));

    }
    public static void printBrands(){
        System.out.println("....marka listesi.......");
        // temelde yapmak istediğim --> System.out.println
        for (Brand b:brand) {
            System.out.println(b.getId()+ " "+b.getName());

        }
        System.out.println("..................");

    }

    public static Brand getBrand(int id){
        for (Brand b :brand
             ) {if (id==b.getId()){
                 return b;
        }

        }
        return null ;
    }

}
