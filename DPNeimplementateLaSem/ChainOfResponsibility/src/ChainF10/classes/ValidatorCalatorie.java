package ChainF10.classes;

public class ValidatorCalatorie {
    private Handler firstHandler;

    public ValidatorCalatorie() {
        Handler handlerCardCalatorii = new HandlerCardCalatorii();
        Handler handlerCardBancar = new HandlerCardBancar();
        Handler handlerSMS = new HandlerSMS();

        handlerCardCalatorii.setNextHandler(handlerCardBancar);
        handlerCardBancar.setNextHandler(handlerSMS);

        this.firstHandler = handlerCardCalatorii;
    }

    public void platesteCalatorie(String metodaPlata) {
        firstHandler.handleRequest(metodaPlata);
    }
}
