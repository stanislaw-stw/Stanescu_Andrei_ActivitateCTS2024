package cts.Stanescu.Andrei.recuperare.pattern.simplefactory;

public class PoliticsNews implements NewsArticle {
    private String title;
    private String content;

    public PoliticsNews(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Politics News: " + title + " - " + content);
    }
}
