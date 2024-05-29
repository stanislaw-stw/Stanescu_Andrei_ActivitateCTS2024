package ChainF10.classes;

public class HandlerCardBancar implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String metodaPlata) {
        if (metodaPlata.equalsIgnoreCase("CardBancar")) {
            System.out.println("Plata realizata cu cardul bancar.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(metodaPlata);
        } else {
            System.out.println("Metoda de plata nevalida.");
        }
    }
}

