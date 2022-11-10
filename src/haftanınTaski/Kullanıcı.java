package haftanınTaski;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Kullanıcı {//kullanıcı objesi üretecek
    String name;// obj de değer alacak
    LocalDateTime kayıtZamanı;//obj de değer alacak
//task'in  1.step
    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {//Full parametreli
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", kayıtZamanı=" + kayıtZamanı;
    }
}
