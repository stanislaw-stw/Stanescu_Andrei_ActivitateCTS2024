package cts.Stanescu.Andrei.as.pattern.Flyweight;
public class RecomandareConcreta implements Recomandare {
    private String sfaturi;

    public RecomandareConcreta(String sfaturi) {
        this.sfaturi = sfaturi;
    }

    @Override
    public void printRecomandare(Reteta reteta) {
        System.out.println("Pentru " + reteta.getNume() + ": " + this.sfaturi);
    }
}
