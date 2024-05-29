package cts.Stanescu.Andrei.recuperare.pattern.factorymethod;

import cts.Stanescu.Andrei.recuperare.pattern.factorymethod.fabrica.EconomyNewsFactory;
import cts.Stanescu.Andrei.recuperare.pattern.factorymethod.fabrica.NewsFactory;
import cts.Stanescu.Andrei.recuperare.pattern.factorymethod.fabrica.PoliticsNewsFactory;
import cts.Stanescu.Andrei.recuperare.pattern.factorymethod.fabrica.SportsNewsFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewsFactory factory;
        int newsCount = 0;

        while (newsCount < 5) {
            System.out.println("Enter news category (economy, politics, sports):");
            String category = scanner.nextLine();
            System.out.println("Enter title:");
            String title = scanner.nextLine();
            System.out.println("Enter content:");
            String content = scanner.nextLine();

            switch (category.toLowerCase()) {
                case "economy":
                    factory = new EconomyNewsFactory();
                    break;
                case "politics":
                    factory = new PoliticsNewsFactory();
                    break;
                case "sports":
                    factory = new SportsNewsFactory();
                    break;
                default:
                    System.out.println("Unknown news category. Try again.");
                    continue;
            }

            NewsArticle article = factory.createNews(title, content);
            article.display();
            newsCount++;

            String socialMediaContent = content.length() > 100 ? content.substring(0, 100) : content;
            System.out.println("Social Media Post: " + title + " - " + socialMediaContent + " Read more at: [link]");
        }

        scanner.close();
    }
}
