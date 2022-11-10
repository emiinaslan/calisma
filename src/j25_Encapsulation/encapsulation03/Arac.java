package j25_Encapsulation.encapsulation03;
/*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
  olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- ArabaMain isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
     */
public class Arac {
    //fields..1->step
    private String renk;
    private  String model;
    private  int motor;
    private  int yıl;
    //Step --2--
    public Arac(String renk, String model, int motor, int yıl) {
        this.renk = renk;
        this.model = model;
        //this.motor = motor;
        setMotor(motor);//set method
       // this.yıl = yıl;
        setYıl(yıl);
    }//parametresiz cons. 4.Step
    public Arac() {

    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            this.motor = 1001;
        }else this.motor = motor;

    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        if (yıl<0){
            this.yıl = (-1)*yıl;
        }else this.yıl =yıl;

    }

    @Override
    public String toString() {
        return
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl;
    }
}//Clas sonu
