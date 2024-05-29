package cts.Stanescu.Andrei.recuperare.pattern.factorymethod.fabrica;

import cts.Stanescu.Andrei.recuperare.pattern.factorymethod.NewsArticle;

public interface NewsFactory {
    NewsArticle createNews(String title, String content);
}
