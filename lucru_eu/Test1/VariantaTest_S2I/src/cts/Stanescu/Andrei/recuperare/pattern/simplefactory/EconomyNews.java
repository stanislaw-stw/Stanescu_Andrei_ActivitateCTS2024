package cts.Stanescu.Andrei.recuperare.pattern.simplefactory;

public class EconomyNews implements NewsArticle {
    private String title;
    private String content;

    public EconomyNews(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Economy News: " + title + " - " + content);
    }
}
