package cts.Stanescu.Andrei.recuperare.pattern.factorymethod;

public class SportsNews implements NewsArticle {
    private String title;
    private String content;

    public SportsNews(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Sports News: " + title + " - " + content);
    }
}
