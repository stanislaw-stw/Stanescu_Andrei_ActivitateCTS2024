package cts.Stanescu.Andrei.recuperare.pattern.factorymethod.fabrica;

import cts.Stanescu.Andrei.recuperare.pattern.factorymethod.NewsArticle;
import cts.Stanescu.Andrei.recuperare.pattern.factorymethod.PoliticsNews;

public class PoliticsNewsFactory implements NewsFactory {
    @Override
    public NewsArticle createNews(String title, String content) {
        return new PoliticsNews(title, content);
    }
}
