package myJSOUP;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class addClass {

	public static void main(String[] args) {
		String html = "<div>An <a href='http://example.com/'><b>example</b></a> link.</div>";
		Document doc = Jsoup.parse(html);
		doc.select("div.comments").attr("rel", "nofollow");
		doc.select("div.comments").attr("title", "jsoup").addClass("round-box");
		
		
		
		Element div = doc.select("div").first(); // <div></div>
		div.html("<p>lorem ipsum</p>"); // <div><p>lorem ipsum</p></div>
		div.prepend("<p>First</p>");
		div.append("<p>Last</p>");
		// now: <div><p>First</p><p>lorem ipsum</p><p>Last</p></div>

		Element span = doc.select("span").first(); // <span>One</span>
		span.wrap("<li><a href='http://example.com/'></a></li>");
		// now: <li><a href="http://example.com"><span>One</span></a></li>
		
	}

}
