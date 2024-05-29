package ChainF10.classes;

public interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(String metodaPlata);
}