package Adapter.classes.metrou;

public class BiletMetrou extends Calatorie {

    private int nrCalatorii;

    public BiletMetrou(String numeClient,int nrCalatorii) {
        super(numeClient);
        this.nrCalatorii=nrCalatorii;
    }

    @Override
    public boolean estePermisAccesl() {
       if( this.nrCalatorii<=0){
           return false;
       }
        this.nrCalatorii-=1;
       return true;
    }
}
