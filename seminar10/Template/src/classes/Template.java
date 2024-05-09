package classes;

public abstract class Template {
    public final void internare(Pacient pacient){
        analizaSanatate(pacient);
        if(disponibilitatePaturi()>0){
            emitereFisa(pacient);
        } else {
            refuzaInternare(pacient);
        }
    }

    // pentru a nu fi apelate in main sunt puse protected
    protected abstract void analizaSanatate(Pacient pacient);
    protected abstract int disponibilitatePaturi();
    protected abstract void emitereFisa(Pacient pacient);
    protected abstract void refuzaInternare(Pacient pacient);
}
