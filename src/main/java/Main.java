import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Article> articles = new ArrayList<>();

        Document document = Jsoup.connect("https://elmir.ua/laptops/").get();
        Elements sectionElements = document.getElementsByAttributeValue("class", "vit-info");
        sectionElements.forEach(sectionElement -> {
            String url = sectionElement.child(0).attr("href");
            String title = sectionElement.child(0).text();
            double cost = Double.parseDouble(sectionElement.child(3).text());
            String about = sectionElement.child(1).text();

            articles.add(new Article(title, cost, url, about));
        });

        System.out.println(articles);
    }
}
