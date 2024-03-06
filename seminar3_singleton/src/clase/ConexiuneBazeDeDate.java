package clase;

public class ConexiuneBazeDeDate {

    private String numeBaza;

    private int nrTabele;

    private String linkConexiune;

    private static ConexiuneBazeDeDate instanta = null;

    private ConexiuneBazeDeDate(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    @Override
    public String toString() {
        return "ConexiuneBazeDeDate{" +
                "numeBaza='" + numeBaza + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConexiune='" + linkConexiune + '\'' +
                '}';
    }

    public static synchronized ConexiuneBazeDeDate getInstance(String numeBaza, int nrTabele, String linkConexiune){
        // daca nu avem synchronized practic nu se modifica nimic
        if(instanta == null)
            instanta = new ConexiuneBazeDeDate(numeBaza,nrTabele,linkConexiune);

        return instanta;


    }
    public String getNumeBaza() {
        return numeBaza;
    }


    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }


    public int getNrTabele() {
        return nrTabele;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public String getLinkConexiune() {
        return linkConexiune;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }
}
