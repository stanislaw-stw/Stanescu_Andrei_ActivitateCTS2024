package adapter.softNou;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private List<Bautura> listaBautura;

    public Bar() {
        this.listaBautura = new ArrayList<>();
    }

    public List<Bautura> getListaBautura() {
        return listaBautura;
    }

    public void adaugaBautura(Bautura bautura){
        this.listaBautura.add(bautura);
    }
    public void printareNotaDePlata(){
        int total =0;
        System.out.println("Lista de bauturi: ");
        for(Bautura bautura: listaBautura){
            System.out.println(bautura.toString());
            total += bautura.getPret();
        }
        System.out.println("Totalul bauturilor este: " + total);
    }
}
