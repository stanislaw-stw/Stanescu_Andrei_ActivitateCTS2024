package ChainF10.classes;

public class HandlerCardCalatorii implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String metodaPlata) {
        if (metodaPlata.equalsIgnoreCase("CardCalatorii")) {
            System.out.println("Plata realizata cu cardul de calatorii.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(metodaPlata);
        } else {
            System.out.println("Metoda de plata nevalida.");
        }
    }
}
