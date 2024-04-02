package adapter.main;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;
import adapter.softVechi.*;

public class Main {
    public static void platesteConsumatia(SoftBucatarie comanda){
        comanda.printrareBon();
    }
    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        Produs produs = new Produs("Pizza",52);
        Produs produs1 = new Produs("Paste",45);
        bucatarie.adaugareProdus(produs);
        bucatarie.adaugareProdus(produs1);

        platesteConsumatia(bucatarie);

        Bar bar = new Bar();
        bar.adaugaBautura(new Bautura(12, "Cola", 0));
        Bautura bautura = new Bautura(25, "Mojito", 25.5F);
        bar.adaugaBautura(bautura);

        AdapterComandaBarBucatarie bar2 = new AdapterComandaBarBucatarie();
        bar2.adaugaBautura(new Bautura(20,"cola", 0));
        bar2.adaugaBautura(new Bautura( 15, "pepsi",0));
        bar2.adaugaBautura(new Bautura( 18,"sprite", 0));

        Bautura bautura2 = new Bautura(5, "apa", 0);
        AdapterBauturaProdus produs2 = new AdapterBauturaProdus(bautura2);
        bar2.adaugareProdus(produs2);
//        bar2.adaugareProdus(new AdapterBauturaProdus(new Bautura(5, "apa", 0)));

        platesteConsumatia(bar2);
    }
}