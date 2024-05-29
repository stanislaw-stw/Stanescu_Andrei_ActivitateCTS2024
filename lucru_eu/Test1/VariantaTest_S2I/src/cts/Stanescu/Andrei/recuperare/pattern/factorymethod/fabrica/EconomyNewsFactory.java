package cts.Stanescu.Andrei.recuperare.pattern.factorymethod.fabrica;

import cts.Stanescu.Andrei.recuperare.pattern.factorymethod.EconomyNews;
import cts.Stanescu.Andrei.recuperare.pattern.factorymethod.NewsArticle;

public class EconomyNewsFactory implements NewsFactory {
    @Override
    public NewsArticle createNews(String title, String content) {
        return new EconomyNews(title, content);
    }
}
