package cts.Stanescu.Andrei.recuperare.pattern.factorymethod.fabrica;

import cts.Stanescu.Andrei.recuperare.pattern.factorymethod.NewsArticle;
import cts.Stanescu.Andrei.recuperare.pattern.factorymethod.SportsNews;

public class SportsNewsFactory implements NewsFactory {
    @Override
    public NewsArticle createNews(String title, String content) {
        return new SportsNews(title, content);
    }
}
