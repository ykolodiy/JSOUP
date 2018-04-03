package myJSOUP;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class test {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
        

        Elements newsHeadlines = doc.select("a");
        for (Element headline : newsHeadlines) {
      
            System.out.println(headline.absUrl("href"));
            
        }
    }

  
}
