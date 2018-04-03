package myJSOUP;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class extract {

	public static void main(String[] args) {
		String html = "<p>An <a href='http://example.com/'><b>example</b></a> link.</p>";
		Document doc = Jsoup.parse(html);
		Element link = doc.select("a").first();

		String text = doc.body().text(); // "An example link"
		String linkHref = link.attr("href"); // "http://example.com/"
		String linkText = link.text(); // "example""

		String relHref = link.attr("href"); // == "/"
		String absHref = link.attr("abs:href"); // "http://jsoup.org/"
		
		
		String linkOuterH = link.outerHtml(); 
		    // "<a href="http://example.com"><b>example</b></a>"
		String linkInnerH = link.html(); // "<b>example</b>"

		
		System.out.println(linkInnerH);
	
	}

}
