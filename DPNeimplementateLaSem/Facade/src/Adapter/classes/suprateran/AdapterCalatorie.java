package Adapter.classes.suprateran;

import Adapter.classes.metrou.Calatorie;

public class AdapterCalatorie extends CardSTB {
    private Calatorie calatorieMetrou;

    public AdapterCalatorie(String numeClient, String cnpClient) {
        super(numeClient, cnpClient);
    }

    public AdapterCalatorie(Calatorie calatorie) {
        super(calatorie.getNumeClient(), null);
        this.calatorieMetrou = calatorie;
    }

    @Override
    public void validareCalatorie() {
        if (this.calatorieMetrou.estePermisAccesl()){
            System.out.println("Calatorie placuta!!");
        }else{
            System.out.println("Fonduri insuficiente!!");
        }
    }
}
