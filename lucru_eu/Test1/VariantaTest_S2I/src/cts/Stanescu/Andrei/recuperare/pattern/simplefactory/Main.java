package cts.Stanescu.Andrei.recuperare.pattern.simplefactory;

import cts.Stanescu.Andrei.recuperare.pattern.simplefactory.fabrica.NewsFactory;
import cts.Stanescu.Andrei.recuperare.pattern.simplefactory.fabrica.NewsType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewsFactory factory = new NewsFactory();

        int newsCount = 0;
        while (newsCount < 5) {
            System.out.println("Enter news category (economy, politics, sports):");
            String categoryInput = scanner.nextLine();

            NewsType category;
            try {
                category = NewsType.valueOf(categoryInput.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid news category. Please try again.");
                continue;
            }

            System.out.println("Enter title:");
            String title = scanner.nextLine();

            System.out.println("Enter content:");
            String content = scanner.nextLine();

            NewsArticle article = factory.createNews(category, title, content);
            article.display();

            String socialMediaContent = content.length() > 100 ? content.substring(0, 100) : content;
            System.out.println("Social Media Post: " + title + " - " + socialMediaContent + "\nRead more at: [YourWebsiteLinkHere]");

            newsCount++;
        }

        scanner.close();
    }
}
