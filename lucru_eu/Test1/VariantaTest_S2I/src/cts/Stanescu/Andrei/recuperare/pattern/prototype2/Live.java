package cts.Stanescu.Andrei.recuperare.pattern.prototype2;

public interface Live {
    Live clone();
    void addComment(String comment);
    void displayComments();

    void setPlatform(String platform);
}
