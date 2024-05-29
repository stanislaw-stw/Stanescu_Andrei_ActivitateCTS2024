package ChainF10.classes;

public class HandlerSMS implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String metodaPlata) {
        if (metodaPlata.equalsIgnoreCase("SMS")) {
            System.out.println("Plata realizata prin SMS.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(metodaPlata);
        } else {
            System.out.println("Metoda de plata nevalida.");
        }
    }
}
