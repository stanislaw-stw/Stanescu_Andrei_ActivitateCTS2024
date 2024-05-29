package cts.Stanescu.Andrei.recuperare.pattern.simplefactory.fabrica;

import cts.Stanescu.Andrei.recuperare.pattern.simplefactory.EconomyNews;
import cts.Stanescu.Andrei.recuperare.pattern.simplefactory.NewsArticle;
import cts.Stanescu.Andrei.recuperare.pattern.simplefactory.PoliticsNews;
import cts.Stanescu.Andrei.recuperare.pattern.simplefactory.SportsNews;

public class NewsFactory {
    public NewsArticle createNews(NewsType type, String title, String content) {
        switch (type) {
            case ECONOMY:
                return new EconomyNews(title, content);
            case POLITICS:
                return new PoliticsNews(title, content);
            case SPORTS:
                return new SportsNews(title, content);
            default:
                throw new IllegalArgumentException("Unknown news type: " + type);
        }
    }
}

