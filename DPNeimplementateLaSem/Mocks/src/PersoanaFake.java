public class PersoanaFake implements IPersoana {
    private String sex;
    private int varsta;
    private boolean cnpValid;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCnpValid(boolean cnpValid) {
        this.cnpValid = cnpValid;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return cnpValid;
    }
}
