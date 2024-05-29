package mock_testariduble.teste.dubluri;

import mock_testariduble.clase.IPersoana;

public class PersoanaFake implements IPersoana {

    private String valoareSex;
    private int valoareGetVarsta;
    private boolean valoareGetCheckCNP;

    public void setValoareSex(String valoareSex) {
        this.valoareSex = valoareSex;
    }

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoareGetCheckCNP(boolean valoareGetCheckCNP) {
        this.valoareGetCheckCNP = valoareGetCheckCNP;
    }

    @Override
    public String getSex() {
        return valoareSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoareGetCheckCNP;
    }
}

