public class PersoanaSpy extends Persoana {
    private int getVarstaCallCount = 0;

    @Override
    public int getVarsta() {
        getVarstaCallCount++;
        return super.getVarsta();
    }

    public int getGetVarstaCallCount() {
        return getVarstaCallCount;
    }
}
