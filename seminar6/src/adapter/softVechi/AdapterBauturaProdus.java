package adapter.softVechi;

import adapter.softNou.Bautura;

public class AdapterBauturaProdus extends Produs{

    private Bautura bautura;

    public AdapterBauturaProdus(Bautura bautura){
        super(bautura.getDenumire(),bautura.getPret()); // ca sa apelam constr din baza ca ma obliga si acum setez
        this.bautura = bautura;
    }



}
