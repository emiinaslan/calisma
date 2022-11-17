package j33_InterFace;

public class Sahin extends Tofas implements DısDonanım,İçDonanım,Lastik{
    @Override
    public void kapi() {
        System.out.println("agam 4 kapı sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("agam akordiyon kaporta");
    }

    @Override
    public void ebat() {
        System.out.println("agam 16 inç lastik ebat");
        System.out.println("dr bu ne insan yiyecek bunu");
    }

    @Override
    public void jant() {
        System.out.println("agam senin gibi janti adama 5 kollu jant yakışır:)");
    }

    @Override
    public void motor() {
        System.out.println("agam 1.6 aile motor");
    }

    @Override
    public void yakit() {
        System.out.println("agam tüp takmazsan tüpitak:) yoksa ocağına incir ağacı");
    }

    @Override
    public void koltuk() {
        System.out.println("agam deri koltuk yazın pişik yapar,içi saman olmasın kafi");
    }

    @Override
    public void klima() {
        System.out.println("agam ac camı serinle klima senin neyine:)");
    }
}
